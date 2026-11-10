package io.github.chrisribble.ffm.ffmpeg.analyzer;

import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg$shared.C_POINTER;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AVMEDIA_TYPE_AUDIO;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_DICT_IGNORE_SUFFIX;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_NOPTS_VALUE;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_PKT_FLAG_KEY;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_primaries_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_range_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_space_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_transfer_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_dict_get;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_fourcc_make_string;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_get_pix_fmt_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_read_frame;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.avcodec_profile_name;
import static java.lang.foreign.MemorySegment.NULL;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.AudioInfo.ChannelLayout;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.ColorInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.FrameRateMode;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVChannelLayout;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVCodecParameters;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVDictionaryEntry;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVFormatContext;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVPacket;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVRational;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVStream;
import io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg;
import io.github.chrisribble.ffm.ffmpeg.core.Rational;
import io.github.chrisribble.ffm.ffmpeg.core.Resolution;
import io.github.chrisribble.ffm.ffmpeg.core.exception.AVAllocateException;
import io.github.chrisribble.ffm.ffmpeg.core.internal.AVFormatContextUtil;
import io.github.chrisribble.ffm.ffmpeg.core.internal.AVStreamUtil;
import io.github.chrisribble.ffm.ffmpeg.core.internal.LibavVersion;
import io.github.chrisribble.ffm.ffmpeg.core.internal.StreamInfo;

public final class MediaAnalyzer {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final double EPSILON = 1 / (double) TimeUnit.SECONDS.toNanos(1);
	private static final long MICROS_PER_S = TimeUnit.SECONDS.toMicros(1);
	private static final int CODEC_TAG_BUFFER_SIZE = 32;
	private static final long BITS_PER_BYTE = 8;
	private static final long BPS_TO_KBPS = 1000;
	private static final long NANOS_PER_SECOND = TimeUnit.SECONDS.toNanos(1L);

	private final Path[] inputs;

	public MediaAnalyzer(final List<Path> inputs) {
		this(inputs.toArray(Path[]::new));
	}

	public MediaAnalyzer(final Path... inputs) {
		if (inputs == null) {
			throw new IllegalArgumentException("inputs must be non-null");
		}
		if (inputs.length == 0) {
			throw new IllegalArgumentException("inputs must be non-empty");
		}
		this.inputs = Arrays.copyOf(inputs, inputs.length);

		super();
	}

	public MediaInfo getMediaInfo(final boolean analyzePackets) {
		if (!LibavVersion.getInstance().isCompatible()) {
			throw new UnsupportedOperationException("Runtime FFmpeg version (" + LibavVersion.getVersionInfo() + ") is not compatible with bindings");
		}

		try (Arena arena = Arena.ofConfined()) {
			var pFormatCtx = AVFormatContextUtil.open(arena, inputs);

			List<StreamInfo> streams = AVStreamUtil.getStreams(pFormatCtx);

			StreamInfo videoStream = streams.stream()
					.filter(stream -> stream.codecType() == AVMEDIA_TYPE_VIDEO())
					.findFirst()
					.orElse(null);

			StreamInfo audioStream = streams.stream()
					.filter(stream -> stream.codecType() == AVMEDIA_TYPE_AUDIO())
					.findFirst()
					.orElse(null);

			PacketAnalysis packetAnalysis = null;
			if (analyzePackets) {
				packetAnalysis = getPacketAnalysis(arena, pFormatCtx, videoStream != null ? videoStream.index() : -1);
			}

			ContainerInfo container = getContainerInfo(pFormatCtx);
			Duration containerDuration = container.duration();
			VideoInfo video = getVideoInfo(arena, videoStream, packetAnalysis, containerDuration);
			AudioInfo audio = getAudioInfo(arena, audioStream, packetAnalysis, containerDuration);

			return new MediaInfo(container, video, audio);
		}
	}

	private ContainerInfo getContainerInfo(final MemorySegment pFormatCtx) {
		Duration duration = getContainerDuration(pFormatCtx);
		return new ContainerInfo(duration);
	}

	private VideoInfo getVideoInfo(final Arena arena, final StreamInfo videoStream, final PacketAnalysis packetAnalysis, final Duration containerDuration) {
		if (videoStream == null) {
			return null;
		}

		String codecTag = getCodecTag(videoStream.codecTag());
		String codecName = getCodecName(videoStream.codecId());

		Duration duration = getStreamDuration(arena, videoStream.avStream());
		if (duration == null) {
			duration = containerDuration;
		}

		Resolution resolution = getResolution(videoStream);

		FrameRateMode frameRateMode = getFrameRateMode(videoStream);

		Long gopDuration = null;

		if (packetAnalysis != null && frameRateMode == FrameRateMode.CONSTANT) {
			gopDuration = getGopDuration(packetAnalysis.keyframes());
		}

		Double gopSeconds = gopDuration != null
				? gopDuration * videoStream.getTimeBase()
				: null;

		Long streamSizeBytes = packetAnalysis != null ? packetAnalysis.streamSizes().get(videoStream.index()) : null;

		ColorInfo colorInfo = getColorInfo(videoStream);

		return new VideoInfo(
				videoStream.id(),
				codecTag,
				codecName,
				duration,
				resolution,
				frameRateMode,
				videoStream.getAvgFrameRate(),
				videoStream.getRFrameRate(),
				gopSeconds,
				streamSizeBytes,
				colorInfo);
	}

	private ColorInfo getColorInfo(final StreamInfo videoStream) {
		var avCodecParams = videoStream.avCodecParams();
		String pixelFormat = av_get_pix_fmt_name(AVCodecParameters.format(avCodecParams)).getString(0);
		String colorRange = av_color_range_name(AVCodecParameters.color_range(avCodecParams)).getString(0);
		String colorSpace = av_color_space_name(AVCodecParameters.color_space(avCodecParams)).getString(0);
		String colorPrimaries = av_color_primaries_name(AVCodecParameters.color_primaries(avCodecParams)).getString(0);
		String colorTransfer = av_color_transfer_name(AVCodecParameters.color_trc(avCodecParams)).getString(0);

		return new ColorInfo(
				pixelFormat,
				colorRange,
				colorSpace,
				colorPrimaries,
				colorTransfer);
	}

	private AudioInfo getAudioInfo(final Arena arena, final StreamInfo audioStream, final PacketAnalysis packetAnalysis, final Duration containerDuration) {
		if (audioStream == null) {
			return null;
		}

		String codecTag = getCodecTag(audioStream.codecTag());
		String codecName = getCodecName(audioStream.codecId());
		String codecProfile = getCodecProfile(audioStream);

		Duration duration = getStreamDuration(arena, audioStream.avStream());
		if (duration == null) {
			duration = containerDuration;
		}

		ChannelLayout layout = getChannelLayout(audioStream.avCodecParams());
		int sampleRate = audioStream.sampleRate();

		Long streamSizeBytes = packetAnalysis != null ? packetAnalysis.streamSizes().get(audioStream.index()) : null;

		return new AudioInfo(
				audioStream.id(),
				codecTag,
				codecName,
				codecProfile,
				duration,
				layout,
				sampleRate,
				streamSizeBytes);
	}

	private String getCodecProfile(final StreamInfo streamInfo) {
		MemorySegment pCodecProfile = avcodec_profile_name(streamInfo.codecId(), streamInfo.codecProfile());

		if (NULL.equals(pCodecProfile)) {
			return null;
		}

		return pCodecProfile.getString(0);
	}

	private ChannelLayout getChannelLayout(final MemorySegment avCodecParams) {
		MemorySegment chLayout = AVCodecParameters.ch_layout(avCodecParams);
		int channels = AVChannelLayout.nb_channels(chLayout);
		return new ChannelLayout(channels);
	}

	private static Duration getStreamDuration(final Arena arena, final MemorySegment pStream) {
		long duration = AVStream.duration(pStream);
		if (duration != AV_NOPTS_VALUE()) {
			return getDuration(duration, AVStream.time_base(pStream));
		}

		MemorySegment pMetadata = AVStream.metadata(pStream);
		MemorySegment pDurationEntry = av_dict_get(pMetadata, arena.allocateFrom(AVStreamMetadataKeys.DURATION), NULL, AV_DICT_IGNORE_SUFFIX());

		if (NULL.equals(pDurationEntry)) {
			return null;
		}

		String streamDurationString = AVDictionaryEntry.value(pDurationEntry).getString(0);
		return parseMetadataDuration(streamDurationString);
	}

	private static Duration parseMetadataDuration(final String streamDurationString) {
		try {
			String[] durationParts = streamDurationString.split(":");
			if (durationParts.length != 3) {
				LOG.error("Invalid stream duration: {}", streamDurationString);
				return null;
			}
			return Duration.ofHours(Long.parseLong(durationParts[0]))
					.plus(Duration.ofMinutes(Long.parseLong(durationParts[1])))
					.plus(Duration.ofNanos((long) (Double.parseDouble(durationParts[2]) * NANOS_PER_SECOND)));
		} catch (RuntimeException e) {
			LOG.error("Failed to parse duration: {}", streamDurationString, e);
			return null;
		}
	}

	private static Duration getContainerDuration(final MemorySegment pFormatCtx) {
		long duration = AVFormatContext.duration(pFormatCtx);
		if (duration == AV_NOPTS_VALUE()) {
			return null;
		}
		return Duration.of(duration, ChronoUnit.MICROS);
	}

	private static Duration getDuration(final long duration, final MemorySegment pAvRationalTimeBase) {
		double timeBaseMicros = MICROS_PER_S * AVRational.num(pAvRationalTimeBase) /
				(double) AVRational.den(pAvRationalTimeBase);
		long micros = (long) (timeBaseMicros * duration);
		return Duration.of(micros, ChronoUnit.MICROS);
	}

	private Long getGopDuration(final List<Long> keyframes) {
		List<Long> intervals = new ArrayList<>(keyframes.size() - 1);

		Long lastPts = null;
		// candidate for GOP
		long longestInterval = 0;

		for (long pts : keyframes) {
			// First frame is always an I-frame, so interval duration must be zero
			long interval = lastPts != null ? pts - lastPts : 0;
			lastPts = pts;

			// Do not track zero-sized intervals (first I-frame)
			if (interval == 0) {
				continue;
			}
			if (interval > longestInterval) {
				longestInterval = interval;
			}
			intervals.add(interval);
		}

		// Determine whether I-frames occur at constant interval without negative detection on extra I-frames
		long intervalAccumulator = 0;
		for (long interval : intervals) {
			intervalAccumulator += interval;

			long delta = intervalAccumulator - longestInterval;
			if (delta > 0) {
				// Inconsistent GOP
				return null;
			}
			if (delta == 0) {
				// Interval is exactly candidate GOP; reset accumulator
				intervalAccumulator = 0;
			}
			// Interval is less than candidate GOP (potential scene change); keep accumulating
		}

		return longestInterval > 0 ? longestInterval : null;
	}

	private PacketAnalysis getPacketAnalysis(final Arena arena, final MemorySegment pFormatCtx, final int keyFrameFilterStreamIndex) {
		List<Long> keyframes = new ArrayList<>();

		int numStreams = AVFormatContext.nb_streams(pFormatCtx);

		long[] streamSizes = new long[numStreams];

		var packet = allocatePacket(arena);
		while (av_read_frame(pFormatCtx, packet) >= 0) {
			int streamIndex = AVPacket.stream_index(packet);
			int flags = AVPacket.flags(packet);
			int packetSize = AVPacket.size(packet);
			streamSizes[streamIndex] += packetSize;

			// Ignore packets from streams we aren't interested in or which are not key frames
			if (streamIndex != keyFrameFilterStreamIndex || (flags & AV_PKT_FLAG_KEY()) == 0) {
				av_packet_unref(packet);
				continue;
			}

			long pts = AVPacket.pts(packet);
			av_packet_unref(packet);

			keyframes.add(pts);
		}

		return new PacketAnalysis(keyframes, Arrays.stream(streamSizes).boxed().toList());
	}

	public String getCodecTag(final int tag) {
		try (Arena arena = Arena.ofConfined()) {
			// char*
			var buf = arena.allocate(CODEC_TAG_BUFFER_SIZE);
			av_fourcc_make_string(buf, tag);

			return buf.getString(0);
		}
	}

	private String getCodecName(final int codecId) {
		return FFmpeg.avcodec_get_name(codecId).getString(0);
	}

	private static Resolution getResolution(final StreamInfo streamInfo) {
		var pCodecParams = streamInfo.avCodecParams();
		int width = AVCodecParameters.width(pCodecParams);
		int height = AVCodecParameters.height(pCodecParams);

		return new Resolution(width, height);
	}

	private MemorySegment allocatePacket(final Arena arena) {
		// AVPacket*
		var p = av_packet_alloc();
		requireNonNull(p, "av_packet_alloc failed");

		pointer(arena, p).reinterpret(arena, FFmpeg::av_packet_free);
		return p;
	}

	private MemorySegment pointer(final Arena arena, final MemorySegment segment) {
		var pointer = arena.allocate(C_POINTER);
		pointer.set(C_POINTER, 0, MemorySegment.ofAddress(segment.address()));
		return pointer;
	}

	private FrameRateMode getFrameRateMode(final StreamInfo videoStream) {
		Rational avgFrameRate = videoStream.getAvgFrameRate();
		Rational rFrameRate = videoStream.getRFrameRate();

		return doubleEquals(avgFrameRate.doubleValue(), rFrameRate.doubleValue())
				? FrameRateMode.CONSTANT
				: FrameRateMode.VARIABLE;
	}

	private boolean doubleEquals(final double a, final double b) {
		return Math.abs(a - b) <= EPSILON;
	}

	private static void requireNonNull(final MemorySegment segment, final String message) throws AVAllocateException {
		if (segment == null) {
			throw new IllegalArgumentException("segment must be non-null");
		}
		if (segment.equals(NULL)) {
			throw new AVAllocateException(message);
		}
	}

	public record MediaInfo(ContainerInfo container, VideoInfo video, AudioInfo audio) {}

	public record ContainerInfo(
			Duration duration) {}

	public interface TrackInfo {
		int id();

		String codecTag();

		Duration duration();

		Long sizeBytes();

		default Long bitrateKbps() {
			Long sizeBytes = sizeBytes();
			if (sizeBytes == null) {
				return null;
			}

			if (duration() == null) {
				return null;
			}

			if (duration().toMillis() < 1000L) {
				throw new ArithmeticException("Duration must be >= 1 second");
			}

			return sizeBytes * BITS_PER_BYTE / duration().toSeconds() / BPS_TO_KBPS;
		}
	}

	public record VideoInfo(
			int id,
			String codecTag,
			String codecName,
			Duration duration,
			Resolution resolution,
			FrameRateMode frameRateMode,
			Rational avgFrameRate,
			Rational rFrameRate,
			Double gopSeconds,
			Long sizeBytes,
			ColorInfo colorInfo) implements TrackInfo {

		public VideoInfo {
			if (resolution == null) {
				throw new IllegalArgumentException("resolution must be non-null");
			}
			if (frameRateMode == null) {
				throw new IllegalArgumentException("frameRateMode must be non-null");
			}
			if (avgFrameRate == null) {
				throw new IllegalArgumentException("avgFrameRate must be non-null");
			}
			if (rFrameRate == null) {
				throw new IllegalArgumentException("rFrameRate must be non-null");
			}
		}

		public Integer gopFrames() {
			if (frameRateMode != FrameRateMode.CONSTANT || gopSeconds() == null) {
				return null;
			}
			return Math.toIntExact(Math.round(gopSeconds * rFrameRate.doubleValue()));
		}

		public record ColorInfo(
				String pixelFormat,
				String colorRange,
				String colorSpace,
				String colorPrimaries,
				String colorTransfer) {}

		public enum FrameRateMode {
			CONSTANT("Constant"),
			VARIABLE("Variable");

			private final String value;

			FrameRateMode(final String value) {
				this.value = value;
			}

			@Override
			public String toString() {
				return value;
			}
		}
	}

	public record AudioInfo(
			int id,
			String codecTag,
			String codecName,
			String codecProfile,
			Duration duration,
			ChannelLayout layout,
			int sampleRate,
			Long sizeBytes) implements TrackInfo {

		public record ChannelLayout(int channels) {}
	}

	private record PacketAnalysis(List<Long> keyframes, List<Long> streamSizes) {}

	private static final class AVStreamMetadataKeys {
		public static final String DURATION = "DURATION";

		private AVStreamMetadataKeys() {}
	}
}

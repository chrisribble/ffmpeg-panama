package io.github.chrisribble.ffm.ffmpeg.analyzer;

import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AVMEDIA_TYPE_AUDIO;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_DICT_IGNORE_SUFFIX;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_NOPTS_VALUE;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_PKT_DATA_DISPLAYMATRIX;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.AV_PKT_FLAG_KEY;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_primaries_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_range_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_space_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_color_transfer_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_dict_get;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_display_rotation_get;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_fourcc_make_string;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_packet_side_data_get;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_pix_fmt_desc_get;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.av_read_frame;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg.avcodec_profile_name;
import static io.github.chrisribble.ffm.ffmpeg.bindings.FFmpeg$shared.C_POINTER;
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
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.AudioInfo.ChannelLayout;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.Color;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.FrameRate;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.FrameRateMode;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.Gop;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.PixelFormat;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.Rotation;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.RotationImpl;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVChannelLayout;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVCodecParameters;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVComponentDescriptor;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVDictionaryEntry;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVFormatContext;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVPacket;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVPacketSideData;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVPixFmtDescriptor;
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
	// see const int32_t matrix[9] parameter in https://www.ffmpeg.org/doxygen/8.0/display_8h.html
	private static final long DISPLAY_MATRIX_BYTES = 9L * Integer.BYTES;

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

			int videoStreamIndex = videoStream != null ? videoStream.index() : -1;
			PacketAnalysis packetAnalysis = analyzePackets
					? getPacketAnalysis(arena, pFormatCtx, videoStreamIndex)
					: null;

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

		Duration duration = getStreamDuration(arena, videoStream.avStream());
		if (duration == null) {
			duration = containerDuration;
		}

		Long streamBytes = getStreamBytes(packetAnalysis, videoStream.index());
		Resolution resolution = getResolution(videoStream);
		FrameRate frameRate = getFrameRate(videoStream);

		Codec codec = getCodec(videoStream);
		Color color = getColor(videoStream);
		Optional<Gop> gop = getGop(frameRate.mode(), videoStream.getTimeBase(), packetAnalysis);
		Optional<Rotation> rotation = getRotation(videoStream);

		return new VideoInfo(
				videoStream.id(),
				duration,
				streamBytes,
				resolution,
				frameRate,
				codec,
				color,
				gop,
				rotation);
	}

	private AudioInfo getAudioInfo(final Arena arena, final StreamInfo audioStream, final PacketAnalysis packetAnalysis, final Duration containerDuration) {
		if (audioStream == null) {
			return null;
		}

		Duration duration = getStreamDuration(arena, audioStream.avStream());
		if (duration == null) {
			duration = containerDuration;
		}

		Long streamBytes = getStreamBytes(packetAnalysis, audioStream.index());

		Codec codec = getCodec(audioStream);
		ChannelLayout layout = getChannelLayout(audioStream.avCodecParams());
		int sampleRate = audioStream.sampleRate();

		return new AudioInfo(
				audioStream.id(),
				duration,
				streamBytes,
				codec,
				layout,
				sampleRate);
	}

	private Optional<Rotation> getRotation(final StreamInfo videoStream) {
		// AVCodecParameters*
		MemorySegment pCodecPar = AVStream.codecpar(videoStream.avStream());
		// AVPacketSideData*
		MemorySegment pCodedSideData = AVCodecParameters.coded_side_data(pCodecPar);
		int nbCodedSideData = AVCodecParameters.nb_coded_side_data(pCodecPar);

		// const AVPacketSideData*
		MemorySegment pDisplayMatrixSideData = av_packet_side_data_get(pCodedSideData, nbCodedSideData, AV_PKT_DATA_DISPLAYMATRIX())
				.reinterpret(AVPacketSideData.sizeof());
		if (NULL.equals(pDisplayMatrixSideData) || AVPacketSideData.size(pDisplayMatrixSideData) < DISPLAY_MATRIX_BYTES) {
			return Optional.empty();
		}
		// uint8_t* (points to const int32_t[9])
		MemorySegment pDisplayMatrix = AVPacketSideData.data(pDisplayMatrixSideData).reinterpret(DISPLAY_MATRIX_BYTES);

		double ccwDegrees = av_display_rotation_get(pDisplayMatrix); // [-180, 180]
		if (Double.isNaN(ccwDegrees)) {
			return Optional.empty();
		}
		int roundedDegrees = Math.toIntExact(Math.round(ccwDegrees));
		if (roundedDegrees == 0) {
			return Optional.empty();
		}
		return Optional.of(new RotationImpl(roundedDegrees));
	}

	private Optional<Gop> getGop(final FrameRateMode frameRateMode, final double timebase, final PacketAnalysis packetAnalysis) {
		if (packetAnalysis == null) {
			return Optional.empty();
		}
		if (frameRateMode != FrameRateMode.CONSTANT) {
			return Optional.empty();
		}

		Optional<Long> gopTicks = getGopDuration(packetAnalysis);
		Optional<Double> gopSeconds = gopTicks.map(ticks -> ticks * timebase);
		Optional<Long> maxGopBytes = gopTicks.flatMap(ticks -> getMaxGopBytes(packetAnalysis, ticks));

		return gopSeconds.isPresent() && maxGopBytes.isPresent()
				? Optional.of(new Gop(gopSeconds.get(), maxGopBytes.get()))
				: Optional.empty();
	}

	private Long getStreamBytes(final PacketAnalysis packetAnalysis, final int index) {
		if (packetAnalysis == null) {
			return null;
		}
		return packetAnalysis.streamSizes().get(index);
	}

	private Optional<Long> getMaxGopBytes(final PacketAnalysis packetAnalysis, final Long gopDuration) {
		if (packetAnalysis == null || packetAnalysis.gopCandidates().isEmpty() || gopDuration == null) {
			return Optional.empty();
		}

		long currentGopElapsed = 0;
		long currentGopBytes = 0;
		long maxGopBytes = 0;

		for (GopCandidate gopCandidate : packetAnalysis.gopCandidates()) {
			currentGopBytes += gopCandidate.bytes();
			currentGopElapsed += gopCandidate.duration();

			if (currentGopElapsed >= gopDuration) {
				maxGopBytes = Math.max(maxGopBytes, currentGopBytes);
				currentGopElapsed = 0;
				currentGopBytes = 0;
			}
		}
		return Optional.of(Math.max(maxGopBytes, currentGopBytes));
	}

	private Color getColor(final StreamInfo videoStream) {
		var avCodecParams = videoStream.avCodecParams();
		PixelFormat pixelFormat = getPixelFormat(AVCodecParameters.format(avCodecParams));
		String colorRange = av_color_range_name(AVCodecParameters.color_range(avCodecParams)).getString(0);
		String colorSpace = av_color_space_name(AVCodecParameters.color_space(avCodecParams)).getString(0);
		String colorPrimaries = av_color_primaries_name(AVCodecParameters.color_primaries(avCodecParams)).getString(0);
		String colorTransfer = av_color_transfer_name(AVCodecParameters.color_trc(avCodecParams)).getString(0);

		return new Color(
				pixelFormat,
				colorRange,
				colorSpace,
				colorPrimaries,
				colorTransfer);
	}

	private Codec getCodec(final StreamInfo streamInfo) {
		String tag = getCodecTag(streamInfo.codecTag());
		String name = getCodecName(streamInfo.codecId());
		String profile = getCodecProfile(streamInfo);

		return new Codec(tag, name, profile);
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

	private Optional<Long> getGopDuration(final PacketAnalysis packetAnalysis) {
		if (packetAnalysis == null) {
			return Optional.empty();
		}
		List<GopCandidate> gopCandidates = packetAnalysis.gopCandidates();
		if (gopCandidates.isEmpty()) {
			return Optional.empty();
		}

		List<Long> intervals = new ArrayList<>(gopCandidates.size() - 1);

		// candidate for GOP
		long longestInterval = 0;

		for (GopCandidate gopCandidate : gopCandidates) {
			long interval = gopCandidate.duration();

			// Do not track zero-sized intervals (first I-frame)
			if (interval == 0) {
				continue;
			}
			longestInterval = Math.max(longestInterval, interval);
			intervals.add(interval);
		}

		// Determine whether I-frames occur at constant interval without negative detection on extra I-frames
		long intervalAccumulator = 0;
		for (long interval : intervals) {
			intervalAccumulator += interval;

			long delta = intervalAccumulator - longestInterval;
			if (delta > 0) {
				// Inconsistent GOP
				return Optional.empty();
			}
			if (delta == 0) {
				// Interval is exactly candidate GOP; reset accumulator
				intervalAccumulator = 0;
			}
			// Interval is less than candidate GOP (potential scene change); keep accumulating
		}

		return longestInterval > 0
				? Optional.of(longestInterval)
				: Optional.empty();
	}

	private PacketAnalysis getPacketAnalysis(final Arena arena, final MemorySegment pFormatCtx, final int videoStreamIndex) {
		long[] streamSizes = new long[AVFormatContext.nb_streams(pFormatCtx)];
		var accumulator = new GopAccumulator(videoStreamIndex);

		var packet = allocatePacket(arena);
		while (av_read_frame(pFormatCtx, packet) >= 0) {
			int streamIndex = AVPacket.stream_index(packet);
			int packetSize = AVPacket.size(packet);
			streamSizes[streamIndex] += packetSize;

			// Ignore packets from non-video streams for keyframe interval bytes analysis
			if (streamIndex == videoStreamIndex) {
				boolean isKeyframe = (AVPacket.flags(packet) & AV_PKT_FLAG_KEY()) != 0;
				accumulator.accept(AVPacket.pts(packet), AVPacket.duration(packet), packetSize, isKeyframe);
			}
			av_packet_unref(packet);
		}

		return new PacketAnalysis(accumulator.finish(), Arrays.stream(streamSizes).boxed().toList());
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

	private static PixelFormat getPixelFormat(final int pixelFormatId) {
		// const AVPixFmtDescriptor*
		MemorySegment pPixelFormatDesc = av_pix_fmt_desc_get(pixelFormatId);
		if (NULL.equals(pPixelFormatDesc)) {
			// av_pix_fmt_desc_get() can return null if the pixel format is unknown
			return null;
		}

		int nbComponents = Byte.toUnsignedInt(AVPixFmtDescriptor.nb_components(pPixelFormatDesc));

		// AVComponentDescriptor[4]
		MemorySegment pComponentDescriptors = AVPixFmtDescriptor.comp(pPixelFormatDesc);
		int bitDepth = 0;
		for (int i = 0; i < nbComponents; i++) {
			// AVComponentDescriptor*
			MemorySegment pComponent = AVComponentDescriptor.asSlice(pComponentDescriptors, i);
			bitDepth = Math.max(bitDepth, AVComponentDescriptor.depth(pComponent));
		}

		String name = AVPixFmtDescriptor.name(pPixelFormatDesc).getString(0);

		return new PixelFormat(name, bitDepth);
	}

	private static Resolution getResolution(final StreamInfo streamInfo) {
		var pCodecParams = streamInfo.avCodecParams();
		int width = AVCodecParameters.width(pCodecParams);
		int height = AVCodecParameters.height(pCodecParams);

		return new Resolution(width, height);
	}

	private static FrameRate getFrameRate(final StreamInfo videoStream) {
		FrameRateMode mode = getFrameRateMode(videoStream);
		return new FrameRate(mode, videoStream.getAvgFrameRate(), videoStream.getRFrameRate());
	}

	private static FrameRateMode getFrameRateMode(final StreamInfo videoStream) {
		Rational avgFrameRate = videoStream.getAvgFrameRate();
		Rational rFrameRate = videoStream.getRFrameRate();

		return doubleEquals(avgFrameRate.doubleValue(), rFrameRate.doubleValue())
				? FrameRateMode.CONSTANT
				: FrameRateMode.VARIABLE;
	}

	private static boolean doubleEquals(final double a, final double b) {
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

	public record ContainerInfo(Duration duration) {}

	public interface TrackInfo {
		int id();

		Codec codec();

		Duration duration();

		Long bytes();

		default Long bitrateKbps() {
			Long sizeBytes = bytes();
			if (sizeBytes == null) {
				return null;
			}

			if (duration() == null) {
				return null;
			}

			long ms = duration().toMillis();
			if (ms < 1) {
				LOG.warn("Cannot determine bitrate; duration too short ({} bytes / {})", sizeBytes, duration());
				return null;
			}

			return sizeBytes * BITS_PER_BYTE / ms;
		}
	}

	public record VideoInfo(
			int id,
			Duration duration,
			Long bytes,
			Resolution resolution,
			FrameRate frameRate,
			Codec codec,
			Color color,
			Optional<Gop> gop,
			Optional<Rotation> rotation) implements TrackInfo {

		public VideoInfo {
			if (resolution == null) {
				throw new IllegalArgumentException("resolution must be non-null");
			}
			if (frameRate == null) {
				throw new IllegalArgumentException("frameRate must be non-null");
			}
		}

		public Integer gopFrames() {
			if (frameRate.mode() != FrameRateMode.CONSTANT || gop.isEmpty()) {
				return null;
			}
			double gopSeconds = gop.get().gopSeconds();
			return Math.toIntExact(Math.round(gopSeconds * frameRate.timeBaseRate().doubleValue()));
		}

		public record FrameRate(
				FrameRateMode mode,
				Rational average,
				Rational timeBaseRate) {
			public FrameRate {
				if (mode == null) {
					throw new IllegalArgumentException("mode must be non-null");
				}
				if (average == null) {
					throw new IllegalArgumentException("average must be non-null");
				}
				if (timeBaseRate == null) {
					throw new IllegalArgumentException("timeBaseRate must be non-null");
				}
			}
		}

		public record Color(
				PixelFormat pixelFormat,
				String colorRange,
				String colorSpace,
				String colorPrimaries,
				String colorTransfer) {}

		public record PixelFormat(String name, int bitDepth) {}

		/**
		 * The rotation a video pipeline should apply to display frames in the correct orientation.
		 *
		 * @see <a href="https://www.ffmpeg.org/doxygen/8.0/group__lavu__video__display.html">FFmpeg
		 *      display transformation matrix</a>
		 */
		public interface Rotation {
			/**
			 * How far to rotate the frame counter-clockwise to display it correctly, in degrees,
			 * from {@code -180} to {@code 180} inclusive. A negative value means a clockwise
			 * rotation.
			 *
			 * <p>
			 * For example, if the stored frames are rotated 90° counter-clockwise (common in
			 * videos captured on mobile devices) this returns {@code -90}, which indicates that
			 * they should be rotated 90° clockwise.
			 *
			 * @return the counter-clockwise rotation, in degrees, that corrects the frame
			 */
			int degrees();
		}

		record RotationImpl(int degrees) implements Rotation {
			RotationImpl {
				// https://www.ffmpeg.org/doxygen/8.0/group__lavu__video__display.html#gaac2ea94d3f66496c758349450b5b0217
				if (degrees < -180 || degrees > 180) {
					throw new IllegalArgumentException("degrees must be between -180 and 180");
				}
			}
		}

		public record Gop(double gopSeconds, long maxGopBytes) {
			public Gop {
				if (gopSeconds <= 0) {
					throw new IllegalArgumentException("gopSeconds must be positive");
				}
				if (maxGopBytes < 0) {
					throw new IllegalArgumentException("maxGopBytes must be non-negative");
				}
			}

			public long maxGopKbps() {
				double maxKbps = maxGopBytes * BITS_PER_BYTE / gopSeconds / BPS_TO_KBPS;
				return (long) Math.ceil(maxKbps);
			}
		}

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
			Duration duration,
			Long bytes,
			Codec codec,
			ChannelLayout layout,
			int sampleRate) implements TrackInfo {

		public record ChannelLayout(int channels) {}
	}

	public record Codec(
			String tag,
			String name,
			String profile) {}

	private record GopCandidate(long duration, long bytes) {}

	private record PacketAnalysis(List<GopCandidate> gopCandidates, List<Long> streamSizes) {}

	private static final class GopAccumulator {
		private final int videoStreamIndex;
		private final List<GopCandidate> candidates;
		private boolean aborted;
		private Long lastKeyframePts;
		private long intervalBytes;
		private long maxEndPts;

		GopAccumulator(final int videoStreamIndex) {
			this.videoStreamIndex = videoStreamIndex;
			candidates = new ArrayList<>();
		}

		void accept(final long pts, final long duration, final int size, final boolean isKeyframe) {
			if (aborted) {
				return;
			}
			if (pts == AV_NOPTS_VALUE()) {
				LOG.warn("A packet on video stream {} is missing pts; aborting GOP packet analysis", videoStreamIndex);
				aborted = true;
				return;
			}
			if (isKeyframe) {
				onKeyframe(pts);
			}
			intervalBytes += size;

			// compute furthest pts from last keyframe to get final GOP duration in finish()
			maxEndPts = Math.max(pts + duration, maxEndPts);
		}

		private void onKeyframe(final long pts) {
			if (lastKeyframePts != null) {
				candidates.add(new GopCandidate(pts - lastKeyframePts, intervalBytes));
				intervalBytes = 0;
			}
			lastKeyframePts = pts;
		}

		List<GopCandidate> finish() {
			if (aborted) {
				return List.of();
			}
			if (lastKeyframePts != null) {
				candidates.add(new GopCandidate(maxEndPts - lastKeyframePts, intervalBytes));
			}
			return candidates;
		}
	}

	private static final class AVStreamMetadataKeys {
		public static final String DURATION = "DURATION";

		private AVStreamMetadataKeys() {}
	}
}

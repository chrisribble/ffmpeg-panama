package io.github.chrisribble.ffm.ffmpeg.core;

import static io.github.chrisribble.ffmpeg8.FFmpeg.AVMEDIA_TYPE_AUDIO;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_NOPTS_VALUE;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PKT_FLAG_KEY;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_fourcc_make_string;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_read_frame;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.chrisribble.ffm.ffmpeg.core.MediaAnalyzer.VideoInfo.FrameRateMode;
import io.github.chrisribble.ffmpeg8.AVCodecParameters;
import io.github.chrisribble.ffmpeg8.AVFormatContext;
import io.github.chrisribble.ffmpeg8.AVPacket;
import io.github.chrisribble.ffmpeg8.AVRational;
import io.github.chrisribble.ffmpeg8.AVStream;
import io.github.chrisribble.ffmpeg8.FFmpeg;

public final class MediaAnalyzer {
	private static final double EPSILON = 1 / (double) TimeUnit.SECONDS.toNanos(1);
	private static final long MICROS_PER_S = TimeUnit.SECONDS.toMicros(1);
	private static final int CODEC_TAG_BUFFER_SIZE = 32;

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

			ContainerInfo container = getContainerInfo(pFormatCtx);
			VideoInfo video = getVideoInfo(videoStream, pFormatCtx, arena, analyzePackets);
			AudioInfo audio = getAudioInfo(audioStream);

			return new MediaInfo(container, video, audio);
		}
	}

	private ContainerInfo getContainerInfo(final MemorySegment pFormatCtx) {
		Duration duration = getContainerDuration(pFormatCtx);
		return new ContainerInfo(duration);
	}

	private VideoInfo getVideoInfo(final StreamInfo videoStream, final MemorySegment pFormatCtx, final Arena arena, final boolean analyzePackets) {
		if (videoStream == null) {
			return null;
		}

		String codecTag = getCodecTag(videoStream.codecTag());

		Duration duration = getStreamDuration(videoStream.avStream());
		Resolution resolution = getResolution(videoStream);

		FrameRateMode frameRateMode = getFrameRateMode(videoStream);

		Long gopDuration = analyzePackets && frameRateMode == FrameRateMode.CONSTANT
				? getGopDuration(arena, pFormatCtx, videoStream)
				: null;
		Double gopSeconds = gopDuration != null
				? gopDuration * videoStream.getTimeBase()
				: null;

		return new VideoInfo(
				videoStream.id(),
				codecTag,
				duration,
				resolution,
				frameRateMode,
				videoStream.getAvgFrameRate(),
				videoStream.getRFrameRate(),
				gopSeconds);
	}

	private AudioInfo getAudioInfo(final StreamInfo audioStream) {
		if (audioStream == null) {
			return null;
		}

		String codecTag = getCodecTag(audioStream.codecTag());
		Duration duration = getStreamDuration(audioStream.avStream());
		return new AudioInfo(
				audioStream.id(),
				codecTag,
				duration);
	}

	private static Duration getStreamDuration(final MemorySegment pStream) {
		long duration = AVStream.duration(pStream);
		if (duration == AV_NOPTS_VALUE()) {
			return null;
		}
		return getDuration(duration, AVStream.time_base(pStream));
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

	private Long getGopDuration(final Arena arena, final MemorySegment pFormatCtx, final StreamInfo videoStream) {
		List<Long> keyframes = getKeyFrames(arena, pFormatCtx, videoStream.index());
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

	private List<Long> getKeyFrames(final Arena arena, final MemorySegment pFormatCtx, final int filterStreamIndex) {
		List<Long> keyframes = new ArrayList<>();

		var packet = allocatePacket(arena);
		while (av_read_frame(pFormatCtx, packet) >= 0) {
			int streamIndex = AVPacket.stream_index(packet);
			int flags = AVPacket.flags(packet);

			// Ignore packets from streams we aren't interested in or which are not key frames
			if (streamIndex != filterStreamIndex || (flags & AV_PKT_FLAG_KEY()) == 0) {
				av_packet_unref(packet);
				continue;
			}

			long pts = AVPacket.pts(packet);
			av_packet_unref(packet);

			keyframes.add(pts);
		}

		return keyframes;
	}

	public String getCodecTag(final int tag) {
		try (Arena arena = Arena.ofConfined()) {
			// char*
			var buf = arena.allocate(CODEC_TAG_BUFFER_SIZE);
			av_fourcc_make_string(buf, tag);

			return buf.getString(0, StandardCharsets.UTF_8);
		}
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
		return p.reinterpret(arena, FFmpeg::av_packet_free);
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

	public record MediaInfo(ContainerInfo container, VideoInfo video, AudioInfo audio) {}

	public record ContainerInfo(
			Duration duration) {}

	public interface TrackInfo {
		int id();

		String codecTag();

		Duration duration();
	}

	public record VideoInfo(
			int id,
			String codecTag,
			Duration duration,
			Resolution resolution,
			FrameRateMode frameRateMode,
			Rational avgFrameRate,
			Rational rFrameRate,
			Double gopSeconds) implements TrackInfo {

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
	}

	public record AudioInfo(
			int id,
			String codecTag,
			Duration duration) implements TrackInfo {}
}

package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PKT_FLAG_KEY;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_read_frame;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.chrisribble.ffmpeg.example.MediaAnalyzer.MediaInfo.FrameRateMode;
import io.github.chrisribble.ffmpeg8.AVPacket;
import io.github.chrisribble.ffmpeg8.FFmpeg;

public class MediaAnalyzer {
	private static final double EPSILON = 1 / (double) TimeUnit.SECONDS.toNanos(1);

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
		this.inputs = new Path[inputs.length];
		System.arraycopy(inputs, 0, this.inputs, 0, inputs.length);
	}

	public MediaInfo getMediaInfo(final boolean calculateGop) {
		try (Arena arena = Arena.ofConfined()) {
			var pFormatCtx = AVFormatContextUtil.open(arena, inputs);

			List<StreamInfo> videoStreams = AVStreamUtil.getStreams(pFormatCtx, AVMEDIA_TYPE_VIDEO());
			StreamInfo videoStream = videoStreams.getFirst();

			FrameRateMode mode = getFrameRateMode(videoStream);

			Long gopDuration = calculateGop && mode == FrameRateMode.CONSTANT
					? getGopDuration(arena, pFormatCtx, videoStream)
					: null;
			Double gopSeconds = gopDuration != null
					? gopDuration * videoStream.getTimeBase()
					: null;

			return new MediaInfo(
					mode,
					videoStream.getAvgFrameRate(),
					videoStream.getRFrameRate(),
					gopSeconds);
		}
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

	public record MediaInfo(
			FrameRateMode frameRateMode,
			Rational avgFrameRate,
			Rational rFrameRate,
			Double gopSeconds) {

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

		public MediaInfo {
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
}

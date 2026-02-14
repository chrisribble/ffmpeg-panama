package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PKT_FLAG_KEY;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_read_frame;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffmpeg8.AVPacket;
import io.github.chrisribble.ffmpeg8.FFmpeg;

public class MediaAnalyzer {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final long MICROS_PER_S = TimeUnit.SECONDS.toMicros(1);

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

	public MediaInfo getMediaInfo() {
		try (Arena arena = Arena.ofConfined()) {
			var pFormatCtx = AVFormatContextUtil.open(arena, inputs);

			List<StreamInfo> videoStreams = AVStreamUtil.getStreams(pFormatCtx, AVMEDIA_TYPE_VIDEO());
			StreamInfo videoStream = videoStreams.getFirst();

			List<Long> keyframes = getKeyFrames(arena, pFormatCtx, videoStream.index());

			long timescale = videoStream.getTimescale();
			for (Long keyframe : keyframes) {
				long micros = keyframe * MICROS_PER_S / timescale;
				LOG.info("{}", micros / (double) MICROS_PER_S);
			}

			LOG.info("avg_frame_rate: {} FPS", Math.round(videoStream.getAvgFrameRate() * 1000) / 1000.0);
			LOG.info("r_frame_rate: {} FPS", videoStream.getRFrameRate());
			LOG.info("Found {} keyframes and timescale={}", keyframes.size(), timescale);

			// TODO: Stub
			return null;
		}
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

	public record MediaInfo() {}
}

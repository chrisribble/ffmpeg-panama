package io.github.chrisribble.ffm.ffmpeg.analyzer;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.AudioInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.ContainerInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.MediaInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo;

public class MediaAnalyzerTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Test
	public void testGetMediaInfo() {
		var analyzer = new MediaAnalyzer(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath());

		long startNanos = System.nanoTime();

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);

		long totalNanos = System.nanoTime() - startNanos;
		LOG.debug("Time: {}ms", TimeUnit.NANOSECONDS.toMillis(totalNanos));
		System.out.println();

		ContainerInfo containerInfo = mediaInfo.container();
		System.out.println("General");
		System.out.println("Duration                                 : " + containerInfo.duration());
		System.out.println();

		VideoInfo videoInfo = mediaInfo.video();
		if (videoInfo != null) {
			System.out.println("Video");
			System.out.println("ID                                       : " + videoInfo.id());
			System.out.println("Codec ID                                 : " + videoInfo.codecTag());
			System.out.println("Duration                                 : " + videoInfo.duration());
			System.out.println("Width                                    : " + videoInfo.resolution().width());
			System.out.println("Height                                   : " + videoInfo.resolution().height());
			System.out.println("Frame rate mode                          : " + videoInfo.frameRateMode());
			System.out.println("Frame rate                               : " + getFrameRate(videoInfo) + " FPS");
			Double gopSeconds = videoInfo.gopSeconds();
			if (gopSeconds != null) {
				Integer gopFrames = videoInfo.gopFrames();
				System.out.println("Format settings, GOP                     : N=" + gopFrames + ", " + gopSeconds + "s");
			}
			System.out.println();
		}

		AudioInfo audioInfo = mediaInfo.audio();
		if (audioInfo != null) {
			System.out.println("Audio");
			System.out.println("ID                                       : " + audioInfo.id());
			System.out.println("Codec ID                                 : " + audioInfo.codecTag());
			System.out.println("Duration                                 : " + audioInfo.duration());
			System.out.println();
		}
	}

	private String getFrameRate(final VideoInfo videoInfo) {
		return switch (videoInfo.frameRateMode()) {
			case CONSTANT -> videoInfo.rFrameRate().den() == 1
					? videoInfo.rFrameRate().toString()
					: formatFrameRate(videoInfo.avgFrameRate().doubleValue()) + " (" + videoInfo.rFrameRate() + ")";
			case VARIABLE -> formatFrameRate(videoInfo.avgFrameRate().doubleValue());
		};
	}

	private String formatFrameRate(final double value) {
		return String.format("%.3f", value);
	}
}

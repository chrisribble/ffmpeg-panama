package io.github.chrisribble.ffm.ffmpeg.core;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import io.github.chrisribble.ffm.ffmpeg.core.MediaAnalyzer.MediaInfo;

public class MediaAnalyzerTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Test
	public void testGetMediaInfo() {
		var analyzer = new MediaAnalyzer(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath());

		long startNanos = System.nanoTime();

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);

		long totalNanos = System.nanoTime() - startNanos;
		LOG.debug("Time: {}ms", TimeUnit.NANOSECONDS.toMillis(totalNanos));
		System.out.println("Frame rate mode                          : " + mediaInfo.frameRateMode());
		System.out.println("Frame rate                               : " + getFrameRate(mediaInfo) + " FPS");

		Double gopSeconds = mediaInfo.gopSeconds();
		if (gopSeconds != null) {
			Integer gopFrames = mediaInfo.gopFrames();
			System.out.println("Format settings, GOP                     : N=" + gopFrames + ", " + gopSeconds + "s");
		}
	}

	private String getFrameRate(final MediaInfo mediaInfo) {
		return switch (mediaInfo.frameRateMode()) {
			case CONSTANT -> mediaInfo.rFrameRate().den() == 1
					? mediaInfo.rFrameRate().toString()
					: formatFrameRate(mediaInfo.avgFrameRate().doubleValue()) + " (" + mediaInfo.rFrameRate() + ")";
			case VARIABLE -> formatFrameRate(mediaInfo.avgFrameRate().doubleValue());
		};
	}

	private String formatFrameRate(final double value) {
		return String.format("%.3f", value);
	}
}

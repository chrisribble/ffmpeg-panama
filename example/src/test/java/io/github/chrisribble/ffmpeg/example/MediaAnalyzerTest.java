package io.github.chrisribble.ffmpeg.example;

import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import io.github.chrisribble.ffmpeg.example.MediaAnalyzer.MediaInfo;

public class MediaAnalyzerTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	// One nanosecond
	private static final double EPSILON = 0.000000001d;

	@Test
	public void testGetMediaInfo() {
		//var analyzer = new MediaAnalyzer(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath());
		//var analyzer = new MediaAnalyzer(Path.of("/home/chris/work/resi/media/Spring.1080p-VFR.mp4"));
		var analyzer = new MediaAnalyzer(Path.of("/home/chris/work/resi/media/Spring.1080p-good.mp4"));

		analyzer.getMediaInfo();

		long startNanos = System.nanoTime();

		MediaInfo mediaInfo = analyzer.getMediaInfo();

		long totalNanos = System.nanoTime() - startNanos;
		System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(totalNanos) + "ms");

		LOG.info("avg_frame_rate: {} FPS", mediaInfo.avgFrameRate());
		LOG.info("r_frame_rate: {} FPS", mediaInfo.rFrameRate());
		LOG.info("rational r_frame_rate: {} FPS", mediaInfo.rationalRFrameRate());

		String frameRateMode = doubleEquals(mediaInfo.avgFrameRate(), mediaInfo.rFrameRate()) ? "Constant" : "Variable";
		System.out.println("Frame rate mode                          : " + frameRateMode);
		System.out.println("Frame rate                               : " + getFrameRate(mediaInfo) + " FPS");
	}

	private boolean doubleEquals(final double a, final double b) {
		return Math.abs(a - b) <= EPSILON;
	}

	private String getFrameRate(final MediaInfo mediaInfo) {
		if (!doubleEquals(mediaInfo.avgFrameRate(), mediaInfo.rFrameRate())) {
			return formatFrameRate(mediaInfo.avgFrameRate());
		}

		String formatted = formatFrameRate(mediaInfo.rFrameRate());

		return mediaInfo.rationalRFrameRate().contains("/")
				? formatted + " (" + mediaInfo.rationalRFrameRate() + ")"
				: formatted;
	}

	private String formatFrameRate(final double value) {
		return String.format("%.3f", value);
	}

	private double round(final double value, final int decimals) {
		int multiplier = Math.powExact(10, decimals);
		long rounded = Math.round(value * multiplier);
		return rounded / (double) multiplier;
	}
}

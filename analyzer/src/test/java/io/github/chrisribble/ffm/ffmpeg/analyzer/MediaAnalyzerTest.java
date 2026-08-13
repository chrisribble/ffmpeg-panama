package io.github.chrisribble.ffm.ffmpeg.analyzer;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.lang.invoke.MethodHandles;
import java.time.Duration;
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
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);

		VideoInfo videoInfo = mediaInfo.video();
		AudioInfo audioInfo = mediaInfo.audio();

		assertNotNull(videoInfo);
		assertEquals(videoInfo.codecTag(), "hvc1");
		assertEquals(videoInfo.duration(), Duration.ofSeconds(10L));
		assertEquals(videoInfo.resolution().width(), 1920);
		assertEquals(videoInfo.resolution().height(), 1080);
		assertEquals(videoInfo.frameRateMode(), VideoInfo.FrameRateMode.CONSTANT);
		assertEquals(getFrameRate(videoInfo), "30");
		assertEquals(videoInfo.colorInfo().pixelFormat(), "yuv420p10le");
		assertEquals(videoInfo.colorInfo().colorRange(), "tv");
		assertEquals(videoInfo.colorInfo().colorSpace(), "bt2020nc");
		assertEquals(videoInfo.colorInfo().colorPrimaries(), "bt2020");
		assertEquals(videoInfo.colorInfo().colorTransfer(), "smpte2084");

		assertNotNull(audioInfo);
		assertEquals(audioInfo.codecTag(), "mp4a");
		assertEquals(audioInfo.duration(), Duration.ofSeconds(10L));
	}

	public static void main(final String[] args) {
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

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
			System.out.println("Pixel Format                             : " + videoInfo.colorInfo().pixelFormat());
			System.out.println("Color Range                              : " + videoInfo.colorInfo().colorRange());
			System.out.println("Color Space                              : " + videoInfo.colorInfo().colorSpace());
			System.out.println("Color Primaries                          : " + videoInfo.colorInfo().colorPrimaries());
			System.out.println("Color Transfer                           : " + videoInfo.colorInfo().colorTransfer());
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

	private static String getFrameRate(final VideoInfo videoInfo) {
		return switch (videoInfo.frameRateMode()) {
			case CONSTANT -> videoInfo.rFrameRate().den() == 1
					? videoInfo.rFrameRate().toString()
					: formatFrameRate(videoInfo.avgFrameRate().doubleValue()) + " (" + videoInfo.rFrameRate() + ")";
			case VARIABLE -> formatFrameRate(videoInfo.avgFrameRate().doubleValue());
		};
	}

	private static String formatFrameRate(final double value) {
		return String.format("%.3f", value);
	}
}

package io.github.chrisribble.ffm.ffmpeg.analyzer;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.lang.invoke.MethodHandles;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.AudioInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.AudioInfo.ChannelLayout;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.ContainerInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.MediaInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.TrackInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.FrameRate;
import io.github.chrisribble.ffm.ffmpeg.analyzer.MediaAnalyzer.VideoInfo.Gop;
import io.github.chrisribble.ffm.ffmpeg.core.Rational;
import io.github.chrisribble.ffm.ffmpeg.core.Resolution;

public class MediaAnalyzerTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final long BYTES_PER_KIB = 1024;
	private static final String PREFIXES = "KMGTPEZYQ";

	@Test
	public void testGetMediaInfo() {
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);
		VideoInfo videoInfo = mediaInfo.video();
		AudioInfo audioInfo = mediaInfo.audio();

		assertNotNull(videoInfo);
		assertEquals(videoInfo.codec().tag(), "hvc1");
		assertEquals(videoInfo.codec().name(), "hevc");
		assertEquals(videoInfo.duration(), Duration.ofSeconds(10L));
		assertEquals(videoInfo.resolution().width(), 1920);
		assertEquals(videoInfo.resolution().height(), 1080);
		assertEquals(videoInfo.frameRate().mode(), VideoInfo.FrameRateMode.CONSTANT);
		assertEquals(getFrameRate(videoInfo), "30");
		assertEquals(videoInfo.bytes(), 40348);
		assertEquals(videoInfo.bitrateKbps(), 32);
		assertEquals(videoInfo.color().colorSpace(), "bt2020nc");
		assertEquals(videoInfo.color().colorRange(), "tv");
		assertEquals(videoInfo.color().colorPrimaries(), "bt2020");
		assertEquals(videoInfo.color().colorTransfer(), "smpte2084");
		assertEquals(videoInfo.color().pixelFormat(), "yuv420p10le");

		assertNotNull(audioInfo);
		assertEquals(audioInfo.codec().tag(), "mp4a");
		assertEquals(audioInfo.codec().name(), "aac");
		assertEquals(audioInfo.codec().profile(), "LC");
		assertEquals(audioInfo.duration(), Duration.ofSeconds(10L));

		assertNotNull(audioInfo.layout());
		assertEquals(audioInfo.layout().channels(), 1);

		assertEquals(audioInfo.sampleRate(), 48000);
		assertEquals(audioInfo.bytes(), 190832);
		assertEquals(audioInfo.bitrateKbps(), 152);
	}

	@Test
	public void testMaxGopBytes() {
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);
		VideoInfo videoInfo = mediaInfo.video();

		assertNotNull(videoInfo);

		Optional<Gop> maybeGopInfo = videoInfo.gop();
		assertTrue(maybeGopInfo.isPresent());

		Gop gopInfo = maybeGopInfo.get();
		assertEquals(gopInfo.maxGopBytes(), 31295);
		assertTrue(gopInfo.maxGopBytes() <= videoInfo.bytes());
	}

	@Test
	public void testMaxGopKbps() {
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);
		VideoInfo videoInfo = mediaInfo.video();

		assertNotNull(videoInfo);

		Optional<Gop> maybeGopInfo = videoInfo.gop();
		assertTrue(maybeGopInfo.isPresent());

		Gop gopInfo = maybeGopInfo.get();
		assertEquals(gopInfo.maxGopKbps(), 31);
	}

	@Test
	public void testGopInfoEmptyWithoutPacketAnalysis() {
		var analyzer = new MediaAnalyzer(MediaResources.HDR_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(false);
		VideoInfo videoInfo = mediaInfo.video();

		assertNotNull(videoInfo);
		assertTrue(videoInfo.gop().isEmpty());
	}

	@Test
	public void testMkvStreamDurationMetadata() {
		var analyzer = new MediaAnalyzer(MediaResources.DURATION_METADATA_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);
		VideoInfo videoInfo = mediaInfo.video();
		AudioInfo audioInfo = mediaInfo.audio();

		assertNotNull(videoInfo);
		assertEquals(videoInfo.duration(), Duration.parse("PT10.00S"));

		assertNotNull(audioInfo);
		assertEquals(audioInfo.duration(), Duration.parse("PT10.021S"));
	}

	@Test
	public void testMkvNoStreamDurationMetadata() {
		var analyzer = new MediaAnalyzer(MediaResources.DURATION_NO_METADATA_TEST.getPath());

		MediaInfo mediaInfo = analyzer.getMediaInfo(true);
		VideoInfo videoInfo = mediaInfo.video();
		AudioInfo audioInfo = mediaInfo.audio();

		var containerDuration = Duration.parse("PT10.005333S");

		assertNotNull(videoInfo);
		assertEquals(videoInfo.duration(), containerDuration);

		assertNotNull(audioInfo);
		assertEquals(audioInfo.duration(), containerDuration);
	}

	@DataProvider(name = "nullDurationTrackInfos")
	public Object[][] getNullDurationTrackInfos() {
		return new Object[][] {
				{ new VideoInfo(0, null, 1000L, new Resolution(1920, 1080),
						new FrameRate(VideoInfo.FrameRateMode.CONSTANT, new Rational(30, 1), new Rational(30, 1)),
						null, null, Optional.empty()) },
				{ new AudioInfo(0, null, 1000L, null, null, 48000) }
		};
	}

	@Test(dataProvider = "nullDurationTrackInfos")
	public void testTrackInfoNullDurationReturnsNull(final TrackInfo trackInfo) {
		assertNull(trackInfo.bitrateKbps());
	}

	@DataProvider(name = "lessThanOneSecondDurationTrackInfos")
	public Object[][] getLessThanOneSecondDurationTrackInfos() {
		return new Object[][] {
				{ new VideoInfo(0, Duration.ofMillis(999L), 1000L, new Resolution(1920, 1080),
						new FrameRate(VideoInfo.FrameRateMode.CONSTANT, new Rational(30, 1), new Rational(30, 1)),
						null, null, Optional.empty()) },
				{ new AudioInfo(0, Duration.ofMillis(999L), 1000L, null, null, 48000) }
		};
	}

	@Test(dataProvider = "lessThanOneSecondDurationTrackInfos", expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "Duration must be >= 1 second")
	public void testStreamInfoDurationLessThanOneSecond(final TrackInfo trackInfo) {
		trackInfo.bitrateKbps();
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
			System.out.println("Codec ID                                 : " + videoInfo.codec().tag());
			System.out.println("Codec name                               : " + videoInfo.codec().name());
			System.out.println("Codec profile                            : " + videoInfo.codec().profile());
			System.out.println("Duration                                 : " + videoInfo.duration());
			System.out.println("Bit rate                                 : " + videoInfo.bitrateKbps() + " kb/s");
			System.out.println("Width                                    : " + videoInfo.resolution().width());
			System.out.println("Height                                   : " + videoInfo.resolution().height());
			System.out.println("Frame rate mode                          : " + videoInfo.frameRate().mode());
			System.out.println("Frame rate                               : " + getFrameRate(videoInfo) + " FPS");
			videoInfo.gop().ifPresent(info -> {
				Integer gopFrames = videoInfo.gopFrames();
				System.out.println("Format settings, GOP                     : N=" + gopFrames + ", " + info.gopSeconds() + "s");
			});
			System.out.println("Stream size                              : " + toHumanReadable(videoInfo.bytes()));
			System.out.println("Color space                              : " + videoInfo.color().colorSpace());
			System.out.println("Color range                              : " + videoInfo.color().colorRange());
			System.out.println("Color primaries                          : " + videoInfo.color().colorPrimaries());
			System.out.println("Color transfer                           : " + videoInfo.color().colorTransfer());
			System.out.println("Pixel format                             : " + videoInfo.color().pixelFormat());
			System.out.println();
		}

		AudioInfo audioInfo = mediaInfo.audio();
		if (audioInfo != null) {
			ChannelLayout layout = audioInfo.layout();

			System.out.println("Audio");
			System.out.println("ID                                       : " + audioInfo.id());
			System.out.println("Codec ID                                 : " + audioInfo.codec().tag());
			System.out.println("Codec name                               : " + audioInfo.codec().name());
			System.out.println("Codec profile                            : " + audioInfo.codec().profile());
			System.out.println("Duration                                 : " + audioInfo.duration());
			System.out.println("Bit rate                                 : " + audioInfo.bitrateKbps() + " kb/s");
			System.out.println("Channel(s)                               : " + layout.channels() + " channel" + (layout.channels() > 1 ? "s" : ""));
			System.out.println("Sampling rate                            : " + audioInfo.sampleRate());
			System.out.println("Stream size                              : " + toHumanReadable(audioInfo.bytes()));
			System.out.println();
		}
	}

	private static String getFrameRate(final VideoInfo videoInfo) {
		FrameRate frameRate = videoInfo.frameRate();
		return switch (frameRate.mode()) {
			case CONSTANT -> frameRate.timeBaseRate().den() == 1
					? frameRate.timeBaseRate().toString()
					: formatFrameRate(frameRate.average().doubleValue()) + " (" + frameRate.timeBaseRate() + ")";
			case VARIABLE -> formatFrameRate(frameRate.average().doubleValue());
		};
	}

	private static String formatFrameRate(final double value) {
		return String.format("%.3f", value);
	}

	public static String toHumanReadable(final long bytes) {
		if (bytes < BYTES_PER_KIB) {
			return bytes + " B";
		}

		double value = bytes;
		int index = 0;
		for (int i = 0; i < PREFIXES.length() && value > BYTES_PER_KIB; ++i) {
			value /= BYTES_PER_KIB;
			index = i;
		}

		char prefix = PREFIXES.charAt(index);
		return String.format("%.2f %siB", value, prefix);
	}
}

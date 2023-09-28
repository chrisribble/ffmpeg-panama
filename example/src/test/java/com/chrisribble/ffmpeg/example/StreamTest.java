package com.chrisribble.ffmpeg.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class StreamTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final Path MP4 = Paths.get("/home/chris/Desktop/video/fireman-clip.mp4");

	@Test
	public void testStuff() throws IOException {
		AtomicInteger counter = new AtomicInteger();
		Path tmpDir = Files.createTempDirectory("foo");

		//av_log_set_level(AV_LOG_VERBOSE());

		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = Mp4FrameStream.builder()
				.mp4(MP4)
				.modFrames(100)
				.palette(ColorPalette.GRAY)
				.build()) {

			stream.forEach(i -> {
				LOG.info("image sampled");

				Path file = Paths.get(tmpDir.toString(), "frame" + counter.incrementAndGet() + ".bmp");
				try {
					ImageIO.write(i, "bmp", file.toFile());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}

			});

			long totalNanos = System.nanoTime() - startNanos;
			LOG.info("Sampled {} images in {}ms", counter.get(), TimeUnit.NANOSECONDS.toMillis(totalNanos));
		} finally {
			Files.walk(tmpDir)
					.sorted(Comparator.reverseOrder())
					.map(Path::toFile)
					.forEach(File::delete);
		}
	}
}

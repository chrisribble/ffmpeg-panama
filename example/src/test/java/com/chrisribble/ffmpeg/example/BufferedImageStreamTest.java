package com.chrisribble.ffmpeg.example;

import static com.chrisribble.ffmpeg6.FFmpeg.AV_LOG_WARNING;
import static com.chrisribble.ffmpeg6.FFmpeg_1.av_log_set_level;
import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class BufferedImageStreamTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final Dimensions OUTPUT_SIZE = new Dimensions(960, 540);

	@Test
	public void testStream() throws IOException {
		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());

		//av_log_set_level(AV_LOG_VERBOSE());
		av_log_set_level(AV_LOG_WARNING());

		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.mp4(MediaResources.LAVFI_TEST_SRC.getPath())
				.modFrames(100)
				.pixelFormat(PixelFormat.RGB)
				.dimensions(OUTPUT_SIZE)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 3);

			// TODO: Assert on some more stuff
			int frameNumber = 0;
			for (var image : images) {
				writeImage(tmpDir, image, ++frameNumber);
			}

			long totalNanos = System.nanoTime() - startNanos;
			LOG.info("Sampled {} images in {}ms", images.size(), TimeUnit.NANOSECONDS.toMillis(totalNanos));
		} finally {
			Files.walk(tmpDir)
					.sorted(Comparator.reverseOrder())
					.map(Path::toFile)
					.forEach(File::delete);
		}
	}

	// TODO: Think of a good way to validate without writing and visually inspecting images
	private void writeImage(final Path tmpDir, final BufferedImage image, final int frameNumber) {
		LOG.debug("image sampled");

		Path file = Paths.get(tmpDir.toString(), "frame" + frameNumber + ".bmp");
		try {
			ImageIO.write(image, "bmp", file.toFile());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_LOG_WARNING;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_log_set_level;
import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BufferedImageStreamTest {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final Resolution OUTPUT_RESOLUTION = new Resolution(960, 540);
	private static final int MOD_FRAMES = 50;

	private static final Path INVALID_PATH = Path.of("does/not/exist");

	static {
		//av_log_set_level(AV_LOG_TRACE());
		//av_log_set_level(AV_LOG_DEBUG());
		//av_log_set_level(AV_LOG_VERBOSE());
		//av_log_set_level(AV_LOG_INFO());
		av_log_set_level(AV_LOG_WARNING());
	}

	@DataProvider(name = "pixelFormat")
	public PixelFormat[] pixelFormats() {
		Stream<PixelFormat> formats = Arrays.stream(PixelFormat.values());
		return Stream.concat(formats, Stream.of((PixelFormat) null))
				.toArray(PixelFormat[]::new);
	}

	@Test
	public void testManagedArena() throws IOException {
		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.resolution(OUTPUT_RESOLUTION)
				.limit(2)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 2);
		}
	}

	@Test
	public void testConfinedArena() throws IOException {
		try (Arena arena = Arena.ofConfined();
				Stream<BufferedImage> stream = BufferedImageStream.builder(arena)
						.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
						.resolution(OUTPUT_RESOLUTION)
						.limit(2)
						.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 2);
		}
	}

	@Test
	public void testSharedArena() throws IOException {
		try (Arena arena = Arena.ofShared();
				Stream<BufferedImage> stream = BufferedImageStream.builder(arena)
						.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
						.resolution(OUTPUT_RESOLUTION)
						.limit(2)
						.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 2);
		}
	}

	@Test
	public void testAutoArena() throws IOException {
		Arena arena = Arena.ofAuto();
		try (Stream<BufferedImage> stream = BufferedImageStream.builder(arena)
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.resolution(OUTPUT_RESOLUTION)
				.limit(2)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 2);
		}
	}

	@Test(expectedExceptions = FileNotFoundException.class)
	public void testFileNotFoundException() throws IOException {
		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(INVALID_PATH)
				.resolution(OUTPUT_RESOLUTION)
				.modFrames(MOD_FRAMES)
				.build()) {
			// should throw before calling toList
			stream.toList();
		}
	}

	@Test(expectedExceptions = FileNotFoundException.class)
	public void testUnmanagedFileNotFoundException() throws IOException {
		try (Arena arena = Arena.ofConfined();
				Stream<BufferedImage> stream = BufferedImageStream.builder(arena)
						.inputs(INVALID_PATH)
						.resolution(OUTPUT_RESOLUTION)
						.modFrames(MOD_FRAMES)
						.build()) {
			// should throw before calling toList
			stream.toList();
		}
	}

	@Test(dataProvider = "pixelFormat")
	public void testStreamPixelFormat(final PixelFormat format) throws IOException {
		int limit = 3;

		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.pixelFormat(format)
				.resolution(OUTPUT_RESOLUTION)
				.limit(limit)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), limit);

			writeImages(tmpDir, images);
			logSampled(images.size(), format, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test(dataProvider = "pixelFormat")
	public void testStreamModFrames(final PixelFormat format) throws IOException {
		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.pixelFormat(format)
				.resolution(OUTPUT_RESOLUTION)
				.modFrames(MOD_FRAMES)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 5);

			writeImages(tmpDir, images);
			logSampled(images.size(), format, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test(dataProvider = "pixelFormat")
	public void testStreamModFramesLimit(final PixelFormat format) throws IOException {
		int limit = 2;

		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.pixelFormat(format)
				.resolution(OUTPUT_RESOLUTION)
				.modFrames(MOD_FRAMES)
				.limit(limit)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), limit);

			writeImages(tmpDir, images);
			logSampled(images.size(), PixelFormat.BGR, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test(dataProvider = "pixelFormat")
	public void testStreamLimit(final PixelFormat format) throws IOException {
		int limit = 1;

		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.pixelFormat(format)
				.resolution(OUTPUT_RESOLUTION)
				.limit(limit)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), limit);

			writeImages(tmpDir, images);
			logSampled(images.size(), PixelFormat.BGR, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test(dataProvider = "pixelFormat")
	public void testStreamNativeLimit(final PixelFormat format) throws IOException {
		int limit = 1;

		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
				.pixelFormat(format)
				.resolution(OUTPUT_RESOLUTION)
				.build()) {

			List<BufferedImage> images = stream.limit(limit)
					.toList();
			assertEquals(images.size(), limit);

			writeImages(tmpDir, images);
			logSampled(images.size(), PixelFormat.BGR, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test
	public void testIsoBmffSegmentsList() throws IOException {
		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(List.of(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath()))
				.resolution(OUTPUT_RESOLUTION)
				.modFrames(MOD_FRAMES)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 5);

			writeImages(tmpDir, images);
			logSampled(images.size(), PixelFormat.BGR, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	@Test
	public void testIsoBmffSegmentsVarArgs() throws IOException {
		Path tmpDir = Files.createTempDirectory(MethodHandles.lookup().lookupClass().getSimpleName());
		long startNanos = System.nanoTime();

		try (Stream<BufferedImage> stream = BufferedImageStream.builder()
				.inputs(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath())
				.resolution(OUTPUT_RESOLUTION)
				.modFrames(MOD_FRAMES)
				.build()) {

			List<BufferedImage> images = stream.toList();
			assertEquals(images.size(), 5);

			writeImages(tmpDir, images);
			logSampled(images.size(), PixelFormat.BGR, System.nanoTime() - startNanos);
		} finally {
			delete(tmpDir);
		}
	}

	private void writeImages(final Path dir, final List<BufferedImage> images) {
		int frameNumber = 0;
		for (var image : images) {
			writeImage(dir, image, ++frameNumber);
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

	private void logSampled(final int count, final PixelFormat format, final long totalNanos) {
		LOG.info("Sampled {} {} images in {}ms", count, format, TimeUnit.NANOSECONDS.toMillis(totalNanos));
	}

	private void delete(final Path tmpDir) throws IOException {
		Files.walk(tmpDir)
				.sorted(Comparator.reverseOrder())
				.map(Path::toFile)
				.forEach(File::delete);
	}
}

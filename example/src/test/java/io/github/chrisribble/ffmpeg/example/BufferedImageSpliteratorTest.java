package io.github.chrisribble.ffmpeg.example;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNull;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.lang.foreign.Arena;
import java.util.Spliterator;

import org.testng.annotations.Test;

public class BufferedImageSpliteratorTest {
	@Test
	public void testProperties() throws FileNotFoundException {
		try (Arena arena = Arena.ofConfined()) {
			Spliterator<BufferedImage> splitr = BufferedImageStreamSpliterator.builder(arena)
					.inputs(MediaResources.LAVFI_TEST_SRC.getPath())
					.build();

			assertNull(splitr.trySplit(), "trySplit should return null indicating that splitting is not possible");

			assertEquals(splitr.estimateSize(), Long.MAX_VALUE, "estimateSize should return Long.MAX_VALUE to indicate unknown size");

			assertEquals(splitr.characteristics() & Spliterator.NONNULL, Spliterator.NONNULL, "characteristics should include NONNULL");
			assertEquals(splitr.characteristics() & Spliterator.ORDERED, Spliterator.ORDERED, "characteristics should include ORDERED");
			assertEquals(splitr.characteristics() & Spliterator.IMMUTABLE, Spliterator.IMMUTABLE, "characteristics should include IMMUTABLE");
			assertNotEquals(splitr.characteristics() & Spliterator.CONCURRENT, Spliterator.CONCURRENT, "characteristics should NOT include CONCURRENT");
		}
	}
}

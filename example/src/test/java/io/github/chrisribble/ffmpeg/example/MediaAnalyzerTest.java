package io.github.chrisribble.ffmpeg.example;

import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class MediaAnalyzerTest {

	@Test
	public void testGetMediaInfo() {
		//var analyzer = new MediaAnalyzer(MediaResources.LAVFI_TEST_SRC_INIT.getPath(), MediaResources.LAVFI_TEST_SRC_CHUNK.getPath());
		//var analyzer = new MediaAnalyzer(Path.of("/home/chris/work/resi/media/Spring.1080p-VFR.mp4"));
		var analyzer = new MediaAnalyzer(Path.of("/home/chris/work/resi/media/Chase_Oaks-Sunday-1080p.mp4"));
		analyzer.getMediaInfo();

		long startNanos = System.nanoTime();

		analyzer.getMediaInfo();

		long totalNanos = System.nanoTime() - startNanos;
		System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(totalNanos) + "ms");
	}
}

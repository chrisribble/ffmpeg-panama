package io.github.chrisribble.ffmpeg.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MediaResources {
	private static final String RESOURCES_BASE = "src/test/resources";

	public static final TestFile LAVFI_TEST_SRC = new TestFile(RESOURCES_BASE, "testsrc.mp4");

	private MediaResources() {}

	public record TestFile(String resources, String file) {
		public Path getPath() {
			return Paths.get(resources, file);
		}
	}
}

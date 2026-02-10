package io.github.chrisribble.ffmpeg.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MediaResources {
	private static final String RESOURCES_BASE = "src/test/resources";

	public static final TestFile LAVFI_TEST_SRC = new TestFile(RESOURCES_BASE, "testsrc.mp4");

	public static final TestFile LAVFI_TEST_SRC_INIT = new TestFile(RESOURCES_BASE, "init-stream0.m4s");
	public static final TestFile LAVFI_TEST_SRC_CHUNK = new TestFile(RESOURCES_BASE, "chunk-stream0-00001.m4s");

	private MediaResources() {}

	public record TestFile(String resources, String file) {
		public Path getPath() {
			return Paths.get(resources, file);
		}
	}
}

package io.github.chrisribble.ffmpeg.example;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LibavVersionTest {
	@Test
	public void getVersionInfo() {
		String versionInfo = LibavVersion.getVersionInfo();
		assertNotNull(versionInfo, "versionInfo should be non-null");
		assertFalse(versionInfo.isEmpty(), "versionInfo should be non-empty");
		assertFalse(versionInfo.isBlank(), "versionInfo should be non-blank");
		assertTrue(versionInfo.length() >= 3, "versionInfo should contain at least 3 characters");
	}

	@Test
	public void testIsCompatible() {
		assertTrue(LibavVersion.getInstance().isCompatible(),
				"runtime FFmpeg version (" + LibavVersion.getVersionInfo() + ") should be compatible with binding version");
	}
}

package io.github.chrisribble.ffmpeg.example;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffmpeg7.FFmpeg;
import io.github.chrisribble.ffmpeg7.FFmpeg_1;
import io.github.chrisribble.ffmpeg7.FFmpeg_3;

final class LibavVersion {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final int AVCODEC_VERSION = FFmpeg.LIBAVCODEC_VERSION_INT();
	private static final int AVFORMAT_VERSION = FFmpeg.LIBAVFORMAT_VERSION_INT();
	private static final int AVUTIL_VERSION = FFmpeg.LIBAVUTIL_VERSION_INT();
	private static final int SWSCALE_VERSION = FFmpeg.LIBSWSCALE_VERSION_INT();

	private final int avCodecVersion;
	private final int avFormatVersion;
	private final int avUtilVersion;
	private final int swScaleVersion;

	private final boolean compatible;

	private LibavVersion() {
		// Cache down-calls and compatibility check so that it's cheap to verify in all consumers
		avCodecVersion = getAvCodecVersion();
		avFormatVersion = getAvFormatVersion();
		avUtilVersion = getAvUtilVersion();
		swScaleVersion = getSwScaleVersion();

		boolean avCodecMatches = isCompatible("libavcodec", avCodecVersion, AVCODEC_VERSION);
		boolean avFormatMatches = isCompatible("libavformat", avFormatVersion, AVFORMAT_VERSION);
		boolean avUtilMatches = isCompatible("libavutil", avUtilVersion, AVUTIL_VERSION);
		boolean swScaleMatches = isCompatible("libswscale", swScaleVersion, SWSCALE_VERSION);
		compatible = avCodecMatches && avFormatMatches && avUtilMatches && swScaleMatches;
	}

	private static final class LazyHolder {
		static final LibavVersion INSTANCE = new LibavVersion();
	}

	public static LibavVersion getInstance() {
		return LazyHolder.INSTANCE;
	}

	public static String getVersionInfo() {
		return FFmpeg_3.av_version_info().getString(0, StandardCharsets.UTF_8);
	}

	public boolean isCompatible() {
		return compatible;
	}

	private static int getAvCodecVersion() {
		return FFmpeg_1.avcodec_version();
	}

	private static int getAvFormatVersion() {
		return FFmpeg_1.avformat_version();
	}

	private static int getAvUtilVersion() {
		return FFmpeg_3.avutil_version();
	}

	private static int getSwScaleVersion() {
		return FFmpeg.swscale_version();
	}

	private static boolean isCompatible(final String name, final int runtimeVersion, final int bindingVersion) {
		if (runtimeVersion == bindingVersion) {
			return true;
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("{} version [binding / runtime]: [{}.{}.{} / {}.{}.{}]",
					name,
					getMajorVersion(bindingVersion), getMinorVersion(bindingVersion), getMicroVersion(bindingVersion),
					getMajorVersion(runtimeVersion), getMinorVersion(runtimeVersion), getMicroVersion(runtimeVersion));
		}

		int runtimeMajor = getMajorVersion(runtimeVersion);
		int bindingMajor = getMajorVersion(bindingVersion);

		if (runtimeMajor != bindingMajor) {
			LOG.error("{} runtime major version [{}] does not match binding major version [{}]", name, runtimeMajor, bindingMajor);
			return false;
		}

		int runtimeMinor = getMinorVersion(runtimeVersion);
		int bindingMinor = getMinorVersion(bindingVersion);

		if (runtimeMinor < bindingMinor) {
			LOG.error("{} runtime minor version [{}.{}] is older than binding minor version [{}.{}]",
					name,
					runtimeMajor, runtimeMinor,
					bindingMajor, bindingMinor);
			return false;
		}

		return true;
	}

	private static int getMajorVersion(final int version) {
		return version >> 16;
	}

	private static int getMinorVersion(final int version) {
		return (version & 0x00FF00) >> 8;
	}

	private static int getMicroVersion(final int version) {
		return version & 0xFF;
	}
}

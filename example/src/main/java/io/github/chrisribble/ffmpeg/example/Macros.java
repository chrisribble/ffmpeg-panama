package io.github.chrisribble.ffmpeg.example;

/**
 * Utility class for FFmpeg function macros
 *
 * This only exists because jextract does not support generating Java
 * classes for function-style macros.
 */
final class Macros {
	private Macros() {}

	/**
	 * Negate error code enum to match library return code scheme
	 * See libavutil/error.h
	 */
	public static int AVERROR(final int code) {
		return -1 * code;
	}
}

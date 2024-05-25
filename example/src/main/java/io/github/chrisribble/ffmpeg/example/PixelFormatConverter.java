package io.github.chrisribble.ffmpeg.example;

final class PixelFormatConverter {
	private PixelFormatConverter() {}

	/**
	 * naive RGB to BGR conversion implemented with byte swapping
	 *
	 * @param pixels
	 *            byte[] containing R,G,B pixel bytes
	 */
	public static void rgbToBgr(final byte[] pixels) {
		for (int i = 0; i < pixels.length; i += 3) {
			byte red = pixels[i];

			// Swap blue byte
			pixels[i] = pixels[i + 2];

			// Swap red byte
			pixels[i + 2] = red;
		}
	}
}

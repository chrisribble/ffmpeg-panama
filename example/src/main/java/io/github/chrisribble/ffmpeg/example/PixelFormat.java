package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PIX_FMT_0BGR;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PIX_FMT_0RGB;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PIX_FMT_BGR24;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AV_PIX_FMT_GRAY8;

import java.awt.image.BufferedImage;

public enum PixelFormat {
	RGB32(AV_PIX_FMT_0RGB(), BufferedImage.TYPE_INT_RGB),
	BGR32(AV_PIX_FMT_0BGR(), BufferedImage.TYPE_INT_BGR),
	BGR24(AV_PIX_FMT_BGR24(), BufferedImage.TYPE_3BYTE_BGR),
	GRAY8(AV_PIX_FMT_GRAY8(), BufferedImage.TYPE_BYTE_GRAY);

	private final int ffmpegType;
	private final int bufferedImageType;

	PixelFormat(final int ffmpegType, final int bufferedImageType) {
		this.ffmpegType = ffmpegType;
		this.bufferedImageType = bufferedImageType;
	}

	public int ffmpegType() {
		return ffmpegType;
	}

	public int bufferedImageType() {
		return bufferedImageType;
	}
}

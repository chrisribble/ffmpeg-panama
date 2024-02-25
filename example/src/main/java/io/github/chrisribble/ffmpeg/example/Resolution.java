package io.github.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

import io.github.chrisribble.ffmpeg6.AVCodecContext;

public record Resolution(int width, int height) {
	Resolution(final DecoderContext context) {
		this(context.avCodecContext());
	}

	Resolution(final MemorySegment avCodecContext) {
		this(AVCodecContext.width(avCodecContext), AVCodecContext.height(avCodecContext));
	}
}
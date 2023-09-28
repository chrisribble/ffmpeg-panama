package com.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

import com.chrisribble.ffmpeg6.AVCodecContext;

public record Dimensions(int width, int height) {
	Dimensions(final DecoderContext context) {
		this(context.avCodecContext());
	}

	Dimensions(final MemorySegment avCodecContext) {
		this(AVCodecContext.width$get(avCodecContext), AVCodecContext.height$get(avCodecContext));
	}
}
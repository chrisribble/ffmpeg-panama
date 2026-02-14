package io.github.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

record DecoderContext(
		StreamInfo videoStream,
		// AVCodecContext*
		MemorySegment pAvCodecContext) {}
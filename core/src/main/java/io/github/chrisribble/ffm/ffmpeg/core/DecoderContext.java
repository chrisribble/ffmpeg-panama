package io.github.chrisribble.ffm.ffmpeg.core;

import java.lang.foreign.MemorySegment;

record DecoderContext(
		StreamInfo videoStream,
		// AVCodecContext*
		MemorySegment pAvCodecContext) {}
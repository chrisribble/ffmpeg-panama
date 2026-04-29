package io.github.chrisribble.ffm.ffmpeg.decoder;

import java.lang.foreign.MemorySegment;

import io.github.chrisribble.ffm.ffmpeg.bindings.AVCodecContext;
import io.github.chrisribble.ffm.ffmpeg.core.Resolution;
import io.github.chrisribble.ffm.ffmpeg.core.internal.StreamInfo;

record DecoderContext(
		StreamInfo videoStream,
		// AVCodecContext*
		MemorySegment pAvCodecContext) {

	Resolution resolution() {
		int width = AVCodecContext.width(pAvCodecContext);
		int height = AVCodecContext.height(pAvCodecContext);
		return new Resolution(width, height);
	}
}
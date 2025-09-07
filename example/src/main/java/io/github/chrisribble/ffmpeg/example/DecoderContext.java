package io.github.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

record DecoderContext(VideoStream videoStream, MemorySegment pAvCodecContext) {}
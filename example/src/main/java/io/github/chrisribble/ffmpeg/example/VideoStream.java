package io.github.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

record VideoStream(int index, MemorySegment avCodecParams) {}

package com.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

public record VideoStream(int index, MemorySegment avCodecParams) {}

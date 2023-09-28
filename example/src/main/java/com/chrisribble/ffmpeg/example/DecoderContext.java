package com.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

public record DecoderContext(VideoStream videoStream, MemorySegment avCodecContext) {}
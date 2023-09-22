#!/bin/sh

jextract --source \
  -l avcodec \
  -l avformat \
  -l avutil \
  -l swscale \
  --output src/main/java \
  --target-package com.chrisribble.ffmpeg5 \
  --header-class-name FFmpeg5 \
  ffmpeg.h 

# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Generate FFmpeg bindings:
## Download jextract from https://jdk.java.net/jextract

## Run jextract on FFmpeg tarballs
```
export FFMPEG_VERSION=5.1.3
wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
PATH="/usr/local/jextract/bin:${PATH}" jextract \
  --source \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg5/src/main/java --target-package com.chrisribble.ffmpeg5 --header-class-name FFmpeg \
  ffmpeg5/ffmpeg.h

export FFMPEG_VERSION=6.0
wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
PATH="/usr/local/jextract/bin:${PATH}" jextract \
  --source \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg6/src/main/java --target-package com.chrisribble.ffmpeg6 --header-class-name FFmpeg \
  ffmpeg6/ffmpeg.h
```

# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Generate FFmpeg bindings:
## Download jextract from https://jdk.java.net/jextract

## Run jextract on FFmpeg tarballs
```
# Optionally, provide the path to Clang libraries
export LD_LIBRARY_PATH=/usr/lib/llvm/16/lib64

export JEXTRACT="/usr/local/jextract/bin/jextract"
export FFMPEG_VERSION=5.1.4

wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
${JEXTRACT} \
  --source \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg5/src/main/java --target-package com.chrisribble.ffmpeg5 --header-class-name FFmpeg \
  ffmpeg5/ffmpeg.h

export FFMPEG_VERSION=6.0.1
wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
${JEXTRACT} \
  --source \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg6/src/main/java --target-package com.chrisribble.ffmpeg6 --header-class-name FFmpeg \
  ffmpeg6/ffmpeg.h
```

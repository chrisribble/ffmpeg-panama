# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Building
- Download/install jextract 22 from https://jdk.java.net/jextract

# Generate FFmpeg bindings
## Run jextract on FFmpeg tarballs
```
# Assumes you've install jextract at /usr/local/jextract
export JEXTRACT="/usr/local/jextract/bin/jextract"

export FFMPEG_VERSION=5.1.4
wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
${JEXTRACT} \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg5/src/main/java --target-package io.github.chrisribble.ffmpeg5 --header-class-name FFmpeg \
  ffmpeg5/ffmpeg.h

export FFMPEG_VERSION=6.1.1
wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
${JEXTRACT} \
  -I ./ffmpeg-${FFMPEG_VERSION} \
  -l avcodec -l avformat -l avutil -l swscale \
  --output ffmpeg6/src/main/java --target-package io.github.chrisribble.ffmpeg6 --header-class-name FFmpeg \
  ffmpeg6/ffmpeg.h
```

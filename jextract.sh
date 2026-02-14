#!/bin/bash

JEXTRACT_LOCATION="/usr/local/jextract/bin"
export PATH="${PATH}:${JEXTRACT_LOCATION}"

FFMPEG_VERSION="${1}"
BINDINGS="${2}"

if [ -z "${FFMPEG_VERSION}" ]; then
	echo "FFmpeg version is required. Ex: 8.0.1"
	exit 1
fi
if [ -z "${BINDINGS}" ]; then
	echo "Bindings (directory/package) is required. Ex: ffmpeg7"
	exit 1
fi

BINDINGS_SRC="${BINDINGS}/src/main/java"
echo "Generating bindings for FFmpeg ${FFMPEG_VERSION} in ${BINDINGS_SRC}"

FFMPEG_TARBALL="ffmpeg-${FFMPEG_VERSION}.tar.gz"
if [ ! -f "${FFMPEG_TARBALL}" ]; then
	wget http://ffmpeg.org/releases/${FFMPEG_TARBALL}
fi

tar xzvf ${FFMPEG_TARBALL}
rm -rf ${BINDINGS_SRC}

# Note: Run with --dump-includes <out> instead of @includes.txt to see all bindings
jextract \
  --include-dir ./ffmpeg-${FFMPEG_VERSION} \
  --library avcodec --library avformat --library avutil --library swscale \
  @includes.txt \
  --output ${BINDINGS_SRC} --target-package io.github.chrisribble.${BINDINGS} \
  --header-class-name FFmpeg \
  "<libavcodec/avcodec.h>" \
  "<libavformat/avformat.h>" \
  "<libavutil/imgutils.h>" \
  "<libswscale/swscale.h>"

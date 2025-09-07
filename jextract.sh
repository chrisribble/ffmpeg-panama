#!/bin/bash

JEXTRACT_LOCATION="/usr/local/jextract/bin"
export PATH="${PATH}:${JEXTRACT_LOCATION}"

FFMPEG_VERSION="${1}"
BINDINGS="${2}"

if [ -z "${FFMPEG_VERSION}" ]; then
	echo "FFmpeg version is required. Ex: 7.1.1"
	exit 1
fi
if [ -z "${BINDINGS}" ]; then
	echo "Bindings (directory/package) is required. Ex: ffmpeg7"
	exit 1
fi

BINDINGS_SRC="${BINDINGS}/src/main/java"

echo "Generating bindings for FFmpeg ${FFMPEG_VERSION} in ${BINDINGS_SRC}"

#wget http://ffmpeg.org/releases/ffmpeg-${FFMPEG_VERSION}.tar.gz
tar xzvf ffmpeg-${FFMPEG_VERSION}.tar.gz
rm -rf ${BINDINGS_SRC}
jextract \
  --include-dir ./ffmpeg-${FFMPEG_VERSION} \
  --library avcodec --library avformat --library avutil --library swscale \
  --output ${BINDINGS_SRC} --target-package io.github.chrisribble.${BINDINGS} \
  --header-class-name FFmpeg \
  "<libavcodec/avcodec.h>" \
  "<libavformat/avformat.h>" \
  "<libavutil/imgutils.h>" \
  "<libswscale/swscale.h>"

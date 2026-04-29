package io.github.chrisribble.ffm.ffmpeg.decoder;

enum FrameReceiveResult {
	READ,
	SKIP,
	AGAIN,
	EOF
}

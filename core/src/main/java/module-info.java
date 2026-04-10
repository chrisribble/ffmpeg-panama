module io.github.chrisribble.ffm.ffmpeg.core {
	requires org.slf4j;

	requires io.github.chrisribble.ffm.ffmpeg.bindings;

	exports io.github.chrisribble.ffm.ffmpeg.core;
	exports io.github.chrisribble.ffm.ffmpeg.core.exception;
	exports io.github.chrisribble.ffm.ffmpeg.core.internal to
			io.github.chrisribble.ffm.ffmpeg.analyzer,
			io.github.chrisribble.ffm.ffmpeg.decoder;
}
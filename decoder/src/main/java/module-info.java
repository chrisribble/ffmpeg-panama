module io.github.chrisribble.ffm.ffmpeg.decoder {
	requires org.slf4j;
	requires transitive java.desktop;

	requires io.github.chrisribble.ffm.ffmpeg.bindings;
	requires transitive io.github.chrisribble.ffm.ffmpeg.core;

	exports io.github.chrisribble.ffm.ffmpeg.decoder;
}
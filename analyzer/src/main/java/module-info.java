module io.github.chrisribble.ffm.ffmpeg.analyzer {
	requires org.slf4j;

	requires io.github.chrisribble.ffm.ffmpeg.bindings;
	requires transitive io.github.chrisribble.ffm.ffmpeg.core;

	exports io.github.chrisribble.ffm.ffmpeg.analyzer;
}
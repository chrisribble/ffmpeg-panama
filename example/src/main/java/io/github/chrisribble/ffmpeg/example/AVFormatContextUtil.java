package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg.av_dump_format;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avformat_find_stream_info;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avformat_open_input;
import static io.github.chrisribble.ffmpeg8.FFmpeg$shared.C_POINTER;
import static java.lang.foreign.MemorySegment.NULL;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import io.github.chrisribble.ffmpeg.example.exception.AVException;
import io.github.chrisribble.ffmpeg.example.exception.AVIOException;
import io.github.chrisribble.ffmpeg8.FFmpeg;

public final class AVFormatContextUtil {
	private AVFormatContextUtil() {}

	public static MemorySegment open(final Arena arena, final Path... inputs) {
		String input = inputs.length == 1
				? inputs[0].toString()
				: "concat:" + String.join("|", Arrays.stream(inputs).map(Path::toString).toList());

		// char*
		var fileName = arena.allocateFrom(input, StandardCharsets.UTF_8);

		// AVFormatContext**
		var ppFormatCtx = arena.allocate(C_POINTER);
		if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
			if (!Files.exists(Paths.get(input))) {
				throw new AVIOException("File '" + input + "' does not exist");
			}
			throw new AVIOException("Cannot open file: " + input);
		}

		ppFormatCtx = ppFormatCtx.reinterpret(arena, FFmpeg::avformat_close_input);

		// AVFormatContext*
		var ctx = ppFormatCtx.get(C_POINTER, 0);
		if (avformat_find_stream_info(ctx, NULL) < 0) {
			throw new AVException("No streams detected in file: " + input);
		}

		// Dump AV format info to STDERR
		av_dump_format(ctx, 0, fileName, 0);

		return ctx;
	}
}

package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg8.FFmpeg$shared.C_POINTER;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffmpeg8.AVFormatContext;

public final class AVStreamUtil {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private AVStreamUtil() {}

	public static List<StreamInfo> getStreams(final MemorySegment pFormatCtx, final Integer codecType) {
		// AVStream*[]
		var pStreams = AVFormatContext.streams(pFormatCtx);
		int streams = AVFormatContext.nb_streams(pFormatCtx);

		LOG.debug("Found {} streams", streams);
		if (streams == 0) {
			return List.of();
		}

		List<StreamInfo> filtered = new ArrayList<>(streams);

		for (int i = 0; i < streams; i++) {
			// AVStream*
			var pStream = pStreams.getAtIndex(C_POINTER, i);
			var streamInfo = new StreamInfo(i, pStream);

			// Filter streams as requested
			if (codecType != null && streamInfo.getCodecType() != codecType) {
				continue;
			}

			filtered.add(streamInfo);
		}
		return filtered;
	}
}

package com.chrisribble.ffmpeg.example;

import static com.chrisribble.ffmpeg5.FFmpeg5.AVMEDIA_TYPE_VIDEO;
import static com.chrisribble.ffmpeg5.FFmpeg5.AV_LOG_VERBOSE;
import static com.chrisribble.ffmpeg5.FFmpeg5.C_CHAR;
import static com.chrisribble.ffmpeg5.FFmpeg5.C_INT;
import static com.chrisribble.ffmpeg5.FFmpeg5.C_POINTER;
import static com.chrisribble.ffmpeg5.FFmpeg5.EAGAIN;
import static com.chrisribble.ffmpeg5.FFmpeg5.SWS_BILINEAR;
import static com.chrisribble.ffmpeg5.FFmpeg5_1.AV_PIX_FMT_RGB24;
import static com.chrisribble.ffmpeg5.FFmpeg5_1.av_frame_alloc;
import static com.chrisribble.ffmpeg5.FFmpeg5_1.av_free;
import static com.chrisribble.ffmpeg5.FFmpeg5_1.av_log_set_level;
import static com.chrisribble.ffmpeg5.FFmpeg5_1.av_malloc;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.av_dump_format;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.av_image_fill_arrays;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.av_image_get_buffer_size;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.av_packet_unref;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.av_read_frame;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_alloc_context3;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_close;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_find_decoder;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_open2;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_parameters_to_context;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_receive_frame;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avcodec_send_packet;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avformat_close_input;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avformat_find_stream_info;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.avformat_open_input;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.sws_getContext;
import static com.chrisribble.ffmpeg5.FFmpeg5_2.sws_scale;
import static java.lang.foreign.MemorySegment.NULL;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chrisribble.ffmpeg.example.exception.AVAllocateException;
import com.chrisribble.ffmpeg.example.exception.AVException;
import com.chrisribble.ffmpeg5.AVCodec;
import com.chrisribble.ffmpeg5.AVCodecContext;
import com.chrisribble.ffmpeg5.AVCodecParameters;
import com.chrisribble.ffmpeg5.AVFormatContext;
import com.chrisribble.ffmpeg5.AVFrame;
import com.chrisribble.ffmpeg5.AVPacket;
import com.chrisribble.ffmpeg5.AVStream;

/*
 * FFmpeg 5.1-based frame extraction example, inspired by jextract sample
*/
public class FrameExtract {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final int DUMP_FRAMES = 3;

	// TODO: Should this be 1, 16, 32?
	private static final int SIMD_ALIGN_BYTES = 1;

	public static void main(final String[] args) {
		if (args.length != 1) {
			System.err.println("mp4 file is required");
			System.exit(-1);
		}

		String file = args[0];

		FrameExtract fe = new FrameExtract();
		try {
			fe.nonConcurrentFrameExtract(file, DUMP_FRAMES);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (IOException | RuntimeException e) {
			LOG.error("Failed to process frame extraction", e);
			System.exit(2);
		}
	}

	public void nonConcurrentFrameExtract(final String file, final int dumpFrames) throws AVException, IOException {
		if (file == null || file.isBlank()) {
			throw new IllegalArgumentException("file must be non-empty");
		}

		try (Arena arena = Arena.ofConfined()) {
			extractFrames(arena, file, dumpFrames);
		}
	}

	private static void extractFrames(final Arena arena, final String file, final int dumpFrames) throws AVException, IOException {
		av_log_set_level(AV_LOG_VERBOSE());

		var ppFormatCtx = NULL;
		var decoderCtx = NULL;

		var decodedFrame = NULL;
		var outputFrame = NULL;
		var buffer = NULL;

		try {
			// AVFormatContext**
			ppFormatCtx = arena.allocate(C_POINTER);

			// char* fileName;
			var fileName = arena.allocateUtf8String(file);
			if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
				if (!Files.exists(Paths.get(file))) {
					throw new FileNotFoundException("File '" + file + "' does not exist");
				}
				throw new AVException("Cannot open file: " + file);
			}

			// AVFormatContext*
			var pFormatCtx = ppFormatCtx.get(C_POINTER, 0);
			if (avformat_find_stream_info(pFormatCtx, NULL) < 0) {
				throw new AVException("No streams detected in file: " + file);
			}

			// Dump AV format info to STDERR
			av_dump_format(pFormatCtx, 0, fileName, 0);

			// Find the first video stream
			VideoStream videoStream = getFirstVideoStream(pFormatCtx);
			if (videoStream == null) {
				throw new AVException("No video streams found in file: " + file);
			}
			LOG.debug("Found video stream (index: {})", videoStream.index());

			var pCodec = getAVCodec(videoStream);

			// Copy codec params to AVCodecContext*
			decoderCtx = avcodec_alloc_context3(pCodec);
			if (avcodec_parameters_to_context(decoderCtx, videoStream.avCodecParams()) != 0) {
				throw new AVException("Failed to create decoder context from video stream codec parameters");
			}

			// Open codec context so that we can feed packets to the decoder
			if (avcodec_open2(decoderCtx, pCodec, NULL) < 0) {
				throw new AVException("Failed to open decoder context using codec '" + AVCodec.name$get(pCodec) + "'");
			}

			// Allocate input/output AVFrame*
			decodedFrame = av_frame_alloc();
			outputFrame = av_frame_alloc();

			// Determine required buffer size and allocate buffer
			int width = AVCodecContext.width$get(decoderCtx);
			int height = AVCodecContext.height$get(decoderCtx);
			int numBytes = av_image_get_buffer_size(AV_PIX_FMT_RGB24(), width, height, SIMD_ALIGN_BYTES);
			buffer = av_malloc(numBytes * C_CHAR.byteSize());

			requireNonNull(decodedFrame, "Cannot allocate decodedFrame AVFrame*");
			requireNonNull(outputFrame, "Cannot allocate outputFrame AVFrame*");
			requireNonNull(buffer, "Cannot allocate buffer");

			// Assign appropriate parts of buffer to image planes in outputFrame
			av_image_fill_arrays(
					AVFrame.data$slice(outputFrame), AVFrame.linesize$slice(outputFrame), buffer,
					AV_PIX_FMT_RGB24(), width, height, SIMD_ALIGN_BYTES);

			// initialize SWS context for software scaling
			int pixFmt = AVCodecContext.pix_fmt$get(decoderCtx);
			var swScaleCtx = sws_getContext(width, height, pixFmt, width, height,
					AV_PIX_FMT_RGB24(), SWS_BILINEAR(), NULL, NULL, NULL);

			// ACPacket*
			var packet = AVPacket.allocate(arena);

			int i = 0;
			while (av_read_frame(pFormatCtx, packet) >= 0) {
				// Ignore packets from other streams
				if (AVPacket.stream_index$get(packet) != videoStream.index()) {
					// Free the packet that was allocated by av_read_frame
					av_packet_unref(packet);
					continue;
				}

				// Dispatch packet to decoder
				int decodeErr = avcodec_send_packet(decoderCtx, packet);
				if (decodeErr != 0) {
					throw new AVException("Decode failure at frame " + i + "; invalid packet");
				}
				LOG.debug("Sent packet to decoder");

				// Retrieve frame from decoder if one is ready
				// FIXME: This should be called in a loop, since a packet could contain more than 1 frame
				int receiveErr = avcodec_receive_frame(decoderCtx, decodedFrame);

				if (receiveErr == 0) {
					LOG.debug("Received frame from decoder");

					// Convert the image from its native format to RGB
					sws_scale(swScaleCtx, AVFrame.data$slice(decodedFrame),
							AVFrame.linesize$slice(decodedFrame), 0, height,
							AVFrame.data$slice(outputFrame), AVFrame.linesize$slice(outputFrame));

					// Save the frame to disk
					if (++i <= dumpFrames) {
						dumpFrame(outputFrame, arena, width, height, i);
					} else {
						return;
					}
				} else if (receiveErr != AVERROR(EAGAIN())) {
					throw new AVException("Decode failure (" + receiveErr + "); cannot decode at frame " + ++i);
				}

				// Decrement reference count for packet allocated by av_read_frame
				av_packet_unref(packet);
			}
		} finally {
			if (!buffer.equals(NULL)) {
				av_free(buffer);
			}
			if (!outputFrame.equals(NULL)) {
				av_free(outputFrame);
			}
			if (!decodedFrame.equals(NULL)) {
				av_free(decodedFrame);
			}
			if (!decoderCtx.equals(NULL)) {
				avcodec_close(decoderCtx);
			}
			if (!ppFormatCtx.equals(NULL)) {
				avformat_close_input(ppFormatCtx);
			}
		}
	}

	private static void dumpFrame(final MemorySegment frameRGB, final Arena arena,
			final int width, final int height, final int iFrame) throws IOException {
		String header = String.format("P6\n%d %d\n255\n", width, height);
		Path path = Paths.get("frame" + iFrame + ".ppm");

		try (OutputStream os = Files.newOutputStream(path)) {
			LOG.debug("Writing " + path);

			os.write(header.getBytes());
			var data = AVFrame.data$slice(frameRGB);
			// frameRGB.data[0]
			var pdata = data.get(C_POINTER, 0);
			// frameRGB.linespace[0]
			var linesize = AVFrame.linesize$slice(frameRGB).get(C_INT, 0);
			// Write pixel data
			for (long y = 0; y < height; y++) {
				// frameRGB.data[0] + y*frameRGB.linesize[0] is the pointer. And 3*width size of data
				var pixelArray = pdata.asSlice(y * linesize)
						.reinterpret(3L * width, arena, null);
				// dump the pixel byte buffer to file
				os.write(pixelArray.toArray(C_CHAR));
			}
		}
	}

	/**
	 * Negate error code enum to match library return code scheme
	 * jextract does not support function-style macros; see libavutil/error.h
	 */
	private static int AVERROR(final int code) {
		return -1 * code;
	}

	private static void requireNonNull(final MemorySegment segment, final String message) throws AVAllocateException {
		if (segment == null) {
			throw new IllegalArgumentException("segment must be non-null");
		}
		if (segment.equals(NULL)) {
			throw new AVAllocateException(message);
		}
	}

	private static VideoStream getFirstVideoStream(final MemorySegment pFormatCtx) {
		// Find the first video stream
		int streams = AVFormatContext.nb_streams$get(pFormatCtx);
		var pStreams = AVFormatContext.streams$get(pFormatCtx);

		LOG.debug("Found {} streams", streams);

		for (int i = 0; i < streams; i++) {
			// AVStream*;
			var pStream = pStreams.getAtIndex(C_POINTER, i);
			// AVCodecParameters*;
			var pCodecParams = AVStream.codecpar$get(pStream);
			if (AVCodecParameters.codec_type$get(pCodecParams) == AVMEDIA_TYPE_VIDEO()) {
				return new VideoStream(i, pCodecParams);
			}
		}
		return null;
	}

	/**
	 * Find the AVCodec* decoder for the video stream
	 *
	 * @param videoStream
	 * @return MemorySegment which contains an AVCodec*
	 * @throws AVAllocateException
	 */
	private static MemorySegment getAVCodec(final VideoStream videoStream) throws AVAllocateException {
		// Find the AVCodec* decoder for the video stream
		int codecId = AVCodecParameters.codec_id$get(videoStream.avCodecParams());
		var pCodec = avcodec_find_decoder(codecId);
		requireNonNull(pCodec, "No decoder found for codec id: " + codecId);

		return pCodec;
	}

	private record VideoStream(int index, MemorySegment avCodecParams) {}
}

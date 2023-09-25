package com.chrisribble.ffmpeg.example;

import static com.chrisribble.ffmpeg.example.Macros.AVERROR;
import static com.chrisribble.ffmpeg6.FFmpeg6.AVMEDIA_TYPE_VIDEO;
import static com.chrisribble.ffmpeg6.FFmpeg6.AV_LOG_VERBOSE;
import static com.chrisribble.ffmpeg6.FFmpeg6.C_CHAR;
import static com.chrisribble.ffmpeg6.FFmpeg6.C_INT;
import static com.chrisribble.ffmpeg6.FFmpeg6.C_POINTER;
import static com.chrisribble.ffmpeg6.FFmpeg6.EAGAIN;
import static com.chrisribble.ffmpeg6.FFmpeg6.SWS_BILINEAR;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.AV_PIX_FMT_GRAY8;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.AV_PIX_FMT_RGB24;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.av_frame_alloc;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.av_free;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.av_log_set_level;
import static com.chrisribble.ffmpeg6.FFmpeg6_1.av_malloc;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.av_dump_format;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.av_image_fill_arrays;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.av_image_get_buffer_size;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.av_packet_unref;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.av_read_frame;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_alloc_context3;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_close;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_find_decoder;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_open2;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_parameters_to_context;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_receive_frame;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avcodec_send_packet;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avformat_close_input;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avformat_find_stream_info;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.avformat_open_input;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.sws_freeContext;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.sws_getContext;
import static com.chrisribble.ffmpeg6.FFmpeg6_2.sws_scale;
import static com.chrisribble.ffmpeg6.FFmpeg6_3.AVERROR_EOF;
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
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chrisribble.ffmpeg.example.exception.AVAllocateException;
import com.chrisribble.ffmpeg.example.exception.AVException;
import com.chrisribble.ffmpeg6.AVCodec;
import com.chrisribble.ffmpeg6.AVCodecContext;
import com.chrisribble.ffmpeg6.AVCodecParameters;
import com.chrisribble.ffmpeg6.AVFormatContext;
import com.chrisribble.ffmpeg6.AVFrame;
import com.chrisribble.ffmpeg6.AVPacket;
import com.chrisribble.ffmpeg6.AVStream;

/*
 * FFmpeg 5.1-based frame extraction example, inspired by jextract sample
*/
public class FrameExtract {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	// TODO: Should this be 1, 16, 32?
	private static final int SIMD_ALIGN_BYTES = 32;

	private static final long RGB24_BYTES_PER_PIXEL = 3L;
	private static final long GRAY8_BYTES_PER_PIXEL = 1L;

	private static final int OUTPUT_PIX_FMT = AV_PIX_FMT_GRAY8();

	public static void main(final String[] args) {
		if (args.length != 3) {
			System.err.println("mp4, frame count, and frame radix are required");
			System.exit(-1);
		}

		String file = args[0];
		int dumpFrames = Integer.parseInt(args[1]);
		int frameRadix = Integer.parseInt(args[2]);

		FrameExtract fe = new FrameExtract();
		try {
			long startNanos = System.nanoTime();

			int dumpedFrames = fe.nonConcurrentFrameExtract(file, dumpFrames, frameRadix);

			long totalNanos = System.nanoTime() - startNanos;
			LOG.info("Decoded and wrote {} frames in {}ms", dumpedFrames, TimeUnit.NANOSECONDS.toMillis(totalNanos));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		} catch (IOException | RuntimeException e) {
			LOG.error("Failed to process frame extraction", e);
			System.exit(2);
		}
	}

	public int nonConcurrentFrameExtract(final String file, final int dumpFrames, final int frameRadix) throws AVException, IOException {
		if (file == null || file.isBlank()) {
			throw new IllegalArgumentException("file must be non-empty");
		}

		av_log_set_level(AV_LOG_VERBOSE());

		try (Arena arena = Arena.ofConfined()) {
			return extractFrames(arena, file, dumpFrames, frameRadix);
		}
	}

	private int extractFrames(final Arena arena, final String file, final int dumpFrames, final int frameRadix) throws AVException, IOException {
		var ppFormatCtx = NULL;
		DecoderContext decoderContext = null;
		var swScaleCtx = NULL;

		var decodedFrame = NULL;
		var outputFrame = NULL;
		var buffer = NULL;

		try {
			// AVFormatContext**
			ppFormatCtx = arena.allocate(C_POINTER);

			// AVformatContext*
			var pFormatCtx = openFile(arena, ppFormatCtx, file);

			// Initialize decoder context
			decoderContext = getDecoderContext(pFormatCtx);

			var srcDimensions = new Dimensions(decoderContext);
			var dstDimensions = new Dimensions(srcDimensions.width() / 2, srcDimensions.height() / 2);

			// Determine required buffer size and allocate
			buffer = allocateRgb24Buffer(srcDimensions);

			// Allocate input/output AVFrame*
			decodedFrame = allocateFrame();
			outputFrame = allocateFrame();

			// Assign appropriate parts of buffer to image planes in outputFrame
			av_image_fill_arrays(
					AVFrame.data$slice(outputFrame), AVFrame.linesize$slice(outputFrame), buffer,
					OUTPUT_PIX_FMT, dstDimensions.width(), dstDimensions.height(), SIMD_ALIGN_BYTES);

			// initialize SWS context for software scaling
			swScaleCtx = getSwScaleContext(decoderContext.avCodecContext(), dstDimensions, OUTPUT_PIX_FMT);

			// ACPacket*
			var packet = AVPacket.allocate(arena);

			int dumpedFrames = 0;
			int frameNumber = 0;
			while (av_read_frame(pFormatCtx, packet) >= 0) {
				// Ignore packets from other streams
				if (AVPacket.stream_index$get(packet) != decoderContext.videoStream().index()) {
					av_packet_unref(packet);
					continue;
				}

				// Dispatch packet to decoder
				int decodeErr = avcodec_send_packet(decoderContext.avCodecContext(), packet);
				av_packet_unref(packet);
				LOG.debug("Sent packet to decoder");
				if (decodeErr != 0) {
					throw new AVException("Decode failure at frame " + dumpedFrames + "; invalid packet");
				}

				// Retrieve frames from decoder if ready
				int returnCode;
				while ((returnCode = avcodec_receive_frame(decoderContext.avCodecContext(), decodedFrame)) == 0) {
					LOG.debug("Received frame from decoder");

					// Convert the image from its native format to RGB
					sws_scale(swScaleCtx, AVFrame.data$slice(decodedFrame),
							AVFrame.linesize$slice(decodedFrame), 0, srcDimensions.height(),
							AVFrame.data$slice(outputFrame), AVFrame.linesize$slice(outputFrame));
					if (dumpedFrames >= dumpFrames) {
						return dumpedFrames;
					}

					if (frameNumber++ % frameRadix == 0) {
						// Write every Nth frame
						writePpm(arena, outputFrame, dstDimensions, OUTPUT_PIX_FMT, ++dumpedFrames);
					}
					//++dumpedFrames;
				}

				if (returnCode != AVERROR(EAGAIN()) && returnCode != AVERROR_EOF()) {
					throw new AVException("Decode failure (" + returnCode + "); cannot decode at frame " + ++dumpedFrames);
				}
			}
			return dumpedFrames;
		} finally {
			avFreeNonNull(buffer);
			avFreeNonNull(outputFrame);
			avFreeNonNull(decodedFrame);
			swsFreeNonNull(swScaleCtx);
			avCodecCloseNonNull(decoderContext);
			avFormatCloseNonNull(ppFormatCtx);
		}
	}

	private MemorySegment openFile(final Arena arena, final MemorySegment ppFormatCtx, final String file) throws IOException {
		// char* fileName;
		var fileName = arena.allocateUtf8String(file);
		if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
			if (!Files.exists(Paths.get(file))) {
				throw new FileNotFoundException("File '" + file + "' does not exist");
			}
			throw new IOException("Cannot open file: " + file);
		}

		// AVFormatContext*
		var pFormatCtx = ppFormatCtx.get(C_POINTER, 0);
		if (avformat_find_stream_info(pFormatCtx, NULL) < 0) {
			throw new AVException("No streams detected in file: " + file);
		}

		// Dump AV format info to STDERR
		av_dump_format(pFormatCtx, 0, fileName, 0);

		return pFormatCtx;
	}

	private VideoStream getFirstVideoStream(final MemorySegment pFormatCtx) {
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

	private DecoderContext getDecoderContext(final MemorySegment avFormatContext) {
		var decoderCtx = NULL;
		try {
			// Find the first video stream
			VideoStream videoStream = getFirstVideoStream(avFormatContext);
			if (videoStream == null) {
				throw new AVException("No video streams found in file");
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

			return new DecoderContext(videoStream, decoderCtx);
		} catch (AVException e) {
			avcodec_close(decoderCtx);
			throw e;
		}
	}

	private MemorySegment getSwScaleContext(final MemorySegment avCodecContext, final Dimensions dstDimensions, final int outputPixelFormat) {
		var srcDimensions = new Dimensions(avCodecContext);
		int pixFmt = AVCodecContext.pix_fmt$get(avCodecContext);
		return sws_getContext(srcDimensions.width(), srcDimensions.height(), pixFmt, dstDimensions.width(), dstDimensions.height(),
				outputPixelFormat, SWS_BILINEAR(), NULL, NULL, NULL);
	}

	private void writePpm(final Arena arena, final MemorySegment frameRGB,
			final Dimensions dimensions, final int pixFmt, final int frameNumber) throws IOException {
		int width = dimensions.width();
		int height = dimensions.height();

		String header;
		long bytesPerPixel;
		if (pixFmt == AV_PIX_FMT_RGB24()) {
			header = String.format("P6\n%d %d\n255\n", width, height);
			bytesPerPixel = RGB24_BYTES_PER_PIXEL;
		} else if (pixFmt == AV_PIX_FMT_GRAY8()) {
			header = String.format("P5\n%d %d\n255\n", width, height);
			bytesPerPixel = GRAY8_BYTES_PER_PIXEL;
		} else {
			throw new IllegalArgumentException("Unsupported pixel format: " + pixFmt);
		}

		Path path = Paths.get("frame" + frameNumber + ".ppm");

		try (OutputStream os = Files.newOutputStream(path)) {
			LOG.debug("Writing {}", path);

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
						.reinterpret(bytesPerPixel * width, arena, null);
				// dump the pixel byte buffer to file
				os.write(pixelArray.toArray(C_CHAR));
			}
		}
	}

	private static void requireNonNull(final MemorySegment segment, final String message) throws AVAllocateException {
		if (segment == null) {
			throw new IllegalArgumentException("segment must be non-null");
		}
		if (segment.equals(NULL)) {
			throw new AVAllocateException(message);
		}
	}

	private MemorySegment allocateRgb24Buffer(final Dimensions dimensions) {
		int width = dimensions.width();
		int height = dimensions.height();

		int numBytes = av_image_get_buffer_size(AV_PIX_FMT_RGB24(), width, height, SIMD_ALIGN_BYTES);
		var buffer = av_malloc(numBytes * C_CHAR.byteSize());
		requireNonNull(buffer, "Cannot allocate buffer");

		return buffer;
	}

	private MemorySegment allocateFrame() {
		var frame = av_frame_alloc();
		requireNonNull(frame, "Cannot allocate AVFrame*");

		return frame;
	}

	/**
	 * Find the AVCodec* decoder for the video stream
	 *
	 * @param videoStream
	 * @return MemorySegment which contains an AVCodec*
	 * @throws AVAllocateException
	 */
	private MemorySegment getAVCodec(final VideoStream videoStream) throws AVAllocateException {
		// Find the AVCodec* decoder for the video stream
		int codecId = AVCodecParameters.codec_id$get(videoStream.avCodecParams());
		var pCodec = avcodec_find_decoder(codecId);
		requireNonNull(pCodec, "No decoder found for codec id: " + codecId);

		return pCodec;
	}

	private void avFreeNonNull(final MemorySegment allocated) {
		if (allocated == null) {
			return;
		}
		av_free(allocated);
	}

	private void swsFreeNonNull(final MemorySegment swScaleCtx) {
		if (swScaleCtx == null) {
			return;
		}
		sws_freeContext(swScaleCtx);
	}

	private void avCodecCloseNonNull(final DecoderContext decoderContext) {
		if (decoderContext == null || decoderContext.avCodecContext() == null) {
			return;
		}
		avcodec_close(decoderContext.avCodecContext());
	}

	private void avFormatCloseNonNull(final MemorySegment ppFormatCtx) {
		if (ppFormatCtx == null) {
			return;
		}
		avformat_close_input(ppFormatCtx);
	}

	private record Dimensions(int width, int height) {
		Dimensions(final DecoderContext context) {
			this(context.avCodecContext());
		}

		Dimensions(final MemorySegment avCodecContext) {
			this(AVCodecContext.width$get(avCodecContext), AVCodecContext.height$get(avCodecContext));
		}
	}

	private record VideoStream(int index, MemorySegment avCodecParams) {}

	private record DecoderContext(VideoStream videoStream, MemorySegment avCodecContext) {}
}

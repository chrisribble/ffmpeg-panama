package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg.example.Macros.AVERROR;
import static io.github.chrisribble.ffmpeg6.FFmpeg.AVERROR_EOF;
import static io.github.chrisribble.ffmpeg6.FFmpeg.av_image_fill_arrays;
import static io.github.chrisribble.ffmpeg6.FFmpeg.av_image_get_buffer_size;
import static io.github.chrisribble.ffmpeg6.FFmpeg.sws_freeContext;
import static io.github.chrisribble.ffmpeg6.FFmpeg.sws_getContext;
import static io.github.chrisribble.ffmpeg6.FFmpeg.sws_scale;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.av_dump_format;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.av_frame_alloc;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.av_packet_unref;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.av_read_frame;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_alloc_context3;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_close;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_find_decoder;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_open2;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_parameters_to_context;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_receive_frame;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avcodec_send_packet;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avformat_close_input;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avformat_find_stream_info;
import static io.github.chrisribble.ffmpeg6.FFmpeg_1.avformat_open_input;
import static io.github.chrisribble.ffmpeg6.FFmpeg_2.AV_PIX_FMT_GRAY8;
import static io.github.chrisribble.ffmpeg6.FFmpeg_2.AV_PIX_FMT_RGB24;
import static io.github.chrisribble.ffmpeg6.FFmpeg_2.av_free;
import static io.github.chrisribble.ffmpeg6.FFmpeg_2.av_malloc;
import static io.github.chrisribble.ffmpeg6.FFmpeg_3.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffmpeg6.FFmpeg_3.C_CHAR;
import static io.github.chrisribble.ffmpeg6.FFmpeg_3.C_INT;
import static io.github.chrisribble.ffmpeg6.FFmpeg_3.C_POINTER;
import static io.github.chrisribble.ffmpeg6.FFmpeg_3.SWS_BILINEAR;
import static java.lang.foreign.MemorySegment.NULL;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.io.FileNotFoundException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffmpeg.example.exception.AVAllocateException;
import io.github.chrisribble.ffmpeg.example.exception.AVException;
import io.github.chrisribble.ffmpeg.example.exception.AVIOException;
import io.github.chrisribble.ffmpeg6.AVCodec;
import io.github.chrisribble.ffmpeg6.AVCodecContext;
import io.github.chrisribble.ffmpeg6.AVCodecParameters;
import io.github.chrisribble.ffmpeg6.AVFormatContext;
import io.github.chrisribble.ffmpeg6.AVFrame;
import io.github.chrisribble.ffmpeg6.AVPacket;
import io.github.chrisribble.ffmpeg6.AVStream;

public final class BufferedImageStreamSpliterator implements Spliterator<BufferedImage>, AutoCloseable {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	// TODO: Should this be 1, 16, 32?
	private static final int SIMD_ALIGN_BYTES = 32;

	private final Arena arena;
	private final Path mp4;
	private final int modFrames;
	private final Integer limit;
	private final int pixelFormat;

	private MemorySegment ppFormatCtx;
	private MemorySegment pFormatCtx;
	private MemorySegment avCodecCtx;
	private MemorySegment swScaleCtx;
	private MemorySegment decodedFrame;
	private MemorySegment outputFrame;
	private MemorySegment buffer;
	private MemorySegment packet;

	private VideoStream videoStream;

	private Resolution srcResolution;
	private Resolution dstResolution;

	private int frameNumber;
	private int images;

	private boolean opened;
	private boolean closed;

	private BufferedImageStreamSpliterator(final Builder builder) throws FileNotFoundException {
		if (!Files.exists(builder.mp4)) {
			throw new FileNotFoundException("File " + builder.mp4 + " does not exist");
		}

		arena = builder.arena;
		mp4 = builder.mp4;
		modFrames = builder.modFrames != null ? builder.modFrames : 1;
		limit = builder.limit;
		pixelFormat = builder.pixelFormat == PixelFormat.RGB
				? AV_PIX_FMT_RGB24()
				: AV_PIX_FMT_GRAY8();
		dstResolution = builder.resolution;
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public Spliterator<BufferedImage> trySplit() {
		// Splitting not supported
		return null;
	}

	@Override
	public long estimateSize() {
		// Size unknown
		return Long.MAX_VALUE;
	}

	@Override
	public int characteristics() {
		return Spliterator.NONNULL | Spliterator.ORDERED | Spliterator.IMMUTABLE;
	}

	@Override
	public boolean tryAdvance(final Consumer<? super BufferedImage> action) {
		LOG.trace("tryAdvance");
		if (closed) {
			throw new IllegalStateException("tryAdvance must not be called after closed");
		}
		if (limit != null && images == limit) {
			return false;
		}
		try {
			init();
			return tryReadFrame(action);
		} catch (RuntimeException e) {
			close();
			throw e;
		}
	}

	@Override
	public void close() {
		try {
			avFreeNonNull(buffer);
			avFreeNonNull(outputFrame);
			avFreeNonNull(decodedFrame);
			swsFreeNonNull(swScaleCtx);
			avCodecCloseNonNull(avCodecCtx);
			avFormatCloseNonNull(ppFormatCtx);
		} finally {
			closed = true;
		}
	}

	private boolean tryReadFrame(final Consumer<? super BufferedImage> action) {
		// Retrieve frames from decoder if ready
		if (drainFrames(outputFrame)) {
			action.accept(getBufferedImage(outputFrame, dstResolution));
			return true;
		}

		while (av_read_frame(pFormatCtx, packet) >= 0) {
			// Ignore packets from other streams
			int streamIndex = AVPacket.stream_index(packet);
			if (streamIndex != videoStream.index()) {
				LOG.debug("Ignoring packet for stream {}", streamIndex);
				av_packet_unref(packet);
				continue;
			}

			// Dispatch packet to decoder
			int decodeErr = avcodec_send_packet(avCodecCtx, packet);
			av_packet_unref(packet);
			LOG.debug("Sent packet to decoder");
			if (decodeErr != 0) {
				throw new AVException("Decode failure at frame " + frameNumber + "; invalid packet");
			}

			// Retrieve frames from decoder if ready
			if (drainFrames(outputFrame)) {
				action.accept(getBufferedImage(outputFrame, dstResolution));
				return true;
			}
		}

		// Initiate end-of-stream drain
		avcodec_send_packet(avCodecCtx, NULL);
		if (drainFrames(outputFrame)) {
			action.accept(getBufferedImage(outputFrame, dstResolution));
			return true;
		}

		return false;
	}

	private boolean drainFrames(final MemorySegment output) {
		FrameReceiveResult result;
		while ((result = receiveFrame(output)) == FrameReceiveResult.SKIP) {
			// ignore skipped frames
		}
		return result == FrameReceiveResult.READ;
	}

	private FrameReceiveResult receiveFrame(final MemorySegment output) {
		// Retrieve frames from decoder if ready
		int returnCode = avcodec_receive_frame(avCodecCtx, decodedFrame);
		if (returnCode == AVERROR_EOF()) {
			return FrameReceiveResult.EOF;
		}
		if (returnCode == AVERROR(RuntimeErrno.EAGAIN())) {
			return FrameReceiveResult.AGAIN;
		}
		if (returnCode != 0) {
			throw new AVException("Decode failure (" + returnCode + ") at frame " + ++frameNumber);
		}

		LOG.debug("Received frame from decoder");

		// Accept every Nth frame
		if (frameNumber++ % modFrames > 0) {
			return FrameReceiveResult.SKIP;
		}

		// Convert the image from its native format/size to requested format/size
		sws_scale(swScaleCtx, AVFrame.data(decodedFrame),
				AVFrame.linesize(decodedFrame), 0, srcResolution.height(),
				AVFrame.data(output), AVFrame.linesize(output));

		return FrameReceiveResult.READ;
	}

	private void init() {
		if (opened) {
			return;
		}

		// AVFormatContext**
		ppFormatCtx = arena.allocate(C_POINTER);

		// AVformatContext*
		pFormatCtx = openFile(ppFormatCtx, mp4.toString());

		// Initialize decoder context
		var decoderContext = getDecoderContext(pFormatCtx);
		avCodecCtx = decoderContext.avCodecContext();
		videoStream = decoderContext.videoStream();

		srcResolution = new Resolution(decoderContext);
		if (dstResolution == null) {
			dstResolution = srcResolution;
		}

		// Determine required buffer size and allocate
		buffer = allocateRgb24Buffer(srcResolution);

		// Allocate input/output AVFrame*
		decodedFrame = allocateFrame();
		outputFrame = allocateFrame();

		// Assign appropriate parts of buffer to image planes in outputFrame
		av_image_fill_arrays(
				AVFrame.data(outputFrame), AVFrame.linesize(outputFrame), buffer,
				pixelFormat, dstResolution.width(), dstResolution.height(), SIMD_ALIGN_BYTES);

		// initialize SWS context for software scaling
		swScaleCtx = getSwScaleContext(decoderContext.avCodecContext(), dstResolution, pixelFormat);

		// AVPacket*
		packet = AVPacket.allocate(arena);

		opened = true;
	}

	private BufferedImage getBufferedImage(final MemorySegment frame, final Resolution resolution) {
		int width = resolution.width();
		int height = resolution.height();

		int bytesPerPixel = pixelFormat == AV_PIX_FMT_RGB24() ? 3 : 1;
		int bufferedImageType = pixelFormat == AV_PIX_FMT_RGB24()
				? BufferedImage.TYPE_3BYTE_BGR
				: BufferedImage.TYPE_BYTE_GRAY;

		byte[] pixelBuf = new byte[width * height * bytesPerPixel];

		var data = AVFrame.data(frame);
		// frame.data[0]
		var pdata = data.get(C_POINTER, 0);
		// frame.linespace[0]
		var linesize = AVFrame.linesize(frame).get(C_INT, 0);

		// Copy pixel data
		for (int y = 0; y < height; y++) {
			var pixelArray = pdata.asSlice((long) y * linesize)
					.reinterpret((long) width * bytesPerPixel, arena, null);

			byte[] linePixelBytes = pixelArray.toArray(C_CHAR);
			if (pixelFormat == AV_PIX_FMT_RGB24()) {
				convertRgbToBgr(linePixelBytes);
			}

			System.arraycopy(linePixelBytes, 0, pixelBuf, y * width * bytesPerPixel, linePixelBytes.length);
		}

		BufferedImage image = new BufferedImage(width, height, bufferedImageType);
		image.setData(Raster.createRaster(image.getSampleModel(), new DataBufferByte(pixelBuf, pixelBuf.length), new Point()));

		++images;
		return image;
	}

	/**
	 * naive RGB to BGR conversion implemented with byte swapping
	 *
	 * @param pixels
	 */
	private void convertRgbToBgr(final byte[] pixels) {
		for (int i = 0; i < pixels.length; i += 3) {
			byte red = pixels[i];

			// Swap blue byte
			pixels[i] = pixels[i + 2];

			// Swap red byte
			pixels[i + 2] = red;
		}
	}

	private MemorySegment openFile(final MemorySegment ppFormatCtx, final String file) {
		// char* fileName;
		var fileName = arena.allocateFrom(file, StandardCharsets.UTF_8);
		if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
			if (!Files.exists(Paths.get(file))) {
				throw new AVIOException("File '" + file + "' does not exist");
			}
			throw new AVIOException("Cannot open file: " + file);
		}

		// AVFormatContext*
		var ctx = ppFormatCtx.get(C_POINTER, 0);
		if (avformat_find_stream_info(ctx, NULL) < 0) {
			throw new AVException("No streams detected in file: " + file);
		}

		// Dump AV format info to STDERR
		av_dump_format(ctx, 0, fileName, 0);

		return ctx;
	}

	private static VideoStream getFirstVideoStream(final MemorySegment pFormatCtx) {
		// Find the first video stream
		int streams = AVFormatContext.nb_streams(pFormatCtx);
		var pStreams = AVFormatContext.streams(pFormatCtx);

		LOG.debug("Found {} streams", streams);

		for (int i = 0; i < streams; i++) {
			// AVStream*;
			var pStream = pStreams.getAtIndex(C_POINTER, i);
			// AVCodecParameters*;
			var pCodecParams = AVStream.codecpar(pStream);
			if (AVCodecParameters.codec_type(pCodecParams) == AVMEDIA_TYPE_VIDEO()) {
				return new VideoStream(i, pCodecParams);
			}
		}
		return null;
	}

	private static DecoderContext getDecoderContext(final MemorySegment avFormatContext) {
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
				throw new AVException("Failed to open decoder context using codec '" + AVCodec.name(pCodec) + "'");
			}

			return new DecoderContext(videoStream, decoderCtx);
		} catch (AVException e) {
			avcodec_close(decoderCtx);
			throw e;
		}
	}

	private MemorySegment getSwScaleContext(final MemorySegment avCodecContext, final Resolution dstResolution, final int outputPixelFormat) {
		int pixFmt = AVCodecContext.pix_fmt(avCodecContext);
		return sws_getContext(srcResolution.width(), srcResolution.height(), pixFmt, dstResolution.width(), dstResolution.height(),
				outputPixelFormat, SWS_BILINEAR(), NULL, NULL, NULL);
	}

	private static void requireNonNull(final MemorySegment segment, final String message) throws AVAllocateException {
		if (segment == null) {
			throw new IllegalArgumentException("segment must be non-null");
		}
		if (segment.equals(NULL)) {
			throw new AVAllocateException(message);
		}
	}

	private MemorySegment allocateRgb24Buffer(final Resolution resolution) {
		int width = resolution.width();
		int height = resolution.height();

		int bufferBytes = av_image_get_buffer_size(AV_PIX_FMT_RGB24(), width, height, SIMD_ALIGN_BYTES);
		var buf = av_malloc(bufferBytes * C_CHAR.byteSize());
		requireNonNull(buf, "Cannot allocate buffer");

		return buf;
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
	private static MemorySegment getAVCodec(final VideoStream videoStream) throws AVAllocateException {
		// Find the AVCodec* decoder for the video stream
		int codecId = AVCodecParameters.codec_id(videoStream.avCodecParams());
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

	private void avCodecCloseNonNull(final MemorySegment avCodecCtx) {
		if (avCodecCtx == null) {
			return;
		}
		avcodec_close(avCodecCtx);
	}

	private void avFormatCloseNonNull(final MemorySegment ppFormatCtx) {
		if (ppFormatCtx == null) {
			return;
		}
		avformat_close_input(ppFormatCtx);
	}

	public static final class Builder {
		private Arena arena;
		private Path mp4;
		private Integer modFrames;
		private Integer limit;
		private PixelFormat pixelFormat;
		private Resolution resolution;

		private Builder() {}

		public Builder mp4(final Path mp4) {
			this.mp4 = mp4;
			return this;
		}

		public Builder modFrames(final Integer modFrames) {
			this.modFrames = modFrames;
			return this;
		}

		public Builder limit(final Integer limit) {
			this.limit = limit;
			return this;
		}

		public Builder pixelFormat(final PixelFormat pixelFormat) {
			this.pixelFormat = pixelFormat;
			return this;
		}

		public Builder resolution(final Resolution resolution) {
			this.resolution = resolution;
			return this;
		}

		public BufferedImageStreamSpliterator build(final Arena arena) throws FileNotFoundException {
			if (arena == null) {
				throw new IllegalArgumentException("arena must be non-null");
			}
			if (mp4 == null) {
				throw new IllegalArgumentException("mp4 must be non-null");
			}
			if (pixelFormat == null) {
				throw new IllegalArgumentException("pixelFormat must be non-null");
			}
			this.arena = arena;
			return new BufferedImageStreamSpliterator(this);
		}
	}
}

package io.github.chrisribble.ffmpeg.example;

import static io.github.chrisribble.ffmpeg.example.Macros.AVERROR;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AVERROR_EOF;
import static io.github.chrisribble.ffmpeg8.FFmpeg.AVMEDIA_TYPE_VIDEO;
import static io.github.chrisribble.ffmpeg8.FFmpeg.SWS_BILINEAR;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_dump_format;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_frame_alloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_free;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_image_fill_arrays;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_image_get_buffer_size;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_malloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_alloc;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_free;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_packet_unref;
import static io.github.chrisribble.ffmpeg8.FFmpeg.av_read_frame;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_alloc_context3;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_find_decoder;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_free_context;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_open2;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_parameters_to_context;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_receive_frame;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avcodec_send_packet;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avformat_close_input;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avformat_find_stream_info;
import static io.github.chrisribble.ffmpeg8.FFmpeg.avformat_open_input;
import static io.github.chrisribble.ffmpeg8.FFmpeg.sws_freeContext;
import static io.github.chrisribble.ffmpeg8.FFmpeg.sws_getContext;
import static io.github.chrisribble.ffmpeg8.FFmpeg.sws_scale;
import static io.github.chrisribble.ffmpeg8.FFmpeg$shared.C_CHAR;
import static io.github.chrisribble.ffmpeg8.FFmpeg$shared.C_INT;
import static io.github.chrisribble.ffmpeg8.FFmpeg$shared.C_POINTER;
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
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chrisribble.ffmpeg.example.exception.AVAllocateException;
import io.github.chrisribble.ffmpeg.example.exception.AVException;
import io.github.chrisribble.ffmpeg.example.exception.AVIOException;
import io.github.chrisribble.ffmpeg8.AVCodec;
import io.github.chrisribble.ffmpeg8.AVCodecContext;
import io.github.chrisribble.ffmpeg8.AVCodecParameters;
import io.github.chrisribble.ffmpeg8.AVFormatContext;
import io.github.chrisribble.ffmpeg8.AVFrame;
import io.github.chrisribble.ffmpeg8.AVPacket;
import io.github.chrisribble.ffmpeg8.AVStream;

public final class BufferedImageStreamSpliterator implements Spliterator<BufferedImage>, AutoCloseable {
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private static final int SIMD_ALIGN_BYTES = 32;

	private final Arena arena;
	private final Path[] inputs;
	private final int modFrames;
	private final Integer limit;
	private final PixelFormat pixelFormat;

	private MemorySegment ppFormatCtx;
	private MemorySegment pFormatCtx;
	private MemorySegment pAvCodecCtx;
	private MemorySegment pSwScaleCtx;
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

	private BufferedImageStreamSpliterator(final Builder builder) {
		arena = builder.arena;
		inputs = builder.inputs;
		modFrames = builder.modFrames != null ? builder.modFrames : 1;
		limit = builder.limit;
		pixelFormat = builder.pixelFormat;
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
			avPacketFreeNonNull(packet);
			swsFreeNonNull(pSwScaleCtx);
			avCodecFreeContextNonNull(pAvCodecCtx);
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
			int decodeErr = avcodec_send_packet(pAvCodecCtx, packet);
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
		avcodec_send_packet(pAvCodecCtx, NULL);
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
		int returnCode = avcodec_receive_frame(pAvCodecCtx, decodedFrame);
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
		sws_scale(pSwScaleCtx, AVFrame.data(decodedFrame),
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

		// AVFormatContext*
		pFormatCtx = openInput(ppFormatCtx, inputs);

		// Initialize decoder context
		var decoderContext = getVideoDecoderContext(pFormatCtx);
		pAvCodecCtx = decoderContext.pAvCodecContext();
		videoStream = decoderContext.videoStream();

		srcResolution = new Resolution(decoderContext);
		if (dstResolution == null) {
			dstResolution = srcResolution;
		}

		// Determine required buffer size and allocate
		buffer = allocateBuffer(srcResolution);

		// Allocate input/output AVFrame*
		decodedFrame = allocateFrame();
		outputFrame = allocateFrame();

		// Assign appropriate parts of buffer to image planes in outputFrame
		av_image_fill_arrays(
				AVFrame.data(outputFrame), AVFrame.linesize(outputFrame), buffer,
				pixelFormat.ffmpegType(), dstResolution.width(), dstResolution.height(), SIMD_ALIGN_BYTES);

		// initialize SWS context for software scaling
		pSwScaleCtx = getSwScaleContext(decoderContext.pAvCodecContext(), dstResolution);

		// AVPacket*
		packet = av_packet_alloc();

		opened = true;
	}

	private BufferedImage getBufferedImage(final MemorySegment frame, final Resolution resolution) {
		int width = resolution.width();
		int height = resolution.height();

		int bytesPerPixel = pixelFormat.bytesPerPixel();
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
			if (pixelFormat == PixelFormat.RGB) {
				/*
				 * FFmpeg supports RGB24, but BufferedImage only supports:
				 * - TYPE_3BYTE_BGR (blue and red bytes are swapped)
				 * - TYPE_INT_RGB (4-byte integer encoding with alpha)
				 * Simple/naive solution is to just swap B <-> R.
				 * There is likely a more elegant way to do this.
				 */
				PixelFormatConverter.rgbToBgr(linePixelBytes);
			}

			System.arraycopy(linePixelBytes, 0, pixelBuf, y * width * bytesPerPixel, linePixelBytes.length);
		}

		var image = new BufferedImage(width, height, pixelFormat.bufferedImageType());
		var dataBuffer = new DataBufferByte(pixelBuf, pixelBuf.length);
		image.setData(Raster.createRaster(image.getSampleModel(), dataBuffer, new Point()));

		++images;
		return image;
	}

	private MemorySegment openInput(final MemorySegment ppFormatCtx, final Path... inputs) {
		String input = inputs.length == 1
				? inputs[0].toString()
				: "concat:" + String.join("|", Arrays.stream(inputs).map(Path::toString).toList());

		// char* fileName;
		var fileName = arena.allocateFrom(input, StandardCharsets.UTF_8);
		if (avformat_open_input(ppFormatCtx, fileName, NULL, NULL) != 0) {
			if (!Files.exists(Paths.get(input))) {
				throw new AVIOException("File '" + input + "' does not exist");
			}
			throw new AVIOException("Cannot open file: " + input);
		}

		// AVFormatContext*
		var ctx = ppFormatCtx.get(C_POINTER, 0);
		if (avformat_find_stream_info(ctx, NULL) < 0) {
			throw new AVException("No streams detected in file: " + input);
		}

		// Dump AV format info to STDERR
		av_dump_format(ctx, 0, fileName, 0);

		return ctx;
	}

	private DecoderContext getVideoDecoderContext(final MemorySegment avFormatContext) {
		// AVCodecContext*
		var pDecoderCtx = NULL;
		try {
			// Find the first video stream
			VideoStream stream = getFirstVideoStream(avFormatContext);
			if (stream == null) {
				throw new AVException("No video streams found in file");
			}
			LOG.debug("Found video stream (index: {})", stream.index());

			var pCodec = getAVCodec(stream);

			// Copy codec params to AVCodecContext*
			pDecoderCtx = avcodec_alloc_context3(pCodec);
			if (avcodec_parameters_to_context(pDecoderCtx, stream.avCodecParams()) != 0) {
				throw new AVException("Failed to create decoder context from video stream codec parameters");
			}

			// Open codec context so that we can feed packets to the decoder
			if (avcodec_open2(pDecoderCtx, pCodec, NULL) < 0) {
				throw new AVException("Failed to open decoder context using codec '" + AVCodec.name(pCodec) + "'");
			}

			return new DecoderContext(stream, pDecoderCtx);
		} catch (AVException e) {
			avCodecFreeContextNonNull(pDecoderCtx);
			throw e;
		}
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

	private MemorySegment getSwScaleContext(final MemorySegment avCodecContext, final Resolution dstResolution) {
		int pixFmt = AVCodecContext.pix_fmt(avCodecContext);
		return sws_getContext(srcResolution.width(), srcResolution.height(), pixFmt,
				dstResolution.width(), dstResolution.height(), pixelFormat.ffmpegType(),
				SWS_BILINEAR(), NULL, NULL, NULL);
	}

	private static void requireNonNull(final MemorySegment segment, final String message) throws AVAllocateException {
		if (segment == null) {
			throw new IllegalArgumentException("segment must be non-null");
		}
		if (segment.equals(NULL)) {
			throw new AVAllocateException(message);
		}
	}

	private MemorySegment allocateBuffer(final Resolution resolution) {
		int width = resolution.width();
		int height = resolution.height();

		int bufferBytes = av_image_get_buffer_size(pixelFormat.ffmpegType(), width, height, SIMD_ALIGN_BYTES);
		var buf = av_malloc(bufferBytes * C_CHAR.byteSize());
		requireNonNull(buf, "Cannot allocate buffer");

		return buf;
	}

	private MemorySegment allocateFrame() {
		// AVFrame*
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

		// AVCodec*
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

	private void avPacketFreeNonNull(final MemorySegment pAvPacket) {
		if (pAvPacket == null) {
			return;
		}
		av_packet_free(pAvPacket);
	}

	private void swsFreeNonNull(final MemorySegment swScaleCtx) {
		if (swScaleCtx == null) {
			return;
		}
		sws_freeContext(swScaleCtx);
	}

	private void avCodecFreeContextNonNull(final MemorySegment avCodecCtx) {
		if (avCodecCtx == null) {
			return;
		}
		// AVCodecContext**
		var ppAvCodecCtx = pointer(pAvCodecCtx);
		avcodec_free_context(ppAvCodecCtx);
	}

	private void avFormatCloseNonNull(final MemorySegment ppFormatCtx) {
		if (ppFormatCtx == null) {
			return;
		}
		avformat_close_input(ppFormatCtx);
	}

	private MemorySegment pointer(final MemorySegment segment) {
		var pointer = arena.allocate(C_POINTER);
		pointer.set(C_POINTER, 0, MemorySegment.ofAddress(segment.address()));
		return pointer;
	}

	public static final class Builder {
		private static final LibavVersion LIBAV_VERSION = LibavVersion.getInstance();

		private Arena arena;
		private Path[] inputs;
		private Integer modFrames;
		private Integer limit;
		private PixelFormat pixelFormat;
		private Resolution resolution;

		private Builder() {
			if (!LIBAV_VERSION.isCompatible()) {
				throw new UnsupportedOperationException("Runtime FFmpeg version (" + LibavVersion.getVersionInfo() + ") is not compatible with bindings");
			}
		}

		public Builder input(final Path input) {
			inputs = new Path[] { input };
			return this;
		}

		public Builder inputs(final List<Path> inputs) {
			this.inputs = inputs.toArray(Path[]::new);
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
			if (inputs == null) {
				throw new IllegalArgumentException("inputs must be non-null");
			}
			for (Path input : inputs) {
				if (input == null) {
					throw new IllegalArgumentException("input must be non-null");
				}
				if (!Files.exists(input)) {
					throw new FileNotFoundException("File " + input + " does not exist");
				}
			}
			if (pixelFormat == null) {
				throw new IllegalArgumentException("pixelFormat must be non-null");
			}
			this.arena = arena;
			return new BufferedImageStreamSpliterator(this);
		}
	}
}

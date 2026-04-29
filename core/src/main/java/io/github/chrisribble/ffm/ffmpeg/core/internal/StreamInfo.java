package io.github.chrisribble.ffm.ffmpeg.core.internal;

import java.lang.foreign.MemorySegment;

import io.github.chrisribble.ffm.ffmpeg.bindings.AVCodecParameters;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVRational;
import io.github.chrisribble.ffm.ffmpeg.bindings.AVStream;
import io.github.chrisribble.ffm.ffmpeg.core.Rational;

public final class StreamInfo {
	private final int index;

	// AVStream*
	private final MemorySegment avStream;

	// AVCodecParameters*
	private final MemorySegment avCodecParams;

	public StreamInfo(final int index, final MemorySegment avStream) {
		this(index, avStream, AVStream.codecpar(avStream));
	}

	public StreamInfo(final int index, final MemorySegment avStream, final MemorySegment avCodecParams) {
		if (index < 0) {
			throw new IllegalArgumentException("index must be non-negative");
		}
		if (avStream == null) {
			throw new IllegalArgumentException("avStream must be non-null");
		}
		if (avStream == MemorySegment.NULL) {
			throw new IllegalArgumentException("avStream must be a non-NULL pointer");
		}
		if (avCodecParams == null) {
			throw new IllegalArgumentException("avCodecParams must be non-null");
		}
		if (avCodecParams == MemorySegment.NULL) {
			throw new IllegalArgumentException("avCodecParams must be a non-NULL pointer");
		}

		this.index = index;
		this.avStream = avStream.asReadOnly();
		this.avCodecParams = avCodecParams.asReadOnly();
	}

	public int index() {
		return index;
	}

	public MemorySegment avStream() {
		return avStream.asReadOnly();
	}

	public MemorySegment avCodecParams() {
		return avCodecParams.asReadOnly();
	}

	public int id() {
		return AVStream.id(avStream);
	}

	public int codecType() {
		return AVCodecParameters.codec_type(avCodecParams);
	}

	public int codecId() {
		return AVCodecParameters.codec_id(avCodecParams);
	}

	public int codecTag() {
		return AVCodecParameters.codec_tag(avCodecParams);
	}

	public Rational getAvgFrameRate() {
		return rational(AVStream.avg_frame_rate(avStream));
	}

	public Rational getRFrameRate() {
		return rational(AVStream.r_frame_rate(avStream));
	}

	public double getTimeBase() {
		// AVRational*
		var timeBase = AVStream.time_base(avStream);
		return q2d(timeBase);
	}

	public long getTimescale() {
		// AVRational*
		var timeBase = AVStream.time_base(avStream);

		// libav uses reciprocal of time scale as time base
		return (long) (AVRational.den(timeBase) / (double) AVRational.num(timeBase));
	}

	private Rational rational(final MemorySegment avRational) {
		return new Rational(AVRational.num(avRational), AVRational.den(avRational));
	}

	private double q2d(final MemorySegment avRational) {
		return AVRational.num(avRational) / (double) AVRational.den(avRational);
	}
}

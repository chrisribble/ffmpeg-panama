package io.github.chrisribble.ffmpeg.example;

import java.lang.foreign.MemorySegment;

import io.github.chrisribble.ffmpeg8.AVCodecParameters;
import io.github.chrisribble.ffmpeg8.AVRational;
import io.github.chrisribble.ffmpeg8.AVStream;

record StreamInfo(
		int index,
		// AVStream*
		MemorySegment avStream,
		// AVCodecParameters*
		MemorySegment avCodecParams) {

	public StreamInfo {
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
	}

	public StreamInfo(final int index, final MemorySegment avStream) {
		this(index, avStream, AVStream.codecpar(avStream));
	}

	public int getCodecType() {
		return AVCodecParameters.codec_type(avCodecParams);
	}

	public int getCodecId() {
		return AVCodecParameters.codec_id(avCodecParams);
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

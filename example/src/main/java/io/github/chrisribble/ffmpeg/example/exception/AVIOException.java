package io.github.chrisribble.ffmpeg.example.exception;

public class AVIOException extends AVException {
	private static final long serialVersionUID = 1L;

	public AVIOException(final String message) {
		super(message);
	}

	public AVIOException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
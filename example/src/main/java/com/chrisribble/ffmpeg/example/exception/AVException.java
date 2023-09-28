package com.chrisribble.ffmpeg.example.exception;

public class AVException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AVException(final String message) {
		super(message);
	}

	public AVException(final String message, final Throwable cause) {
		super(message, cause);
	}
}

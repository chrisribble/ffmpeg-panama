package com.chrisribble.ffmpeg.example.exception;

public class AVException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AVException(final String message) {
		super(message);
	}
}

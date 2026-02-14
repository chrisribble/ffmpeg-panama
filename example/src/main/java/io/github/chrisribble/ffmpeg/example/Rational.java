package io.github.chrisribble.ffmpeg.example;

public record Rational(int num, int den) {
	public Rational {
		if (num <= 0) {
			throw new IllegalArgumentException("num must be positive");
		}
		if (den <= 0) {
			throw new IllegalArgumentException("den must be positive");
		}
	}

	public double doubleValue() {
		return num / (double) den;
	}

	@Override
	public String toString() {
		if (den == 1) {
			return Integer.toString(num);
		}
		return num + "/" + den;
	}
}
package com.chrisribble.ffmpeg.example;

public final class RuntimePosix {
	private RuntimePosix() {}

	public static int EAGAIN() {
		return PosixDetector.INSTANCE.EAGAIN();
	}

	// TODO: Map other POSIX error codes that do not match across *nix systems

	private static class PosixDetector {
		private static final String BSD = "bsd";
		private static final String LINUX = "linux";
		private static final String MAC = "mac";
		private static final String WINDOWS = "windows";

		static final Posix INSTANCE = getPosixImpl();

		private static Posix getPosixImpl() {
			String os = System.getProperty("os.name");
			String lowercaseOs = os.toLowerCase();
			if (lowercaseOs.contains(BSD)) {
				return new BSD();
			}
			if (lowercaseOs.contains(LINUX)) {
				return new Linux();
			}
			if (lowercaseOs.contains(MAC)) {
				return new MacOSX();
			}
			if (lowercaseOs.contains(WINDOWS)) {
				return new Windows();
			}

			return new Unknown(os);
		}
	}

	private static class Linux implements Posix {
		@Override
		public int EAGAIN() {
			return 11;
		}
	}

	private static class MacOSX extends BSD {}

	private static class BSD implements Posix {
		@Override
		public int EAGAIN() {
			return 35;
		}
	}

	private static class Windows implements Posix {
		@Override
		public int EAGAIN() {
			return 11;
		}
	}

	private static final class Unknown implements Posix {
		private final String os;

		Unknown(final String os) {
			this.os = os;
		}

		@Override
		public int EAGAIN() {
			throw new UnsupportedOperationException("Platform detection failed for OS '" + os + "'");
		}
	}

	private interface Posix {
		int EAGAIN();
	}
}

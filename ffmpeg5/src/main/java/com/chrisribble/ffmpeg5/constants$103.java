// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$103 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$103() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "lrand48_r",
        constants$66.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "nrand48_r",
        constants$71.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mrand48_r",
        constants$66.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "jrand48_r",
        constants$71.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "srand48_r",
        constants$103.const$4
    );
}



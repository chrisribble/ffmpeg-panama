// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$124 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$124() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "strlen",
        constants$79.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "strnlen",
        constants$124.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "strerror",
        constants$0.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "strerror_r",
        constants$124.const$4
    );
}



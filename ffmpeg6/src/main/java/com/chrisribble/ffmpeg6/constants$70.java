// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$70 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$70() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "fflush",
        constants$0.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "fflush_unlocked",
        constants$0.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "fopen",
        constants$69.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "freopen",
        constants$70.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "fdopen",
        constants$70.const$5
    );
}



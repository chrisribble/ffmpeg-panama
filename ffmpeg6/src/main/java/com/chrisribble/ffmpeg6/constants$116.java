// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$116 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$116() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "getloadavg",
        constants$82.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "memcpy",
        constants$116.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "memmove",
        constants$116.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "memccpy",
        constants$116.const$4
    );
}



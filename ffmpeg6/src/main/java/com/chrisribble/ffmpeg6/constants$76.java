// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$76 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$76() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "getw",
        constants$0.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "putw",
        constants$72.const$4
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "fgets",
        constants$76.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "__getdelim",
        constants$76.const$4
    );
}



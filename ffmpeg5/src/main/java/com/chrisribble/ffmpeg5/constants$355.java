// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$355 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$355() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sws_alloc_context",
        constants$4.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sws_init_context",
        constants$71.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sws_freeContext",
        constants$70.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sws_getContext",
        constants$355.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "sws_scale",
        constants$355.const$5
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$348 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$348() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sws_isSupportedOutput",
        constants$1.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sws_isSupportedEndiannessConversion",
        constants$1.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sws_alloc_context",
        constants$4.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sws_init_context",
        constants$71.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sws_freeContext",
        constants$70.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
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
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "sws_getContext",
        constants$348.const$5
    );
}



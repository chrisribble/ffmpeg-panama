// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$133 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$133() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_reduce",
        constants$133.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("num"),
        JAVA_INT.withName("den")
    ).withName("AVRational"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_mul_q",
        constants$133.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_div_q",
        constants$133.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_add_q",
        constants$133.const$2
    );
}



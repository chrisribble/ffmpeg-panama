// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$138 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$138() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_rescale_q_rnd",
        constants$138.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_compare_ts",
        constants$138.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_compare_mod",
        constants$137.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        JAVA_INT,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_rescale_delta",
        constants$138.const$5
    );
}



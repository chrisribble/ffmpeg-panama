// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$134 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$134() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_sub_q",
        constants$133.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("num"),
        JAVA_INT.withName("den")
    ).withName("AVRational"),
        JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_d2q",
        constants$134.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
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
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_nearer_q",
        constants$134.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_find_nearest_q_idx",
        constants$134.const$5
    );
}


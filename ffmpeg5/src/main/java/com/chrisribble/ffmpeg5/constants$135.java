// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$135 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$135() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_q2intfloat",
        constants$135.const$0
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
        ).withName("AVRational"),
        JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_gcd_q",
        constants$135.const$2
    );
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        JAVA_INT.withName("i"),
        JAVA_FLOAT.withName("f")
    ).withName("av_intfloat32");
    static final VarHandle const$5 = constants$135.const$4.varHandle(MemoryLayout.PathElement.groupElement("i"));
}


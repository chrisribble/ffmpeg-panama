// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$137 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$137() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_rescale",
        constants$137.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_rescale_rnd",
        constants$137.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_rescale_q",
        constants$137.const$4
    );
}



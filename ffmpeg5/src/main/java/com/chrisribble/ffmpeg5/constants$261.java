// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$261 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$261() {}
    static final VarHandle const$0 = constants$259.const$1.varHandle(MemoryLayout.PathElement.groupElement("tm_zone"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("tv_sec"),
            JAVA_LONG.withName("tv_nsec")
        ).withName("it_interval"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("tv_sec"),
            JAVA_LONG.withName("tv_nsec")
        ).withName("it_value")
    ).withName("itimerspec");
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clock",
        constants$83.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "time",
        constants$79.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_DOUBLE,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "difftime",
        constants$261.const$4
    );
}



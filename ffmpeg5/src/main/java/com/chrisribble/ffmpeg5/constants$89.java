// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$89 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$89() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "strtoll",
        constants$6.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "strtoull",
        constants$6.const$2
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "l64a",
        constants$89.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "a64l",
        constants$82.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("__val")
    ).withName("");
}



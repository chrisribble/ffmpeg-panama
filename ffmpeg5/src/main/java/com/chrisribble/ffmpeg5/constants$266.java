// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$266 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$266() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "dysize",
        constants$1.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "nanosleep",
        constants$66.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clock_getres",
        constants$72.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clock_gettime",
        constants$72.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clock_settime",
        constants$72.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "clock_nanosleep",
        constants$266.const$5
    );
}



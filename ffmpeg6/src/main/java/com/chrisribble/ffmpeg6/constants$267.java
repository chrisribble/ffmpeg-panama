// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$267 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$267() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "timer_delete",
        constants$0.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "timer_settime",
        constants$267.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "timer_gettime",
        constants$66.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "timer_getoverrun",
        constants$0.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "timespec_get",
        constants$82.const$5
    );
}


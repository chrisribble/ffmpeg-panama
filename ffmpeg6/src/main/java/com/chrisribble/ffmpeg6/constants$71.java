// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$71 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$71() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandleVariadic(
        "sprintf",
        constants$66.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "vfprintf",
        constants$71.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "vprintf",
        constants$66.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "vsprintf",
        constants$71.const$1
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$71.const$5
    );
}



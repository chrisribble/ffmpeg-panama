// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$156 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$156() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_dict_get",
        constants$156.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_dict_iterate",
        constants$69.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_dict_count",
        constants$0.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_dict_set",
        constants$145.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_dict_set_int",
        constants$156.const$5
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_get_packed_sample_fmt",
        constants$1.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_get_planar_sample_fmt",
        constants$1.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_get_sample_fmt_string",
        constants$1.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_get_bytes_per_sample",
        constants$1.const$0
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$346 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$346() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_pix_fmt_swap_endianness",
        constants$1.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_get_pix_fmt_loss",
        constants$346.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_find_best_pix_fmt_of_2",
        constants$346.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_image_fill_max_pixsteps",
        constants$130.const$5
    );
}



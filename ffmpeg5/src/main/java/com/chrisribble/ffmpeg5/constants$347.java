// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$347 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$347() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_write_image_line2",
        constants$346.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_write_image_line",
        constants$347.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_pix_fmt_swap_endianness",
        constants$1.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_get_pix_fmt_loss",
        constants$347.const$4
    );
}



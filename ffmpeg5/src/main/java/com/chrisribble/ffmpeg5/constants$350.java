// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$350 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$350() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_image_copy",
        constants$350.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_image_copy_uc_from",
        constants$350.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_image_fill_arrays",
        constants$2.const$3
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_image_get_buffer_size",
        constants$350.const$4
    );
}



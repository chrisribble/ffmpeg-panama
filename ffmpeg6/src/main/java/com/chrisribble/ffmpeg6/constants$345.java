// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$345 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$345() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_image_check_size2",
        constants$345.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("AVRational")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_image_check_sar",
        constants$345.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_image_fill_black",
        constants$2.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "swscale_version",
        constants$3.const$4
    );
}



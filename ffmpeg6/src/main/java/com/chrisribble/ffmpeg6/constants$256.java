// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$256 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$256() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avcodec_find_best_pix_fmt_of_list",
        constants$256.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "avcodec_default_get_format",
        constants$66.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avcodec_string",
        constants$256.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(avcodec_default_execute$func.class, "apply", constants$66.const$1);
}



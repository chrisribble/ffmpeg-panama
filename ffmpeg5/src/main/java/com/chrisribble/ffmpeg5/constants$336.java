// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$336 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$336() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_dump_format",
        constants$256.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_get_frame_filename2",
        constants$336.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_get_frame_filename",
        constants$180.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_filename_number_test",
        constants$0.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_sdp_create",
        constants$180.const$2
    );
}



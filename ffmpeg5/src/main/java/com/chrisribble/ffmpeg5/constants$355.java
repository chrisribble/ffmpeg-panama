// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$355 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$355() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sws_frame_start",
        constants$71.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sws_frame_end",
        constants$70.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sws_send_slice",
        constants$337.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sws_receive_slice",
        constants$337.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sws_receive_slice_alignment",
        constants$0.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "sws_setColorspaceDetails",
        constants$355.const$5
    );
}



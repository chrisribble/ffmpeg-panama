// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$247 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$247() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "avcodec_send_packet",
        constants$66.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avcodec_receive_frame",
        constants$66.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "avcodec_send_frame",
        constants$66.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avcodec_receive_packet",
        constants$66.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "avcodec_get_hw_frames_parameters",
        constants$247.const$4
    );
}



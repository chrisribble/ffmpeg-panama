// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$204() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_new_packet",
        constants$82.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_shrink_packet",
        constants$159.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_grow_packet",
        constants$82.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_packet_from_data",
        constants$109.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_packet_new_side_data",
        constants$117.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_packet_add_side_data",
        constants$204.const$5
    );
}



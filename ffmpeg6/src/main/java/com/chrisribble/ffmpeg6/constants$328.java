// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$328 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$328() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_pkt_dump2",
        constants$328.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_pkt_dump_log2",
        constants$328.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_codec_get_id",
        constants$82.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_codec_get_tag",
        constants$82.const$5
    );
}


// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$258 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$258() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avcodec_fill_audio_frame",
        constants$258.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "avcodec_flush_buffers",
        constants$70.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_get_audio_frame_duration",
        constants$82.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_fast_padded_malloc",
        constants$70.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_fast_padded_mallocz",
        constants$70.const$0
    );
}



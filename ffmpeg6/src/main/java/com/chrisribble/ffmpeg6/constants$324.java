// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$324 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$324() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_program_add_stream_index",
        constants$130.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_find_best_stream",
        constants$324.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_read_frame",
        constants$66.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_seek_frame",
        constants$295.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "avformat_seek_file",
        constants$297.const$1
    );
}



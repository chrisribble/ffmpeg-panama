// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$326 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$326() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_probe_input_format3",
        constants$79.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_probe_input_buffer2",
        constants$231.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_probe_input_buffer",
        constants$231.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avformat_open_input",
        constants$249.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avformat_find_stream_info",
        constants$68.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_find_program_from_stream",
        constants$326.const$5
    );
}



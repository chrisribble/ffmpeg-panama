// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$333 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$333() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_hex_dump",
        constants$281.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_hex_dump_log",
        constants$256.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_pkt_dump2",
        constants$333.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_pkt_dump_log2",
        constants$333.const$4
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$330 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$330() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_add_index_entry",
        constants$330.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_url_split",
        constants$330.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_dump_format",
        constants$256.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_get_frame_filename2",
        constants$330.const$5
    );
}



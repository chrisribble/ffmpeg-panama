// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$329 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$329() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_codec_get_tag2",
        constants$326.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_find_default_stream_index",
        constants$0.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_index_search_timestamp",
        constants$78.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avformat_index_get_entries_count",
        constants$0.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avformat_index_get_entry",
        constants$120.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "avformat_index_get_entry_from_timestamp",
        constants$329.const$5
    );
}



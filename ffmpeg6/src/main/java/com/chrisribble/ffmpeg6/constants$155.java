// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$155() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_buffer_pool_uninit",
        constants$72.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_buffer_pool_get",
        constants$69.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_buffer_pool_buffer_get_opaque",
        constants$69.const$2
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("key"),
        RuntimeHelper.POINTER.withName("value")
    ).withName("AVDictionaryEntry");
    static final VarHandle const$4 = constants$155.const$3.varHandle(MemoryLayout.PathElement.groupElement("key"));
    static final VarHandle const$5 = constants$155.const$3.varHandle(MemoryLayout.PathElement.groupElement("value"));
}



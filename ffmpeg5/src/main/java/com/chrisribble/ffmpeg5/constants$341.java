// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$341 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$341() {}
    static final VarHandle const$0 = constants$340.const$3.varHandle(MemoryLayout.PathElement.groupElement("log2_chroma_w"));
    static final VarHandle const$1 = constants$340.const$3.varHandle(MemoryLayout.PathElement.groupElement("log2_chroma_h"));
    static final VarHandle const$2 = constants$340.const$3.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$3 = constants$340.const$3.varHandle(MemoryLayout.PathElement.groupElement("alias"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_get_bits_per_pixel",
        constants$0.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_get_padded_bits_per_pixel",
        constants$0.const$3
    );
}



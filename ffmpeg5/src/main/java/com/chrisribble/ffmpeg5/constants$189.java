// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        RuntimeHelper.POINTER.withName("long_name"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("id"),
        JAVA_INT.withName("capabilities"),
        JAVA_BYTE.withName("max_lowres"),
        MemoryLayout.paddingLayout(3),
        RuntimeHelper.POINTER.withName("supported_framerates"),
        RuntimeHelper.POINTER.withName("pix_fmts"),
        RuntimeHelper.POINTER.withName("supported_samplerates"),
        RuntimeHelper.POINTER.withName("sample_fmts"),
        RuntimeHelper.POINTER.withName("channel_layouts"),
        RuntimeHelper.POINTER.withName("priv_class"),
        RuntimeHelper.POINTER.withName("profiles"),
        RuntimeHelper.POINTER.withName("wrapper_name"),
        RuntimeHelper.POINTER.withName("ch_layouts")
    ).withName("AVCodec");
    static final VarHandle const$1 = constants$189.const$0.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$2 = constants$189.const$0.varHandle(MemoryLayout.PathElement.groupElement("long_name"));
    static final VarHandle const$3 = constants$189.const$0.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$189.const$0.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$5 = constants$189.const$0.varHandle(MemoryLayout.PathElement.groupElement("capabilities"));
}



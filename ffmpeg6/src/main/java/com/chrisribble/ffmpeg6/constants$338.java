// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$338 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$338() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        JAVA_BYTE.withName("nb_components"),
        JAVA_BYTE.withName("log2_chroma_w"),
        JAVA_BYTE.withName("log2_chroma_h"),
        MemoryLayout.paddingLayout(5),
        JAVA_LONG.withName("flags"),
        MemoryLayout.sequenceLayout(4, MemoryLayout.structLayout(
            JAVA_INT.withName("plane"),
            JAVA_INT.withName("step"),
            JAVA_INT.withName("offset"),
            JAVA_INT.withName("shift"),
            JAVA_INT.withName("depth")
        ).withName("AVComponentDescriptor")).withName("comp"),
        RuntimeHelper.POINTER.withName("alias")
    ).withName("AVPixFmtDescriptor");
    static final VarHandle const$1 = constants$338.const$0.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$2 = constants$338.const$0.varHandle(MemoryLayout.PathElement.groupElement("nb_components"));
    static final VarHandle const$3 = constants$338.const$0.varHandle(MemoryLayout.PathElement.groupElement("log2_chroma_w"));
    static final VarHandle const$4 = constants$338.const$0.varHandle(MemoryLayout.PathElement.groupElement("log2_chroma_h"));
    static final VarHandle const$5 = constants$338.const$0.varHandle(MemoryLayout.PathElement.groupElement("flags"));
}



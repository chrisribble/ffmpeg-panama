// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$243 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$243() {}
    static final VarHandle const$0 = constants$238.const$5.varHandle(MemoryLayout.PathElement.groupElement("frame_params"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("w"),
        JAVA_INT.withName("h"),
        JAVA_INT.withName("nb_colors"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(4, RuntimeHelper.POINTER).withName("data"),
        MemoryLayout.sequenceLayout(4, JAVA_INT).withName("linesize"),
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("text"),
        RuntimeHelper.POINTER.withName("ass"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVSubtitleRect");
    static final VarHandle const$2 = constants$243.const$1.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$3 = constants$243.const$1.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$4 = constants$243.const$1.varHandle(MemoryLayout.PathElement.groupElement("w"));
    static final VarHandle const$5 = constants$243.const$1.varHandle(MemoryLayout.PathElement.groupElement("h"));
}



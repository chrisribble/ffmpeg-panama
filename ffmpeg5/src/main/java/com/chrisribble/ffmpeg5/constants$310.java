// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$310 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$310() {}
    static final VarHandle const$0 = constants$307.const$5.varHandle(MemoryLayout.PathElement.groupElement("pts_wrap_reference"));
    static final VarHandle const$1 = constants$307.const$5.varHandle(MemoryLayout.PathElement.groupElement("pts_wrap_behavior"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("id"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("time_base"),
        JAVA_LONG.withName("start"),
        JAVA_LONG.withName("end"),
        RuntimeHelper.POINTER.withName("metadata")
    ).withName("AVChapter");
    static final VarHandle const$3 = constants$310.const$2.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$4 = constants$310.const$2.varHandle(MemoryLayout.PathElement.groupElement("start"));
    static final VarHandle const$5 = constants$310.const$2.varHandle(MemoryLayout.PathElement.groupElement("end"));
}


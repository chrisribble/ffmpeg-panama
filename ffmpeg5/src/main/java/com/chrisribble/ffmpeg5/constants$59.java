// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$59 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$59() {}
    static final VarHandle const$0 = JAVA_INT.varHandle();
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("signgam", JAVA_INT);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("__count"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("__wch"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
        ).withName("__value")
    ).withName("");
    static final VarHandle const$3 = constants$59.const$2.varHandle(MemoryLayout.PathElement.groupElement("__count"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        JAVA_INT.withName("__wch"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
    ).withName("");
    static final VarHandle const$5 = constants$59.const$4.varHandle(MemoryLayout.PathElement.groupElement("__wch"));
}



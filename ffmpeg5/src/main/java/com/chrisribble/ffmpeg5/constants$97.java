// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$97 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$97() {}
    static final VarHandle const$0 = constants$96.const$5.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_rwlockattr_t");
    static final VarHandle const$2 = constants$97.const$1.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$3 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_barrier_t");
    static final VarHandle const$4 = constants$97.const$3.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__size"),
        JAVA_INT.withName("__align")
    ).withName("pthread_barrierattr_t");
}



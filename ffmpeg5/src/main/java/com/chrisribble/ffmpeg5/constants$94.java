// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$94 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$94() {}
    static final VarHandle const$0 = constants$92.const$2.varHandle(MemoryLayout.PathElement.groupElement("__pad2"));
    static final VarHandle const$1 = constants$92.const$2.varHandle(MemoryLayout.PathElement.groupElement("__flags"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("__value64"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("__low"),
                JAVA_INT.withName("__high")
            ).withName("__value32")
        ).withName("__wseq"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("__value64"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("__low"),
                JAVA_INT.withName("__high")
            ).withName("__value32")
        ).withName("__g1_start"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("__g_refs"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("__g_size"),
        JAVA_INT.withName("__g1_orig_size"),
        JAVA_INT.withName("__wrefs"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("__g_signals")
    ).withName("__pthread_cond_s");
    static final VarHandle const$3 = constants$94.const$2.varHandle(MemoryLayout.PathElement.groupElement("__g1_orig_size"));
    static final VarHandle const$4 = constants$94.const$2.varHandle(MemoryLayout.PathElement.groupElement("__wrefs"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("__data")
    ).withName("__once_flag");
}



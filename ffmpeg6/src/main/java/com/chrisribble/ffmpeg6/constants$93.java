// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$93 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$93() {}
    static final VarHandle const$0 = constants$91.const$5.varHandle(MemoryLayout.PathElement.groupElement("__cur_writer"));
    static final VarHandle const$1 = constants$91.const$5.varHandle(MemoryLayout.PathElement.groupElement("__shared"));
    static final VarHandle const$2 = constants$91.const$5.varHandle(MemoryLayout.PathElement.groupElement("__rwelision"));
    static final VarHandle const$3 = constants$91.const$5.varHandle(MemoryLayout.PathElement.groupElement("__pad2"));
    static final VarHandle const$4 = constants$91.const$5.varHandle(MemoryLayout.PathElement.groupElement("__flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$96 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$96() {}
    static final VarHandle const$0 = constants$95.const$5.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("__lock"),
            JAVA_INT.withName("__count"),
            JAVA_INT.withName("__owner"),
            JAVA_INT.withName("__nusers"),
            JAVA_INT.withName("__kind"),
            JAVA_SHORT.withName("__spins"),
            JAVA_SHORT.withName("__elision"),
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("__prev"),
                RuntimeHelper.POINTER.withName("__next")
            ).withName("__list")
        ).withName("__data"),
        MemoryLayout.sequenceLayout(40, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_mutex_t");
    static final VarHandle const$2 = constants$96.const$1.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$3 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
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
        ).withName("__data"),
        MemoryLayout.sequenceLayout(48, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_cond_t");
    static final VarHandle const$4 = constants$96.const$3.varHandle(MemoryLayout.PathElement.groupElement("__align"));
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("__readers"),
            JAVA_INT.withName("__writers"),
            JAVA_INT.withName("__wrphase_futex"),
            JAVA_INT.withName("__writers_futex"),
            JAVA_INT.withName("__pad3"),
            JAVA_INT.withName("__pad4"),
            JAVA_INT.withName("__cur_writer"),
            JAVA_INT.withName("__shared"),
            JAVA_BYTE.withName("__rwelision"),
            MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("__pad1"),
            JAVA_LONG.withName("__pad2"),
            JAVA_INT.withName("__flags"),
            MemoryLayout.paddingLayout(4)
        ).withName("__data"),
        MemoryLayout.sequenceLayout(56, JAVA_BYTE).withName("__size"),
        JAVA_LONG.withName("__align")
    ).withName("pthread_rwlock_t");
}



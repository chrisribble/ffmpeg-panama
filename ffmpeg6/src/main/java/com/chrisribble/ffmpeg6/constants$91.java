// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$91 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$91() {}
    static final VarHandle const$0 = constants$90.const$3.varHandle(MemoryLayout.PathElement.groupElement("__owner"));
    static final VarHandle const$1 = constants$90.const$3.varHandle(MemoryLayout.PathElement.groupElement("__nusers"));
    static final VarHandle const$2 = constants$90.const$3.varHandle(MemoryLayout.PathElement.groupElement("__kind"));
    static final VarHandle const$3 = constants$90.const$3.varHandle(MemoryLayout.PathElement.groupElement("__spins"));
    static final VarHandle const$4 = constants$90.const$3.varHandle(MemoryLayout.PathElement.groupElement("__elision"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
    ).withName("__pthread_rwlock_arch_t");
}



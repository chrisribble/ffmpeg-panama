// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$89 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$89() {}
    static final VarHandle const$0 = constants$88.const$5.varHandle(MemoryLayout.PathElement.groupElement("__value64"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("__low"),
        JAVA_INT.withName("__high")
    ).withName("");
    static final VarHandle const$2 = constants$89.const$1.varHandle(MemoryLayout.PathElement.groupElement("__low"));
    static final VarHandle const$3 = constants$89.const$1.varHandle(MemoryLayout.PathElement.groupElement("__high"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__prev"),
        RuntimeHelper.POINTER.withName("__next")
    ).withName("__pthread_internal_list");
    static final VarHandle const$5 = constants$89.const$4.varHandle(MemoryLayout.PathElement.groupElement("__prev"));
}


// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$334 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$334() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("plane"),
        JAVA_INT.withName("step"),
        JAVA_INT.withName("offset"),
        JAVA_INT.withName("shift"),
        JAVA_INT.withName("depth")
    ).withName("AVComponentDescriptor");
    static final VarHandle const$1 = constants$334.const$0.varHandle(MemoryLayout.PathElement.groupElement("plane"));
    static final VarHandle const$2 = constants$334.const$0.varHandle(MemoryLayout.PathElement.groupElement("step"));
    static final VarHandle const$3 = constants$334.const$0.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    static final VarHandle const$4 = constants$334.const$0.varHandle(MemoryLayout.PathElement.groupElement("shift"));
    static final VarHandle const$5 = constants$334.const$0.varHandle(MemoryLayout.PathElement.groupElement("depth"));
}



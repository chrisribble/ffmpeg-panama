// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$352 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$352() {}
    static final VarHandle const$0 = constants$351.const$5.varHandle(MemoryLayout.PathElement.groupElement("coeff"));
    static final VarHandle const$1 = constants$351.const$5.varHandle(MemoryLayout.PathElement.groupElement("length"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lumH"),
        RuntimeHelper.POINTER.withName("lumV"),
        RuntimeHelper.POINTER.withName("chrH"),
        RuntimeHelper.POINTER.withName("chrV")
    ).withName("SwsFilter");
    static final VarHandle const$3 = constants$352.const$2.varHandle(MemoryLayout.PathElement.groupElement("lumH"));
    static final VarHandle const$4 = constants$352.const$2.varHandle(MemoryLayout.PathElement.groupElement("lumV"));
    static final VarHandle const$5 = constants$352.const$2.varHandle(MemoryLayout.PathElement.groupElement("chrH"));
}


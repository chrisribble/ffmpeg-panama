// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$281 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$281() {}
    static final VarHandle const$0 = constants$274.const$5.varHandle(MemoryLayout.PathElement.groupElement("protocol_blacklist"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVIOContext.write_data_type.class, "apply", constants$281.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$281.const$1
    );
    static final VarHandle const$4 = constants$274.const$5.varHandle(MemoryLayout.PathElement.groupElement("write_data_type"));
    static final VarHandle const$5 = constants$274.const$5.varHandle(MemoryLayout.PathElement.groupElement("ignore_boundary_point"));
}



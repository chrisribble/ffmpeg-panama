// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$305 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$305() {}
    static final VarHandle const$0 = constants$304.const$4.varHandle(MemoryLayout.PathElement.groupElement("start"));
    static final VarHandle const$1 = constants$304.const$4.varHandle(MemoryLayout.PathElement.groupElement("end"));
    static final VarHandle const$2 = constants$304.const$4.varHandle(MemoryLayout.PathElement.groupElement("metadata"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(av_format_control_message.class, "apply", constants$204.const$5);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$204.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$276 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$276() {}
    static final VarHandle const$0 = constants$271.const$1.varHandle(MemoryLayout.PathElement.groupElement("read_pause"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVIOContext.read_seek.class, "apply", constants$276.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$276.const$1
    );
    static final VarHandle const$4 = constants$271.const$1.varHandle(MemoryLayout.PathElement.groupElement("read_seek"));
    static final VarHandle const$5 = constants$271.const$1.varHandle(MemoryLayout.PathElement.groupElement("seekable"));
}



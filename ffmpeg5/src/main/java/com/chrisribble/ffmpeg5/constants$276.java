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
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVIOContext.read_packet.class, "apply", constants$66.const$0);
    static final VarHandle const$1 = constants$274.const$5.varHandle(MemoryLayout.PathElement.groupElement("read_packet"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVIOContext.write_packet.class, "apply", constants$66.const$0);
    static final VarHandle const$3 = constants$274.const$5.varHandle(MemoryLayout.PathElement.groupElement("write_packet"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVIOContext.seek.class, "apply", constants$276.const$4);
}



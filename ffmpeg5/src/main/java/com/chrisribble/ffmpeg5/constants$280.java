// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$280 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$280() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(avio_alloc_context$read_packet.class, "apply", constants$109.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(avio_alloc_context$write_packet.class, "apply", constants$109.const$5);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(avio_alloc_context$seek.class, "apply", constants$273.const$0);
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avio_alloc_context",
        constants$280.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "avio_context_free",
        constants$70.const$2
    );
}



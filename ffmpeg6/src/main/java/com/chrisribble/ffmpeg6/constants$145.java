// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$145 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$145() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AVClass.query_ranges.class, "apply", constants$145.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$145.const$0
    );
    static final VarHandle const$3 = constants$143.const$0.varHandle(MemoryLayout.PathElement.groupElement("query_ranges"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(AVClass.child_next.class, "apply", constants$69.const$5);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$69.const$5
    );
}



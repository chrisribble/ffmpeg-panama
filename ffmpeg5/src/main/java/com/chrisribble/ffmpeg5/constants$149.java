// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$149 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$149() {}
    static final VarHandle const$0 = constants$148.const$3.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_buffer_alloc",
        constants$87.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_buffer_allocz",
        constants$87.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(av_buffer_create$free.class, "apply", constants$69.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$69.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "av_buffer_create",
        constants$149.const$5
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$154 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$154() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(av_buffer_pool_init2$alloc.class, "apply", constants$108.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$108.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(av_buffer_pool_init2$pool_free.class, "apply", constants$72.const$4);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$72.const$4
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_buffer_pool_init2",
        constants$154.const$4
    );
}



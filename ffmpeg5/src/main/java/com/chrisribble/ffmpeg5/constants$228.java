// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$228 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$228() {}
    static final VarHandle const$0 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("thread_count"));
    static final VarHandle const$1 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("thread_type"));
    static final VarHandle const$2 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("active_thread_type"));
    static final VarHandle const$3 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("thread_safe_callbacks"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVCodecContext.execute.class, "apply", constants$228.const$4);
}



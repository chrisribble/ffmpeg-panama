// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$146 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$146() {}
    static final VarHandle const$0 = constants$143.const$0.varHandle(MemoryLayout.PathElement.groupElement("child_next"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AVClass.child_class_iterate.class, "apply", constants$69.const$2);
    static final VarHandle const$2 = constants$143.const$0.varHandle(MemoryLayout.PathElement.groupElement("child_class_iterate"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "av_log",
        constants$146.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandleVariadic(
        "av_log_once",
        constants$146.const$5
    );
}



// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$68 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$68() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("stdout", RuntimeHelper.POINTER);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("stderr", RuntimeHelper.POINTER);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "remove",
        constants$0.const$3
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "rename",
        constants$68.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "renameat",
        constants$68.const$5
    );
}



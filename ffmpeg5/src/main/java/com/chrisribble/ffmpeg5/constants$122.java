// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$122() {}
    static final VarHandle const$0 = constants$121.const$5.varHandle(MemoryLayout.PathElement.groupElement("__ctype_b"));
    static final VarHandle const$1 = constants$121.const$5.varHandle(MemoryLayout.PathElement.groupElement("__ctype_tolower"));
    static final VarHandle const$2 = constants$121.const$5.varHandle(MemoryLayout.PathElement.groupElement("__ctype_toupper"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "strcoll_l",
        constants$73.const$3
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "strxfrm_l",
        constants$122.const$4
    );
}



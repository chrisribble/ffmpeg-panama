// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$229 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$229() {}
    static final VarHandle const$0 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("execute"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AVCodecContext.execute2.class, "apply", constants$154.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$154.const$0
    );
    static final VarHandle const$3 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("execute2"));
    static final VarHandle const$4 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("nsse_weight"));
    static final VarHandle const$5 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("profile"));
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$268 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$268() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "timer_getoverrun",
        constants$0.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "timespec_get",
        constants$82.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("callback"),
        RuntimeHelper.POINTER.withName("opaque")
    ).withName("AVIOInterruptCB");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AVIOInterruptCB.callback.class, "apply", constants$0.const$3);
    static final VarHandle const$4 = constants$268.const$2.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    static final VarHandle const$5 = constants$268.const$2.varHandle(MemoryLayout.PathElement.groupElement("opaque"));
}



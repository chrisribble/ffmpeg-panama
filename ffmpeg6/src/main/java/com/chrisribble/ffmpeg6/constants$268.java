// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$268 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$268() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("callback"),
        RuntimeHelper.POINTER.withName("opaque")
    ).withName("AVIOInterruptCB");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AVIOInterruptCB.callback.class, "apply", constants$0.const$3);
    static final VarHandle const$2 = constants$268.const$0.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    static final VarHandle const$3 = constants$268.const$0.varHandle(MemoryLayout.PathElement.groupElement("opaque"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("utf8"),
        JAVA_LONG.withName("size"),
        JAVA_LONG.withName("modification_timestamp"),
        JAVA_LONG.withName("access_timestamp"),
        JAVA_LONG.withName("status_change_timestamp"),
        JAVA_LONG.withName("user_id"),
        JAVA_LONG.withName("group_id"),
        JAVA_LONG.withName("filemode")
    ).withName("AVIODirEntry");
    static final VarHandle const$5 = constants$268.const$4.varHandle(MemoryLayout.PathElement.groupElement("name"));
}


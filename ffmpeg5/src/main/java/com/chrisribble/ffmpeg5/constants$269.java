// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$269 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$269() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
    static final VarHandle const$1 = constants$269.const$0.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$2 = constants$269.const$0.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$269.const$0.varHandle(MemoryLayout.PathElement.groupElement("utf8"));
    static final VarHandle const$4 = constants$269.const$0.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final VarHandle const$5 = constants$269.const$0.varHandle(MemoryLayout.PathElement.groupElement("modification_timestamp"));
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$307 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$307() {}
    static final VarHandle const$0 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_device_list"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("pos"),
        JAVA_LONG.withName("timestamp"),
        MemoryLayout.paddingLayout(4),
        JAVA_INT.withName("min_distance")
    ).withName("AVIndexEntry");
    static final VarHandle const$2 = constants$307.const$1.varHandle(MemoryLayout.PathElement.groupElement("pos"));
    static final VarHandle const$3 = constants$307.const$1.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    static final VarHandle const$4 = constants$307.const$1.varHandle(MemoryLayout.PathElement.groupElement("min_distance"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_disposition_from_string",
        constants$0.const$3
    );
}



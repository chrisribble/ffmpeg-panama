// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$200 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$200() {}
    static final VarHandle const$0 = constants$199.const$1.varHandle(MemoryLayout.PathElement.groupElement("vbv_delay"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_cpb_properties_alloc",
        constants$67.const$1
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("wallclock"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVProducerReferenceTime");
    static final VarHandle const$3 = constants$200.const$2.varHandle(MemoryLayout.PathElement.groupElement("wallclock"));
    static final VarHandle const$4 = constants$200.const$2.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_xiphlacing",
        constants$82.const$5
    );
}



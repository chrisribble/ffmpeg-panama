// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$186() {}
    static final VarHandle const$0 = constants$185.const$2.varHandle(MemoryLayout.PathElement.groupElement("min_height"));
    static final VarHandle const$1 = constants$185.const$2.varHandle(MemoryLayout.PathElement.groupElement("max_width"));
    static final VarHandle const$2 = constants$185.const$2.varHandle(MemoryLayout.PathElement.groupElement("max_height"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_hwdevice_hwconfig_alloc",
        constants$69.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_hwdevice_get_hwframe_constraints",
        constants$69.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_hwframe_constraints_free",
        constants$72.const$4
    );
}



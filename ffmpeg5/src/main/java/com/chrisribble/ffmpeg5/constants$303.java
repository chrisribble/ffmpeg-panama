// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$303 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$303() {}
    static final VarHandle const$0 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("read_probe"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AVInputFormat.read_header.class, "apply", constants$0.const$3);
    static final VarHandle const$2 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("read_header"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AVInputFormat.read_packet.class, "apply", constants$68.const$3);
    static final VarHandle const$4 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("read_packet"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVInputFormat.read_close.class, "apply", constants$0.const$3);
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$273 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$273() {}
    static final VarHandle const$0 = constants$272.const$1.varHandle(MemoryLayout.PathElement.groupElement("buf_end"));
    static final VarHandle const$1 = constants$272.const$1.varHandle(MemoryLayout.PathElement.groupElement("opaque"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVIOContext.read_packet.class, "apply", constants$110.const$5);
    static final VarHandle const$3 = constants$272.const$1.varHandle(MemoryLayout.PathElement.groupElement("read_packet"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(AVIOContext.write_packet.class, "apply", constants$110.const$5);
    static final VarHandle const$5 = constants$272.const$1.varHandle(MemoryLayout.PathElement.groupElement("write_packet"));
}



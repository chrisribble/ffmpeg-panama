// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$302 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$302() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$301.const$4
    );
    static final VarHandle const$1 = constants$297.const$5.varHandle(MemoryLayout.PathElement.groupElement("read_timestamp"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVInputFormat.read_play.class, "apply", constants$0.const$3);
    static final VarHandle const$3 = constants$297.const$5.varHandle(MemoryLayout.PathElement.groupElement("read_play"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(AVInputFormat.read_pause.class, "apply", constants$0.const$3);
    static final VarHandle const$5 = constants$297.const$5.varHandle(MemoryLayout.PathElement.groupElement("read_pause"));
}


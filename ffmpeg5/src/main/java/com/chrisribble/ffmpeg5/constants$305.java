// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$305 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$305() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVInputFormat.read_timestamp.class, "apply", constants$304.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$304.const$5
    );
    static final VarHandle const$2 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("read_timestamp"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AVInputFormat.read_play.class, "apply", constants$0.const$3);
    static final VarHandle const$4 = constants$301.const$0.varHandle(MemoryLayout.PathElement.groupElement("read_play"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVInputFormat.read_pause.class, "apply", constants$0.const$3);
}



// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$296 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$296() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVOutputFormat.get_output_timestamp.class, "apply", constants$145.const$0);
    static final VarHandle const$1 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_output_timestamp"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(AVOutputFormat.control_message.class, "apply", constants$205.const$5);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$205.const$5
    );
    static final VarHandle const$4 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("control_message"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVOutputFormat.write_uncoded_frame.class, "apply", constants$181.const$2);
}



// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$212 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$212() {}
    static final VarHandle const$0 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("coded_width"));
    static final VarHandle const$1 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("coded_height"));
    static final VarHandle const$2 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("gop_size"));
    static final VarHandle const$3 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("pix_fmt"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVCodecContext.draw_horiz_band.class, "apply", constants$212.const$4);
}



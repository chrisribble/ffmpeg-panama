// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*avcodec_default_execute2$func)(AVCodecContext*,void*,int,int);
 * }
 */
public interface avcodec_default_execute2$func {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
    static MemorySegment allocate(avcodec_default_execute2$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$260.const$0, fi, constants$259.const$5, scope);
    }
    static avcodec_default_execute2$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
            try {
                return (int)constants$260.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}



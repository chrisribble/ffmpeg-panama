// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*avio_alloc_context$write_packet)(void*,uint8_t*,int);
 * }
 */
public interface avio_alloc_context$write_packet {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
    static MemorySegment allocate(avio_alloc_context$write_packet fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$279.const$4, fi, constants$109.const$5, scope);
    }
    static avio_alloc_context$write_packet ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
            try {
                return (int)constants$222.const$5.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}



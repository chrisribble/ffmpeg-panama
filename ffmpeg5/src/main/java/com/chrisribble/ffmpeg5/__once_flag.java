// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     int __data;
 * };
 * }
 */
public class __once_flag {

    public static MemoryLayout $LAYOUT() {
        return constants$97.const$2;
    }
    public static VarHandle __data$VH() {
        return constants$97.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __data;
     * }
     */
    public static int __data$get(MemorySegment seg) {
        return (int)constants$97.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __data;
     * }
     */
    public static void __data$set(MemorySegment seg, int x) {
        constants$97.const$3.set(seg, x);
    }
    public static int __data$get(MemorySegment seg, long index) {
        return (int)constants$97.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void __data$set(MemorySegment seg, long index, int x) {
        constants$97.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



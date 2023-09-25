// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union av_intfloat32 {
 *     uint32_t i;
 *     float f;
 * };
 * }
 */
public class av_intfloat32 {

    public static MemoryLayout $LAYOUT() {
        return constants$135.const$4;
    }
    public static VarHandle i$VH() {
        return constants$135.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t i;
     * }
     */
    public static int i$get(MemorySegment seg) {
        return (int)constants$135.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t i;
     * }
     */
    public static void i$set(MemorySegment seg, int x) {
        constants$135.const$5.set(seg, x);
    }
    public static int i$get(MemorySegment seg, long index) {
        return (int)constants$135.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void i$set(MemorySegment seg, long index, int x) {
        constants$135.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle f$VH() {
        return constants$136.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static float f$get(MemorySegment seg) {
        return (float)constants$136.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float f;
     * }
     */
    public static void f$set(MemorySegment seg, float x) {
        constants$136.const$0.set(seg, x);
    }
    public static float f$get(MemorySegment seg, long index) {
        return (float)constants$136.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void f$set(MemorySegment seg, long index, float x) {
        constants$136.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



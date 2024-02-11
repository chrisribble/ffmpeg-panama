// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SwsVector {
 *     double* coeff;
 *     int length;
 * };
 * }
 */
public class SwsVector {

    public static MemoryLayout $LAYOUT() {
        return constants$349.const$3;
    }
    public static VarHandle coeff$VH() {
        return constants$349.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double* coeff;
     * }
     */
    public static MemorySegment coeff$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$349.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double* coeff;
     * }
     */
    public static void coeff$set(MemorySegment seg, MemorySegment x) {
        constants$349.const$4.set(seg, x);
    }
    public static MemorySegment coeff$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$349.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void coeff$set(MemorySegment seg, long index, MemorySegment x) {
        constants$349.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle length$VH() {
        return constants$349.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$349.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$349.const$5.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$349.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$349.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



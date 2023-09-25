// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVRegionOfInterest {
 *     uint32_t self_size;
 *     int top;
 *     int bottom;
 *     int left;
 *     int right;
 *     AVRational qoffset;
 * };
 * }
 */
public class AVRegionOfInterest {

    public static MemoryLayout $LAYOUT() {
        return constants$163.const$4;
    }
    public static VarHandle self_size$VH() {
        return constants$163.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t self_size;
     * }
     */
    public static int self_size$get(MemorySegment seg) {
        return (int)constants$163.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t self_size;
     * }
     */
    public static void self_size$set(MemorySegment seg, int x) {
        constants$163.const$5.set(seg, x);
    }
    public static int self_size$get(MemorySegment seg, long index) {
        return (int)constants$163.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void self_size$set(MemorySegment seg, long index, int x) {
        constants$163.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle top$VH() {
        return constants$164.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int top;
     * }
     */
    public static int top$get(MemorySegment seg) {
        return (int)constants$164.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int top;
     * }
     */
    public static void top$set(MemorySegment seg, int x) {
        constants$164.const$0.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)constants$164.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        constants$164.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bottom$VH() {
        return constants$164.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bottom;
     * }
     */
    public static int bottom$get(MemorySegment seg) {
        return (int)constants$164.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bottom;
     * }
     */
    public static void bottom$set(MemorySegment seg, int x) {
        constants$164.const$1.set(seg, x);
    }
    public static int bottom$get(MemorySegment seg, long index) {
        return (int)constants$164.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bottom$set(MemorySegment seg, long index, int x) {
        constants$164.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle left$VH() {
        return constants$164.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int left;
     * }
     */
    public static int left$get(MemorySegment seg) {
        return (int)constants$164.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int left;
     * }
     */
    public static void left$set(MemorySegment seg, int x) {
        constants$164.const$2.set(seg, x);
    }
    public static int left$get(MemorySegment seg, long index) {
        return (int)constants$164.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void left$set(MemorySegment seg, long index, int x) {
        constants$164.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle right$VH() {
        return constants$164.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int right;
     * }
     */
    public static int right$get(MemorySegment seg) {
        return (int)constants$164.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int right;
     * }
     */
    public static void right$set(MemorySegment seg, int x) {
        constants$164.const$3.set(seg, x);
    }
    public static int right$get(MemorySegment seg, long index) {
        return (int)constants$164.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void right$set(MemorySegment seg, long index, int x) {
        constants$164.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment qoffset$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



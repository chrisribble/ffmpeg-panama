// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVHWFramesConstraints {
 *     enum AVPixelFormat* valid_hw_formats;
 *     enum AVPixelFormat* valid_sw_formats;
 *     int min_width;
 *     int min_height;
 *     int max_width;
 *     int max_height;
 * };
 * }
 */
public class AVHWFramesConstraints {

    public static MemoryLayout $LAYOUT() {
        return constants$181.const$4;
    }
    public static VarHandle valid_hw_formats$VH() {
        return constants$181.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_hw_formats;
     * }
     */
    public static MemorySegment valid_hw_formats$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$181.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_hw_formats;
     * }
     */
    public static void valid_hw_formats$set(MemorySegment seg, MemorySegment x) {
        constants$181.const$5.set(seg, x);
    }
    public static MemorySegment valid_hw_formats$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$181.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void valid_hw_formats$set(MemorySegment seg, long index, MemorySegment x) {
        constants$181.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle valid_sw_formats$VH() {
        return constants$182.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_sw_formats;
     * }
     */
    public static MemorySegment valid_sw_formats$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$182.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat* valid_sw_formats;
     * }
     */
    public static void valid_sw_formats$set(MemorySegment seg, MemorySegment x) {
        constants$182.const$0.set(seg, x);
    }
    public static MemorySegment valid_sw_formats$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$182.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void valid_sw_formats$set(MemorySegment seg, long index, MemorySegment x) {
        constants$182.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_width$VH() {
        return constants$182.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int min_width;
     * }
     */
    public static int min_width$get(MemorySegment seg) {
        return (int)constants$182.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int min_width;
     * }
     */
    public static void min_width$set(MemorySegment seg, int x) {
        constants$182.const$1.set(seg, x);
    }
    public static int min_width$get(MemorySegment seg, long index) {
        return (int)constants$182.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void min_width$set(MemorySegment seg, long index, int x) {
        constants$182.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_height$VH() {
        return constants$182.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int min_height;
     * }
     */
    public static int min_height$get(MemorySegment seg) {
        return (int)constants$182.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int min_height;
     * }
     */
    public static void min_height$set(MemorySegment seg, int x) {
        constants$182.const$2.set(seg, x);
    }
    public static int min_height$get(MemorySegment seg, long index) {
        return (int)constants$182.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void min_height$set(MemorySegment seg, long index, int x) {
        constants$182.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_width$VH() {
        return constants$182.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_width;
     * }
     */
    public static int max_width$get(MemorySegment seg) {
        return (int)constants$182.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_width;
     * }
     */
    public static void max_width$set(MemorySegment seg, int x) {
        constants$182.const$3.set(seg, x);
    }
    public static int max_width$get(MemorySegment seg, long index) {
        return (int)constants$182.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void max_width$set(MemorySegment seg, long index, int x) {
        constants$182.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_height$VH() {
        return constants$182.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_height;
     * }
     */
    public static int max_height$get(MemorySegment seg) {
        return (int)constants$182.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_height;
     * }
     */
    public static void max_height$set(MemorySegment seg, int x) {
        constants$182.const$4.set(seg, x);
    }
    public static int max_height$get(MemorySegment seg, long index) {
        return (int)constants$182.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void max_height$set(MemorySegment seg, long index, int x) {
        constants$182.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



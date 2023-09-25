// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCodecHWConfig {
 *     enum AVPixelFormat pix_fmt;
 *     int methods;
 *     enum AVHWDeviceType device_type;
 * };
 * }
 */
public class AVCodecHWConfig {

    public static MemoryLayout $LAYOUT() {
        return constants$189.const$2;
    }
    public static VarHandle pix_fmt$VH() {
        return constants$189.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat pix_fmt;
     * }
     */
    public static int pix_fmt$get(MemorySegment seg) {
        return (int)constants$189.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat pix_fmt;
     * }
     */
    public static void pix_fmt$set(MemorySegment seg, int x) {
        constants$189.const$3.set(seg, x);
    }
    public static int pix_fmt$get(MemorySegment seg, long index) {
        return (int)constants$189.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pix_fmt$set(MemorySegment seg, long index, int x) {
        constants$189.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle methods$VH() {
        return constants$189.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int methods;
     * }
     */
    public static int methods$get(MemorySegment seg) {
        return (int)constants$189.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int methods;
     * }
     */
    public static void methods$set(MemorySegment seg, int x) {
        constants$189.const$4.set(seg, x);
    }
    public static int methods$get(MemorySegment seg, long index) {
        return (int)constants$189.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void methods$set(MemorySegment seg, long index, int x) {
        constants$189.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle device_type$VH() {
        return constants$189.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVHWDeviceType device_type;
     * }
     */
    public static int device_type$get(MemorySegment seg) {
        return (int)constants$189.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVHWDeviceType device_type;
     * }
     */
    public static void device_type$set(MemorySegment seg, int x) {
        constants$189.const$5.set(seg, x);
    }
    public static int device_type$get(MemorySegment seg, long index) {
        return (int)constants$189.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void device_type$set(MemorySegment seg, long index, int x) {
        constants$189.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



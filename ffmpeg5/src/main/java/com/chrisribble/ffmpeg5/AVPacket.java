// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVPacket {
 *     AVBufferRef* buf;
 *     int64_t pts;
 *     int64_t dts;
 *     uint8_t* data;
 *     int size;
 *     int stream_index;
 *     int flags;
 *     AVPacketSideData* side_data;
 *     int side_data_elems;
 *     int64_t duration;
 *     int64_t pos;
 *     void* opaque;
 *     AVBufferRef* opaque_ref;
 *     AVRational time_base;
 * };
 * }
 */
public class AVPacket {

    public static MemoryLayout $LAYOUT() {
        return constants$200.const$4;
    }
    public static VarHandle buf$VH() {
        return constants$200.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVBufferRef* buf;
     * }
     */
    public static MemorySegment buf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$200.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVBufferRef* buf;
     * }
     */
    public static void buf$set(MemorySegment seg, MemorySegment x) {
        constants$200.const$5.set(seg, x);
    }
    public static MemorySegment buf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$200.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void buf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$200.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts$VH() {
        return constants$201.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static long pts$get(MemorySegment seg) {
        return (long)constants$201.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static void pts$set(MemorySegment seg, long x) {
        constants$201.const$0.set(seg, x);
    }
    public static long pts$get(MemorySegment seg, long index) {
        return (long)constants$201.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pts$set(MemorySegment seg, long index, long x) {
        constants$201.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dts$VH() {
        return constants$201.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static long dts$get(MemorySegment seg) {
        return (long)constants$201.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static void dts$set(MemorySegment seg, long x) {
        constants$201.const$1.set(seg, x);
    }
    public static long dts$get(MemorySegment seg, long index) {
        return (long)constants$201.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dts$set(MemorySegment seg, long index, long x) {
        constants$201.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle data$VH() {
        return constants$201.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$201.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        constants$201.const$2.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$201.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$201.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$201.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static int size$get(MemorySegment seg) {
        return (int)constants$201.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static void size$set(MemorySegment seg, int x) {
        constants$201.const$3.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)constants$201.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        constants$201.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stream_index$VH() {
        return constants$201.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int stream_index;
     * }
     */
    public static int stream_index$get(MemorySegment seg) {
        return (int)constants$201.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int stream_index;
     * }
     */
    public static void stream_index$set(MemorySegment seg, int x) {
        constants$201.const$4.set(seg, x);
    }
    public static int stream_index$get(MemorySegment seg, long index) {
        return (int)constants$201.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void stream_index$set(MemorySegment seg, long index, int x) {
        constants$201.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$201.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$201.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$201.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$201.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$201.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle side_data$VH() {
        return constants$202.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVPacketSideData* side_data;
     * }
     */
    public static MemorySegment side_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$202.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVPacketSideData* side_data;
     * }
     */
    public static void side_data$set(MemorySegment seg, MemorySegment x) {
        constants$202.const$0.set(seg, x);
    }
    public static MemorySegment side_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$202.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void side_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$202.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle side_data_elems$VH() {
        return constants$202.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int side_data_elems;
     * }
     */
    public static int side_data_elems$get(MemorySegment seg) {
        return (int)constants$202.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int side_data_elems;
     * }
     */
    public static void side_data_elems$set(MemorySegment seg, int x) {
        constants$202.const$1.set(seg, x);
    }
    public static int side_data_elems$get(MemorySegment seg, long index) {
        return (int)constants$202.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void side_data_elems$set(MemorySegment seg, long index, int x) {
        constants$202.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle duration$VH() {
        return constants$202.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t duration;
     * }
     */
    public static long duration$get(MemorySegment seg) {
        return (long)constants$202.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t duration;
     * }
     */
    public static void duration$set(MemorySegment seg, long x) {
        constants$202.const$2.set(seg, x);
    }
    public static long duration$get(MemorySegment seg, long index) {
        return (long)constants$202.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void duration$set(MemorySegment seg, long index, long x) {
        constants$202.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pos$VH() {
        return constants$202.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static long pos$get(MemorySegment seg) {
        return (long)constants$202.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static void pos$set(MemorySegment seg, long x) {
        constants$202.const$3.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)constants$202.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        constants$202.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle opaque$VH() {
        return constants$202.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static MemorySegment opaque$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$202.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static void opaque$set(MemorySegment seg, MemorySegment x) {
        constants$202.const$4.set(seg, x);
    }
    public static MemorySegment opaque$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$202.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void opaque$set(MemorySegment seg, long index, MemorySegment x) {
        constants$202.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle opaque_ref$VH() {
        return constants$202.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVBufferRef* opaque_ref;
     * }
     */
    public static MemorySegment opaque_ref$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$202.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVBufferRef* opaque_ref;
     * }
     */
    public static void opaque_ref$set(MemorySegment seg, MemorySegment x) {
        constants$202.const$5.set(seg, x);
    }
    public static MemorySegment opaque_ref$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$202.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void opaque_ref$set(MemorySegment seg, long index, MemorySegment x) {
        constants$202.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment time_base$slice(MemorySegment seg) {
        return seg.asSlice(96, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



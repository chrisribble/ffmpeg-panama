// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IO_cookie_io_functions_t {
 *     cookie_read_function_t* read;
 *     cookie_write_function_t* write;
 *     cookie_seek_function_t* seek;
 *     cookie_close_function_t* close;
 * };
 * }
 */
public class _IO_cookie_io_functions_t {

    public static MemoryLayout $LAYOUT() {
        return constants$66.const$5;
    }
    public static VarHandle read$VH() {
        return constants$67.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cookie_read_function_t* read;
     * }
     */
    public static MemorySegment read$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$67.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cookie_read_function_t* read;
     * }
     */
    public static void read$set(MemorySegment seg, MemorySegment x) {
        constants$67.const$0.set(seg, x);
    }
    public static MemorySegment read$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$67.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void read$set(MemorySegment seg, long index, MemorySegment x) {
        constants$67.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle write$VH() {
        return constants$67.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cookie_write_function_t* write;
     * }
     */
    public static MemorySegment write$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$67.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cookie_write_function_t* write;
     * }
     */
    public static void write$set(MemorySegment seg, MemorySegment x) {
        constants$67.const$1.set(seg, x);
    }
    public static MemorySegment write$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$67.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void write$set(MemorySegment seg, long index, MemorySegment x) {
        constants$67.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle seek$VH() {
        return constants$67.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cookie_seek_function_t* seek;
     * }
     */
    public static MemorySegment seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$67.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cookie_seek_function_t* seek;
     * }
     */
    public static void seek$set(MemorySegment seg, MemorySegment x) {
        constants$67.const$2.set(seg, x);
    }
    public static MemorySegment seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$67.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$67.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle close$VH() {
        return constants$67.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cookie_close_function_t* close;
     * }
     */
    public static MemorySegment close$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$67.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cookie_close_function_t* close;
     * }
     */
    public static void close$set(MemorySegment seg, MemorySegment x) {
        constants$67.const$3.set(seg, x);
    }
    public static MemorySegment close$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$67.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void close$set(MemorySegment seg, long index, MemorySegment x) {
        constants$67.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



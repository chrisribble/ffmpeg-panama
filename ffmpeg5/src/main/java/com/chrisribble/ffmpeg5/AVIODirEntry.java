// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVIODirEntry {
 *     char* name;
 *     int type;
 *     int utf8;
 *     int64_t size;
 *     int64_t modification_timestamp;
 *     int64_t access_timestamp;
 *     int64_t status_change_timestamp;
 *     int64_t user_id;
 *     int64_t group_id;
 *     int64_t filemode;
 * };
 * }
 */
public class AVIODirEntry {

    public static MemoryLayout $LAYOUT() {
        return constants$269.const$0;
    }
    public static VarHandle name$VH() {
        return constants$269.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$269.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$269.const$1.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$269.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$269.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$269.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$269.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$269.const$2.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$269.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$269.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle utf8$VH() {
        return constants$269.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int utf8;
     * }
     */
    public static int utf8$get(MemorySegment seg) {
        return (int)constants$269.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int utf8;
     * }
     */
    public static void utf8$set(MemorySegment seg, int x) {
        constants$269.const$3.set(seg, x);
    }
    public static int utf8$get(MemorySegment seg, long index) {
        return (int)constants$269.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void utf8$set(MemorySegment seg, long index, int x) {
        constants$269.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle size$VH() {
        return constants$269.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t size;
     * }
     */
    public static long size$get(MemorySegment seg) {
        return (long)constants$269.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t size;
     * }
     */
    public static void size$set(MemorySegment seg, long x) {
        constants$269.const$4.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)constants$269.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        constants$269.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle modification_timestamp$VH() {
        return constants$269.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t modification_timestamp;
     * }
     */
    public static long modification_timestamp$get(MemorySegment seg) {
        return (long)constants$269.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t modification_timestamp;
     * }
     */
    public static void modification_timestamp$set(MemorySegment seg, long x) {
        constants$269.const$5.set(seg, x);
    }
    public static long modification_timestamp$get(MemorySegment seg, long index) {
        return (long)constants$269.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void modification_timestamp$set(MemorySegment seg, long index, long x) {
        constants$269.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle access_timestamp$VH() {
        return constants$270.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t access_timestamp;
     * }
     */
    public static long access_timestamp$get(MemorySegment seg) {
        return (long)constants$270.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t access_timestamp;
     * }
     */
    public static void access_timestamp$set(MemorySegment seg, long x) {
        constants$270.const$0.set(seg, x);
    }
    public static long access_timestamp$get(MemorySegment seg, long index) {
        return (long)constants$270.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void access_timestamp$set(MemorySegment seg, long index, long x) {
        constants$270.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle status_change_timestamp$VH() {
        return constants$270.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t status_change_timestamp;
     * }
     */
    public static long status_change_timestamp$get(MemorySegment seg) {
        return (long)constants$270.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t status_change_timestamp;
     * }
     */
    public static void status_change_timestamp$set(MemorySegment seg, long x) {
        constants$270.const$1.set(seg, x);
    }
    public static long status_change_timestamp$get(MemorySegment seg, long index) {
        return (long)constants$270.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void status_change_timestamp$set(MemorySegment seg, long index, long x) {
        constants$270.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle user_id$VH() {
        return constants$270.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t user_id;
     * }
     */
    public static long user_id$get(MemorySegment seg) {
        return (long)constants$270.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t user_id;
     * }
     */
    public static void user_id$set(MemorySegment seg, long x) {
        constants$270.const$2.set(seg, x);
    }
    public static long user_id$get(MemorySegment seg, long index) {
        return (long)constants$270.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void user_id$set(MemorySegment seg, long index, long x) {
        constants$270.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle group_id$VH() {
        return constants$270.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t group_id;
     * }
     */
    public static long group_id$get(MemorySegment seg) {
        return (long)constants$270.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t group_id;
     * }
     */
    public static void group_id$set(MemorySegment seg, long x) {
        constants$270.const$3.set(seg, x);
    }
    public static long group_id$get(MemorySegment seg, long index) {
        return (long)constants$270.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void group_id$set(MemorySegment seg, long index, long x) {
        constants$270.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle filemode$VH() {
        return constants$270.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t filemode;
     * }
     */
    public static long filemode$get(MemorySegment seg) {
        return (long)constants$270.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t filemode;
     * }
     */
    public static void filemode$set(MemorySegment seg, long x) {
        constants$270.const$4.set(seg, x);
    }
    public static long filemode$get(MemorySegment seg, long index) {
        return (long)constants$270.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void filemode$set(MemorySegment seg, long index, long x) {
        constants$270.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



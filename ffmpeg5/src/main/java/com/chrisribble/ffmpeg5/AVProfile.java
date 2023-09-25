// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVProfile {
 *     int profile;
 *     char* name;
 * };
 * }
 */
public class AVProfile {

    public static MemoryLayout $LAYOUT() {
        return constants$184.const$5;
    }
    public static VarHandle profile$VH() {
        return constants$185.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int profile;
     * }
     */
    public static int profile$get(MemorySegment seg) {
        return (int)constants$185.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int profile;
     * }
     */
    public static void profile$set(MemorySegment seg, int x) {
        constants$185.const$0.set(seg, x);
    }
    public static int profile$get(MemorySegment seg, long index) {
        return (int)constants$185.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void profile$set(MemorySegment seg, long index, int x) {
        constants$185.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$185.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$185.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$185.const$1.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$185.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$185.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



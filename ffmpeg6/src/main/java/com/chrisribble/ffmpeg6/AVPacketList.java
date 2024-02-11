// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVPacketList {
 *     AVPacket pkt;
 *     struct AVPacketList* next;
 * };
 * }
 */
public class AVPacketList {

    public static MemoryLayout $LAYOUT() {
        return constants$206.const$0;
    }
    public static MemorySegment pkt$slice(MemorySegment seg) {
        return seg.asSlice(0, 104);
    }
    public static VarHandle next$VH() {
        return constants$206.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVPacketList* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$206.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVPacketList* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$206.const$1.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$206.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$206.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



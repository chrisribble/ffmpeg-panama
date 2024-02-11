// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVHWDeviceContext {
 *     const AVClass* av_class;
 *     AVHWDeviceInternal* internal;
 *     enum AVHWDeviceType type;
 *     void* hwctx;
 *     void (*free)(struct AVHWDeviceContext*);
 *     void* user_opaque;
 * };
 * }
 */
public class AVHWDeviceContext {

    public static MemoryLayout $LAYOUT() {
        return constants$178.const$2;
    }
    public static VarHandle av_class$VH() {
        return constants$178.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static MemorySegment av_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$178.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static void av_class$set(MemorySegment seg, MemorySegment x) {
        constants$178.const$3.set(seg, x);
    }
    public static MemorySegment av_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$178.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void av_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$178.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle internal$VH() {
        return constants$178.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVHWDeviceInternal* internal;
     * }
     */
    public static MemorySegment internal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$178.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVHWDeviceInternal* internal;
     * }
     */
    public static void internal$set(MemorySegment seg, MemorySegment x) {
        constants$178.const$4.set(seg, x);
    }
    public static MemorySegment internal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$178.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void internal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$178.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$178.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVHWDeviceType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$178.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVHWDeviceType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$178.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$178.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$178.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwctx$VH() {
        return constants$179.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* hwctx;
     * }
     */
    public static MemorySegment hwctx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$179.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* hwctx;
     * }
     */
    public static void hwctx$set(MemorySegment seg, MemorySegment x) {
        constants$179.const$0.set(seg, x);
    }
    public static MemorySegment hwctx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$179.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hwctx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$179.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*free)(struct AVHWDeviceContext*);
     * }
     */
    public interface free {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(free fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$179.const$1, fi, constants$72.const$4, scope);
        }
        static free ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$154.const$3.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle free$VH() {
        return constants$179.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*free)(struct AVHWDeviceContext*);
     * }
     */
    public static MemorySegment free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$179.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*free)(struct AVHWDeviceContext*);
     * }
     */
    public static void free$set(MemorySegment seg, MemorySegment x) {
        constants$179.const$2.set(seg, x);
    }
    public static MemorySegment free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$179.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemorySegment x) {
        constants$179.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free(MemorySegment segment, Arena scope) {
        return free.ofAddress(free$get(segment), scope);
    }
    public static VarHandle user_opaque$VH() {
        return constants$179.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* user_opaque;
     * }
     */
    public static MemorySegment user_opaque$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$179.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* user_opaque;
     * }
     */
    public static void user_opaque$set(MemorySegment seg, MemorySegment x) {
        constants$179.const$3.set(seg, x);
    }
    public static MemorySegment user_opaque$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$179.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void user_opaque$set(MemorySegment seg, long index, MemorySegment x) {
        constants$179.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



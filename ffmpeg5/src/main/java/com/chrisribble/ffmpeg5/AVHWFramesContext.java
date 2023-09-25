// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVHWFramesContext {
 *     const AVClass* av_class;
 *     AVHWFramesInternal* internal;
 *     AVBufferRef* device_ref;
 *     AVHWDeviceContext* device_ctx;
 *     void* hwctx;
 *     void (*free)(struct AVHWFramesContext*);
 *     void* user_opaque;
 *     AVBufferPool* pool;
 *     int initial_pool_size;
 *     enum AVPixelFormat format;
 *     enum AVPixelFormat sw_format;
 *     int width;
 *     int height;
 * };
 * }
 */
public class AVHWFramesContext {

    public static MemoryLayout $LAYOUT() {
        return constants$176.const$4;
    }
    public static VarHandle av_class$VH() {
        return constants$176.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static MemorySegment av_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$176.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static void av_class$set(MemorySegment seg, MemorySegment x) {
        constants$176.const$5.set(seg, x);
    }
    public static MemorySegment av_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$176.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void av_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$176.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle internal$VH() {
        return constants$177.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVHWFramesInternal* internal;
     * }
     */
    public static MemorySegment internal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$177.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVHWFramesInternal* internal;
     * }
     */
    public static void internal$set(MemorySegment seg, MemorySegment x) {
        constants$177.const$0.set(seg, x);
    }
    public static MemorySegment internal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$177.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void internal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$177.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle device_ref$VH() {
        return constants$177.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVBufferRef* device_ref;
     * }
     */
    public static MemorySegment device_ref$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$177.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVBufferRef* device_ref;
     * }
     */
    public static void device_ref$set(MemorySegment seg, MemorySegment x) {
        constants$177.const$1.set(seg, x);
    }
    public static MemorySegment device_ref$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$177.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void device_ref$set(MemorySegment seg, long index, MemorySegment x) {
        constants$177.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle device_ctx$VH() {
        return constants$177.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVHWDeviceContext* device_ctx;
     * }
     */
    public static MemorySegment device_ctx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$177.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVHWDeviceContext* device_ctx;
     * }
     */
    public static void device_ctx$set(MemorySegment seg, MemorySegment x) {
        constants$177.const$2.set(seg, x);
    }
    public static MemorySegment device_ctx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$177.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void device_ctx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$177.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwctx$VH() {
        return constants$177.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* hwctx;
     * }
     */
    public static MemorySegment hwctx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$177.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* hwctx;
     * }
     */
    public static void hwctx$set(MemorySegment seg, MemorySegment x) {
        constants$177.const$3.set(seg, x);
    }
    public static MemorySegment hwctx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$177.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hwctx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$177.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*free)(struct AVHWFramesContext*);
     * }
     */
    public interface free {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(free fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$177.const$4, fi, constants$70.const$2, scope);
        }
        static free ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    constants$151.const$3.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle free$VH() {
        return constants$177.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*free)(struct AVHWFramesContext*);
     * }
     */
    public static MemorySegment free$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$177.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*free)(struct AVHWFramesContext*);
     * }
     */
    public static void free$set(MemorySegment seg, MemorySegment x) {
        constants$177.const$5.set(seg, x);
    }
    public static MemorySegment free$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$177.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemorySegment x) {
        constants$177.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free(MemorySegment segment, Arena scope) {
        return free.ofAddress(free$get(segment), scope);
    }
    public static VarHandle user_opaque$VH() {
        return constants$178.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* user_opaque;
     * }
     */
    public static MemorySegment user_opaque$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$178.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* user_opaque;
     * }
     */
    public static void user_opaque$set(MemorySegment seg, MemorySegment x) {
        constants$178.const$0.set(seg, x);
    }
    public static MemorySegment user_opaque$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$178.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void user_opaque$set(MemorySegment seg, long index, MemorySegment x) {
        constants$178.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pool$VH() {
        return constants$178.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVBufferPool* pool;
     * }
     */
    public static MemorySegment pool$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$178.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVBufferPool* pool;
     * }
     */
    public static void pool$set(MemorySegment seg, MemorySegment x) {
        constants$178.const$1.set(seg, x);
    }
    public static MemorySegment pool$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$178.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pool$set(MemorySegment seg, long index, MemorySegment x) {
        constants$178.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle initial_pool_size$VH() {
        return constants$178.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int initial_pool_size;
     * }
     */
    public static int initial_pool_size$get(MemorySegment seg) {
        return (int)constants$178.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int initial_pool_size;
     * }
     */
    public static void initial_pool_size$set(MemorySegment seg, int x) {
        constants$178.const$2.set(seg, x);
    }
    public static int initial_pool_size$get(MemorySegment seg, long index) {
        return (int)constants$178.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void initial_pool_size$set(MemorySegment seg, long index, int x) {
        constants$178.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$178.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$178.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$178.const$3.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$178.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$178.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sw_format$VH() {
        return constants$178.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat sw_format;
     * }
     */
    public static int sw_format$get(MemorySegment seg) {
        return (int)constants$178.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat sw_format;
     * }
     */
    public static void sw_format$set(MemorySegment seg, int x) {
        constants$178.const$4.set(seg, x);
    }
    public static int sw_format$get(MemorySegment seg, long index) {
        return (int)constants$178.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void sw_format$set(MemorySegment seg, long index, int x) {
        constants$178.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle width$VH() {
        return constants$178.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$178.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$178.const$5.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$178.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$178.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$179.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$179.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$179.const$0.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$179.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$179.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



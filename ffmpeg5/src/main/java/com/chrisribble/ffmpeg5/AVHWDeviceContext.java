// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct AVHWDeviceContext {
 *     const AVClass *av_class;
 *     AVHWDeviceInternal *internal;
 *     enum AVHWDeviceType type;
 *     void *hwctx;
 *     void (*free)(struct AVHWDeviceContext *);
 *     void *user_opaque;
 * }
 * }
 */
public class AVHWDeviceContext {

    AVHWDeviceContext() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_POINTER.withName("av_class"),
        FFmpeg.C_POINTER.withName("internal"),
        FFmpeg.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("hwctx"),
        FFmpeg.C_POINTER.withName("free"),
        FFmpeg.C_POINTER.withName("user_opaque")
    ).withName("AVHWDeviceContext");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout av_class$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("av_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const AVClass *av_class
     * }
     */
    public static final AddressLayout av_class$layout() {
        return av_class$LAYOUT;
    }

    private static final long av_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const AVClass *av_class
     * }
     */
    public static final long av_class$offset() {
        return av_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const AVClass *av_class
     * }
     */
    public static MemorySegment av_class(MemorySegment struct) {
        return struct.get(av_class$LAYOUT, av_class$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const AVClass *av_class
     * }
     */
    public static void av_class(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(av_class$LAYOUT, av_class$OFFSET, fieldValue);
    }

    private static final AddressLayout internal$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("internal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVHWDeviceInternal *internal
     * }
     */
    public static final AddressLayout internal$layout() {
        return internal$LAYOUT;
    }

    private static final long internal$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVHWDeviceInternal *internal
     * }
     */
    public static final long internal$offset() {
        return internal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVHWDeviceInternal *internal
     * }
     */
    public static MemorySegment internal(MemorySegment struct) {
        return struct.get(internal$LAYOUT, internal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVHWDeviceInternal *internal
     * }
     */
    public static void internal(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(internal$LAYOUT, internal$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout hwctx$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *hwctx
     * }
     */
    public static final AddressLayout hwctx$layout() {
        return hwctx$LAYOUT;
    }

    private static final long hwctx$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *hwctx
     * }
     */
    public static final long hwctx$offset() {
        return hwctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *hwctx
     * }
     */
    public static MemorySegment hwctx(MemorySegment struct) {
        return struct.get(hwctx$LAYOUT, hwctx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *hwctx
     * }
     */
    public static void hwctx(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwctx$LAYOUT, hwctx$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*free)(struct AVHWDeviceContext *)
     * }
     */
    public class free {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            FFmpeg.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = FFmpeg.upcallHandle(free.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(free.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout free$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*free)(struct AVHWDeviceContext *)
     * }
     */
    public static final AddressLayout free$layout() {
        return free$LAYOUT;
    }

    private static final long free$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*free)(struct AVHWDeviceContext *)
     * }
     */
    public static final long free$offset() {
        return free$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*free)(struct AVHWDeviceContext *)
     * }
     */
    public static MemorySegment free(MemorySegment struct) {
        return struct.get(free$LAYOUT, free$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*free)(struct AVHWDeviceContext *)
     * }
     */
    public static void free(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(free$LAYOUT, free$OFFSET, fieldValue);
    }

    private static final AddressLayout user_opaque$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("user_opaque"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *user_opaque
     * }
     */
    public static final AddressLayout user_opaque$layout() {
        return user_opaque$LAYOUT;
    }

    private static final long user_opaque$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *user_opaque
     * }
     */
    public static final long user_opaque$offset() {
        return user_opaque$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *user_opaque
     * }
     */
    public static MemorySegment user_opaque(MemorySegment struct) {
        return struct.get(user_opaque$LAYOUT, user_opaque$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *user_opaque
     * }
     */
    public static void user_opaque(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(user_opaque$LAYOUT, user_opaque$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}


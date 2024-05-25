// Generated by jextract

package io.github.chrisribble.ffmpeg7;

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
 * struct AVCodecHWConfig {
 *     enum AVPixelFormat pix_fmt;
 *     int methods;
 *     enum AVHWDeviceType device_type;
 * }
 * }
 */
public class AVCodecHWConfig {

    AVCodecHWConfig() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("pix_fmt"),
        FFmpeg.C_INT.withName("methods"),
        FFmpeg.C_INT.withName("device_type")
    ).withName("AVCodecHWConfig");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt pix_fmt$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pix_fmt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVPixelFormat pix_fmt
     * }
     */
    public static final OfInt pix_fmt$layout() {
        return pix_fmt$LAYOUT;
    }

    private static final long pix_fmt$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVPixelFormat pix_fmt
     * }
     */
    public static final long pix_fmt$offset() {
        return pix_fmt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVPixelFormat pix_fmt
     * }
     */
    public static int pix_fmt(MemorySegment struct) {
        return struct.get(pix_fmt$LAYOUT, pix_fmt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVPixelFormat pix_fmt
     * }
     */
    public static void pix_fmt(MemorySegment struct, int fieldValue) {
        struct.set(pix_fmt$LAYOUT, pix_fmt$OFFSET, fieldValue);
    }

    private static final OfInt methods$LAYOUT = (OfInt)$LAYOUT.select(groupElement("methods"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int methods
     * }
     */
    public static final OfInt methods$layout() {
        return methods$LAYOUT;
    }

    private static final long methods$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int methods
     * }
     */
    public static final long methods$offset() {
        return methods$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int methods
     * }
     */
    public static int methods(MemorySegment struct) {
        return struct.get(methods$LAYOUT, methods$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int methods
     * }
     */
    public static void methods(MemorySegment struct, int fieldValue) {
        struct.set(methods$LAYOUT, methods$OFFSET, fieldValue);
    }

    private static final OfInt device_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("device_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType device_type
     * }
     */
    public static final OfInt device_type$layout() {
        return device_type$LAYOUT;
    }

    private static final long device_type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType device_type
     * }
     */
    public static final long device_type$offset() {
        return device_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType device_type
     * }
     */
    public static int device_type(MemorySegment struct) {
        return struct.get(device_type$LAYOUT, device_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVHWDeviceType device_type
     * }
     */
    public static void device_type(MemorySegment struct, int fieldValue) {
        struct.set(device_type$LAYOUT, device_type$OFFSET, fieldValue);
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
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

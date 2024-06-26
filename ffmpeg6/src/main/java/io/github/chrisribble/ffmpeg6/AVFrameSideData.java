// Generated by jextract

package io.github.chrisribble.ffmpeg6;

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
 * struct AVFrameSideData {
 *     enum AVFrameSideDataType type;
 *     uint8_t *data;
 *     size_t size;
 *     AVDictionary *metadata;
 *     AVBufferRef *buf;
 * }
 * }
 */
public class AVFrameSideData {

    AVFrameSideData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("data"),
        FFmpeg.C_LONG.withName("size"),
        FFmpeg.C_POINTER.withName("metadata"),
        FFmpeg.C_POINTER.withName("buf")
    ).withName("AVFrameSideData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVFrameSideDataType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVFrameSideDataType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVFrameSideDataType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVFrameSideDataType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final AddressLayout metadata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("metadata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static final AddressLayout metadata$layout() {
        return metadata$LAYOUT;
    }

    private static final long metadata$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static final long metadata$offset() {
        return metadata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static MemorySegment metadata(MemorySegment struct) {
        return struct.get(metadata$LAYOUT, metadata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static void metadata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(metadata$LAYOUT, metadata$OFFSET, fieldValue);
    }

    private static final AddressLayout buf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVBufferRef *buf
     * }
     */
    public static final AddressLayout buf$layout() {
        return buf$LAYOUT;
    }

    private static final long buf$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVBufferRef *buf
     * }
     */
    public static final long buf$offset() {
        return buf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVBufferRef *buf
     * }
     */
    public static MemorySegment buf(MemorySegment struct) {
        return struct.get(buf$LAYOUT, buf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVBufferRef *buf
     * }
     */
    public static void buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buf$LAYOUT, buf$OFFSET, fieldValue);
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


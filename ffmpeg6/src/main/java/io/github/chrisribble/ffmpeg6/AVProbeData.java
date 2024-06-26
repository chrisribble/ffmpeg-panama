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
 * struct AVProbeData {
 *     const char *filename;
 *     unsigned char *buf;
 *     int buf_size;
 *     const char *mime_type;
 * }
 * }
 */
public class AVProbeData {

    AVProbeData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_POINTER.withName("filename"),
        FFmpeg.C_POINTER.withName("buf"),
        FFmpeg.C_INT.withName("buf_size"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("mime_type")
    ).withName("AVProbeData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout filename$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("filename"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *filename
     * }
     */
    public static final AddressLayout filename$layout() {
        return filename$LAYOUT;
    }

    private static final long filename$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *filename
     * }
     */
    public static final long filename$offset() {
        return filename$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *filename
     * }
     */
    public static MemorySegment filename(MemorySegment struct) {
        return struct.get(filename$LAYOUT, filename$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *filename
     * }
     */
    public static void filename(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(filename$LAYOUT, filename$OFFSET, fieldValue);
    }

    private static final AddressLayout buf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *buf
     * }
     */
    public static final AddressLayout buf$layout() {
        return buf$LAYOUT;
    }

    private static final long buf$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *buf
     * }
     */
    public static final long buf$offset() {
        return buf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *buf
     * }
     */
    public static MemorySegment buf(MemorySegment struct) {
        return struct.get(buf$LAYOUT, buf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *buf
     * }
     */
    public static void buf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buf$LAYOUT, buf$OFFSET, fieldValue);
    }

    private static final OfInt buf_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("buf_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int buf_size
     * }
     */
    public static final OfInt buf_size$layout() {
        return buf_size$LAYOUT;
    }

    private static final long buf_size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int buf_size
     * }
     */
    public static final long buf_size$offset() {
        return buf_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int buf_size
     * }
     */
    public static int buf_size(MemorySegment struct) {
        return struct.get(buf_size$LAYOUT, buf_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int buf_size
     * }
     */
    public static void buf_size(MemorySegment struct, int fieldValue) {
        struct.set(buf_size$LAYOUT, buf_size$OFFSET, fieldValue);
    }

    private static final AddressLayout mime_type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mime_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *mime_type
     * }
     */
    public static final AddressLayout mime_type$layout() {
        return mime_type$LAYOUT;
    }

    private static final long mime_type$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *mime_type
     * }
     */
    public static final long mime_type$offset() {
        return mime_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *mime_type
     * }
     */
    public static MemorySegment mime_type(MemorySegment struct) {
        return struct.get(mime_type$LAYOUT, mime_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *mime_type
     * }
     */
    public static void mime_type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mime_type$LAYOUT, mime_type$OFFSET, fieldValue);
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


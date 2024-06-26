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
 * struct AVSubtitle {
 *     uint16_t format;
 *     uint32_t start_display_time;
 *     uint32_t end_display_time;
 *     unsigned int num_rects;
 *     AVSubtitleRect **rects;
 *     int64_t pts;
 * }
 * }
 */
public class AVSubtitle {

    AVSubtitle() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_SHORT.withName("format"),
        MemoryLayout.paddingLayout(2),
        FFmpeg.C_INT.withName("start_display_time"),
        FFmpeg.C_INT.withName("end_display_time"),
        FFmpeg.C_INT.withName("num_rects"),
        FFmpeg.C_POINTER.withName("rects"),
        FFmpeg.C_LONG.withName("pts")
    ).withName("AVSubtitle");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort format$LAYOUT = (OfShort)$LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint16_t format
     * }
     */
    public static final OfShort format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint16_t format
     * }
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint16_t format
     * }
     */
    public static short format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint16_t format
     * }
     */
    public static void format(MemorySegment struct, short fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    private static final OfInt start_display_time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("start_display_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t start_display_time
     * }
     */
    public static final OfInt start_display_time$layout() {
        return start_display_time$LAYOUT;
    }

    private static final long start_display_time$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t start_display_time
     * }
     */
    public static final long start_display_time$offset() {
        return start_display_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t start_display_time
     * }
     */
    public static int start_display_time(MemorySegment struct) {
        return struct.get(start_display_time$LAYOUT, start_display_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t start_display_time
     * }
     */
    public static void start_display_time(MemorySegment struct, int fieldValue) {
        struct.set(start_display_time$LAYOUT, start_display_time$OFFSET, fieldValue);
    }

    private static final OfInt end_display_time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("end_display_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t end_display_time
     * }
     */
    public static final OfInt end_display_time$layout() {
        return end_display_time$LAYOUT;
    }

    private static final long end_display_time$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t end_display_time
     * }
     */
    public static final long end_display_time$offset() {
        return end_display_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t end_display_time
     * }
     */
    public static int end_display_time(MemorySegment struct) {
        return struct.get(end_display_time$LAYOUT, end_display_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t end_display_time
     * }
     */
    public static void end_display_time(MemorySegment struct, int fieldValue) {
        struct.set(end_display_time$LAYOUT, end_display_time$OFFSET, fieldValue);
    }

    private static final OfInt num_rects$LAYOUT = (OfInt)$LAYOUT.select(groupElement("num_rects"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int num_rects
     * }
     */
    public static final OfInt num_rects$layout() {
        return num_rects$LAYOUT;
    }

    private static final long num_rects$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int num_rects
     * }
     */
    public static final long num_rects$offset() {
        return num_rects$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int num_rects
     * }
     */
    public static int num_rects(MemorySegment struct) {
        return struct.get(num_rects$LAYOUT, num_rects$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int num_rects
     * }
     */
    public static void num_rects(MemorySegment struct, int fieldValue) {
        struct.set(num_rects$LAYOUT, num_rects$OFFSET, fieldValue);
    }

    private static final AddressLayout rects$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rects"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVSubtitleRect **rects
     * }
     */
    public static final AddressLayout rects$layout() {
        return rects$LAYOUT;
    }

    private static final long rects$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVSubtitleRect **rects
     * }
     */
    public static final long rects$offset() {
        return rects$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVSubtitleRect **rects
     * }
     */
    public static MemorySegment rects(MemorySegment struct) {
        return struct.get(rects$LAYOUT, rects$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVSubtitleRect **rects
     * }
     */
    public static void rects(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rects$LAYOUT, rects$OFFSET, fieldValue);
    }

    private static final OfLong pts$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t pts
     * }
     */
    public static final OfLong pts$layout() {
        return pts$LAYOUT;
    }

    private static final long pts$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t pts
     * }
     */
    public static final long pts$offset() {
        return pts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t pts
     * }
     */
    public static long pts(MemorySegment struct) {
        return struct.get(pts$LAYOUT, pts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t pts
     * }
     */
    public static void pts(MemorySegment struct, long fieldValue) {
        struct.set(pts$LAYOUT, pts$OFFSET, fieldValue);
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


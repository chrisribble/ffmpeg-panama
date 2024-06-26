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
 * struct AVProducerReferenceTime {
 *     int64_t wallclock;
 *     int flags;
 * }
 * }
 */
public class AVProducerReferenceTime {

    AVProducerReferenceTime() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_LONG.withName("wallclock"),
        FFmpeg.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVProducerReferenceTime");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong wallclock$LAYOUT = (OfLong)$LAYOUT.select(groupElement("wallclock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t wallclock
     * }
     */
    public static final OfLong wallclock$layout() {
        return wallclock$LAYOUT;
    }

    private static final long wallclock$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t wallclock
     * }
     */
    public static final long wallclock$offset() {
        return wallclock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t wallclock
     * }
     */
    public static long wallclock(MemorySegment struct) {
        return struct.get(wallclock$LAYOUT, wallclock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t wallclock
     * }
     */
    public static void wallclock(MemorySegment struct, long fieldValue) {
        struct.set(wallclock$LAYOUT, wallclock$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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


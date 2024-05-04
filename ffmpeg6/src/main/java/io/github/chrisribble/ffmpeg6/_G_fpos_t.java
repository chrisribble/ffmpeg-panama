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
 * struct _G_fpos_t {
 *     __off_t __pos;
 *     __mbstate_t __state;
 * }
 * }
 */
public class _G_fpos_t {

    _G_fpos_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_LONG.withName("__pos"),
        __mbstate_t.layout().withName("__state")
    ).withName("_G_fpos_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong __pos$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__pos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __off_t __pos
     * }
     */
    public static final OfLong __pos$layout() {
        return __pos$LAYOUT;
    }

    private static final long __pos$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __off_t __pos
     * }
     */
    public static final long __pos$offset() {
        return __pos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __off_t __pos
     * }
     */
    public static long __pos(MemorySegment struct) {
        return struct.get(__pos$LAYOUT, __pos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __off_t __pos
     * }
     */
    public static void __pos(MemorySegment struct, long fieldValue) {
        struct.set(__pos$LAYOUT, __pos$OFFSET, fieldValue);
    }

    private static final GroupLayout __state$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __mbstate_t __state
     * }
     */
    public static final GroupLayout __state$layout() {
        return __state$LAYOUT;
    }

    private static final long __state$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __mbstate_t __state
     * }
     */
    public static final long __state$offset() {
        return __state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __mbstate_t __state
     * }
     */
    public static MemorySegment __state(MemorySegment struct) {
        return struct.asSlice(__state$OFFSET, __state$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __mbstate_t __state
     * }
     */
    public static void __state(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __state$OFFSET, __state$LAYOUT.byteSize());
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


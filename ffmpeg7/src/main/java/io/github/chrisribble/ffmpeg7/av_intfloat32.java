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
 * union av_intfloat32 {
 *     uint32_t i;
 *     float f;
 * }
 * }
 */
public class av_intfloat32 {

    av_intfloat32() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        FFmpeg.C_INT.withName("i"),
        FFmpeg.C_FLOAT.withName("f")
    ).withName("av_intfloat32");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt i$LAYOUT = (OfInt)$LAYOUT.select(groupElement("i"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t i
     * }
     */
    public static final OfInt i$layout() {
        return i$LAYOUT;
    }

    private static final long i$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t i
     * }
     */
    public static final long i$offset() {
        return i$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t i
     * }
     */
    public static int i(MemorySegment union) {
        return union.get(i$LAYOUT, i$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t i
     * }
     */
    public static void i(MemorySegment union, int fieldValue) {
        union.set(i$LAYOUT, i$OFFSET, fieldValue);
    }

    private static final OfFloat f$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("f"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float f
     * }
     */
    public static final OfFloat f$layout() {
        return f$LAYOUT;
    }

    private static final long f$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float f
     * }
     */
    public static final long f$offset() {
        return f$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float f
     * }
     */
    public static float f(MemorySegment union) {
        return union.get(f$LAYOUT, f$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float f
     * }
     */
    public static void f(MemorySegment union, float fieldValue) {
        union.set(f$LAYOUT, f$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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


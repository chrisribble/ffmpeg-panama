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
 * struct {
 *     __fd_mask __fds_bits[16];
 * }
 * }
 */
public class fd_set {

    fd_set() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, FFmpeg.C_LONG).withName("__fds_bits")
    ).withName("$anon$59:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout __fds_bits$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__fds_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static final SequenceLayout __fds_bits$layout() {
        return __fds_bits$LAYOUT;
    }

    private static final long __fds_bits$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static final long __fds_bits$offset() {
        return __fds_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static MemorySegment __fds_bits(MemorySegment struct) {
        return struct.asSlice(__fds_bits$OFFSET, __fds_bits$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static void __fds_bits(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __fds_bits$OFFSET, __fds_bits$LAYOUT.byteSize());
    }

    private static long[] __fds_bits$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static long[] __fds_bits$dimensions() {
        return __fds_bits$DIMS;
    }
    private static final VarHandle __fds_bits$ELEM_HANDLE = __fds_bits$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static long __fds_bits(MemorySegment struct, long index0) {
        return (long)__fds_bits$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __fd_mask __fds_bits[16]
     * }
     */
    public static void __fds_bits(MemorySegment struct, long index0, long fieldValue) {
        __fds_bits$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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


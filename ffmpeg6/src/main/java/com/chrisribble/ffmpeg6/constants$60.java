// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$60 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$60() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__pos"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("__count"),
            MemoryLayout.unionLayout(
                JAVA_INT.withName("__wch"),
                MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
            ).withName("__value")
        ).withName("__state")
    ).withName("_G_fpos_t");
    static final VarHandle const$1 = constants$60.const$0.varHandle(MemoryLayout.PathElement.groupElement("__pos"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__pos"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("__count"),
            MemoryLayout.unionLayout(
                JAVA_INT.withName("__wch"),
                MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("__wchb")
            ).withName("__value")
        ).withName("__state")
    ).withName("_G_fpos64_t");
    static final VarHandle const$3 = constants$60.const$2.varHandle(MemoryLayout.PathElement.groupElement("__pos"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("_flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("_IO_read_ptr"),
        RuntimeHelper.POINTER.withName("_IO_read_end"),
        RuntimeHelper.POINTER.withName("_IO_read_base"),
        RuntimeHelper.POINTER.withName("_IO_write_base"),
        RuntimeHelper.POINTER.withName("_IO_write_ptr"),
        RuntimeHelper.POINTER.withName("_IO_write_end"),
        RuntimeHelper.POINTER.withName("_IO_buf_base"),
        RuntimeHelper.POINTER.withName("_IO_buf_end"),
        RuntimeHelper.POINTER.withName("_IO_save_base"),
        RuntimeHelper.POINTER.withName("_IO_backup_base"),
        RuntimeHelper.POINTER.withName("_IO_save_end"),
        RuntimeHelper.POINTER.withName("_markers"),
        RuntimeHelper.POINTER.withName("_chain"),
        JAVA_INT.withName("_fileno"),
        JAVA_INT.withName("_flags2"),
        JAVA_LONG.withName("_old_offset"),
        JAVA_SHORT.withName("_cur_column"),
        JAVA_BYTE.withName("_vtable_offset"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("_shortbuf"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("_lock"),
        JAVA_LONG.withName("_offset"),
        RuntimeHelper.POINTER.withName("_codecvt"),
        RuntimeHelper.POINTER.withName("_wide_data"),
        RuntimeHelper.POINTER.withName("_freeres_list"),
        RuntimeHelper.POINTER.withName("_freeres_buf"),
        JAVA_LONG.withName("__pad5"),
        JAVA_INT.withName("_mode"),
        MemoryLayout.sequenceLayout(20, JAVA_BYTE).withName("_unused2")
    ).withName("_IO_FILE");
    static final VarHandle const$5 = constants$60.const$4.varHandle(MemoryLayout.PathElement.groupElement("_flags"));
}



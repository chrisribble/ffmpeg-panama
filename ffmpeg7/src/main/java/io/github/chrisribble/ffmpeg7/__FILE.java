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
 * typedef struct _IO_FILE {
 *     int _flags;
 *     char *_IO_read_ptr;
 *     char *_IO_read_end;
 *     char *_IO_read_base;
 *     char *_IO_write_base;
 *     char *_IO_write_ptr;
 *     char *_IO_write_end;
 *     char *_IO_buf_base;
 *     char *_IO_buf_end;
 *     char *_IO_save_base;
 *     char *_IO_backup_base;
 *     char *_IO_save_end;
 *     struct _IO_marker *_markers;
 *     struct _IO_FILE *_chain;
 *     int _fileno;
 *     int _flags2;
 *     __off_t _old_offset;
 *     unsigned short _cur_column;
 *     signed char _vtable_offset;
 *     char _shortbuf[1];
 *     _IO_lock_t *_lock;
 *     __off64_t _offset;
 *     struct _IO_codecvt *_codecvt;
 *     struct _IO_wide_data *_wide_data;
 *     struct _IO_FILE *_freeres_list;
 *     void *_freeres_buf;
 *     struct _IO_FILE **_prevchain;
 *     int _mode;
 *     char _unused2[20];
 * } __FILE
 * }
 */
public class __FILE extends _IO_FILE {

    __FILE() {
        // Should not be called directly
    }
}


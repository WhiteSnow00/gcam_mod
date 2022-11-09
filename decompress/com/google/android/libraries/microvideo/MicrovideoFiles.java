// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.microvideo;

import java.util.Arrays;
import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import java.io.InputStream;
import com.google.common.io.ByteStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public final class MicrovideoFiles
{
    private static final byte[] MPEG4_FTYP_MARKER;
    private static final String TAG = "MicrovideoFiles";
    
    static {
        MPEG4_FTYP_MARKER = new byte[] { 102, 116, 121, 112 };
    }
    
    private MicrovideoFiles() {
    }
    
    public static void extractVideo(final File file, File file2) {
        final long videoOffset = getVideoOffset(file);
        file2 = (File)new FileOutputStream(file2);
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, videoOffset);
                ByteStreams.copy(fileInputStream, (OutputStream)file2);
                fileInputStream.close();
                ((OutputStream)file2).close();
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)file).addSuppressed(t);
                }
            }
        }
        finally {
            try {
                ((OutputStream)file2).close();
            }
            finally {
                final Throwable t2;
                ((Throwable)file).addSuppressed(t2);
            }
        }
    }
    
    public static apf extractXMPData(final File file) {
        return mrl.b(file.getPath());
    }
    
    public static long getVideoOffset(final File file) {
        final int d = lsp.d(extractXMPData(file));
        final long n = file.length() - d;
        if (n > 0L) {
            if (validateOffset(file, n)) {
                final FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.skip(-2L + n);
                    fileInputStream.close();
                    return n;
                }
                finally {
                    try {
                        fileInputStream.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)file).addSuppressed(t);
                    }
                }
            }
        }
        Log.w("MicrovideoFiles", String.format("MicroVideoOffset %d invalid. Attempting recovery", d));
        final long scanForMpeg4FtypAtom = scanForMpeg4FtypAtom(file);
        if (scanForMpeg4FtypAtom >= 0L) {
            return scanForMpeg4FtypAtom;
        }
        throw new IOException("Could not recover starting offset.");
    }
    
    public static boolean isMicrovideo(final InputStream inputStream) {
        final apf a = mrl.a(inputStream);
        if (a == null) {
            return false;
        }
        try {
            return lsp.d(a) > 0L;
        }
        catch (final ape ape) {
            return false;
        }
    }
    
    public static InputStream openVideoStream(final File file) {
        final long videoOffset = getVideoOffset(file);
        final FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(videoOffset);
        return fileInputStream;
    }
    
    private static long scanForMpeg4FtypAtom(File file) {
        file = (File)new FileInputStream(file);
        try {
            final byte[] array = new byte[4];
            ByteStreams.readFully((InputStream)file, array);
            long n = 4L;
            while (true) {
                final byte[] mpeg4_FTYP_MARKER = MicrovideoFiles.MPEG4_FTYP_MARKER;
                if (Arrays.equals(array, mpeg4_FTYP_MARKER)) {
                    final int length = mpeg4_FTYP_MARKER.length;
                    ((FileInputStream)file).close();
                    return n - length - 4L;
                }
                int n2;
                for (int i = 0; i < 3; i = n2) {
                    n2 = i + 1;
                    array[i] = array[n2];
                }
                final int read = ((FileInputStream)file).read();
                if (read < 0) {
                    ((FileInputStream)file).close();
                    return -1L;
                }
                array[3] = (byte)read;
                ++n;
            }
        }
        finally {
            Label_0133: {
                try {
                    ((FileInputStream)file).close();
                    break Label_0133;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
            while (true) {}
        }
    }
    
    private static boolean validateOffset(final File file, final long n) {
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, n + 4L);
                final byte[] array = new byte[4];
                ByteStreams.readFully(fileInputStream, array);
                final boolean equals = Arrays.equals(array, MicrovideoFiles.MPEG4_FTYP_MARKER);
                fileInputStream.close();
                return equals;
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)file).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            return false;
        }
    }
}

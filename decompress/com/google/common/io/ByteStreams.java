// 
// Decompiled by Procyon v0.6.0
// 

package com.google.common.io;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.io.EOFException;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.io.InputStream;
import java.util.Queue;
import java.io.OutputStream;

public final class ByteStreams
{
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;
    
    static {
        NULL_OUTPUT_STREAM = new nwt();
    }
    
    private ByteStreams() {
    }
    
    private static byte[] combineBuffers(final Queue queue, final int n) {
        final byte[] array = new byte[n];
        int min;
        for (int i = n; i > 0; i -= min) {
            final byte[] array2 = queue.remove();
            min = Math.min(i, array2.length);
            System.arraycopy(array2, 0, array, n - i, min);
        }
        return array;
    }
    
    public static long copy(final InputStream inputStream, final OutputStream outputStream) {
        inputStream.getClass();
        outputStream.getClass();
        final byte[] buffer = createBuffer();
        long n = 0L;
        while (true) {
            final int read = inputStream.read(buffer);
            if (read == -1) {
                break;
            }
            outputStream.write(buffer, 0, read);
            n += read;
        }
        return n;
    }
    
    public static long copy(final ReadableByteChannel readableByteChannel, final WritableByteChannel writableByteChannel) {
        readableByteChannel.getClass();
        writableByteChannel.getClass();
        final boolean b = readableByteChannel instanceof FileChannel;
        long n = 0L;
        if (b) {
            final FileChannel fileChannel = (FileChannel)readableByteChannel;
            long position;
            final long n2 = position = fileChannel.position();
            long transferTo;
            do {
                transferTo = fileChannel.transferTo(position, 524288L, writableByteChannel);
                position += transferTo;
                fileChannel.position(position);
            } while (transferTo > 0L || position < fileChannel.size());
            return position - n2;
        }
        final ByteBuffer wrap = ByteBuffer.wrap(createBuffer());
        while (readableByteChannel.read(wrap) != -1) {
            wrap.flip();
            while (wrap.hasRemaining()) {
                n += writableByteChannel.write(wrap);
            }
            wrap.clear();
        }
        return n;
    }
    
    static byte[] createBuffer() {
        return new byte[8192];
    }
    
    public static long exhaust(final InputStream inputStream) {
        final byte[] buffer = createBuffer();
        long n = 0L;
        while (true) {
            final long n2 = inputStream.read(buffer);
            if (n2 == -1L) {
                break;
            }
            n += n2;
        }
        return n;
    }
    
    public static InputStream limit(final InputStream inputStream, final long n) {
        return new nww(inputStream, n);
    }
    
    public static nwq newDataInput(final ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.getClass();
        return new nwu(byteArrayInputStream);
    }
    
    public static nwq newDataInput(final byte[] array) {
        return newDataInput(new ByteArrayInputStream(array));
    }
    
    public static nwq newDataInput(final byte[] array, final int n) {
        final int length = array.length;
        njo.w(n, length);
        return newDataInput(new ByteArrayInputStream(array, n, length - n));
    }
    
    public static nwr newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }
    
    public static nwr newDataOutput(final int n) {
        if (n >= 0) {
            return newDataOutput(new ByteArrayOutputStream(n));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", n));
    }
    
    public static nwr newDataOutput(final ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.getClass();
        return new nwv(byteArrayOutputStream);
    }
    
    public static OutputStream nullOutputStream() {
        return ByteStreams.NULL_OUTPUT_STREAM;
    }
    
    public static int read(final InputStream inputStream, final byte[] array, final int n, final int n2) {
        inputStream.getClass();
        array.getClass();
        int i = 0;
        if (n2 >= 0) {
            njo.n(n, n + n2, array.length);
            while (i < n2) {
                final int read = inputStream.read(array, n + i, n2 - i);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            return i;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", n2));
    }
    
    public static Object readBytes(final InputStream inputStream, final nws nws) {
        inputStream.getClass();
        nws.getClass();
        while (inputStream.read(createBuffer()) != -1 && nws.b()) {}
        return nws.a();
    }
    
    public static void readFully(final InputStream inputStream, final byte[] array) {
        readFully(inputStream, array, 0, array.length);
    }
    
    public static void readFully(final InputStream inputStream, final byte[] array, int read, final int n) {
        read = read(inputStream, array, read, n);
        if (read == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(read);
        sb.append(" bytes; ");
        sb.append(n);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }
    
    public static void skipFully(final InputStream inputStream, final long n) {
        final long skipUpTo = skipUpTo(inputStream, n);
        if (skipUpTo >= n) {
            return;
        }
        final StringBuilder sb = new StringBuilder(100);
        sb.append("reached end of stream after skipping ");
        sb.append(skipUpTo);
        sb.append(" bytes; ");
        sb.append(n);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }
    
    private static long skipSafely(final InputStream inputStream, final long n) {
        final int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, n));
    }
    
    static long skipUpTo(final InputStream inputStream, final long n) {
        byte[] array = null;
        long n2;
        byte[] array2;
        long n4;
        for (n2 = 0L; n2 < n; n2 += n4, array = array2) {
            final long n3 = n - n2;
            final long skipSafely = skipSafely(inputStream, n3);
            array2 = array;
            n4 = skipSafely;
            if (skipSafely == 0L) {
                final int n5 = (int)Math.min(n3, 8192L);
                if ((array2 = array) == null) {
                    array2 = new byte[n5];
                }
                n4 = inputStream.read(array2, 0, n5);
                if (n4 == -1L) {
                    break;
                }
            }
        }
        return n2;
    }
    
    public static byte[] toByteArray(final InputStream inputStream) {
        inputStream.getClass();
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }
    
    public static byte[] toByteArray(final InputStream inputStream, final long n) {
        njo.h(n >= 0L, "expectedSize (%s) must be non-negative", n);
        if (n > 2147483639L) {
            final StringBuilder sb = new StringBuilder(62);
            sb.append(n);
            sb.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(sb.toString());
        }
        final int n2 = (int)n;
        final byte[] array = new byte[n2];
        int read;
        for (int i = n2; i > 0; i -= read) {
            final int n3 = n2 - i;
            read = inputStream.read(array, n3, i);
            if (read == -1) {
                return Arrays.copyOf(array, n3);
            }
        }
        final int read2 = inputStream.read();
        if (read2 == -1) {
            return array;
        }
        final ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(array);
        arrayDeque.add(new byte[] { (byte)read2 });
        return toByteArrayInternal(inputStream, arrayDeque, n2 + 1);
    }
    
    private static byte[] toByteArrayInternal(final InputStream inputStream, final Queue queue, int c) {
        final int n = 8192;
        int i = c;
        c = n;
        while (i < 2147483639) {
            final int min = Math.min(c, 2147483639 - i);
            final byte[] array = new byte[min];
            queue.add(array);
            int read;
            for (int j = 0; j < min; j += read, i += read) {
                read = inputStream.read(array, j, min - j);
                if (read == -1) {
                    return combineBuffers(queue, i);
                }
            }
            final long n2 = c;
            c = ofi.C(n2 + n2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}

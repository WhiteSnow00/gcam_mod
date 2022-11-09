import java.io.IOException;
import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.ByteOrder;
import java.io.DataInput;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class acq extends InputStream implements DataInput
{
    private static final ByteOrder d;
    private static final ByteOrder e;
    final DataInputStream a;
    public ByteOrder b;
    int c;
    private byte[] f;
    
    static {
        d = ByteOrder.LITTLE_ENDIAN;
        e = ByteOrder.BIG_ENDIAN;
    }
    
    public acq(final InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }
    
    public acq(final InputStream inputStream, final ByteOrder b) {
        this.b = ByteOrder.BIG_ENDIAN;
        (this.a = new DataInputStream(inputStream)).mark(0);
        this.c = 0;
        this.b = b;
    }
    
    public acq(final InputStream inputStream, final byte[] array) {
        this(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
    
    public acq(final byte[] array) {
        this(new ByteArrayInputStream(array), ByteOrder.BIG_ENDIAN);
    }
    
    public acq(final byte[] array, final byte[] array2) {
        this(array);
        this.a.mark(Integer.MAX_VALUE);
    }
    
    public final long a() {
        return (long)this.readInt() & 0xFFFFFFFFL;
    }
    
    @Override
    public final int available() {
        return this.a.available();
    }
    
    public final void b(final int n) {
        int i;
        int read;
        for (i = 0; i < n; i += read) {
            final int n2 = n - i;
            if ((read = (int)this.a.skip(n2)) <= 0) {
                if (this.f == null) {
                    this.f = new byte[8192];
                }
                read = this.a.read(this.f, 0, Math.min(8192, n2));
                if (read == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Reached EOF while skipping ");
                    sb.append(n);
                    sb.append(" bytes.");
                    throw new EOFException(sb.toString());
                }
            }
        }
        this.c += i;
    }
    
    public final void c(long n) {
        final long n2 = this.c;
        if (n2 > n) {
            this.c = 0;
            this.a.reset();
        }
        else {
            n -= n2;
        }
        this.b((int)n);
    }
    
    @Override
    public final void mark(final int n) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }
    
    @Override
    public final int read() {
        ++this.c;
        return this.a.read();
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        read = this.a.read(array, read, n);
        this.c += read;
        return read;
    }
    
    @Override
    public final boolean readBoolean() {
        ++this.c;
        return this.a.readBoolean();
    }
    
    @Override
    public final byte readByte() {
        ++this.c;
        final int read = this.a.read();
        if (read >= 0) {
            return (byte)read;
        }
        throw new EOFException();
    }
    
    @Override
    public final char readChar() {
        this.c += 2;
        return this.a.readChar();
    }
    
    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public final void readFully(final byte[] array) {
        this.c += array.length;
        this.a.readFully(array);
    }
    
    @Override
    public final void readFully(final byte[] array, final int n, final int n2) {
        this.c += n2;
        this.a.readFully(array, n, n2);
    }
    
    @Override
    public final int readInt() {
        this.c += 4;
        final int read = this.a.read();
        final int read2 = this.a.read();
        final int read3 = this.a.read();
        final int read4 = this.a.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        final ByteOrder b = this.b;
        if (b == acq.d) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (b == acq.e) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(this.b);
        throw new IOException(sb.toString());
    }
    
    @Override
    public final String readLine() {
        return null;
    }
    
    @Override
    public final long readLong() {
        this.c += 8;
        final int read = this.a.read();
        final int read2 = this.a.read();
        final int read3 = this.a.read();
        final int read4 = this.a.read();
        final int read5 = this.a.read();
        final int read6 = this.a.read();
        final int read7 = this.a.read();
        final int read8 = this.a.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        final ByteOrder b = this.b;
        if (b == acq.d) {
            return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
        }
        if (b == acq.e) {
            return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(this.b);
        throw new IOException(sb.toString());
    }
    
    @Override
    public final short readShort() {
        this.c += 2;
        final int read = this.a.read();
        final int read2 = this.a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        final ByteOrder b = this.b;
        if (b == acq.d) {
            return (short)((read2 << 8) + read);
        }
        if (b == acq.e) {
            return (short)((read << 8) + read2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(this.b);
        throw new IOException(sb.toString());
    }
    
    @Override
    public final String readUTF() {
        this.c += 2;
        return this.a.readUTF();
    }
    
    @Override
    public final int readUnsignedByte() {
        ++this.c;
        return this.a.readUnsignedByte();
    }
    
    @Override
    public final int readUnsignedShort() {
        this.c += 2;
        final int read = this.a.read();
        final int read2 = this.a.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        final ByteOrder b = this.b;
        if (b == acq.d) {
            return (read2 << 8) + read;
        }
        if (b == acq.e) {
            return (read << 8) + read2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(this.b);
        throw new IOException(sb.toString());
    }
    
    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }
    
    @Override
    public final int skipBytes(final int n) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}

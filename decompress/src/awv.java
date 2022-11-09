import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awv extends FilterInputStream
{
    private static final byte[] a;
    private final byte b;
    private int c;
    
    static {
        a = new byte[] { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
    }
    
    public awv(final InputStream inputStream, final int n) {
        super(inputStream);
        if (n >= -1 && n <= 8) {
            this.b = (byte)n;
            return;
        }
        final StringBuilder sb = new StringBuilder(43);
        sb.append("Cannot add invalid orientation: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void mark(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() {
        final int c = this.c;
        int n;
        if (c >= 2 && c <= 31) {
            if (c == 31) {
                n = this.b;
            }
            else {
                n = (awv.a[c - 2] & 0xFF);
            }
        }
        else {
            n = super.read();
        }
        if (n != -1) {
            ++this.c;
        }
        return n;
    }
    
    @Override
    public final int read(final byte[] array, int n, int min) {
        final int c = this.c;
        if (c > 31) {
            n = super.read(array, n, min);
        }
        else if (c == 31) {
            array[n] = this.b;
            n = 1;
        }
        else if (c < 2) {
            n = super.read(array, n, 2 - c);
        }
        else {
            min = Math.min(31 - c, min);
            System.arraycopy(awv.a, this.c - 2, array, n, min);
            n = min;
        }
        if (n > 0) {
            this.c += n;
        }
        return n;
    }
    
    @Override
    public final void reset() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final long skip(long skip) {
        skip = super.skip(skip);
        if (skip > 0L) {
            this.c += (int)skip;
        }
        return skip;
    }
}

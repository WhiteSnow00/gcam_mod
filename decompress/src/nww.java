import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nww extends FilterInputStream
{
    private long a;
    private long b;
    
    public nww(final InputStream inputStream, final long a) {
        super(inputStream);
        this.b = -1L;
        inputStream.getClass();
        njo.e(a >= 0L, "limit must be non-negative");
        this.a = a;
    }
    
    @Override
    public final int available() {
        return (int)Math.min(this.in.available(), this.a);
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.in.mark(n);
            this.b = this.a;
        }
    }
    
    @Override
    public final int read() {
        if (this.a == 0L) {
            return -1;
        }
        final int read = this.in.read();
        if (read != -1) {
            --this.a;
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        final long a = this.a;
        if (a == 0L) {
            return -1;
        }
        read = this.in.read(array, read, (int)Math.min(n, a));
        if (read != -1) {
            this.a -= read;
        }
        return read;
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.b != -1L) {
                this.in.reset();
                this.a = this.b;
                return;
            }
            throw new IOException("Mark not set");
        }
    }
    
    @Override
    public final long skip(long n) {
        n = Math.min(n, this.a);
        n = this.in.skip(n);
        this.a -= n;
        return n;
    }
}

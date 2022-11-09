import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oje extends FilterInputStream
{
    private int a;
    
    public oje(final InputStream inputStream, final int a) {
        super(inputStream);
        this.a = a;
    }
    
    @Override
    public final int available() {
        return Math.min(super.available(), this.a);
    }
    
    @Override
    public final int read() {
        if (this.a <= 0) {
            return -1;
        }
        final int read = super.read();
        if (read >= 0) {
            --this.a;
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        final int a = this.a;
        if (a <= 0) {
            return -1;
        }
        read = super.read(array, read, Math.min(n, a));
        if (read >= 0) {
            this.a -= read;
        }
        return read;
    }
    
    @Override
    public final long skip(long skip) {
        skip = super.skip(Math.min(skip, this.a));
        if (skip >= 0L) {
            this.a -= (int)skip;
        }
        return skip;
    }
}

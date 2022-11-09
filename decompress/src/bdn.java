import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class bdn implements bdm
{
    private final InputStream a;
    
    public bdn(final InputStream a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.d() << 8 | this.d();
    }
    
    @Override
    public final int b(final byte[] array, final int n) {
        int i = 0;
        int read = 0;
        while (true) {
            while (i < n) {
                read = this.a.read(array, i, n - i);
                final int n2;
                if ((n2 = read) != -1) {
                    i += read;
                }
                else {
                    if (i == 0 && n2 == -1) {
                        throw new bdl();
                    }
                    return i;
                }
            }
            int n2 = read;
            continue;
        }
    }
    
    @Override
    public final long c(final long n) {
        if (n >= 0L) {
            long n2 = n;
            while (n2 > 0L) {
                final long skip = this.a.skip(n2);
                if (skip > 0L) {
                    n2 -= skip;
                }
                else {
                    if (this.a.read() == -1) {
                        break;
                    }
                    --n2;
                }
            }
            return n - n2;
        }
        return 0L;
    }
    
    @Override
    public final short d() {
        final int read = this.a.read();
        if (read != -1) {
            return (short)read;
        }
        throw new bdl();
    }
}

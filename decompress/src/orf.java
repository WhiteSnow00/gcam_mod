import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orf implements oqw
{
    private final byte[] a;
    private int b;
    private int c;
    
    public orf(final String s) {
        try {
            this.a = s.getBytes("UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public orf(final byte[] a) {
        this.a = a;
    }
    
    @Override
    public final int a(final byte[] array, final int n, int i) {
        monitorenter(this);
        final int n2 = 0;
        boolean b;
        if (65536 - n >= i) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            njo.e(b, "Buffer length too small.");
            if (i == 0) {
                monitorexit(this);
                return 0;
            }
            final int b2 = this.b;
            final int length = this.a.length;
            if (b2 == length) {
                monitorexit(this);
                return 0;
            }
            int min;
            byte[] a;
            int b3;
            for (min = Math.min(i, length - b2), i = n2; i < min; ++i) {
                a = this.a;
                b3 = this.b;
                array[n + i] = a[b3];
                this.b = b3 + 1;
            }
            monitorexit(this);
            return min;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final long b() {
        synchronized (this) {
            return this.c;
        }
    }
    
    @Override
    public final long c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final long d() {
        synchronized (this) {
            return this.a.length;
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.c = this.b;
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            this.b = this.c;
        }
    }
    
    @Override
    public final boolean g() {
        monitorenter(this);
        try {
            final boolean b = this.b < this.a.length;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void h(long min) {
        synchronized (this) {
            min = Math.min(min, this.a.length - this.b);
            this.b += (int)min;
        }
    }
}

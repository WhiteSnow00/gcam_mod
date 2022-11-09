import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hah implements hae
{
    public final dnp a;
    private final had[] b;
    private final Object c;
    
    public hah() {
        final int n = (int)(TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30L);
        this.c = new Object();
        this.a = new dnp(n);
        this.b = new had[n];
    }
    
    @Override
    public final int a() {
        return this.b.length;
    }
    
    @Override
    public final dli b() {
        return this.a;
    }
    
    @Override
    public final had c(final long n) {
        synchronized (this.c) {
            final int g = this.a.g(n);
            had had;
            if (g >= 0) {
                had = this.b[g];
            }
            else {
                had = null;
            }
            return had;
        }
    }
    
    @Override
    public final had d(final long n) {
        synchronized (this.c) {
            final int e = this.a.e();
            had had = null;
            if (e <= 0) {
                return null;
            }
            final dnp a = this.a;
            final int f = a.f(a.c(n));
            final dnp a2 = this.a;
            final int f2 = a2.f(a2.d(n));
            had had2;
            if (f >= 0) {
                had2 = this.b[f];
            }
            else {
                had2 = null;
            }
            if (f2 >= 0) {
                had = this.b[f2];
            }
            if (had2 == null) {
                return had;
            }
            if (had == null) {
                return had2;
            }
            if (n - had2.a >= had.a - n) {
                had2 = had;
            }
            return had2;
        }
    }
    
    @Override
    public final void e() {
    }
    
    public final void f(final had had) {
        try {
            synchronized (this.c) {
                this.b[this.a.b(had.a)] = had;
            }
        }
        catch (final IllegalArgumentException ex) {}
    }
}

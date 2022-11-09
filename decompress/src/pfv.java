import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfv extends oxi
{
    volatile boolean a;
    private final oyl b;
    private final oxo c;
    private final oyl d;
    private final pgk e;
    
    public pfv(final pgk e) {
        this.e = e;
        final oyl b = new oyl();
        this.b = b;
        final oxo c = new oxo();
        this.c = c;
        final oyl d = new oyl();
        (this.d = d).b(b);
        d.b(c);
    }
    
    @Override
    public final oxp b(final Runnable runnable) {
        if (this.a) {
            return oyk.a;
        }
        return this.e.f(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
    }
    
    @Override
    public final void bX() {
        if (!this.a) {
            this.a = true;
            this.d.bX();
        }
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.a) {
            return oyk.a;
        }
        return this.e.f(runnable, n, timeUnit, this.c);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}

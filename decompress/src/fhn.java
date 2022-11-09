import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhn implements krc
{
    public final fho a;
    
    private fhn(final fho a) {
        this.a = a;
    }
    
    public static fhn d(final kre kre, final long n, final int n2) {
        return new fhn(new fho(kre, n, n2));
    }
    
    public final long a() {
        return TimeUnit.MICROSECONDS.convert(this.a.b, TimeUnit.NANOSECONDS);
    }
    
    public final void b() {
        this.a.c.cancel(false);
        this.a.e.cancel(false);
        this.a.d.cancel(false);
    }
    
    public final boolean c() {
        return this.a.c.isDone() && this.a.d.isDone() && this.a.g;
    }
    
    @Override
    public final void close() {
    }
    
    public final boolean e(final fhn fhn) {
        return fhn.a() > TimeUnit.MICROSECONDS.convert(this.a.b, TimeUnit.NANOSECONDS) && ((fhn.a.c.isDone() && !this.a.c.isDone()) || this.a.e.isCancelled());
    }
}

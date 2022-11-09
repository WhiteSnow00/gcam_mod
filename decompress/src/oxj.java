import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oxj
{
    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L));
    }
    
    public abstract oxi a();
    
    public oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        final oxi a = this.a();
        pip.h(runnable);
        final oxh oxh = new oxh(runnable, a);
        a.c(oxh, n, timeUnit);
        return oxh;
    }
    
    public oxp d(final Runnable runnable) {
        return this.c(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}

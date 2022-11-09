import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgi extends oxj
{
    static final pgm a;
    static final pgm b;
    static final pgh c;
    static final pgf d;
    private static final long g;
    private static final TimeUnit h;
    final ThreadFactory e;
    final AtomicReference f;
    
    static {
        h = TimeUnit.SECONDS;
        g = Long.getLong("rx2.io-keep-alive-time", 60L);
        (c = new pgh(new pgm("RxCachedThreadSchedulerShutdown"))).bX();
        final int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5)));
        final pgm pgm = a = new pgm("RxCachedThreadScheduler", max);
        b = new pgm("RxCachedWorkerPoolEvictor", max);
        (d = new pgf(0L, null, pgm)).a();
    }
    
    public pgi() {
        final pgm a = pgi.a;
        this.e = a;
        final pgf d = pgi.d;
        final AtomicReference f = new AtomicReference(d);
        this.f = f;
        final pgf pgf = new pgf(pgi.g, pgi.h, a);
        if (!f.compareAndSet((Object)d, (Object)pgf)) {
            pgf.a();
        }
    }
    
    @Override
    public final oxi a() {
        return new pgg(this.f.get());
    }
}

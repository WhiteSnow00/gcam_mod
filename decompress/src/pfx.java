import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfx extends oxj implements pgp
{
    static final pfw a;
    static final pgm b;
    static final int c;
    static final pgk f;
    final ThreadFactory d;
    final AtomicReference e;
    
    static {
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final int intValue = Integer.getInteger("rx2.computation-threads", 0);
        int c2 = availableProcessors;
        if (intValue > 0 && intValue <= (c2 = availableProcessors)) {
            c2 = intValue;
        }
        c = c2;
        (f = new pgk(new pgm("RxComputationShutdown"))).bX();
        (a = new pfw(0, b = new pgm("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5))), true))).a();
    }
    
    public pfx() {
        final pgm b = pfx.b;
        this.d = b;
        final pfw a = pfx.a;
        final AtomicReference e = new AtomicReference(a);
        this.e = e;
        final pfw pfw = new pfw(pfx.c, b);
        if (!e.compareAndSet((Object)a, (Object)pfw)) {
            pfw.a();
        }
    }
    
    @Override
    public final oxi a() {
        return new pfv(this.e.get().c());
    }
    
    @Override
    public final void b(final int n, final peg peg) {
        phn.h(n, "number > 0 required");
        this.e.get().b(n, peg);
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        return this.e.get().c().e(runnable, n, timeUnit);
    }
}

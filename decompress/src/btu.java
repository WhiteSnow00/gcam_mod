import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btu implements krc
{
    public final ofn a;
    public final ofn b;
    public final oey c;
    public final oey d;
    
    public btu(final ScheduledExecutorService scheduledExecutorService, final ofn ofn, final bmz bmz) {
        final ofn f = ofn.f();
        this.a = f;
        final ofn f2 = ofn.f();
        this.b = f2;
        final oey h = odg.h(ofi.h(f2, f).a(mpx.b, odx.a), btt.a, odx.a);
        this.c = h;
        this.d = oco.h(ofi.t(h, 4000L, TimeUnit.MILLISECONDS, scheduledExecutorService), Throwable.class, btt.d, odx.a);
        if (!ofn.isDone()) {
            ofn.e(oco.h(odg.h(h, btt.c, odx.a), Throwable.class, btt.e, odx.a));
        }
        bmz.i().c(this);
    }
    
    @Override
    public final void close() {
        if (!this.c.isDone()) {
            this.c.cancel(true);
        }
    }
}

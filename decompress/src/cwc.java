import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cwc implements hpc, cvq
{
    public int a;
    public long b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private final AtomicBoolean e;
    private hpg f;
    private int g;
    private ScheduledFuture h;
    private hph i;
    private final AtomicBoolean j;
    
    public cwc() {
        this.j = new AtomicBoolean(false);
        this.c = mcn.l("CoachSDProcessor");
        this.e = new AtomicBoolean(false);
    }
    
    @Override
    public final void a() {
        final ScheduledFuture d = this.d;
        if (d != null) {
            d.cancel(true);
        }
        final ScheduledFuture h = this.h;
        if (h != null) {
            h.cancel(true);
        }
        this.c.shutdownNow();
    }
    
    @Override
    public final void aZ(final long n, final Map map) {
        if (this.j.get()) {
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        int min;
        if (this.e(map)) {
            min = Math.min(this.a + 1, this.g);
            this.a = min;
        }
        else {
            this.a = 0;
            min = 0;
        }
        if (min == this.g) {
            if (this.e.compareAndSet(false, true)) {
                final hph i = this.i;
                if (i != null) {
                    i.b(this.f);
                }
                this.h = this.c.scheduleAtFixedRate(new cvy(this), 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
            return;
        }
        this.d();
    }
    
    @Override
    public final void b(final hph i) {
        this.i = i;
        final cwb c = this.c();
        final hpg b = c.b;
        final Runnable h = b.h;
        if (h != null) {
            final hpf b2 = b.b();
            b2.g = new cvz(i, h);
            this.f = b2.a();
        }
        else {
            this.f = b;
        }
        this.g = c.a;
    }
    
    protected abstract cwb c();
    
    public final void d() {
        if (this.e.compareAndSet(true, false)) {
            final hph i = this.i;
            if (i != null) {
                if (this.f.a == 0L) {
                    this.d = this.c.schedule(new ezh(i, 1), 1000L, TimeUnit.MILLISECONDS);
                }
                else {
                    i.a();
                }
            }
            final ScheduledFuture h = this.h;
            h.getClass();
            h.cancel(false);
            this.h = null;
        }
    }
    
    protected abstract boolean e(final Map p0);
    
    @Override
    public final void t() {
        this.j.set(true);
        this.e.set(false);
    }
    
    @Override
    public final void u() {
        this.j.set(false);
    }
}

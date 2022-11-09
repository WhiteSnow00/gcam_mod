import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hoq implements hpc, bxv
{
    private final ScheduledExecutorService a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public hph d;
    private ScheduledFuture e;
    private hpg f;
    private int g;
    private int h;
    private int i;
    private int j;
    private jbm k;
    private float l;
    
    public hoq(final ScheduledExecutorService a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final void a() {
        final ScheduledFuture e = this.e;
        if (e != null) {
            e.cancel(true);
        }
    }
    
    @Override
    public final void b(final hph d) {
        this.d = d;
        final hop c = this.c();
        final hpf b = c.c.b();
        b.g = new hon(this);
        this.f = b.a();
        this.g = c.a;
        this.i = c.b;
        this.k = c.d;
        this.l = c.e;
    }
    
    @Override
    public final void bn(final jbm jbm, final float n) {
        final int h = this.h + 1;
        this.h = h;
        if (h < this.g) {
            return;
        }
        this.h = 0;
        if (!this.b.get()) {
            int min;
            if (jbm == this.k && n >= this.l) {
                min = Math.min(this.j + 1, this.i);
                this.j = min;
            }
            else {
                this.j = 0;
                min = 0;
            }
            if (min == this.i) {
                if (this.c.compareAndSet(false, true)) {
                    final hph d = this.d;
                    if (d != null) {
                        d.b(this.f);
                    }
                }
            }
            else if (this.c.compareAndSet(true, false)) {
                final hph d2 = this.d;
                if (d2 != null) {
                    if (this.f.a == 0L) {
                        this.e = this.a.schedule(new ezh(d2, 2), 1000L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    d2.a();
                }
            }
        }
    }
    
    protected abstract hop c();
    
    @Override
    public final void t() {
        this.c.set(false);
    }
    
    @Override
    public final void u() {
    }
}

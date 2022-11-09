import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class how implements hpb
{
    private ScheduledFuture a;
    private final AtomicBoolean b;
    private hpg c;
    private int d;
    private int e;
    private int f;
    private int g;
    private hph h;
    protected final ScheduledExecutorService i;
    
    public how(final ScheduledExecutorService i) {
        this.i = i;
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void a() {
        final ScheduledFuture a = this.a;
        if (a != null) {
            a.cancel(true);
        }
    }
    
    @Override
    public final void b(final hph h) {
        this.h = h;
        final hov d = this.d();
        hpg c = d.c;
        final Runnable h2 = c.h;
        if (h2 != null) {
            final hpf b = c.b();
            b.g = new hot(this, h2);
            c = b.a();
        }
        this.c = c;
        this.d = d.a;
        this.f = d.b;
    }
    
    @Override
    public void c(final lfg lfg) {
        this.g();
        this.g = 0;
    }
    
    protected abstract hov d();
    
    protected abstract boolean e(final ljm p0);
    
    protected boolean f(final ljm ljm) {
        return false;
    }
    
    public final void g() {
        if (this.b.compareAndSet(true, false)) {
            final hph h = this.h;
            if (h != null) {
                h.a();
            }
        }
    }
    
    @Override
    public final void h(final ljm ljm) {
        final int e = this.e + 1;
        this.e = e;
        if (e < this.d) {
            return;
        }
        this.e = 0;
        if (this.f(ljm)) {
            this.e = this.d;
            return;
        }
        int min;
        if (this.e(ljm)) {
            min = Math.min(this.g + 1, this.f);
            this.g = min;
        }
        else {
            this.g = 0;
            min = 0;
        }
        if (min == this.f) {
            if (this.b.compareAndSet(false, true)) {
                final hph h = this.h;
                if (h != null) {
                    h.b(this.c);
                }
            }
        }
        else if (this.b.compareAndSet(true, false)) {
            final hph h2 = this.h;
            if (h2 != null) {
                if (this.c.a == 0L) {
                    this.a = this.i.schedule(new ezh(h2, 3), 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
                h2.a();
            }
        }
    }
    
    @Override
    public void t() {
        this.b.set(false);
    }
    
    @Override
    public void u() {
    }
}

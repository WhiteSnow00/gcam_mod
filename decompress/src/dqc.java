import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqc implements krc
{
    private static final nsd a;
    private final max b;
    private final dpm c;
    private final ScheduledExecutorService d;
    private final long e;
    private final AtomicBoolean f;
    private ScheduledFuture g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/framestore/audio/AudioSamplerImpl");
    }
    
    public dqc(final max b, final dpm c, final long e, final ScheduledExecutorService d) {
        this.f = new AtomicBoolean(false);
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.g = null;
    }
    
    private final void c() {
        final ScheduledFuture g = this.g;
        if (g != null) {
            g.cancel(false);
            this.g = null;
            this.b.d();
        }
    }
    
    public final void a() {
        synchronized (this) {
            if (this.f.get()) {
                a.l(dqc.a.c(), "Attempted to start audio sampler after it has been closed.", '\u035e');
                return;
            }
            if (this.g != null) {
                a.l(dqc.a.c(), "Sampler already started.", '\u035d');
                return;
            }
            this.b.c();
            this.g = this.d.scheduleAtFixedRate(new dqb(this.c), 0L, this.e, TimeUnit.MICROSECONDS);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.c();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.c();
            final max b = this.b;
            lya.d();
            b.close();
            this.f.set(true);
        }
    }
}

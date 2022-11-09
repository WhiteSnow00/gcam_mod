import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkd implements Executor, krc
{
    private final ScheduledExecutorService a;
    private final long b;
    private final TimeUnit c;
    private final Object d;
    private ScheduledFuture e;
    private boolean f;
    
    public kkd(final ScheduledExecutorService a, final long b, final TimeUnit c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new Object();
        this.f = false;
    }
    
    public final void a(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.b();
            this.e = this.a.schedule(runnable, n, timeUnit);
        }
    }
    
    public final void b() {
        synchronized (this.d) {
            final ScheduledFuture e = this.e;
            if (e != null) {
                e.cancel(false);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.a.shutdownNow();
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a(runnable, this.b, this.c);
    }
}

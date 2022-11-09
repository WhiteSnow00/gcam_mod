import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyi
{
    public final ScheduledExecutorService a;
    public volatile hyj b;
    public final hyl c;
    private final Object d;
    private ScheduledFuture e;
    
    public hyi(final hyl c, final ScheduledExecutorService a) {
        this.b = hyj.a;
        this.c = c;
        this.a = a;
        this.d = new Object();
    }
    
    public final void a() {
        synchronized (this.d) {
            final ScheduledFuture e = this.e;
            if (e != null) {
                e.cancel(true);
                this.e = null;
            }
        }
    }
    
    public final void b(final hyh hyh) {
        synchronized (this.d) {
            final ScheduledFuture e = this.e;
            if (e != null) {
                e.cancel(true);
            }
            this.e = this.a.scheduleAtFixedRate(new hyg(this, hyh), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }
}

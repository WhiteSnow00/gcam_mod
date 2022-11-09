import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ine
{
    public final Object a;
    public Runnable b;
    public Runnable c;
    private final ScheduledExecutorService d;
    private volatile ScheduledFuture e;
    
    public ine(final ScheduledExecutorService d) {
        this.a = new Object();
        this.e = null;
        this.d = d;
    }
    
    public final void a() {
        synchronized (this.a) {
            final Runnable b = this.b;
            final Runnable c = this.c;
            final ScheduledFuture e = this.e;
            monitorexit(this.a);
            if (b != null && c != null) {
                if (e != null) {
                    e.cancel(true);
                }
                b.run();
                this.e = this.d.schedule(c, 1500L, TimeUnit.MILLISECONDS);
            }
        }
    }
}

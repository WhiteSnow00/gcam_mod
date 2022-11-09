import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class btx implements krc
{
    final /* synthetic */ bty a;
    private final AtomicBoolean b;
    private final ScheduledFuture c;
    
    public btx(final bty a) {
        this.a = a;
        this.b = new AtomicBoolean(true);
        this.c = a.a.schedule(new btw(this), 4000L, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public final void close() {
        if (!this.b.getAndSet(false)) {
            return;
        }
        this.c.cancel(true);
        this.a.c();
    }
}

import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gib implements gie
{
    final /* synthetic */ gid a;
    private final AtomicBoolean b;
    
    public gib(final gid a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (!this.b.getAndSet(true)) {
            final gid a = this.a;
            synchronized (a.b) {
                ++a.e;
                a.d.a = a.a();
                monitorexit(a.b);
                a.d.c();
                final Object b = a.b;
                synchronized (a.b) {
                    final gic gic = a.c.peekFirst();
                    if (gic == null) {
                        return;
                    }
                    if (a.f) {
                        gic.a = new gih("FiniteTicketPool is closed.");
                        a.c.removeFirst();
                        a.d.a = a.a();
                        monitorexit(a.b);
                        a.d.c();
                        throw null;
                    }
                    throw null;
                }
            }
        }
    }
}

import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gif implements gie
{
    final /* synthetic */ gig a;
    private final AtomicBoolean b;
    
    public gif(final gig a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (!this.b.getAndSet(true)) {
            final gig a = this.a;
            synchronized (a.a) {
                a.aR((int)a.d - 1);
            }
        }
    }
}

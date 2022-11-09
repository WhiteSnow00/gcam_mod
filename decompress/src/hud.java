import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class hud implements hub
{
    private final Runnable a;
    private final AtomicBoolean b;
    
    public hud(final Runnable a) {
        this.b = new AtomicBoolean(false);
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (!this.b.getAndSet(true)) {
            this.a.run();
        }
    }
}

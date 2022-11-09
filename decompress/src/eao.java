import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class eao implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ AtomicBoolean b;
    
    public eao(final Runnable a, final AtomicBoolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.run();
        synchronized (this.b) {
            this.b.set(true);
            this.b.notify();
        }
    }
}

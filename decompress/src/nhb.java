import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class nhb implements Runnable
{
    public odo a;
    public Executor b;
    
    public nhb(final odo a, final Executor b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a = null;
        this.b = null;
    }
}

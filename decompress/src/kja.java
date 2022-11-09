import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kja implements Runnable
{
    private final Runnable a;
    private final Executor b;
    
    public kja(final Runnable a, final Executor b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.execute(this.a);
    }
}

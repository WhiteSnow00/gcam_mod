import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bua implements Executor, kjn
{
    public final Executor a;
    private final oey b;
    
    public bua(final Executor a, final oey b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.b.isDone()) {
            this.a.execute(runnable);
            return;
        }
        knf.f(this.b, new btz(this, runnable), odx.a);
    }
}

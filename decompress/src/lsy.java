import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lsy implements Executor
{
    final /* synthetic */ lsz a;
    private final Executor b;
    
    public lsy(final lsz a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.b.execute(new lsx(this, runnable));
    }
}

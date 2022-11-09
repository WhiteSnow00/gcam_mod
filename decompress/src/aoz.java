import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class aoz implements Executor
{
    final /* synthetic */ apa a;
    
    public aoz(final apa a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.b.post(runnable);
    }
}

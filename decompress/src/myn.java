import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class myn implements Executor
{
    final /* synthetic */ myo a;
    
    public myn(final myo a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.a.d(runnable);
    }
}

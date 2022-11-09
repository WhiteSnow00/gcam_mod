import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofc implements Executor
{
    final /* synthetic */ Executor a;
    final /* synthetic */ odc b;
    
    public ofc(final Executor a, final odc b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        try {
            this.a.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            this.b.a(ex);
        }
    }
}

import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lpn implements Executor
{
    private final Handler a;
    
    public lpn(final Handler a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.post(runnable);
    }
}

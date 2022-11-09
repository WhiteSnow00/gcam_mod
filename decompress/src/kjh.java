import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjh implements Executor, kjn
{
    private final Handler a;
    
    public kjh(final Handler a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.post(runnable);
    }
}

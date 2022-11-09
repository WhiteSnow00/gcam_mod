import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kek implements Executor
{
    private final Handler a;
    private final /* synthetic */ int b;
    
    public kek() {
        this.a = new kax(Looper.getMainLooper());
    }
    
    public kek(final Looper looper, final int b) {
        this.b = b;
        this.a = new kax(looper);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        switch (this.b) {
            default: {
                this.a.post(runnable);
                return;
            }
            case 0: {
                this.a.post(runnable);
            }
        }
    }
}

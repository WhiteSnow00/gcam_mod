import android.os.Looper;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apa
{
    public final anz a;
    public final Handler b;
    public final Executor c;
    
    public apa(final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new aoz(this);
        this.a = new anz(executor);
    }
    
    public final void a(final Runnable runnable) {
        this.a.execute(runnable);
    }
}

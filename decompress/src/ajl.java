import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajl
{
    public final Handler a;
    
    public ajl() {
        this.a = Handler.createAsync(Looper.getMainLooper());
    }
    
    public final void a(final Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}

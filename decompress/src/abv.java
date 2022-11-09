import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class abv
{
    public final Looper a;
    private final Choreographer b;
    
    public abv() {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }
    
    public final void a(final Runnable runnable) {
        this.b.postFrameCallback((Choreographer$FrameCallback)new abu(runnable));
    }
}

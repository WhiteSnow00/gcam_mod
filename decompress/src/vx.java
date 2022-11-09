import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class vx implements Drawable$Callback
{
    final /* synthetic */ vy a;
    
    public vx(final vy a) {
        this.a = a;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.a.invalidateSelf();
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
    }
}

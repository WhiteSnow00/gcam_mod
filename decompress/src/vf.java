import android.graphics.drawable.Drawable;
import android.support.wearable.view.CircledImageView;
import android.graphics.drawable.Drawable$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vf implements Drawable$Callback
{
    final /* synthetic */ CircledImageView a;
    
    public vf(final CircledImageView a) {
        this.a = a;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.a.invalidate();
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
    }
}

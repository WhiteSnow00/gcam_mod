import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class gze extends Animatable2$AnimationCallback
{
    final /* synthetic */ gzh a;
    
    public gze(final gzh a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Drawable drawable) {
        super.onAnimationEnd(drawable);
        final gzh a = this.a;
        if (a.b) {
            a.c.start();
        }
    }
}

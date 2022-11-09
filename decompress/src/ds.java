import android.view.animation.Animation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ds implements Animation$AnimationListener
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ du c;
    
    public ds(final ViewGroup a, final View b, final du c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        this.a.post((Runnable)new dr(this));
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}

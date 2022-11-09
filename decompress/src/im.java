import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class im implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ ll a;
    
    public im(final ll a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        ((View)this.a.a.c.getParent()).invalidate();
    }
}

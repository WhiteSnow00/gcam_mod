import android.animation.ValueAnimator;
import android.support.wearable.view.CircledImageView;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vg implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ CircledImageView a;
    
    public vg(final CircledImageView a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int intValue = (int)valueAnimator.getAnimatedValue();
        final CircledImageView a = this.a;
        if (intValue != a.b) {
            a.b = intValue;
            a.invalidate();
        }
    }
}

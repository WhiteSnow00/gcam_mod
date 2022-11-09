import android.animation.ValueAnimator;
import androidx.wear.widget.CircledImageView;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahg implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ CircledImageView a;
    
    public ahg(final CircledImageView a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int intValue = (int)valueAnimator.getAnimatedValue();
        final CircledImageView a = this.a;
        if (intValue != a.a) {
            a.a = intValue;
            a.invalidate();
        }
    }
}

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncz implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ BottomSheetBehavior a;
    
    public ncz(final BottomSheetBehavior a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final nfd c = this.a.c;
        if (c != null) {
            c.h(floatValue);
        }
    }
}

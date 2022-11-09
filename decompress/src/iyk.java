import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyk implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ CaptureAnimationOverlay a;
    
    public iyk(final CaptureAnimationOverlay a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.a.setAlpha((int)((float)valueAnimator.getAnimatedValue() * 255.0f));
        this.a.invalidate();
    }
}

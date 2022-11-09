import android.graphics.drawable.GradientDrawable;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbd implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ ZoomLockView a;
    
    public jbd(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        ((GradientDrawable)this.a.b.getBackground()).setColor((int)valueAnimator.getAnimatedValue());
    }
}

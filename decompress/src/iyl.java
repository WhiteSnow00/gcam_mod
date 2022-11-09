import android.animation.Animator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.animation.ValueAnimator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyl extends AnimatorListenerAdapter
{
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ CaptureAnimationOverlay b;
    
    public iyl(final CaptureAnimationOverlay b, final ValueAnimator a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.start();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final CaptureAnimationOverlay b = this.b;
        b.c = 2;
        b.setVisibility(0);
    }
}

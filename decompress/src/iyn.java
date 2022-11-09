import android.animation.Animator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyn extends AnimatorListenerAdapter
{
    final /* synthetic */ boolean a;
    final /* synthetic */ CaptureAnimationOverlay b;
    
    public iyn(final CaptureAnimationOverlay b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (!this.a) {
            final CaptureAnimationOverlay b = this.b;
            b.c = 1;
            b.setVisibility(4);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (!this.a) {
            final CaptureAnimationOverlay b = this.b;
            b.c = 1;
            b.setVisibility(4);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        if (this.a) {
            final CaptureAnimationOverlay b = this.b;
            b.c = 3;
            b.setVisibility(0);
        }
    }
}

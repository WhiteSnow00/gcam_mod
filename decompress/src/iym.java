import android.animation.Animator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iym extends AnimatorListenerAdapter
{
    final /* synthetic */ CaptureAnimationOverlay a;
    
    public iym(final CaptureAnimationOverlay a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final CaptureAnimationOverlay a = this.a;
        a.c = 1;
        a.setVisibility(4);
    }
}

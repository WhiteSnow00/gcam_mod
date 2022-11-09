import android.animation.Animator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbf extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomLockView a;
    
    public jbf(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.a.bringToFront();
        super.onAnimationEnd(animator);
        final jbi h = this.a.h;
        if (h != null) {
            h.a.b(true);
        }
    }
}

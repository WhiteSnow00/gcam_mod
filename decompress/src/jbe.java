import android.animation.Animator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbe extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomLockView a;
    
    public jbe(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.e.setVisibility(0);
        this.a.a.setVisibility(0);
        super.onAnimationEnd(animator);
    }
}

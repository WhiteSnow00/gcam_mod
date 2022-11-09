import android.animation.Animator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbc extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomLockView a;
    
    public jbc(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setVisibility(0);
        super.onAnimationStart(animator);
    }
}

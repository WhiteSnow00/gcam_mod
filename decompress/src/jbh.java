import android.animation.Animator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbh extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomLockView a;
    
    public jbh(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator, final boolean b) {
        this.a.f = true;
    }
}

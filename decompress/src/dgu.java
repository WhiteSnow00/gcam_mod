import android.animation.Animator;
import com.google.android.apps.camera.evcomp.EvCompView;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgu implements Animator$AnimatorListener
{
    final /* synthetic */ EvCompView a;
    
    public dgu(final EvCompView a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            this.a.setVisibility(8);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            this.a.setVisibility(8);
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}

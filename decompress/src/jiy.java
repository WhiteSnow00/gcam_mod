import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jiy extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jiy(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        super.onAnimationCancel(animator);
        this.a.n().setAlpha(1.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        if (this.a.n().a.get()) {
            this.a.n().b(true);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        this.a.n().b(false);
        this.a.n().setAlpha(0.0f);
        this.a.n().setVisibility(0);
    }
}

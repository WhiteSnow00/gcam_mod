import android.content.res.Resources$Theme;
import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jiw extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jiw(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.e().setVisibility(0);
        this.a.e().setBackground(this.a.getResources().getDrawable(2131231088, (Resources$Theme)null));
        animator.removeAllListeners();
    }
}

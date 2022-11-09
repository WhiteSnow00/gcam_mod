import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jiu extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jiu(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        super.onAnimationCancel(animator);
        this.a.n().b(false);
        this.a.n().setVisibility(0);
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        this.a.n().b(false);
        this.a.n().setVisibility(4);
    }
}

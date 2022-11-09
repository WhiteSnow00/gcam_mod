import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jit extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jit(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        super.onAnimationCancel(animator);
        this.a.b().setAlpha(1.0f);
        this.a.f().setAlpha(1.0f);
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        this.a.b().setAlpha(0.0f);
        this.a.f().setAlpha(0.0f);
        if (this.a.e().getVisibility() != 8) {
            this.a.b().setVisibility(0);
            this.a.f().setVisibility(0);
        }
    }
}

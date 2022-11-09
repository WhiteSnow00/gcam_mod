import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jix extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jix(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.b().setVisibility(4);
        this.a.f().setVisibility(4);
        this.a.b().setAlpha(1.0f);
        this.a.f().setAlpha(1.0f);
    }
}

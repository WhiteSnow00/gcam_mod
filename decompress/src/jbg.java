import android.animation.Animator;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbg extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomLockView a;
    
    public jbg(final ZoomLockView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
        this.a.e.setTranslationX(0.0f);
        this.a.e.setTranslationY(0.0f);
        this.a.a.setTranslationY(0.0f);
        this.a.a.setTranslationX(0.0f);
        this.a.b.setScaleX(0.0f);
        this.a.b.setScaleY(0.0f);
        this.a.b.setTranslationX(0.0f);
        this.a.b.setTranslationY(0.0f);
        final ZoomLockView a = this.a;
        a.f = false;
        a.setAlpha(1.0f);
        super.onAnimationEnd(animator);
    }
}

import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jiv extends AnimatorListenerAdapter
{
    final /* synthetic */ ZoomUi a;
    
    public jiv(final ZoomUi a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a.e().getVisibility() == 8) {
            this.a.e().setVisibility(0);
            this.a.b().setVisibility(0);
            this.a.f().setVisibility(0);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        final ViewGroup b = this.a.b();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)b, ZoomUi.ALPHA, new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat.addListener((Animator$AnimatorListener)new jis((View)b));
        ofFloat.start();
    }
}

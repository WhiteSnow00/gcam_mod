import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gke extends AnimatorListenerAdapter
{
    final /* synthetic */ ofn a;
    final /* synthetic */ OptionsMenuContainer b;
    
    public gke(final OptionsMenuContainer b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b.n.removeListener((Animator$AnimatorListener)this);
        this.b.e().setVisibility(8);
        super.onAnimationEnd(animator);
        this.a.o(true);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.n.removeListener((Animator$AnimatorListener)this);
        this.b.e().setVisibility(8);
        super.onAnimationEnd(animator);
        this.a.o(true);
    }
}

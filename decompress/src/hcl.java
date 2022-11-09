import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class hcl extends AnimatorListenerAdapter
{
    final /* synthetic */ hcp a;
    
    public hcl(final hcp a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.h.setVisibility(8);
        this.a.h.removeAllViews();
        this.a.i.setVisibility(8);
        this.a.i.removeAllViews();
        final ViewPropertyAnimator alpha = this.a.l.e.animate().alpha(1.0f);
        final ViewfinderCover e = this.a.l.e;
        e.getClass();
        alpha.withStartAction((Runnable)new hcx(e, 1)).start();
    }
    
    public final void onAnimationStart(final Animator animator) {
        super.onAnimationStart(animator);
        this.a.l.e.k();
    }
}

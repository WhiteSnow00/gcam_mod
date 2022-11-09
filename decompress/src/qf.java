import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class qf extends AnimatorListenerAdapter
{
    final /* synthetic */ qg a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ sa d;
    
    public qf(final sa d, final qg a, final ViewPropertyAnimator b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.b.setListener((Animator$AnimatorListener)null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.a(this.a.b);
        this.d.l.remove(this.a.b);
        this.d.g();
    }
    
    public final void onAnimationStart(final Animator animator) {
        final st b = this.a.b;
    }
}

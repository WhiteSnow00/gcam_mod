import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class qd extends AnimatorListenerAdapter
{
    final /* synthetic */ st a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ sa f;
    
    public qd(final sa f, final st a, final int b, final View c, final int d, final ViewPropertyAnimator e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.e.setListener((Animator$AnimatorListener)null);
        this.f.a(this.a);
        this.f.j.remove(this.a);
        this.f.g();
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}

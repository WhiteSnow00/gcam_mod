import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class qc extends AnimatorListenerAdapter
{
    final /* synthetic */ st a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ sa d;
    
    public qc(final sa d, final st a, final View b, final ViewPropertyAnimator c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b.setAlpha(1.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.c.setListener((Animator$AnimatorListener)null);
        this.d.a(this.a);
        this.d.i.remove(this.a);
        this.d.g();
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class qo extends AnimatorListenerAdapter
{
    final /* synthetic */ qq a;
    private boolean b;
    
    public qo(final qq a) {
        this.a = a;
        this.b = false;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.b = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if ((float)this.a.p.getAnimatedValue() == 0.0f) {
            final qq a = this.a;
            a.b(a.q = 0);
            return;
        }
        final qq a2 = this.a;
        a2.q = 2;
        a2.a();
    }
}

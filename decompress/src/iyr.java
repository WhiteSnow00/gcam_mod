import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class iyr extends AnimatorListenerAdapter
{
    final /* synthetic */ iys a;
    
    public iyr(final iys a) {
        this.a = a;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        final iys a = this.a;
        a.n = 1;
        a.setVisibility(4);
        iys.c(this.a);
        iys.d(this.a);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final iys a = this.a;
        a.n = 1;
        a.setVisibility(4);
        iys.c(this.a);
        iys.d(this.a);
    }
    
    public final void onAnimationStart(final Animator animator) {
        final iys a = this.a;
        a.d = a.f;
        a.n = 3;
    }
}

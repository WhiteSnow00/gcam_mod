import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ipm extends AnimatorListenerAdapter
{
    final /* synthetic */ ipn a;
    
    public ipm(final ipn a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final ipn a = this.a;
        a.h.n(a.g, true);
        final ipo l = a.l;
        if (l != null) {
            l.a();
        }
        a.f = false;
        this.a.h(true);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.h(false);
    }
}

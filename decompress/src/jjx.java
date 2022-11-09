import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjx extends AnimatorListenerAdapter
{
    final /* synthetic */ jkf a;
    
    public jjx(final jkf a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final float floatValue = (float)this.a.h.aQ();
        final jkf a = this.a;
        final float t = a.t;
        if (floatValue < t) {
            a.h.aR(t);
        }
        if (this.a.p.r()) {
            this.a.t();
            return;
        }
        this.a.i();
    }
}

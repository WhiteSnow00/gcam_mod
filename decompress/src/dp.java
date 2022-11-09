import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class dp extends AnimatorListenerAdapter
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ge d;
    final /* synthetic */ du e;
    
    public dp(final ViewGroup a, final View b, final boolean c, final ge d, final du e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            a.i(this.d.e, this.b);
        }
        this.e.b();
    }
}

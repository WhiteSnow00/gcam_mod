import android.view.View;
import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.animation.LayoutTransition$TransitionListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cox implements LayoutTransition$TransitionListener
{
    final /* synthetic */ coy a;
    
    public cox(final coy a) {
        this.a = a;
    }
    
    public final void endTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, final int n) {
        final coh p4 = this.a.b.f.p;
        if (p4 != null) {
            p4.a.g(jbm.c);
        }
        layoutTransition.removeTransitionListener((LayoutTransition$TransitionListener)this);
    }
    
    public final void startTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, final int n) {
        final coh p4 = this.a.b.f.p;
        if (p4 != null) {
            p4.a.j(jbm.c);
        }
    }
}

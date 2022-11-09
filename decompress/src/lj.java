import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class lj extends ip
{
    final /* synthetic */ ln a;
    
    public lj(final ln a) {
        this.a = a;
    }
    
    @Override
    public final void b() {
        final ln a = this.a;
        if (a.k) {
            final View f = a.f;
            if (f != null) {
                f.setTranslationY(0.0f);
                this.a.c.setTranslationY(0.0f);
            }
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        final ln a2 = this.a;
        a2.m = null;
        final lt i = a2.i;
        if (i != null) {
            i.a(a2.h);
            a2.h = null;
            a2.i = null;
        }
        final ActionBarOverlayLayout b = this.a.b;
        if (b != null) {
            ik.D((View)b);
        }
    }
}

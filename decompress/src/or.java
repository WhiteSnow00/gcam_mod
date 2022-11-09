import android.graphics.PorterDuff$Mode;
import android.content.res.Resources$NotFoundException;
import android.view.View;
import android.util.AttributeSet;
import android.widget.CompoundButton;

// 
// Decompiled by Procyon v0.6.0
// 

final class or
{
    private final CompoundButton a;
    private boolean b;
    
    public or(final CompoundButton a) {
        this.a = a;
    }
    
    final void a(final AttributeSet set, int n) {
        final to q = to.q(this.a.getContext(), set, lo.l, n);
        final CompoundButton a = this.a;
        ik.E((View)a, a.getContext(), lo.l, set, q.b, n, 0);
        try {
            Label_0118: {
                if (q.p(1)) {
                    n = q.f(1, 0);
                    if (n != 0) {
                        try {
                            final CompoundButton a2 = this.a;
                            a2.setButtonDrawable(lp.b(a2.getContext(), n));
                            break Label_0118;
                        }
                        catch (final Resources$NotFoundException ex) {}
                    }
                }
                if (q.p(0)) {
                    n = q.f(0, 0);
                    if (n != 0) {
                        final CompoundButton a3 = this.a;
                        a3.setButtonDrawable(lp.b(a3.getContext(), n));
                    }
                }
            }
            if (q.p(2)) {
                this.a.setButtonTintList(q.g(2));
            }
            if (q.p(3)) {
                this.a.setButtonTintMode(qi.a(q.c(3, -1), null));
            }
        }
        finally {
            q.n();
        }
    }
    
    final void b() {
        if (this.b) {
            this.b = false;
            return;
        }
        this.b = true;
        this.a.getButtonDrawable();
    }
}

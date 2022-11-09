import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oo
{
    private final View a;
    private final ot b;
    private int c;
    private tm d;
    private tm e;
    private tm f;
    
    public oo(final View a) {
        this.c = -1;
        this.a = a;
        this.b = ot.d();
    }
    
    public final ColorStateList a() {
        final tm e = this.e;
        if (e != null) {
            return e.a;
        }
        return null;
    }
    
    public final PorterDuff$Mode b() {
        final tm e = this.e;
        if (e != null) {
            return e.b;
        }
        return null;
    }
    
    public final void c() {
        final Drawable background = this.a.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new tm();
                }
                final tm f = this.f;
                f.a = null;
                f.d = false;
                f.b = null;
                f.c = false;
                final ColorStateList l = ik.l(this.a);
                if (l != null) {
                    f.d = true;
                    f.a = l;
                }
                final PorterDuff$Mode m = ik.m(this.a);
                if (m != null) {
                    f.c = true;
                    f.b = m;
                }
                if (f.d || f.c) {
                    sx.h(background, f, this.a.getDrawableState());
                    return;
                }
            }
            final tm e = this.e;
            if (e != null) {
                sx.h(background, e, this.a.getDrawableState());
                return;
            }
            final tm d = this.d;
            if (d != null) {
                sx.h(background, d, this.a.getDrawableState());
            }
        }
    }
    
    public final void d(final AttributeSet set, final int n) {
        final to q = to.q(this.a.getContext(), set, lo.y, n);
        final View a = this.a;
        ik.E(a, a.getContext(), lo.y, set, q.b, n, 0);
        try {
            if (q.p(0)) {
                this.c = q.f(0, -1);
                final ColorStateList a2 = this.b.a(this.a.getContext(), this.c);
                if (a2 != null) {
                    this.f(a2);
                }
            }
            if (q.p(1)) {
                ik.H(this.a, q.g(1));
            }
            if (q.p(2)) {
                ik.I(this.a, qi.a(q.c(2, -1), null));
            }
        }
        finally {
            q.n();
        }
    }
    
    public final void e(final int c) {
        this.c = c;
        final ot b = this.b;
        ColorStateList a;
        if (b != null) {
            a = b.a(this.a.getContext(), c);
        }
        else {
            a = null;
        }
        this.f(a);
        this.c();
    }
    
    final void f(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new tm();
            }
            final tm d = this.d;
            d.a = a;
            d.d = true;
        }
        else {
            this.d = null;
        }
        this.c();
    }
    
    public final void g(final ColorStateList a) {
        if (this.e == null) {
            this.e = new tm();
        }
        final tm e = this.e;
        e.a = a;
        e.d = true;
        this.c();
    }
    
    public final void h(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new tm();
        }
        final tm e = this.e;
        e.b = b;
        e.c = true;
        this.c();
    }
    
    public final void i() {
        this.c = -1;
        this.f(null);
        this.c();
    }
}

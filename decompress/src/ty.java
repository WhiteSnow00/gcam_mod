import android.view.Menu;
import android.support.v7.widget.ActionMenuView;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window$Callback;
import android.support.v7.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ty implements pz
{
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window$Callback d;
    boolean e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private og m;
    private int n;
    private Drawable o;
    
    public ty(final Toolbar a, final boolean b) {
        this.n = 0;
        this.a = a;
        this.c = a.o;
        this.k = a.p;
        this.j = (this.c != null);
        this.i = a.e();
        final Context context = a.getContext();
        final int[] a2 = lo.a;
        CharSequence string = null;
        final to q = to.q(context, null, a2, 2130968584);
        int b2 = 15;
        this.o = q.h(15);
        if (b) {
            final CharSequence l = q.l(27);
            if (!TextUtils.isEmpty(l)) {
                this.m(l);
            }
            final CharSequence i = q.l(25);
            if (!TextUtils.isEmpty(i)) {
                this.k = i;
                if ((this.b & 0x8) != 0x0) {
                    a.q(i);
                }
            }
            final Drawable h = q.h(20);
            if (h != null) {
                this.j(h);
            }
            final Drawable h2 = q.h(17);
            if (h2 != null) {
                this.g = h2;
                this.D();
            }
            if (this.i == null) {
                final Drawable o = this.o;
                if (o != null) {
                    this.i = o;
                    this.C();
                }
            }
            this.i(q.c(10, 0));
            final int f = q.f(9, 0);
            if (f != 0) {
                final View inflate = LayoutInflater.from(a.getContext()).inflate(f, (ViewGroup)a, false);
                final View f2 = this.f;
                if (f2 != null && (this.b & 0x10) != 0x0) {
                    a.removeView(f2);
                }
                if ((this.f = inflate) != null && (this.b & 0x10) != 0x0) {
                    a.addView(inflate);
                }
                this.i(this.b | 0x10);
            }
            final int e = q.e(13, 0);
            if (e > 0) {
                final ViewGroup$LayoutParams layoutParams = a.getLayoutParams();
                layoutParams.height = e;
                a.setLayoutParams(layoutParams);
            }
            final int a3 = q.a(7, -1);
            final int a4 = q.a(3, -1);
            if (a3 >= 0 || a4 >= 0) {
                final int max = Math.max(a3, 0);
                final int max2 = Math.max(a4, 0);
                a.j();
                a.n.a(max, max2);
            }
            final int f3 = q.f(28, 0);
            if (f3 != 0) {
                final Context context2 = a.getContext();
                a.k = f3;
                final TextView b3 = a.b;
                if (b3 != null) {
                    b3.setTextAppearance(context2, f3);
                }
            }
            final int f4 = q.f(26, 0);
            if (f4 != 0) {
                final Context context3 = a.getContext();
                a.l = f4;
                final TextView c = a.c;
                if (c != null) {
                    c.setTextAppearance(context3, f4);
                }
            }
            final int f5 = q.f(22, 0);
            if (f5 != 0) {
                a.p(f5);
            }
        }
        else {
            if (a.e() != null) {
                this.o = a.e();
            }
            else {
                b2 = 11;
            }
            this.b = b2;
        }
        q.n();
        if (this.n != 2131951620) {
            this.n = 2131951620;
            if (TextUtils.isEmpty(a.h())) {
                final int n = this.n;
                if (n != 0) {
                    string = this.b().getString(n);
                }
                this.l = string;
                this.B();
            }
        }
        this.l = a.h();
        final tw onClickListener = new tw(this);
        a.l();
        a.d.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    private final void A(final CharSequence c) {
        this.c = c;
        if ((this.b & 0x8) != 0x0) {
            this.a.r(c);
        }
    }
    
    private final void B() {
        if ((this.b & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.l)) {
                final Toolbar a = this.a;
                final int n = this.n;
                CharSequence text;
                if (n != 0) {
                    text = a.getContext().getText(n);
                }
                else {
                    text = null;
                }
                a.n(text);
                return;
            }
            this.a.n(this.l);
        }
    }
    
    private final void C() {
        if ((this.b & 0x4) != 0x0) {
            final Toolbar a = this.a;
            Drawable drawable = this.i;
            if (drawable == null) {
                drawable = this.o;
            }
            a.o(drawable);
            return;
        }
        this.a.o(null);
    }
    
    private final void D() {
        final int b = this.b;
        Drawable drawable;
        if ((b & 0x2) != 0x0) {
            if ((b & 0x1) != 0x0) {
                if ((drawable = this.h) == null) {
                    drawable = this.g;
                }
            }
            else {
                drawable = this.g;
            }
        }
        else {
            drawable = null;
        }
        this.a.m(drawable);
    }
    
    @Override
    public final int a() {
        return this.b;
    }
    
    @Override
    public final Context b() {
        return this.a.getContext();
    }
    
    @Override
    public final in c(final int n, final long n2) {
        final in p2 = ik.p((View)this.a);
        float n3;
        if (n == 0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        p2.b(n3);
        p2.c(n2);
        p2.d(new tx(this, n));
        return p2;
    }
    
    @Override
    public final ViewGroup d() {
        return this.a;
    }
    
    @Override
    public final void e() {
        this.a.i();
    }
    
    @Override
    public final void f() {
        final ActionMenuView a = this.a.a;
        if (a != null) {
            a.h();
        }
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.B();
                }
                this.C();
            }
            if ((n & 0x3) != 0x0) {
                this.D();
            }
            if ((n & 0x8) != 0x0) {
                if ((b & 0x8) != 0x0) {
                    this.a.r(this.c);
                    this.a.q(this.k);
                }
                else {
                    this.a.r(null);
                    this.a.q(null);
                }
            }
            if ((n & 0x10) != 0x0) {
                final View f = this.f;
                if (f != null) {
                    if ((b & 0x10) != 0x0) {
                        this.a.addView(f);
                        return;
                    }
                    this.a.removeView(f);
                }
            }
        }
    }
    
    @Override
    public final void j(final Drawable h) {
        this.h = h;
        this.D();
    }
    
    @Override
    public final void k(final Menu menu, final ni e) {
        if (this.m == null) {
            this.m = new og(this.a.getContext());
        }
        final og m = this.m;
        m.e = e;
        final Toolbar a = this.a;
        if (menu != null || a.a != null) {
            a.k();
            final mv a2 = a.a.a;
            if (a2 != menu) {
                if (a2 != null) {
                    a2.m(a.r);
                    a2.m(a.s);
                }
                if (a.s == null) {
                    a.s = new ts(a);
                }
                m.o();
                if (menu != null) {
                    final Context i = a.i;
                    final mv mv = (mv)menu;
                    mv.h(m, i);
                    mv.h(a.s, a.i);
                }
                else {
                    m.b(a.i, null);
                    a.s.b(a.i, null);
                    m.i();
                    a.s.i();
                }
                a.a.j(a.j);
                a.a.k(m);
                a.r = m;
            }
        }
    }
    
    @Override
    public final void l() {
        this.e = true;
    }
    
    @Override
    public final void m(final CharSequence charSequence) {
        this.j = true;
        this.A(charSequence);
    }
    
    @Override
    public final void n(final int visibility) {
        this.a.setVisibility(visibility);
    }
    
    @Override
    public final void o(final Window$Callback d) {
        this.d = d;
    }
    
    @Override
    public final void p(final CharSequence charSequence) {
        if (!this.j) {
            this.A(charSequence);
        }
    }
    
    @Override
    public final boolean q() {
        final Toolbar a = this.a;
        if (a.getVisibility() == 0) {
            final ActionMenuView a2 = a.a;
            if (a2 != null && a2.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean r() {
        final ts s = this.a.s;
        return s != null && s.b != null;
    }
    
    @Override
    public final boolean s() {
        final ActionMenuView a = this.a.a;
        if (a != null) {
            final og c = a.c;
            if (c != null && c.k()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean t() {
        final ActionMenuView a = this.a.a;
        boolean b = true;
        if (a != null) {
            final og c = a.c;
            if (c != null) {
                if (c.k == null && !c.l()) {
                    return false;
                }
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final boolean u() {
        return this.a.s();
    }
    
    @Override
    public final boolean v() {
        return this.a.t();
    }
    
    @Override
    public final void w() {
    }
    
    @Override
    public final void x() {
    }
    
    @Override
    public final void y() {
    }
    
    @Override
    public final void z() {
        this.a.requestLayout();
    }
}

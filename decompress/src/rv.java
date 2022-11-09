import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rv
{
    final /* synthetic */ RecyclerView a;
    
    public rv(final RecyclerView a) {
        this.a = a;
    }
    
    public final st a(final int n) {
        final RecyclerView a = this.a;
        final int c = a.f.c();
        int i = 0;
        st st = null;
        while (i < c) {
            final st f = RecyclerView.f(a.f.f(i));
            st st2 = st;
            if (f != null) {
                st2 = st;
                if (!f.t()) {
                    if (f.c != n) {
                        st2 = st;
                    }
                    else {
                        if (!a.f.k(f.a)) {
                            st = f;
                            break;
                        }
                        st2 = f;
                    }
                }
            }
            ++i;
            st = st2;
        }
        if (st == null) {
            return null;
        }
        if (this.a.f.k(st.a)) {
            return null;
        }
        return st;
    }
    
    final void b(final ol ol) {
        switch (ol.a) {
            default: {
                return;
            }
            case 4: {
                final se l = this.a.l;
                final int b = ol.b;
                final int d = ol.d;
                final Object c = ol.c;
                l.w(b, d);
                return;
            }
            case 2: {
                this.a.l.v(ol.b, ol.d);
                return;
            }
            case 1: {
                this.a.l.u(ol.b, ol.d);
            }
        }
    }
    
    public final void c(final int n, final int n2) {
        final RecyclerView a = this.a;
        for (int c = a.f.c(), i = 0; i < c; ++i) {
            final st f = RecyclerView.f(a.f.f(i));
            if (f != null && !f.y() && f.c >= n) {
                f.i(n2, false);
                a.I.f = true;
            }
        }
        final sk c2 = a.c;
        for (int size = c2.c.size(), j = 0; j < size; ++j) {
            final st st = c2.c.get(j);
            if (st != null && st.c >= n) {
                st.i(n2, false);
            }
        }
        a.requestLayout();
        this.a.J = true;
    }
    
    public final void d(final int n, final int n2) {
        this.a.G(n, n2, true);
        final RecyclerView a = this.a;
        a.J = true;
        final sq i = a.I;
        i.c += n2;
    }
    
    public final void e(final int n, int i) {
        final RecyclerView a = this.a;
        final int c = a.f.c();
        final int n2 = i + n;
        View f;
        st f2;
        int c2;
        for (i = 0; i < c; ++i) {
            f = a.f.f(i);
            f2 = RecyclerView.f(f);
            if (f2 != null) {
                if (!f2.y()) {
                    c2 = f2.c;
                    if (c2 >= n && c2 < n2) {
                        f2.d(2);
                        f2.A();
                        ((sf)f.getLayoutParams()).e = true;
                    }
                }
            }
        }
        final sk c3 = a.c;
        st st;
        int c4;
        for (i = c3.c.size() - 1; i >= 0; --i) {
            st = c3.c.get(i);
            if (st != null) {
                c4 = st.c;
                if (c4 >= n && c4 < n2) {
                    st.d(2);
                    c3.g(i);
                }
            }
        }
        this.a.K = true;
    }
}

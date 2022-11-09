import android.animation.ValueAnimator;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sa
{
    private static TimeInterpolator n;
    public sb a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    private final ArrayList m;
    
    public sa() {
        this.a = null;
        this.m = new ArrayList();
    }
    
    public sa(final byte[] array) {
        this();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }
    
    public static final rz c() {
        return new rz();
    }
    
    public static void d(final st st) {
        final int j = st.j;
        if (st.r()) {
            return;
        }
        if ((j & 0x4) == 0x0) {
            final int d = st.d;
            st.a();
        }
    }
    
    public static final rz e(final st st) {
        final rz c = c();
        c.a(st);
        return c;
    }
    
    public static void m(final List list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            ((st)list.get(i)).a.animate().cancel();
        }
    }
    
    private final void n(final List list, final st st) {
        for (int i = list.size() - 1; i >= 0; --i) {
            final qg qg = list.get(i);
            if (this.p(qg, st) && qg.a == null && qg.b == null) {
                list.remove(qg);
            }
        }
    }
    
    private final void o(final qg qg) {
        final st a = qg.a;
        if (a != null) {
            this.p(qg, a);
        }
        final st b = qg.b;
        if (b != null) {
            this.p(qg, b);
        }
    }
    
    private final boolean p(final qg qg, final st st) {
        if (qg.b == st) {
            qg.b = null;
        }
        else {
            if (qg.a != st) {
                return false;
            }
            qg.a = null;
        }
        st.a.setAlpha(1.0f);
        st.a.setTranslationX(0.0f);
        st.a.setTranslationY(0.0f);
        this.a(st);
        return true;
    }
    
    public final void a(final st st) {
        final sb a = this.a;
        if (a != null) {
            boolean b = true;
            st.l(true);
            if (st.h != null && st.i == null) {
                st.h = null;
            }
            st.i = null;
            if ((st.j & 0x10) == 0x0) {
                final RecyclerView a2 = a.a;
                final View a3 = st.a;
                a2.U();
                final px f = a2.f;
                final int b2 = f.c.b(a3);
                if (b2 == -1) {
                    f.l(a3);
                }
                else if (f.a.f(b2)) {
                    f.a.g(b2);
                    f.l(a3);
                    f.c.e(b2);
                }
                else {
                    b = false;
                }
                if (b) {
                    final st f2 = RecyclerView.f(a3);
                    a2.c.k(f2);
                    a2.c.i(f2);
                }
                a2.V(b ^ true);
                if (!b && st.v()) {
                    a.a.removeDetachedView(st.a, false);
                }
            }
        }
    }
    
    public final void b() {
        for (int size = this.m.size(), i = 0; i < size; ++i) {
            ((ry)this.m.get(i)).a();
        }
        this.m.clear();
    }
    
    public final boolean f(final st st, final st st2, final rz rz, final rz rz2) {
        final int a = rz.a;
        final int b = rz.b;
        int n;
        int n2;
        if (st2.y()) {
            n = rz.a;
            n2 = rz.b;
        }
        else {
            n = rz2.a;
            n2 = rz2.b;
        }
        boolean k;
        if (st == st2) {
            k = this.k(st, a, b, n, n2);
        }
        else {
            final float translationX = st.a.getTranslationX();
            final float translationY = st.a.getTranslationY();
            final float alpha = st.a.getAlpha();
            this.j(st);
            final int n3 = (int)(n - a - translationX);
            final int n4 = (int)(n2 - b - translationY);
            st.a.setTranslationX(translationX);
            st.a.setTranslationY(translationY);
            st.a.setAlpha(alpha);
            if (st2 != null) {
                this.j(st2);
                st2.a.setTranslationX((float)(-n3));
                st2.a.setTranslationY((float)(-n4));
                st2.a.setAlpha(0.0f);
            }
            this.e.add(new qg(st, st2, a, b, n, n2));
            k = true;
        }
        return k;
    }
    
    public final void g() {
        if (!this.l()) {
            this.b();
        }
    }
    
    public final void h(final st st) {
        final View a = st.a;
        a.animate().cancel();
        for (int i = this.d.size() - 1; i >= 0; --i) {
            if (((qh)this.d.get(i)).a == st) {
                a.setTranslationY(0.0f);
                a.setTranslationX(0.0f);
                this.a(st);
                this.d.remove(i);
            }
        }
        this.n(this.e, st);
        if (this.b.remove(st)) {
            a.setAlpha(1.0f);
            this.a(st);
        }
        if (this.c.remove(st)) {
            a.setAlpha(1.0f);
            this.a(st);
        }
        for (int j = this.h.size() - 1; j >= 0; --j) {
            final ArrayList list = this.h.get(j);
            this.n(list, st);
            if (list.isEmpty()) {
                this.h.remove(j);
            }
        }
        for (int k = this.g.size() - 1; k >= 0; --k) {
            final ArrayList list2 = this.g.get(k);
            int l = list2.size() - 1;
            while (l >= 0) {
                if (((qh)list2.get(l)).a == st) {
                    a.setTranslationY(0.0f);
                    a.setTranslationX(0.0f);
                    this.a(st);
                    list2.remove(l);
                    if (list2.isEmpty()) {
                        this.g.remove(k);
                        break;
                    }
                    break;
                }
                else {
                    --l;
                }
            }
        }
        for (int n = this.f.size() - 1; n >= 0; --n) {
            final ArrayList list3 = this.f.get(n);
            if (list3.remove(st)) {
                a.setAlpha(1.0f);
                this.a(st);
                if (list3.isEmpty()) {
                    this.f.remove(n);
                }
            }
        }
        this.k.remove(st);
        this.i.remove(st);
        this.l.remove(st);
        this.j.remove(st);
        this.g();
    }
    
    public final void i() {
        for (int i = this.d.size() - 1; i >= 0; --i) {
            final qh qh = this.d.get(i);
            final View a = qh.a.a;
            a.setTranslationY(0.0f);
            a.setTranslationX(0.0f);
            this.a(qh.a);
            this.d.remove(i);
        }
        for (int j = this.b.size() - 1; j >= 0; --j) {
            this.a((st)this.b.get(j));
            this.b.remove(j);
        }
        for (int k = this.c.size() - 1; k >= 0; --k) {
            final st st = this.c.get(k);
            st.a.setAlpha(1.0f);
            this.a(st);
            this.c.remove(k);
        }
        for (int l = this.e.size() - 1; l >= 0; --l) {
            this.o((qg)this.e.get(l));
        }
        this.e.clear();
        if (!this.l()) {
            return;
        }
        for (int n = this.g.size() - 1; n >= 0; --n) {
            final ArrayList list = this.g.get(n);
            for (int n2 = list.size() - 1; n2 >= 0; --n2) {
                final qh qh2 = (qh)list.get(n2);
                final View a2 = qh2.a.a;
                a2.setTranslationY(0.0f);
                a2.setTranslationX(0.0f);
                this.a(qh2.a);
                list.remove(n2);
                if (list.isEmpty()) {
                    this.g.remove(list);
                }
            }
        }
        for (int n3 = this.f.size() - 1; n3 >= 0; --n3) {
            final ArrayList list2 = this.f.get(n3);
            for (int n4 = list2.size() - 1; n4 >= 0; --n4) {
                final st st2 = (st)list2.get(n4);
                st2.a.setAlpha(1.0f);
                this.a(st2);
                list2.remove(n4);
                if (list2.isEmpty()) {
                    this.f.remove(list2);
                }
            }
        }
        for (int n5 = this.h.size() - 1; n5 >= 0; --n5) {
            final ArrayList list3 = this.h.get(n5);
            for (int n6 = list3.size() - 1; n6 >= 0; --n6) {
                this.o((qg)list3.get(n6));
                if (list3.isEmpty()) {
                    this.h.remove(list3);
                }
            }
        }
        m(this.k);
        m(this.j);
        m(this.i);
        m(this.l);
        this.b();
    }
    
    public final void j(final st st) {
        if (sa.n == null) {
            sa.n = new ValueAnimator().getInterpolator();
        }
        st.a.animate().setInterpolator(sa.n);
        this.h(st);
    }
    
    public final boolean k(final st st, int n, int n2, final int n3, final int n4) {
        final View a = st.a;
        final int n5 = n + (int)a.getTranslationX();
        final int n6 = n2 + (int)st.a.getTranslationY();
        this.j(st);
        n2 = n3 - n5;
        final int n7 = n4 - n6;
        n = n2;
        if (n2 == 0) {
            if (n7 == 0) {
                this.a(st);
                return false;
            }
            n = 0;
        }
        if (n != 0) {
            a.setTranslationX((float)(-n));
        }
        if (n7 != 0) {
            a.setTranslationY((float)(-n7));
        }
        this.d.add(new qh(st, n5, n6, n3, n4));
        return true;
    }
    
    public final boolean l() {
        return !this.c.isEmpty() || !this.e.isEmpty() || !this.d.isEmpty() || !this.b.isEmpty() || !this.j.isEmpty() || !this.k.isEmpty() || !this.i.isEmpty() || !this.l.isEmpty() || !this.g.isEmpty() || !this.f.isEmpty() || !this.h.isEmpty();
    }
}

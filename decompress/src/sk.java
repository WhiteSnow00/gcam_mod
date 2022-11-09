import android.view.ViewGroup$LayoutParams;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import android.os.Trace;
import android.view.View;
import java.util.Collections;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sk
{
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    sj f;
    public final /* synthetic */ RecyclerView g;
    
    public sk(final RecyclerView g) {
        this.g = g;
        final ArrayList a = new ArrayList();
        this.a = a;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList((List<?>)a);
        this.e = 2;
    }
    
    public final int a(final int n) {
        if (n < 0 || n >= this.g.I.a()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(n);
            sb.append(". State item count is ");
            sb.append(this.g.I.a());
            sb.append(this.g.i());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        final RecyclerView g = this.g;
        if (!g.I.g) {
            return n;
        }
        return g.e.a(n);
    }
    
    public final sj b() {
        if (this.f == null) {
            this.f = new sj();
        }
        return this.f;
    }
    
    public final View c(final int n) {
        return this.m(n, Long.MAX_VALUE).a;
    }
    
    final void d(final st st, final boolean b) {
        RecyclerView.o(st);
        final View a = st.a;
        final sv m = this.g.M;
        if (m != null) {
            final su c = m.c;
            ht ht;
            if (c instanceof su) {
                ht = c.c.remove(a);
            }
            else {
                ht = null;
            }
            ik.F(a, ht);
        }
        if (b) {
            for (int size = this.g.m.size(), i = 0; i < size; ++i) {
                ((sl)this.g.m.get(i)).a();
            }
            final RecyclerView g = this.g;
            if (g.I != null) {
                g.g.h(st);
            }
        }
        st.p = null;
        st.o = null;
        final sj b2 = this.b();
        final int f = st.f;
        final ArrayList a2 = b2.a(f).a;
        final int b3 = ((si)b2.a.get(f)).b;
        if (a2.size() >= 5) {
            return;
        }
        st.j();
        a2.add(st);
    }
    
    public final void e() {
        this.a.clear();
        this.f();
    }
    
    public final void f() {
        for (int i = this.c.size() - 1; i >= 0; --i) {
            this.g(i);
        }
        this.c.clear();
        final int p = RecyclerView.P;
        this.g.H.b();
    }
    
    public final void g(final int n) {
        this.d(this.c.get(n), true);
        this.c.remove(n);
    }
    
    public final void h(final View view) {
        final st f = RecyclerView.f(view);
        if (f.v()) {
            this.g.removeDetachedView(view, false);
        }
        if (f.u()) {
            f.n();
        }
        else if (f.z()) {
            f.g();
        }
        this.i(f);
        if (this.g.B != null && !f.s()) {
            this.g.B.h(f);
        }
    }
    
    final void i(final st st) {
        final boolean u = st.u();
        boolean b = true;
        final int n = 1;
        int n2 = 0;
        if (u || st.a.getParent() != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(st.u());
            sb.append(" isAttached:");
            if (st.a.getParent() == null) {
                b = false;
            }
            sb.append(b);
            sb.append(this.g.i());
            throw new IllegalArgumentException(sb.toString());
        }
        if (st.v()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(st);
            sb2.append(this.g.i());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!st.y()) {
            final boolean b2 = (st.j & 0x10) == 0x0 && ik.S(st.a);
            boolean b3 = false;
            int n5 = 0;
            Label_0279: {
                if (st.s()) {
                    if (this.e > 0 && !st.o(526)) {
                        int size;
                        final int n3 = size = this.c.size();
                        if (n3 >= this.e && (size = n3) > 0) {
                            this.g(0);
                            size = n3 - 1;
                        }
                        int n4;
                        if ((n4 = size) > 0) {
                            n4 = size;
                            if (!this.g.H.d(st.c)) {
                                --size;
                                while (size >= 0 && this.g.H.d(((st)this.c.get(size)).c)) {
                                    --size;
                                }
                                n4 = size + 1;
                            }
                        }
                        this.c.add(n4, st);
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        this.d(st, true);
                        b3 = (n2 != 0);
                        n5 = n;
                        break Label_0279;
                    }
                }
                final int n6 = 0;
                b3 = (n2 != 0);
                n5 = n6;
            }
            this.g.g.h(st);
            if (!b3 && n5 == 0 && b2) {
                st.p = null;
                st.o = null;
            }
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        sb3.append(this.g.i());
        throw new IllegalArgumentException(sb3.toString());
    }
    
    final void j(final View view) {
        final st f = RecyclerView.f(view);
        if (!f.o(12) && f.w() && this.g.B != null && f.c().isEmpty() && !f.r()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            f.m(this, true);
            this.b.add(f);
            return;
        }
        if (f.r() && !f.t()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            sb.append(this.g.i());
            throw new IllegalArgumentException(sb.toString());
        }
        f.m(this, false);
        this.a.add(f);
    }
    
    public final void k(final st st) {
        if (st.l) {
            this.b.remove(st);
        }
        else {
            this.a.remove(st);
        }
        st.k = null;
        st.l = false;
        st.g();
    }
    
    public final void l() {
        final se l = this.g.l;
        int y;
        if (l != null) {
            y = l.y;
        }
        else {
            y = 0;
        }
        this.e = y + 2;
        for (int n = this.c.size() - 1; n >= 0 && this.c.size() > this.e; --n) {
            this.g(n);
        }
    }
    
    final st m(int n, long nanoTime) {
        if (n >= 0 && n < this.g.I.a()) {
            final boolean g = this.g.I.g;
            boolean f = true;
            Object o = null;
            boolean b2;
            if (g) {
                final ArrayList b = this.b;
                Label_0127: {
                    if (b != null) {
                        final int size = b.size();
                        if (size == 0) {
                            o = null;
                            break Label_0127;
                        }
                        for (int i = 0; i < size; ++i) {
                            o = this.b.get(i);
                            if (!((st)o).z() && ((st)o).b() == n) {
                                ((st)o).d(32);
                                break Label_0127;
                            }
                        }
                    }
                    o = null;
                }
                b2 = (o != null);
            }
            else {
                o = null;
                b2 = false;
            }
            Label_0887: {
                if (o == null) {
                    final int size2 = this.a.size();
                    int j = 0;
                    while (true) {
                    Label_0680:
                        while (true) {
                            while (j < size2) {
                                o = this.a.get(j);
                                if (!((st)o).z() && ((st)o).b() == n && !((st)o).r() && (this.g.I.g || !((st)o).t())) {
                                    ((st)o).d(32);
                                    if (o != null) {
                                        if (((st)o).t()) {
                                            if (this.g.I.g) {
                                                b2 = true;
                                                break Label_0887;
                                            }
                                        }
                                        else {
                                            final int c = ((st)o).c;
                                            if (c < 0 || c >= this.g.k.a()) {
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("Inconsistency detected. Invalid view holder adapter position");
                                                sb.append(o);
                                                sb.append(this.g.i());
                                                throw new IndexOutOfBoundsException(sb.toString());
                                            }
                                            if (this.g.I.g || ((st)o).f == 0) {
                                                b2 = true;
                                                break Label_0887;
                                            }
                                        }
                                        ((st)o).d(4);
                                        if (((st)o).u()) {
                                            this.g.removeDetachedView(((st)o).a, false);
                                            ((st)o).n();
                                        }
                                        else if (((st)o).z()) {
                                            ((st)o).g();
                                        }
                                        this.i((st)o);
                                        o = null;
                                    }
                                    break Label_0887;
                                }
                                else {
                                    ++j;
                                }
                            }
                            final px f2 = this.g.f;
                            final int size3 = f2.b.size();
                            int k = 0;
                            while (k < size3) {
                                final View view = f2.b.get(k);
                                final ru c2 = f2.c;
                                final st f3 = RecyclerView.f(view);
                                if (f3.b() == n && !f3.r() && !f3.t()) {
                                    if (view == null) {
                                        for (int size4 = this.c.size(), l = 0; l < size4; ++l) {
                                            o = this.c.get(l);
                                            if (!((st)o).r() && ((st)o).b() == n && !((st)o).p()) {
                                                this.c.remove(l);
                                                continue Label_0680;
                                            }
                                        }
                                        o = null;
                                        continue Label_0680;
                                    }
                                    final st f4 = RecyclerView.f(view);
                                    final px f5 = this.g.f;
                                    final int b3 = f5.c.b(view);
                                    if (b3 < 0) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("view is not a child, cannot hide ");
                                        sb2.append(view);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    if (!f5.a.f(b3)) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("trying to unhide a view that was not hidden");
                                        sb3.append(view);
                                        throw new RuntimeException(sb3.toString());
                                    }
                                    f5.a.b(b3);
                                    f5.l(view);
                                    final int d = this.g.f.d(view);
                                    if (d != -1) {
                                        this.g.f.i(d);
                                        this.j(view);
                                        f4.d(8224);
                                        o = f4;
                                        continue Label_0680;
                                    }
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append("layout index should not be -1 after unhiding a view:");
                                    sb4.append(f4);
                                    sb4.append(this.g.i());
                                    throw new IllegalStateException(sb4.toString());
                                }
                                else {
                                    ++k;
                                }
                            }
                            break;
                        }
                        final View view = null;
                        continue;
                    }
                }
            }
            Object c3 = null;
            Label_1319: {
                if ((c3 = o) == null) {
                    final int a = this.g.e.a(n);
                    if (a >= 0 && a < this.g.k.a()) {
                        final si si = (si)this.b().a.get(0);
                        st st = null;
                        Label_1022: {
                            if (si != null && !si.a.isEmpty()) {
                                final ArrayList a2 = si.a;
                                for (int n2 = a2.size() - 1; n2 >= 0; --n2) {
                                    if (!((st)a2.get(n2)).p()) {
                                        st = a2.remove(n2);
                                        break Label_1022;
                                    }
                                }
                            }
                            st = null;
                        }
                        if (st != null) {
                            st.j();
                        }
                        if ((c3 = st) != null) {
                            break Label_1319;
                        }
                        final long nanoTime2 = System.nanoTime();
                        if (nanoTime != Long.MAX_VALUE) {
                            final long c4 = this.f.a(0).c;
                            if (c4 != 0L) {
                                if (c4 + nanoTime2 >= nanoTime) {
                                    return null;
                                }
                            }
                        }
                        final RecyclerView g2 = this.g;
                        c3 = g2.k;
                        try {
                            Trace.beginSection("RV CreateView");
                            c3 = ((rw)c3).d(g2);
                            if (((st)c3).a.getParent() == null) {
                                ((st)c3).f = 0;
                                Trace.endSection();
                                final RecyclerView g3 = RecyclerView.g(((st)c3).a);
                                if (g3 != null) {
                                    ((st)c3).b = new WeakReference(g3);
                                }
                                final long nanoTime3 = System.nanoTime();
                                final si a3 = this.f.a(0);
                                a3.c = sj.b(a3.c, nanoTime3 - nanoTime2);
                                break Label_1319;
                            }
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Inconsistency detected. Invalid item position ");
                    sb5.append(n);
                    sb5.append("(offset:");
                    sb5.append(a);
                    sb5.append(").state:");
                    sb5.append(this.g.I.a());
                    sb5.append(this.g.i());
                    throw new IndexOutOfBoundsException(sb5.toString());
                }
            }
            if (b2 && !this.g.I.g && ((st)c3).o(8192)) {
                ((st)c3).k(0, 8192);
                if (this.g.I.j) {
                    sa.d((st)c3);
                    ((st)c3).c();
                    this.g.L((st)c3, sa.e((st)c3));
                }
            }
            Label_1807: {
                if (this.g.I.g && ((st)c3).q()) {
                    ((st)c3).g = n;
                    n = 0;
                }
                else {
                    Label_1458: {
                        if (!((st)c3).q() || ((st)c3).x() || ((st)c3).r()) {
                            final int a4 = this.g.e.a(n);
                            ((st)c3).p = null;
                            ((st)c3).o = this.g;
                            final int f6 = ((st)c3).f;
                            final long nanoTime4 = System.nanoTime();
                            if (nanoTime != Long.MAX_VALUE) {
                                final long d2 = this.f.a(f6).d;
                                if (d2 != 0L && d2 + nanoTime4 >= nanoTime) {
                                    break Label_1458;
                                }
                            }
                            final rw m = this.g.k;
                            final rw p2 = ((st)c3).p;
                            if (p2 == null) {
                                ((st)c3).c = a4;
                                ((st)c3).k(1, 519);
                                Trace.beginSection("RV OnBindView");
                            }
                            ((st)c3).p = m;
                            ((st)c3).c();
                            m.b((st)c3, a4);
                            if (p2 == null) {
                                ((st)c3).f();
                                final ViewGroup$LayoutParams layoutParams = ((st)c3).a.getLayoutParams();
                                if (layoutParams instanceof sf) {
                                    ((sf)layoutParams).e = true;
                                }
                                Trace.endSection();
                            }
                            nanoTime = System.nanoTime();
                            final si a5 = this.f.a(((st)c3).f);
                            a5.d = sj.b(a5.d, nanoTime - nanoTime4);
                            if (this.g.ab()) {
                                final View a6 = ((st)c3).a;
                                if (ik.d(a6) == 0) {
                                    ik.K(a6, 1);
                                }
                                final sv m2 = this.g.M;
                                if (m2 != null) {
                                    final su c5 = m2.c;
                                    if (c5 instanceof su) {
                                        final ht n3 = ik.n(a6);
                                        if (n3 != null && n3 != c5) {
                                            c5.c.put(a6, n3);
                                        }
                                    }
                                    ik.F(a6, c5);
                                }
                            }
                            if (this.g.I.g) {
                                ((st)c3).g = n;
                            }
                            n = 1;
                            break Label_1807;
                        }
                    }
                    n = 0;
                }
            }
            final ViewGroup$LayoutParams layoutParams2 = ((st)c3).a.getLayoutParams();
            Object o2;
            if (layoutParams2 == null) {
                o2 = this.g.generateDefaultLayoutParams();
                ((st)c3).a.setLayoutParams((ViewGroup$LayoutParams)o2);
            }
            else if (!this.g.checkLayoutParams(layoutParams2)) {
                o2 = this.g.generateLayoutParams(layoutParams2);
                ((st)c3).a.setLayoutParams((ViewGroup$LayoutParams)o2);
            }
            else {
                o2 = layoutParams2;
            }
            final sf sf = (sf)o2;
            sf.c = (st)c3;
            if (!b2 || n == 0) {
                f = false;
            }
            sf.f = f;
            return (st)c3;
        }
        final StringBuilder sb6 = new StringBuilder();
        sb6.append("Invalid item position ");
        sb6.append(n);
        sb6.append("(");
        sb6.append(n);
        sb6.append("). Item count:");
        sb6.append(this.g.I.a());
        sb6.append(this.g.i());
        throw new IndexOutOfBoundsException(sb6.toString());
    }
}

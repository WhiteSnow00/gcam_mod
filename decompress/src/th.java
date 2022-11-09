import android.view.View;
import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class th
{
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;
    
    public th(final StaggeredGridLayoutManager f, final int e) {
        this.f = f;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = e;
    }
    
    public static final td n(final View view) {
        return (td)view.getLayoutParams();
    }
    
    public final int a() {
        int n;
        if (this.f.d) {
            n = this.m(this.a.size() - 1, -1);
        }
        else {
            n = this.m(0, this.a.size());
        }
        return n;
    }
    
    public final int b() {
        int n;
        if (this.f.d) {
            n = this.m(0, this.a.size());
        }
        else {
            n = this.m(this.a.size() - 1, -1);
        }
        return n;
    }
    
    public final int c() {
        final int c = this.c;
        if (c != Integer.MIN_VALUE) {
            return c;
        }
        this.h();
        return this.c;
    }
    
    public final int d(final int n) {
        final int c = this.c;
        if (c != Integer.MIN_VALUE) {
            return c;
        }
        if (this.a.size() == 0) {
            return n;
        }
        this.h();
        return this.c;
    }
    
    public final int e() {
        final int b = this.b;
        if (b != Integer.MIN_VALUE) {
            return b;
        }
        this.i();
        return this.b;
    }
    
    public final int f(final int n) {
        final int b = this.b;
        if (b != Integer.MIN_VALUE) {
            return b;
        }
        if (this.a.size() == 0) {
            return n;
        }
        this.i();
        return this.b;
    }
    
    public final View g(final int n, int i) {
        final View view = null;
        View view2 = null;
        if (i == -1) {
            int size;
            View view3;
            for (size = this.a.size(), i = 0; i < size; ++i, view2 = view3) {
                view3 = this.a.get(i);
                if (this.f.d && se.bd(view3) <= n) {
                    break;
                }
                if (!this.f.d && se.bd(view3) >= n) {
                    break;
                }
                if (!view3.hasFocusable()) {
                    break;
                }
            }
        }
        else {
            i = this.a.size() - 1;
            view2 = view;
            while (i >= 0) {
                final View view4 = this.a.get(i);
                if (this.f.d && se.bd(view4) >= n) {
                    break;
                }
                if (!this.f.d && se.bd(view4) <= n) {
                    break;
                }
                if (!view4.hasFocusable()) {
                    break;
                }
                --i;
                view2 = view4;
            }
        }
        return view2;
    }
    
    final void h() {
        final ArrayList a = this.a;
        final View view = a.get(a.size() - 1);
        final td n = n(view);
        this.c = this.f.b.a(view);
        final boolean b = n.b;
    }
    
    final void i() {
        final View view = this.a.get(0);
        final td n = n(view);
        this.b = this.f.b.d(view);
        final boolean b = n.b;
    }
    
    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }
    
    public final void k(final int n) {
        final int b = this.b;
        if (b != Integer.MIN_VALUE) {
            this.b = b + n;
        }
        final int c = this.c;
        if (c != Integer.MIN_VALUE) {
            this.c = c + n;
        }
    }
    
    public final void l(final int n) {
        this.b = n;
        this.c = n;
    }
    
    final int m(int i, final int n) {
        final int j = this.f.b.j();
        final int f = this.f.b.f();
        final int n2 = -1;
        int n3;
        if (n > i) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        while (i != n) {
            final View view = this.a.get(i);
            final int d = this.f.b.d(view);
            final int a = this.f.b.a(view);
            boolean b = false;
            final boolean b2 = d <= f;
            if (a >= j) {
                b = true;
            }
            if (b2 && b && (d < j || a > f)) {
                i = se.bd(view);
                return i;
            }
            i += n3;
        }
        i = n2;
        return i;
    }
}

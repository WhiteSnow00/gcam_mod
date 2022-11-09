import android.view.ViewGroup$LayoutParams;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class px
{
    public final pw a;
    public final List b;
    public final ru c;
    
    public px(final ru c) {
        this.c = c;
        this.a = new pw();
        this.b = new ArrayList();
    }
    
    public final int a() {
        return this.c.a() - this.b.size();
    }
    
    public final int b(final int n) {
        if (n < 0) {
            return -1;
        }
        int n2;
        for (int a = this.c.a(), i = n; i < a; i += n2) {
            n2 = n - (i - this.a.a(i));
            if (n2 == 0) {
                while (this.a.f(i)) {
                    ++i;
                }
                return i;
            }
        }
        return -1;
    }
    
    public final int c() {
        return this.c.a();
    }
    
    final int d(final View view) {
        final int b = this.c.b(view);
        if (b == -1) {
            return -1;
        }
        if (this.a.f(b)) {
            return -1;
        }
        return b - this.a.a(b);
    }
    
    public final View e(int b) {
        b = this.b(b);
        return this.c.c(b);
    }
    
    public final View f(final int n) {
        return this.c.c(n);
    }
    
    public final void g(final View view, int i, final boolean b) {
        if (i < 0) {
            i = this.c.a();
        }
        else {
            i = this.b(0);
        }
        this.a.c(i, b);
        if (b) {
            this.j(view);
        }
        final ru c = this.c;
        c.a.addView(view, i);
        final RecyclerView a = c.a;
        final st f = RecyclerView.f(view);
        final rw k = a.k;
        if (k != null && f != null) {
            k.c(f);
        }
        final List v = a.v;
        if (v != null) {
            acw acw;
            sf sf;
            for (i = v.size() - 1; i >= 0; --i) {
                acw = a.v.get(i);
                sf = (sf)view.getLayoutParams();
                if (sf.width != -1 || sf.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }
    
    public final void h(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n < 0) {
            n = this.c.a();
        }
        else {
            n = this.b(n);
        }
        this.a.c(n, b);
        if (b) {
            this.j(view);
        }
        final ru c = this.c;
        final st f = RecyclerView.f(view);
        if (f != null) {
            if (!f.v() && !f.y()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(f);
                sb.append(c.a.i());
                throw new IllegalArgumentException(sb.toString());
            }
            f.h();
        }
        RecyclerView.j(c.a, view, n, viewGroup$LayoutParams);
    }
    
    final void i(int b) {
        b = this.b(b);
        this.a.g(b);
        final ru c = this.c;
        final View c2 = c.c(b);
        if (c2 != null) {
            final st f = RecyclerView.f(c2);
            if (f != null) {
                if (f.v() && !f.y()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(f);
                    sb.append(c.a.i());
                    throw new IllegalArgumentException(sb.toString());
                }
                f.d(256);
            }
        }
        RecyclerView.k(c.a, b);
    }
    
    public final void j(final View view) {
        this.b.add(view);
        final ru c = this.c;
        final st f = RecyclerView.f(view);
        if (f != null) {
            final RecyclerView a = c.a;
            final int n = f.n;
            if (n != -1) {
                f.m = n;
            }
            else {
                f.m = ik.d(f.a);
            }
            a.af(f, 4);
        }
    }
    
    public final boolean k(final View view) {
        return this.b.contains(view);
    }
    
    public final void l(final View view) {
        if (this.b.remove(view)) {
            this.c.d(view);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(", hidden list:");
        sb.append(this.b.size());
        return sb.toString();
    }
}

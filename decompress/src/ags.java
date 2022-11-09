import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Locale;
import java.util.Comparator;
import java.util.Arrays;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ags extends aak
{
    public int a;
    public int b;
    public final agr c;
    public int d;
    public aal e;
    private final ViewPager2 f;
    private final RecyclerView g;
    private final LinearLayoutManager h;
    private int i;
    private boolean j;
    private boolean k;
    
    public ags(final ViewPager2 f) {
        this.f = f;
        final RecyclerView e = f.e;
        this.g = e;
        this.h = (LinearLayoutManager)e.l;
        this.c = new agr();
        this.j();
    }
    
    private final void i(final int n, final float n2, final int n3) {
        final aal e = this.e;
        if (e != null) {
            e.e(n, n2, n3);
        }
    }
    
    private final void j() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.i = -1;
        this.d = -1;
        this.j = false;
        this.k = false;
    }
    
    private final boolean k() {
        return this.a == 1;
    }
    
    @Override
    public final void a(final RecyclerView recyclerView, int d, int n) {
        this.k = true;
        this.g();
        if (this.j) {
            this.j = false;
            Label_0084: {
                if (n > 0 || (n == 0 && d < 0 == this.f.d())) {
                    final agr c = this.c;
                    if (c.c != 0) {
                        d = c.a + 1;
                        break Label_0084;
                    }
                }
                d = this.c.a;
            }
            this.d = d;
            if (this.i != d) {
                this.e(d);
            }
        }
        else if (this.a == 0) {
            n = this.c.a;
            if ((d = n) == -1) {
                d = 0;
            }
            this.e(d);
        }
        final agr c2 = this.c;
        n = c2.a;
        if ((d = n) == -1) {
            d = 0;
        }
        this.i(d, c2.b, c2.c);
        final agr c3 = this.c;
        n = c3.a;
        d = this.d;
        if ((n == d || d == -1) && c3.c == 0 && this.b != 1) {
            this.f(0);
            this.j();
        }
    }
    
    @Override
    public final void b(int i) {
        if ((this.a != 1 || this.b != 1) && i == 1) {
            this.a = 1;
            i = this.d;
            if (i != -1) {
                this.i = i;
                this.d = -1;
            }
            else if (this.i == -1) {
                this.i = this.h.F();
            }
            this.f(1);
            return;
        }
        if (this.k() && i == 2) {
            if (this.k) {
                this.f(2);
                this.j = true;
            }
            return;
        }
        if (this.k() && i == 0) {
            this.g();
            if (!this.k) {
                i = this.c.a;
                if (i != -1) {
                    this.i(i, 0.0f, 0);
                }
            }
            else {
                final agr c = this.c;
                if (c.c != 0) {
                    return;
                }
                i = this.i;
                final int a = c.a;
                if (i != a) {
                    this.e(a);
                }
            }
            this.f(0);
            this.j();
        }
    }
    
    public final void e(final int n) {
        final aal e = this.e;
        if (e != null) {
            e.f(n);
        }
    }
    
    public final void f(final int b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        final aal e = this.e;
        if (e != null) {
            e.d(b);
        }
    }
    
    public final void g() {
        final agr c = this.c;
        final int f = this.h.F();
        c.a = f;
        if (f == -1) {
            c.a();
            return;
        }
        final View k = this.h.K(f);
        if (k == null) {
            c.a();
            return;
        }
        final int bc = se.bc(k);
        final int be = se.be(k);
        final int bf = se.bf(k);
        final int az = se.aZ(k);
        final ViewGroup$LayoutParams layoutParams = k.getLayoutParams();
        int n = bc;
        int n2 = be;
        int n3 = bf;
        int n4 = az;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n = bc + viewGroup$MarginLayoutParams.leftMargin;
            n2 = be + viewGroup$MarginLayoutParams.rightMargin;
            n3 = bf + viewGroup$MarginLayoutParams.topMargin;
            n4 = az + viewGroup$MarginLayoutParams.bottomMargin;
        }
        final int n5 = k.getHeight() + n3 + n4;
        final int width = k.getWidth();
        int n8;
        int n9;
        if (this.h.i == 0) {
            int n6 = k.getLeft() - n - this.g.getPaddingLeft();
            if (this.f.d()) {
                n6 = -n6;
            }
            final int n7 = width + n + n2;
            n8 = n6;
            n9 = n7;
        }
        else {
            n8 = k.getTop() - n3 - this.g.getPaddingTop();
            n9 = n5;
        }
        final int c2 = -n8;
        c.c = c2;
        if (c2 < 0) {
            final ViewGroup$MarginLayoutParams a = agn.a;
            final LinearLayoutManager h = this.h;
            final int ah = h.ah();
            Label_0544: {
                if (ah != 0) {
                    final int n10 = h.i ^ 0x1;
                    final int[][] array = new int[ah][2];
                    for (int i = 0; i < ah; ++i) {
                        final View at = h.at(i);
                        if (at == null) {
                            throw new IllegalStateException("null view contained in the view hierarchy");
                        }
                        final ViewGroup$LayoutParams layoutParams2 = at.getLayoutParams();
                        ViewGroup$MarginLayoutParams a2;
                        if (layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                            a2 = (ViewGroup$MarginLayoutParams)layoutParams2;
                        }
                        else {
                            a2 = agn.a;
                        }
                        final int[] array2 = array[i];
                        int n11;
                        if (n10 != 0) {
                            n11 = at.getLeft() - a2.leftMargin;
                        }
                        else {
                            n11 = at.getTop() - a2.topMargin;
                        }
                        array2[0] = n11;
                        final int[] array3 = array[i];
                        int n12;
                        if (n10 != 0) {
                            n12 = at.getRight() + a2.rightMargin;
                        }
                        else {
                            n12 = at.getBottom() + a2.bottomMargin;
                        }
                        array3[1] = n12;
                    }
                    Arrays.sort(array, new aab(3));
                    for (int j = 1; j < ah; ++j) {
                        if (array[j - 1][1] != array[j][0]) {
                            break Label_0544;
                        }
                    }
                    final int[] array4 = array[0];
                    final int n13 = array4[1];
                    final int n14 = array4[0];
                    if (n14 > 0) {
                        break Label_0544;
                    }
                    if (array[ah - 1][1] < n13 - n14) {
                        break Label_0544;
                    }
                }
                if (h.ah() > 1) {
                    throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", c.c));
                }
            }
            for (int ah2 = h.ah(), l = 0; l < ah2; ++l) {
                if (agn.a(h.at(l))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", c.c));
        }
        float b;
        if (n9 == 0) {
            b = 0.0f;
        }
        else {
            b = c2 / (float)n9;
        }
        c.b = b;
    }
    
    public final boolean h() {
        return this.b == 0;
    }
}

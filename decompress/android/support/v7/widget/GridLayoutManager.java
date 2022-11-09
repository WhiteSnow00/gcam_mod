// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import java.util.Arrays;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;

public class GridLayoutManager extends LinearLayoutManager
{
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    qx g;
    final Rect h;
    
    public GridLayoutManager(final Context context, final AttributeSet set, int b, final int n) {
        super(context, set, b, n);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new qx();
        this.h = new Rect();
        b = se.ar(context, set, b, n).b;
        if (b == this.b) {
            return;
        }
        this.a = true;
        if (b > 0) {
            this.b = b;
            this.g.b();
            this.aM();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Span count should be at least 1. Provided ");
        sb.append(b);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private final int bq(final sk sk, final sq sq, final int n) {
        if (!sq.g) {
            return qx.c(n, this.b);
        }
        final int a = sk.a(n);
        if (a == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. ");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return qx.c(a, this.b);
    }
    
    private final int br(final sk sk, final sq sq, final int n) {
        if (!sq.g) {
            return n % this.b;
        }
        final int value = this.f.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int a = sk.a(n);
        if (a == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return a % this.b;
    }
    
    private final int bs(final sk sk, final sq sq, final int n) {
        if (!sq.g) {
            return 1;
        }
        final int value = this.e.get(n, -1);
        if (value != -1) {
            return value;
        }
        if (sk.a(n) == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
        }
        return 1;
    }
    
    private final void bt(int n) {
        final int[] c = this.c;
        final int b = this.b;
        int[] c2 = null;
        Label_0046: {
            if (c != null) {
                final int length = c.length;
                if (length == b + 1) {
                    c2 = c;
                    if (c[length - 1] == n) {
                        break Label_0046;
                    }
                }
            }
            c2 = new int[b + 1];
        }
        final int n2 = 0;
        c2[0] = 0;
        final int n3 = n / b;
        final int n4 = n % b;
        int n5 = 0;
        int i = 1;
        n = n2;
        while (i <= b) {
            n += n4;
            int n6;
            if (n > 0 && b - n < n4) {
                n6 = n3 + 1;
                n -= b;
            }
            else {
                n6 = n3;
            }
            n5 += n6;
            c2[i] = n5;
            ++i;
        }
        this.c = c2;
    }
    
    private final void bu() {
        final View[] d = this.d;
        if (d != null && d.length == this.b) {
            return;
        }
        this.d = new View[this.b];
    }
    
    private final void bv(final View view, int n, final boolean b) {
        final qw qw = (qw)view.getLayoutParams();
        final Rect d = qw.d;
        final int n2 = d.top + d.bottom + qw.topMargin + qw.bottomMargin;
        final int n3 = d.left + d.right + qw.leftMargin + qw.rightMargin;
        final int c = this.c(qw.a, qw.b);
        int n4;
        if (this.i == 1) {
            n4 = se.ai(c, n, n3, qw.width, false);
            n = se.ai(this.j.k(), super.B, n2, qw.height, true);
        }
        else {
            n = se.ai(c, n, n2, qw.height, false);
            n4 = se.ai(this.j.k(), super.A, n3, qw.width, true);
        }
        this.bw(view, n4, n, b);
    }
    
    private final void bw(final View view, final int n, final int n2, final boolean b) {
        final sf sf = (sf)view.getLayoutParams();
        final boolean b2 = true;
        int ax;
        if (b) {
            if (super.w && se.aT(view.getMeasuredWidth(), n, sf.width)) {
                if (!se.aT(view.getMeasuredHeight(), n2, sf.height)) {
                    ax = (b2 ? 1 : 0);
                }
                else {
                    ax = 0;
                }
            }
            else {
                ax = (b2 ? 1 : 0);
            }
        }
        else {
            ax = (this.aX(view, n, n2, sf) ? 1 : 0);
        }
        if (ax != 0) {
            view.measure(n, n2);
        }
    }
    
    private final void bx() {
        int n;
        if (super.i == 1) {
            n = super.C - this.ap() - this.ao();
        }
        else {
            n = super.D - this.an() - this.aq();
        }
        this.bt(n);
    }
    
    @Override
    public final int a(final sk sk, final sq sq) {
        if (this.i == 1) {
            return this.b;
        }
        if (sq.a() <= 0) {
            return 0;
        }
        return this.bq(sk, sq, sq.a() - 1) + 1;
    }
    
    @Override
    public final int b(final sk sk, final sq sq) {
        if (this.i == 0) {
            return this.b;
        }
        if (sq.a() <= 0) {
            return 0;
        }
        return this.bq(sk, sq, sq.a() - 1) + 1;
    }
    
    final int c(int n, final int n2) {
        if (this.i == 1 && this.W()) {
            final int[] c = this.c;
            n = this.b - n;
            return c[n] - c[n - n2];
        }
        final int[] c2 = this.c;
        return c2[n2 + n] - c2[n];
    }
    
    @Override
    public final int d(final int n, final sk sk, final sq sq) {
        this.bx();
        this.bu();
        return super.d(n, sk, sq);
    }
    
    @Override
    public final int e(final int n, final sk sk, final sq sq) {
        this.bx();
        this.bu();
        return super.e(n, sk, sq);
    }
    
    @Override
    public final sf f() {
        if (this.i == 0) {
            return new qw(-2, -1);
        }
        return new qw(-1, -2);
    }
    
    @Override
    public final sf g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new qw((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new qw(viewGroup$LayoutParams);
    }
    
    @Override
    public final sf h(final Context context, final AttributeSet set) {
        return new qw(context, set);
    }
    
    @Override
    public final View i(final sk sk, final sq sq, final boolean b, final boolean b2) {
        final int ah = this.ah();
        int n = -1;
        int i;
        int n2;
        if (b2) {
            i = this.ah() - 1;
            n2 = -1;
        }
        else {
            n = ah;
            i = 0;
            n2 = 1;
        }
        final int a = sq.a();
        this.N();
        final int j = this.j.j();
        final int f = this.j.f();
        View view = null;
        View view2 = null;
        while (i != n) {
            final View at = this.at(i);
            final int bd = se.bd(at);
            View view3 = null;
            View view4 = null;
            Label_0227: {
                if (bd >= 0 && bd < a) {
                    if (this.br(sk, sq, bd) != 0) {
                        view3 = view;
                        view4 = view2;
                        break Label_0227;
                    }
                    if (((sf)at.getLayoutParams()).c()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view3 = view;
                            view4 = at;
                        }
                        break Label_0227;
                    }
                    else {
                        if (this.j.d(at) < f && this.j.a(at) >= j) {
                            return at;
                        }
                        if (view == null) {
                            view3 = at;
                            view4 = view2;
                            break Label_0227;
                        }
                    }
                }
                view4 = view2;
                view3 = view;
            }
            i += n2;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }
    
    @Override
    public final View j(View view, int ah, final sk sk, final sq sq) {
        final View as = this.as(view);
        View view2 = null;
        if (as == null) {
            return null;
        }
        final qw qw = (qw)as.getLayoutParams();
        final int a = qw.a;
        final int n = qw.b + a;
        if (super.j(view, ah, sk, sq) == null) {
            return null;
        }
        int n2;
        int n3;
        if (this.D(ah) == 1 != this.k) {
            n2 = this.ah() - 1;
            ah = -1;
            n3 = -1;
        }
        else {
            ah = this.ah();
            n2 = 0;
            n3 = 1;
        }
        final boolean b = this.i == 1 && this.W();
        final int bq = this.bq(sk, sq, n2);
        int i = n2;
        int a2 = -1;
        final int n4 = 0;
        int n5 = 0;
        int a3 = -1;
        View view3 = null;
        final int n6 = bq;
        final int n7 = ah;
        ah = n4;
        view = as;
        while (i != n7) {
            final int bq2 = this.bq(sk, sq, i);
            final View at = this.at(i);
            if (at == view) {
                break;
            }
            Label_0538: {
                if (at.hasFocusable() && bq2 != n6) {
                    if (view2 != null) {
                        break;
                    }
                }
                else {
                    final qw qw2 = (qw)at.getLayoutParams();
                    final int a4 = qw2.a;
                    final int n8 = qw2.b + a4;
                    if (at.hasFocusable() && a4 == a && n8 == n) {
                        return at;
                    }
                    Label_0469: {
                        if (!at.hasFocusable() || view2 != null) {
                            if (at.hasFocusable() || view3 != null) {
                                final int n9 = Math.min(n8, n) - Math.max(a4, a);
                                if (at.hasFocusable()) {
                                    if (n9 <= ah && (n9 != ah || b != a4 > a3)) {
                                        break Label_0538;
                                    }
                                }
                                else {
                                    if (view2 == null) {
                                        if (!super.r.b(at) || !super.s.b(at)) {
                                            if (n9 > n5) {
                                                break Label_0469;
                                            }
                                            if (n9 == n5) {
                                                if (b == a4 > a2) {
                                                    break Label_0469;
                                                }
                                            }
                                        }
                                    }
                                    break Label_0538;
                                }
                            }
                        }
                    }
                    if (at.hasFocusable()) {
                        a3 = qw2.a;
                        ah = Math.min(n8, n) - Math.max(a4, a);
                        view2 = at;
                    }
                    else {
                        a2 = qw2.a;
                        n5 = Math.min(n8, n) - Math.max(a4, a);
                        view3 = at;
                    }
                }
            }
            i += n3;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }
    
    @Override
    public final void k(final sk sk, final sq sq, final rc rc, final rb rb) {
        final int i = this.j.i();
        int n;
        if (this.ah() > 0) {
            n = this.c[this.b];
        }
        else {
            n = 0;
        }
        if (i != 1073741824) {
            this.bx();
        }
        final int e = rc.e;
        int b = this.b;
        int n2;
        if (e != 1) {
            b = this.br(sk, sq, rc.d) + this.bs(sk, sq, rc.d);
            n2 = 0;
        }
        else {
            n2 = 0;
        }
        while (n2 < this.b && rc.d(sq) && b > 0) {
            final int d = rc.d;
            final int bs = this.bs(sk, sq, d);
            if (bs > this.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(d);
                sb.append(" requires ");
                sb.append(bs);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.b);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
            b -= bs;
            if (b < 0) {
                break;
            }
            final View a = rc.a(sk);
            if (a == null) {
                break;
            }
            this.d[n2] = a;
            ++n2;
        }
        if (n2 != 0) {
            int n3;
            int j;
            int n4;
            if (e == 1) {
                n3 = n2;
                j = 0;
                n4 = 1;
            }
            else {
                j = n2 - 1;
                n3 = -1;
                n4 = -1;
            }
            int a2 = 0;
            while (j != n3) {
                final View view = this.d[j];
                final qw qw = (qw)view.getLayoutParams();
                final int bs2 = this.bs(sk, sq, se.bd(view));
                qw.b = bs2;
                qw.a = a2;
                a2 += bs2;
                j += n4;
            }
            float n5 = 0.0f;
            int k = 0;
            int n6 = 0;
            while (k < n2) {
                final View view2 = this.d[k];
                if (rc.l == null) {
                    if (e == 1) {
                        this.ax(view2);
                    }
                    else {
                        this.ay(view2, 0);
                    }
                }
                else if (e == 1) {
                    this.av(view2);
                }
                else {
                    this.aw(view2, 0);
                }
                this.az(view2, this.h);
                this.bv(view2, i, false);
                final int b2 = this.j.b(view2);
                int n7 = n6;
                if (b2 > n6) {
                    n7 = b2;
                }
                final float n8 = this.j.c(view2) / (float)((qw)view2.getLayoutParams()).b;
                float n9 = n5;
                if (n8 > n5) {
                    n9 = n8;
                }
                ++k;
                n5 = n9;
                n6 = n7;
            }
            int a3 = n6;
            if (i != 1073741824) {
                this.bt(Math.max(Math.round(n5 * this.b), n));
                int n10 = 0;
                int n11 = 0;
                while (true) {
                    a3 = n10;
                    if (n11 >= n2) {
                        break;
                    }
                    final View view3 = this.d[n11];
                    this.bv(view3, 1073741824, true);
                    final int b3 = this.j.b(view3);
                    int n12;
                    if (b3 > (n12 = n10)) {
                        n12 = b3;
                    }
                    ++n11;
                    n10 = n12;
                }
            }
            for (int l = 0; l < n2; ++l) {
                final View view4 = this.d[l];
                if (this.j.b(view4) != a3) {
                    final qw qw2 = (qw)view4.getLayoutParams();
                    final Rect d2 = qw2.d;
                    final int n13 = d2.top + d2.bottom + qw2.topMargin + qw2.bottomMargin;
                    final int n14 = d2.left + d2.right + qw2.leftMargin + qw2.rightMargin;
                    final int c = this.c(qw2.a, qw2.b);
                    int n15;
                    int n16;
                    if (this.i == 1) {
                        n15 = se.ai(c, 1073741824, n14, qw2.width, false);
                        n16 = View$MeasureSpec.makeMeasureSpec(a3 - n13, 1073741824);
                    }
                    else {
                        n15 = View$MeasureSpec.makeMeasureSpec(a3 - n14, 1073741824);
                        n16 = se.ai(c, 1073741824, n13, qw2.height, false);
                    }
                    this.bw(view4, n15, n16, true);
                }
            }
            rb.a = a3;
            int b4;
            int b5;
            int n17;
            int b6;
            if (this.i == 1) {
                if (rc.f == -1) {
                    b4 = rc.b;
                    b5 = b4 - a3;
                    n17 = 0;
                    b6 = 0;
                }
                else {
                    b5 = rc.b;
                    b4 = b5 + a3;
                    n17 = 0;
                    b6 = 0;
                }
            }
            else if (rc.f == -1) {
                b6 = rc.b;
                n17 = b6 - a3;
                b5 = 0;
                b4 = 0;
            }
            else {
                final int b7 = rc.b;
                b4 = 0;
                b6 = b7 + a3;
                final int n18 = 0;
                n17 = b7;
                b5 = n18;
            }
            final int n19 = 0;
            int n20 = b6;
            int n21 = n19;
            int n22 = n17;
            int n23 = b4;
            int n24 = b5;
            while (n21 < n2) {
                final View view5 = this.d[n21];
                final qw qw3 = (qw)view5.getLayoutParams();
                int n26;
                int n27;
                if (this.i == 1) {
                    if (this.W()) {
                        final int n25 = this.ao() + this.c[this.b - qw3.a];
                        final int c2 = this.j.c(view5);
                        n26 = n25;
                        n27 = n25 - c2;
                    }
                    else {
                        n27 = this.ao() + this.c[qw3.a];
                        n26 = this.j.c(view5) + n27;
                    }
                }
                else {
                    n24 = this.aq() + this.c[qw3.a];
                    n23 = this.j.c(view5) + n24;
                    n26 = n20;
                    n27 = n22;
                }
                se.bh(view5, n27, n24, n26, n23);
                if (qw3.c() || qw3.b()) {
                    rb.c = true;
                }
                rb.d |= view5.hasFocusable();
                ++n21;
                n22 = n27;
                n20 = n26;
            }
            Arrays.fill(this.d, null);
            return;
        }
        rb.b = true;
    }
    
    @Override
    public final void l(final sk sk, final sq sq, final ra ra, int b) {
        this.bx();
        if (sq.a() > 0 && !sq.g) {
            int i = this.br(sk, sq, ra.b);
            if (b == 1) {
                while (i > 0) {
                    b = ra.b;
                    if (b <= 0) {
                        break;
                    }
                    --b;
                    ra.b = b;
                    i = this.br(sk, sq, b);
                }
            }
            else {
                final int a = sq.a();
                int j = ra.b;
                b = i;
                while (j < a - 1) {
                    final int n = j + 1;
                    final int br = this.br(sk, sq, n);
                    if (br <= b) {
                        break;
                    }
                    j = n;
                    b = br;
                }
                ra.b = j;
            }
        }
        this.bu();
    }
    
    @Override
    public final void m(final sk sk, final sq sq, final View view, final jc jc) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof qw)) {
            super.aF(view, jc);
            return;
        }
        final qw qw = (qw)layoutParams;
        final int bq = this.bq(sk, sq, qw.a());
        if (this.i == 0) {
            jc.g(jb.a(qw.a, qw.b, bq, 1, false));
            return;
        }
        jc.g(jb.a(bq, 1, qw.a, qw.b, false));
    }
    
    @Override
    public final void n(final sk sk, final sq sq) {
        if (sq.g) {
            for (int ah = this.ah(), i = 0; i < ah; ++i) {
                final qw qw = (qw)this.at(i).getLayoutParams();
                final int a = qw.a();
                this.e.put(a, qw.b);
                this.f.put(a, qw.a);
            }
        }
        super.n(sk, sq);
        this.e.clear();
        this.f.clear();
    }
    
    @Override
    public final void o(final sq sq) {
        super.o(sq);
        this.a = false;
    }
    
    @Override
    public final void p(final Rect rect, int n, int n2) {
        if (this.c == null) {
            super.p(rect, n, n2);
        }
        final int n3 = this.ao() + this.ap();
        final int n4 = this.aq() + this.an();
        if (this.i == 1) {
            n2 = se.ag(n2, rect.height() + n4, this.al());
            final int[] c = this.c;
            n = se.ag(n, c[c.length - 1] + n3, this.am());
        }
        else {
            n = se.ag(n, rect.width() + n3, this.am());
            final int[] c2 = this.c;
            n2 = se.ag(n2, c2[c2.length - 1] + n4, this.al());
        }
        this.aP(n, n2);
    }
    
    @Override
    public final void q(final boolean b) {
        if (!b) {
            super.q(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    
    @Override
    public final boolean r(final sf sf) {
        return sf instanceof qw;
    }
    
    @Override
    public final boolean s() {
        return this.n == null && !this.a;
    }
    
    @Override
    public final void t(final sq sq, final rc rc, final qt qt) {
        for (int b = this.b, n = 0; n < this.b && rc.d(sq) && b > 0; --b, rc.d += rc.e, ++n) {
            qt.a(rc.d, Math.max(0, rc.g));
        }
    }
    
    @Override
    public final void u(final int n, final int n2) {
        this.g.b();
        this.g.a();
    }
    
    @Override
    public final void v(final int n, final int n2) {
        this.g.b();
        this.g.a();
    }
    
    @Override
    public final void w(final int n, final int n2) {
        this.g.b();
        this.g.a();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import java.util.ArrayList;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.graphics.PointF;
import java.util.List;
import java.util.Arrays;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.BitSet;
import android.graphics.Rect;

public class StaggeredGridLayoutManager extends se implements so
{
    private boolean E;
    private tg F;
    private final Rect G;
    private final tc H;
    private boolean I;
    private int[] J;
    private final Runnable K;
    th[] a;
    public rp b;
    rp c;
    public boolean d;
    boolean e;
    int f;
    int g;
    tf h;
    private int i;
    private int j;
    private int k;
    private final qy l;
    private BitSet m;
    private int n;
    private boolean o;
    
    public StaggeredGridLayoutManager(final Context context, final AttributeSet set, int i, final int n) {
        this.i = -1;
        final int n2 = 0;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.h = new tf();
        this.n = 2;
        this.G = new Rect();
        this.H = new tc(this);
        this.I = true;
        this.K = new tb(this);
        final sd ar = se.ar(context, set, i, n);
        i = ar.a;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.L(null);
        if (i != this.j) {
            this.j = i;
            final rp b = this.b;
            this.b = this.c;
            this.c = b;
            this.aM();
        }
        i = ar.b;
        this.L(null);
        if (i != this.i) {
            this.h.a();
            this.aM();
            this.i = i;
            this.m = new BitSet(i);
            this.a = new th[this.i];
            for (i = n2; i < this.i; ++i) {
                this.a[i] = new th(this, i);
            }
            this.aM();
        }
        this.E(ar.c);
        this.l = new qy();
        this.b = rp.q(this, this.j);
        this.c = rp.q(this, 1 - this.j);
    }
    
    private final int M(final int n) {
        if (this.ah() == 0) {
            if (this.e) {
                return 1;
            }
            return -1;
        }
        else {
            if (n < this.c() != this.e) {
                return -1;
            }
            return 1;
        }
    }
    
    private final int N(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        return aah.c(sq, this.b, this.q(this.I ^ true), this.l(this.I ^ true), this, this.I);
    }
    
    private final int R(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        return aah.d(sq, this.b, this.q(this.I ^ true), this.l(this.I ^ true), this, this.I, this.e);
    }
    
    private final int S(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        return aah.e(sq, this.b, this.q(this.I ^ true), this.l(this.I ^ true), this, this.I);
    }
    
    private final int W(final sk sk, final qy qy, final sq sq) {
        this.m.set(0, this.i, true);
        int n;
        if (this.l.i) {
            if (qy.e == 1) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = Integer.MIN_VALUE;
            }
        }
        else if (qy.e == 1) {
            n = qy.g + qy.b;
        }
        else {
            n = qy.f - qy.b;
        }
        final int e = qy.e;
        for (int i = 0; i < this.i; ++i) {
            if (!this.a[i].a.isEmpty()) {
                this.by(this.a[i], e, n);
            }
        }
        int n2;
        if (this.e) {
            n2 = this.b.f();
        }
        else {
            n2 = this.b.j();
        }
        boolean b = false;
        while (qy.a(sq) && (this.l.i || !this.m.isEmpty())) {
            final View c = sk.c(qy.c);
            qy.c += qy.d;
            final td td = (td)c.getLayoutParams();
            final int a = td.a();
            final int[] a2 = this.h.a;
            int n3;
            if (a2 != null) {
                if (a >= a2.length) {
                    n3 = -1;
                }
                else {
                    n3 = a2[a];
                }
            }
            else {
                n3 = -1;
            }
            th a3;
            if (n3 == -1) {
                final boolean b2 = td.b;
                int n4;
                int j;
                int n5;
                if (this.bz(qy.e)) {
                    n4 = this.i - 1;
                    j = -1;
                    n5 = -1;
                }
                else {
                    j = this.i;
                    n4 = 0;
                    n5 = 1;
                }
                final int e2 = qy.e;
                final th th = null;
                a3 = null;
                if (e2 == 1) {
                    final int k = this.b.j();
                    final int n6 = Integer.MAX_VALUE;
                    int l = n4;
                    int n7 = n6;
                    while (l != j) {
                        final th th2 = this.a[l];
                        final int d = th2.d(k);
                        int n8;
                        if (d < n7) {
                            n8 = d;
                        }
                        else {
                            n8 = n7;
                        }
                        if (d < n7) {
                            a3 = th2;
                        }
                        l += n5;
                        n7 = n8;
                    }
                }
                else {
                    final int f = this.b.f();
                    final int n9 = Integer.MIN_VALUE;
                    a3 = th;
                    int n10 = n4;
                    int n11 = n9;
                    while (n10 != j) {
                        final th th3 = this.a[n10];
                        final int f2 = th3.f(f);
                        int n12;
                        if (f2 > n11) {
                            n12 = f2;
                        }
                        else {
                            n12 = n11;
                        }
                        if (f2 > n11) {
                            a3 = th3;
                        }
                        n10 += n5;
                        n11 = n12;
                    }
                }
                final tf h = this.h;
                h.b(a);
                h.a[a] = a3.e;
            }
            else {
                a3 = this.a[n3];
            }
            td.a = a3;
            if (qy.e == 1) {
                this.ax(c);
            }
            else {
                this.ay(c, 0);
            }
            final boolean b3 = td.b;
            if (this.j == 1) {
                this.bA(c, se.ai(this.k, super.A, 0, td.width, false), se.ai(super.D, super.B, this.aq() + this.an(), td.height, true));
            }
            else {
                this.bA(c, se.ai(super.C, super.A, this.ao() + this.ap(), td.width, true), se.ai(this.k, super.B, 0, td.height, false));
            }
            int d2;
            int n14;
            if (qy.e == 1) {
                final boolean b4 = td.b;
                d2 = a3.d(n2);
                final int n13 = this.b.b(c) + d2;
                if (n3 == -1) {
                    final boolean b5 = td.b;
                    n14 = n13;
                }
                else {
                    n14 = n13;
                }
            }
            else {
                final boolean b6 = td.b;
                final int f3 = a3.f(n2);
                d2 = f3 - this.b.b(c);
                if (n3 == -1) {
                    final boolean b7 = td.b;
                    n14 = f3;
                }
                else {
                    n14 = f3;
                }
            }
            final boolean b8 = td.b;
            if (qy.e == 1) {
                final th a4 = td.a;
                final td n15 = th.n(c);
                n15.a = a4;
                a4.a.add(c);
                a4.c = Integer.MIN_VALUE;
                if (a4.a.size() == 1) {
                    a4.b = Integer.MIN_VALUE;
                }
                if (n15.c() || n15.b()) {
                    a4.d += a4.f.b.b(c);
                }
            }
            else {
                final th a5 = td.a;
                final td n16 = th.n(c);
                n16.a = a5;
                a5.a.add(0, c);
                a5.b = Integer.MIN_VALUE;
                if (a5.a.size() == 1) {
                    a5.c = Integer.MIN_VALUE;
                }
                if (n16.c() || n16.b()) {
                    a5.d += a5.f.b.b(c);
                }
            }
            int n17;
            int n18;
            if (this.J() && this.j == 1) {
                final boolean b9 = td.b;
                n17 = this.c.f() - (this.i - 1 - a3.e) * this.k;
                n18 = n17 - this.c.b(c);
            }
            else {
                final boolean b10 = td.b;
                n18 = this.c.j() + a3.e * this.k;
                n17 = this.c.b(c) + n18;
            }
            if (this.j == 1) {
                se.bh(c, n18, d2, n17, n14);
            }
            else {
                se.bh(c, d2, n18, n14, n17);
            }
            final boolean b11 = td.b;
            this.by(a3, this.l.e, n);
            this.bs(sk, this.l);
            if (this.l.h && c.hasFocusable()) {
                final boolean b12 = td.b;
                this.m.set(a3.e, false);
            }
            b = true;
        }
        if (!b) {
            this.bs(sk, this.l);
        }
        int n19;
        if (this.l.e == -1) {
            n19 = this.b.j() - this.ab(this.b.j());
        }
        else {
            n19 = this.X(this.b.f()) - this.b.f();
        }
        if (n19 > 0) {
            return Math.min(qy.b, n19);
        }
        return 0;
    }
    
    private final int X(final int n) {
        int d = this.a[0].d(n);
        int n2;
        for (int i = 1; i < this.i; ++i, d = n2) {
            final int d2 = this.a[i].d(n);
            if (d2 > (n2 = d)) {
                n2 = d2;
            }
        }
        return d;
    }
    
    private final int ab(final int n) {
        int f = this.a[0].f(n);
        int n2;
        for (int i = 1; i < this.i; ++i, f = n2) {
            final int f2 = this.a[i].f(n);
            if (f2 < (n2 = f)) {
                n2 = f2;
            }
        }
        return f;
    }
    
    private final void ac(final sk sk, final sq sq, final boolean b) {
        final int x = this.X(Integer.MIN_VALUE);
        if (x == Integer.MIN_VALUE) {
            return;
        }
        final int n = this.b.f() - x;
        if (n > 0) {
            final int n2 = n - -this.k(-n, sk, sq);
            if (b && n2 > 0) {
                this.b.n(n2);
            }
        }
    }
    
    private final void ad(final sk sk, final sq sq, final boolean b) {
        final int ab = this.ab(Integer.MAX_VALUE);
        if (ab == Integer.MAX_VALUE) {
            return;
        }
        final int n = ab - this.b.j();
        if (n > 0) {
            final int n2 = n - this.k(n, sk, sq);
            if (b && n2 > 0) {
                this.b.n(-n2);
            }
        }
    }
    
    private final void bA(final View view, int bb, int bb2) {
        this.az(view, this.G);
        final td td = (td)view.getLayoutParams();
        bb = bB(bb, td.leftMargin + this.G.left, td.rightMargin + this.G.right);
        bb2 = bB(bb2, td.topMargin + this.G.top, td.bottomMargin + this.G.bottom);
        if (this.aX(view, bb, bb2, td)) {
            view.measure(bb, bb2);
        }
    }
    
    private static final int bB(final int n, int mode, final int n2) {
        int n3 = mode;
        if (mode == 0) {
            if (n2 == 0) {
                return n;
            }
            n3 = 0;
        }
        mode = View$MeasureSpec.getMode(n);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return n;
        }
        return View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(n) - n3 - n2), mode);
    }
    
    private final void bq(final int n, int n2, int i) {
        int n3;
        if (this.e) {
            n3 = this.i();
        }
        else {
            n3 = this.c();
        }
        final int n4 = n + n2;
        final tf h = this.h;
        final int[] a = h.a;
        if (a != null) {
            if (n < a.length) {
                final List b = h.b;
                int a2 = 0;
                Label_0251: {
                    if (b != null) {
                        while (true) {
                            for (int j = b.size() - 1; j >= 0; --j) {
                                final te te = h.b.get(j);
                                if (te.a == n) {
                                    if (te != null) {
                                        h.b.remove(te);
                                    }
                                    final int size = h.b.size();
                                    int k = 0;
                                    while (true) {
                                        while (k < size) {
                                            final int n5 = k;
                                            if (((te)h.b.get(k)).a < n) {
                                                ++k;
                                            }
                                            else {
                                                if (n5 != -1) {
                                                    final te te2 = h.b.get(n5);
                                                    h.b.remove(n5);
                                                    a2 = te2.a;
                                                    break Label_0251;
                                                }
                                                a2 = -1;
                                                break Label_0251;
                                            }
                                        }
                                        final int n5 = -1;
                                        continue;
                                    }
                                }
                            }
                            final te te = null;
                            continue;
                        }
                    }
                    a2 = -1;
                }
                if (a2 == -1) {
                    final int[] a3 = h.a;
                    Arrays.fill(a3, n, a3.length, -1);
                    final int length = h.a.length;
                }
                else {
                    Arrays.fill(h.a, n, Math.min(a2 + 1, h.a.length), -1);
                }
            }
        }
        switch (i) {
            case 2: {
                final tf h2 = this.h;
                final int[] a4 = h2.a;
                if (a4 == null || n >= a4.length) {
                    break;
                }
                h2.b(n4);
                final int[] a5 = h2.a;
                System.arraycopy(a5, n4, a5, n, a5.length - n - n2);
                final int[] a6 = h2.a;
                i = a6.length;
                Arrays.fill(a6, i - n2, i, -1);
                final List b2 = h2.b;
                if (b2 != null) {
                    te te3;
                    int a7;
                    for (i = b2.size() - 1; i >= 0; --i) {
                        te3 = h2.b.get(i);
                        a7 = te3.a;
                        if (a7 >= n) {
                            if (a7 < n4) {
                                h2.b.remove(i);
                            }
                            else {
                                te3.a = a7 - n2;
                            }
                        }
                    }
                    break;
                }
                break;
            }
            case 1: {
                final tf h3 = this.h;
                final int[] a8 = h3.a;
                if (a8 == null || n >= a8.length) {
                    break;
                }
                h3.b(n4);
                final int[] a9 = h3.a;
                System.arraycopy(a9, n, a9, n4, a9.length - n - n2);
                Arrays.fill(h3.a, n, n4, -1);
                final List b3 = h3.b;
                if (b3 != null) {
                    te te4;
                    int a10;
                    for (i = b3.size() - 1; i >= 0; --i) {
                        te4 = h3.b.get(i);
                        a10 = te4.a;
                        if (a10 >= n) {
                            te4.a = a10 + n2;
                        }
                    }
                    break;
                }
                break;
            }
        }
        if (n4 <= n3) {
            return;
        }
        if (this.e) {
            n2 = this.c();
        }
        else {
            n2 = this.i();
        }
        if (n <= n2) {
            this.aM();
        }
    }
    
    private final void br(final sk sk, final sq sq, final boolean b) {
        final tc h = this.H;
        if ((this.F == null && this.f == -1) || sq.a() != 0) {
            final boolean e = h.e;
            final int n = 1;
            final boolean b2 = !e || this.f != -1 || this.F != null;
            if (b2) {
                h.a();
                final tg f = this.F;
                if (f != null) {
                    final int c = f.c;
                    if (c > 0) {
                        if (c == this.i) {
                            for (int i = 0; i < this.i; ++i) {
                                this.a[i].j();
                                final tg f2 = this.F;
                                int n2 = f2.d[i];
                                if (n2 != Integer.MIN_VALUE) {
                                    if (f2.i) {
                                        n2 += this.b.f();
                                    }
                                    else {
                                        n2 += this.b.j();
                                    }
                                }
                                this.a[i].l(n2);
                            }
                        }
                        else {
                            f.b();
                            final tg f3 = this.F;
                            f3.a = f3.b;
                        }
                    }
                    final tg f4 = this.F;
                    this.E = f4.j;
                    this.E(f4.h);
                    this.bv();
                    final tg f5 = this.F;
                    final int a = f5.a;
                    if (a != -1) {
                        this.f = a;
                        h.c = f5.i;
                    }
                    else {
                        h.c = this.e;
                    }
                    if (f5.e > 1) {
                        final tf h2 = this.h;
                        h2.a = f5.f;
                        h2.b = f5.g;
                    }
                }
                else {
                    this.bv();
                    h.c = this.e;
                }
                Label_1018: {
                    if (!sq.g) {
                        final int f6 = this.f;
                        if (f6 != -1) {
                            if (f6 >= 0 && f6 < sq.a()) {
                                final tg f7 = this.F;
                                if (f7 != null && f7.a != -1 && f7.c > 0) {
                                    h.b = Integer.MIN_VALUE;
                                    h.a = this.f;
                                    break Label_1018;
                                }
                                final View k = this.K(this.f);
                                if (k == null) {
                                    final int f8 = this.f;
                                    h.a = f8;
                                    final int g = this.g;
                                    if (g == Integer.MIN_VALUE) {
                                        final boolean c2 = this.M(f8) == 1;
                                        h.c = c2;
                                        int b3;
                                        if (c2) {
                                            b3 = h.g.b.f();
                                        }
                                        else {
                                            b3 = h.g.b.j();
                                        }
                                        h.b = b3;
                                    }
                                    else if (h.c) {
                                        h.b = h.g.b.f() - g;
                                    }
                                    else {
                                        h.b = h.g.b.j() + g;
                                    }
                                    h.d = true;
                                    break Label_1018;
                                }
                                int a2;
                                if (this.e) {
                                    a2 = this.i();
                                }
                                else {
                                    a2 = this.c();
                                }
                                h.a = a2;
                                if (this.g != Integer.MIN_VALUE) {
                                    if (h.c) {
                                        h.b = this.b.f() - this.g - this.b.a(k);
                                        break Label_1018;
                                    }
                                    h.b = this.b.j() + this.g - this.b.d(k);
                                    break Label_1018;
                                }
                                else {
                                    if (this.b.b(k) > this.b.k()) {
                                        int b4;
                                        if (h.c) {
                                            b4 = this.b.f();
                                        }
                                        else {
                                            b4 = this.b.j();
                                        }
                                        h.b = b4;
                                        break Label_1018;
                                    }
                                    final int n3 = this.b.d(k) - this.b.j();
                                    if (n3 < 0) {
                                        h.b = -n3;
                                        break Label_1018;
                                    }
                                    final int b5 = this.b.f() - this.b.a(k);
                                    if (b5 < 0) {
                                        h.b = b5;
                                        break Label_1018;
                                    }
                                    h.b = Integer.MIN_VALUE;
                                    break Label_1018;
                                }
                            }
                            else {
                                this.f = -1;
                                this.g = Integer.MIN_VALUE;
                            }
                        }
                    }
                    int a4 = 0;
                    Label_1004: {
                        if (this.o) {
                            final int a3 = sq.a();
                            for (int j = this.ah() - 1; j >= 0; --j) {
                                final int bd = se.bd(this.at(j));
                                if (bd >= 0 && bd < a3) {
                                    a4 = bd;
                                    break Label_1004;
                                }
                            }
                            a4 = 0;
                        }
                        else {
                            final int a5 = sq.a();
                            for (int ah = this.ah(), l = 0; l < ah; ++l) {
                                final int bd2 = se.bd(this.at(l));
                                if (bd2 >= 0 && bd2 < a5) {
                                    a4 = bd2;
                                    break Label_1004;
                                }
                            }
                            a4 = 0;
                        }
                    }
                    h.a = a4;
                    h.b = Integer.MIN_VALUE;
                }
                h.e = true;
            }
            if (this.F == null && this.f == -1 && (h.c != this.o || this.J() != this.E)) {
                this.h.a();
                h.d = true;
            }
            Label_1482: {
                if (this.ah() > 0) {
                    final tg f9 = this.F;
                    if (f9 == null || f9.c <= 0) {
                        if (h.d) {
                            for (int n4 = 0; n4 < this.i; ++n4) {
                                this.a[n4].j();
                                final int b6 = h.b;
                                if (b6 != Integer.MIN_VALUE) {
                                    this.a[n4].l(b6);
                                }
                            }
                        }
                        else {
                            int n6;
                            if (!b2) {
                                if (this.H.f != null) {
                                    for (int n5 = 0; n5 < this.i; ++n5) {
                                        final th th = this.a[n5];
                                        th.j();
                                        th.l(this.H.f[n5]);
                                    }
                                    break Label_1482;
                                }
                                n6 = 0;
                            }
                            else {
                                n6 = 0;
                            }
                            while (n6 < this.i) {
                                final th th2 = this.a[n6];
                                final boolean e2 = this.e;
                                final int b7 = h.b;
                                int n7;
                                if (e2) {
                                    n7 = th2.d(Integer.MIN_VALUE);
                                }
                                else {
                                    n7 = th2.f(Integer.MIN_VALUE);
                                }
                                th2.j();
                                if (n7 != Integer.MIN_VALUE) {
                                    if ((!e2 || n7 >= th2.f.b.f()) && (e2 || n7 <= th2.f.b.j())) {
                                        int n8 = n7;
                                        if (b7 != Integer.MIN_VALUE) {
                                            n8 = n7 + b7;
                                        }
                                        th2.c = n8;
                                        th2.b = n8;
                                    }
                                }
                                ++n6;
                            }
                            final tc h3 = this.H;
                            final th[] a6 = this.a;
                            final int length = a6.length;
                            final int[] f10 = h3.f;
                            int n9;
                            if (f10 != null && f10.length >= length) {
                                n9 = 0;
                            }
                            else {
                                h3.f = new int[h3.g.a.length];
                                n9 = 0;
                            }
                            while (n9 < length) {
                                h3.f[n9] = a6[n9].f(Integer.MIN_VALUE);
                                ++n9;
                            }
                        }
                    }
                }
            }
            this.aA(sk);
            this.l.a = false;
            this.F(this.c.k());
            this.bx(h.a, sq);
            if (h.c) {
                this.bw(-1);
                this.W(sk, this.l, sq);
                this.bw(1);
                final qy m = this.l;
                m.c = h.a + m.d;
                this.W(sk, m, sq);
            }
            else {
                this.bw(1);
                this.W(sk, this.l, sq);
                this.bw(-1);
                final qy l2 = this.l;
                l2.c = h.a + l2.d;
                this.W(sk, l2, sq);
            }
            if (this.c.h() != 1073741824) {
                final int ah2 = this.ah();
                float n10 = 0.0f;
                float max;
                for (int n11 = 0; n11 < ah2; ++n11, n10 = max) {
                    final View at = this.at(n11);
                    final float n12 = (float)this.c.b(at);
                    max = n10;
                    if (n12 >= n10) {
                        final td td = (td)at.getLayoutParams();
                        max = Math.max(n10, n12);
                    }
                }
                final int k2 = this.k;
                int n13 = Math.round(n10 * this.i);
                if (this.c.h() == Integer.MIN_VALUE) {
                    n13 = Math.min(n13, this.c.k());
                }
                this.F(n13);
                if (this.k != k2) {
                    for (int n14 = 0; n14 < ah2; ++n14) {
                        final View at2 = this.at(n14);
                        final td td2 = (td)at2.getLayoutParams();
                        final boolean b8 = td2.b;
                        if (this.J() && this.j == 1) {
                            final int n15 = -(this.i - 1 - td2.a.e);
                            at2.offsetLeftAndRight(this.k * n15 - n15 * k2);
                        }
                        else {
                            final int e3 = td2.a.e;
                            final int n16 = this.k * e3;
                            final int n17 = e3 * k2;
                            if (this.j == 1) {
                                at2.offsetLeftAndRight(n16 - n17);
                            }
                            else {
                                at2.offsetTopAndBottom(n16 - n17);
                            }
                        }
                    }
                }
            }
            if (this.ah() > 0) {
                if (this.e) {
                    this.ac(sk, sq, true);
                    this.ad(sk, sq, false);
                }
                else {
                    this.ad(sk, sq, true);
                    this.ac(sk, sq, false);
                }
            }
            int n18 = 0;
            Label_2045: {
                if (b && !sq.g && this.n != 0 && this.ah() > 0 && this.t() != null) {
                    this.bk(this.K);
                    if (this.G()) {
                        n18 = n;
                        break Label_2045;
                    }
                }
                n18 = 0;
            }
            if (sq.g) {
                this.H.a();
            }
            this.o = h.c;
            this.E = this.J();
            if (n18 != 0) {
                this.H.a();
                this.br(sk, sq, false);
            }
            return;
        }
        this.aH(sk);
        h.a();
    }
    
    private final void bs(final sk sk, final qy qy) {
        if (!qy.a || qy.i) {
            return;
        }
        if (qy.b == 0) {
            if (qy.e == -1) {
                this.bt(sk, qy.g);
                return;
            }
            this.bu(sk, qy.f);
        }
        else {
            final int e = qy.e;
            final int n = 1;
            int i = 1;
            if (e == -1) {
                final int f = qy.f;
                int f2 = this.a[0].f(f);
                while (i < this.i) {
                    final int f3 = this.a[i].f(f);
                    int n2;
                    if (f3 > (n2 = f2)) {
                        n2 = f3;
                    }
                    ++i;
                    f2 = n2;
                }
                final int n3 = f - f2;
                int g;
                if (n3 < 0) {
                    g = qy.g;
                }
                else {
                    g = qy.g - Math.min(n3, qy.b);
                }
                this.bt(sk, g);
                return;
            }
            final int g2 = qy.g;
            final int d = this.a[0].d(g2);
            int j = n;
            int n4 = d;
            while (j < this.i) {
                final int d2 = this.a[j].d(g2);
                int n5;
                if (d2 < (n5 = n4)) {
                    n5 = d2;
                }
                ++j;
                n4 = n5;
            }
            final int n6 = n4 - qy.g;
            int f4;
            if (n6 < 0) {
                f4 = qy.f;
            }
            else {
                f4 = Math.min(n6, qy.b) + qy.f;
            }
            this.bu(sk, f4);
        }
    }
    
    private final void bt(final sk sk, final int n) {
        for (int i = this.ah() - 1; i >= 0; --i) {
            final View at = this.at(i);
            if (this.b.d(at) < n || this.b.m(at) < n) {
                break;
            }
            final td td = (td)at.getLayoutParams();
            final boolean b = td.b;
            if (td.a.a.size() == 1) {
                return;
            }
            final th a = td.a;
            final int size = a.a.size();
            final View view = a.a.remove(size - 1);
            final td n2 = th.n(view);
            n2.a = null;
            if (n2.c() || n2.b()) {
                a.d -= a.f.b.b(view);
            }
            if (size == 1) {
                a.b = Integer.MIN_VALUE;
            }
            a.c = Integer.MIN_VALUE;
            this.aJ(at, sk);
        }
    }
    
    private final void bu(final sk sk, final int n) {
        while (this.ah() > 0) {
            final View at = this.at(0);
            if (this.b.a(at) > n || this.b.l(at) > n) {
                break;
            }
            final td td = (td)at.getLayoutParams();
            final boolean b = td.b;
            if (td.a.a.size() == 1) {
                return;
            }
            final th a = td.a;
            final View view = a.a.remove(0);
            final td n2 = th.n(view);
            n2.a = null;
            if (a.a.size() == 0) {
                a.c = Integer.MIN_VALUE;
            }
            if (n2.c() || n2.b()) {
                a.d -= a.f.b.b(view);
            }
            a.b = Integer.MIN_VALUE;
            this.aJ(at, sk);
        }
    }
    
    private final void bv() {
        boolean d;
        if (this.j != 1 && this.J()) {
            d = (this.d ^ true);
        }
        else {
            d = this.d;
        }
        this.e = d;
    }
    
    private final void bw(int n) {
        final qy l = this.l;
        l.e = n;
        final boolean e = this.e;
        final int n2 = 1;
        if (e == (n == -1)) {
            n = n2;
        }
        else {
            n = -1;
        }
        l.d = n;
    }
    
    private final void bx(int k, final sq sq) {
        final qy l = this.l;
        final boolean b = false;
        l.b = 0;
        l.c = k;
        int i = 0;
        Label_0098: {
            if (this.aU()) {
                final int a = sq.a;
                if (a != -1) {
                    if (this.e == a < k) {
                        k = this.b.k();
                        i = 0;
                        break Label_0098;
                    }
                    i = this.b.k();
                    k = 0;
                    break Label_0098;
                }
            }
            k = 0;
            i = 0;
        }
        final RecyclerView q = super.q;
        if (q != null && q.h) {
            this.l.f = this.b.j() - i;
            this.l.g = this.b.f() + k;
        }
        else {
            this.l.g = this.b.e() + k;
            this.l.f = -i;
        }
        final qy j = this.l;
        j.h = false;
        j.a = true;
        j.i = ((this.b.h() == 0 && this.b.e() == 0) || b);
    }
    
    private final void by(final th th, final int n, final int n2) {
        final int d = th.d;
        if (n == -1) {
            if (th.e() + d <= n2) {
                this.m.set(th.e, false);
            }
        }
        else if (th.c() - d >= n2) {
            this.m.set(th.e, false);
        }
    }
    
    private final boolean bz(final int n) {
        if (this.j == 0) {
            return n == -1 != this.e;
        }
        return n == -1 == this.e == this.J();
    }
    
    @Override
    public final int A(final sq sq) {
        return this.N(sq);
    }
    
    @Override
    public final int B(final sq sq) {
        return this.R(sq);
    }
    
    @Override
    public final int C(final sq sq) {
        return this.S(sq);
    }
    
    final void D(final int n, final sq sq) {
        int n2;
        int n3;
        if (n > 0) {
            n2 = this.i();
            n3 = 1;
        }
        else {
            n2 = this.c();
            n3 = -1;
        }
        this.l.a = true;
        this.bx(n2, sq);
        this.bw(n3);
        final qy l = this.l;
        l.c = n2 + l.d;
        l.b = Math.abs(n);
    }
    
    public final void E(final boolean b) {
        this.L(null);
        final tg f = this.F;
        if (f != null && f.h != b) {
            f.h = b;
        }
        this.d = b;
        this.aM();
    }
    
    final void F(final int n) {
        this.k = n / this.i;
        View$MeasureSpec.makeMeasureSpec(n, this.c.h());
    }
    
    public final boolean G() {
        if (this.ah() == 0 || this.n == 0 || !super.v) {
            return false;
        }
        int n;
        if (this.e) {
            n = this.i();
            this.c();
        }
        else {
            n = this.c();
            this.i();
        }
        if (n == 0 && this.t() != null) {
            this.h.a();
            super.u = true;
            this.aM();
            return true;
        }
        return false;
    }
    
    @Override
    public final PointF H(int m) {
        m = this.M(m);
        final PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = (float)m;
            pointF.y = 0.0f;
        }
        else {
            pointF.x = 0.0f;
            pointF.y = (float)m;
        }
        return pointF;
    }
    
    @Override
    public final Parcelable I() {
        final tg f = this.F;
        if (f != null) {
            return (Parcelable)new tg(f);
        }
        final tg tg = new tg();
        tg.h = this.d;
        tg.i = this.o;
        tg.j = this.E;
        final tf h = this.h;
        int i = 0;
        Label_0103: {
            if (h != null) {
                final int[] a = h.a;
                if (a != null) {
                    tg.f = a;
                    tg.e = tg.f.length;
                    tg.g = h.b;
                    break Label_0103;
                }
            }
            tg.e = 0;
        }
        final int ah = this.ah();
        final int n = -1;
        if (ah > 0) {
            int a2;
            if (this.o) {
                a2 = this.i();
            }
            else {
                a2 = this.c();
            }
            tg.a = a2;
            View view;
            if (this.e) {
                view = this.l(true);
            }
            else {
                view = this.q(true);
            }
            int bd;
            if (view == null) {
                bd = n;
            }
            else {
                bd = se.bd(view);
            }
            tg.b = bd;
            final int j = this.i;
            tg.c = j;
            tg.d = new int[j];
            while (i < this.i) {
                int n2;
                if (this.o) {
                    final int d = this.a[i].d(Integer.MIN_VALUE);
                    if ((n2 = d) != Integer.MIN_VALUE) {
                        n2 = d - this.b.f();
                    }
                }
                else {
                    final int f2 = this.a[i].f(Integer.MIN_VALUE);
                    if ((n2 = f2) != Integer.MIN_VALUE) {
                        n2 = f2 - this.b.j();
                    }
                }
                tg.d[i] = n2;
                ++i;
            }
        }
        else {
            tg.a = -1;
            tg.b = -1;
            tg.c = 0;
        }
        return (Parcelable)tg;
    }
    
    final boolean J() {
        return this.ak() == 1;
    }
    
    @Override
    public final void L(final String s) {
        if (this.F == null) {
            super.L(s);
        }
    }
    
    @Override
    public final void O(final AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (this.ah() <= 0) {
            return;
        }
        final View q = this.q(false);
        final View l = this.l(false);
        if (q == null || l == null) {
            return;
        }
        final int bd = se.bd(q);
        final int bd2 = se.bd(l);
        if (bd < bd2) {
            accessibilityEvent.setFromIndex(bd);
            accessibilityEvent.setToIndex(bd2);
            return;
        }
        accessibilityEvent.setFromIndex(bd2);
        accessibilityEvent.setToIndex(bd);
    }
    
    @Override
    public final void P(final Parcelable parcelable) {
        if (parcelable instanceof tg) {
            final tg f = (tg)parcelable;
            this.F = f;
            if (this.f != -1) {
                f.a();
                this.F.b();
            }
            this.aM();
        }
    }
    
    @Override
    public final void Q(final int f) {
        final tg f2 = this.F;
        if (f2 != null && f2.a != f) {
            f2.a();
        }
        this.f = f;
        this.g = Integer.MIN_VALUE;
        this.aM();
    }
    
    @Override
    public final boolean T() {
        return this.j == 0;
    }
    
    @Override
    public final boolean U() {
        return this.j == 1;
    }
    
    @Override
    public final boolean V() {
        return this.n != 0;
    }
    
    @Override
    public final void Z(int n, int i, final sq sq, final qt qt) {
        if (1 == this.j) {
            n = i;
        }
        if (this.ah() != 0 && n != 0) {
            this.D(n, sq);
            final int[] j = this.J;
            final int n2 = 0;
            if (j != null && j.length >= this.i) {
                i = 0;
                n = 0;
            }
            else {
                this.J = new int[this.i];
                i = 0;
                n = 0;
            }
            while (i < this.i) {
                final qy l = this.l;
                int n3;
                if (l.d == -1) {
                    final int f = l.f;
                    n3 = f - this.a[i].f(f);
                }
                else {
                    n3 = this.a[i].d(l.g) - this.l.g;
                }
                int n4 = n;
                if (n3 >= 0) {
                    this.J[n] = n3;
                    n4 = n + 1;
                }
                ++i;
                n = n4;
            }
            Arrays.sort(this.J, 0, n);
            qy k;
            for (i = n2; i < n && this.l.a(sq); ++i) {
                qt.a(this.l.c, this.J[i]);
                k = this.l;
                k.c += k.d;
            }
        }
    }
    
    @Override
    public final void aC(final int n) {
        super.aC(n);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].k(n);
        }
    }
    
    @Override
    public final void aD(final int n) {
        super.aD(n);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].k(n);
        }
    }
    
    @Override
    public final void aG(final int n) {
        if (n == 0) {
            this.G();
        }
    }
    
    @Override
    public final void ae(final RecyclerView recyclerView) {
        this.bk(this.K);
        for (int i = 0; i < this.i; ++i) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }
    
    @Override
    public final void af(final RecyclerView recyclerView, final int b) {
        final sp sp = new sp(recyclerView.getContext());
        sp.b = b;
        this.aS(sp);
    }
    
    @Override
    public final void bi() {
        this.h.a();
        for (int i = 0; i < this.i; ++i) {
            this.a[i].j();
        }
    }
    
    final int c() {
        if (this.ah() == 0) {
            return 0;
        }
        return se.bd(this.at(0));
    }
    
    @Override
    public final int d(final int n, final sk sk, final sq sq) {
        return this.k(n, sk, sq);
    }
    
    @Override
    public final int e(final int n, final sk sk, final sq sq) {
        return this.k(n, sk, sq);
    }
    
    @Override
    public final sf f() {
        if (this.j == 0) {
            return new td(-2, -1);
        }
        return new td(-1, -2);
    }
    
    @Override
    public final sf g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new td((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new td(viewGroup$LayoutParams);
    }
    
    @Override
    public final sf h(final Context context, final AttributeSet set) {
        return new td(context, set);
    }
    
    final int i() {
        final int ah = this.ah();
        if (ah == 0) {
            return 0;
        }
        return se.bd(this.at(ah - 1));
    }
    
    @Override
    public final View j(View as, int i, final sk sk, final sq sq) {
        if (this.ah() == 0) {
            return null;
        }
        as = this.as(as);
        if (as == null) {
            return null;
        }
        this.bv();
        final boolean b = true;
        Label_0197: {
            Label_0152: {
                Label_0138: {
                    switch (i) {
                        default: {
                            i = Integer.MIN_VALUE;
                            break Label_0197;
                        }
                        case 130: {
                            if (this.j == 1) {
                                break Label_0152;
                            }
                            break Label_0138;
                        }
                        case 66: {
                            if (this.j == 0) {
                                break Label_0152;
                            }
                            break Label_0138;
                        }
                        case 33: {
                            if (this.j == 1) {
                                break;
                            }
                            break Label_0138;
                        }
                        case 17: {
                            if (this.j == 0) {
                                break;
                            }
                            break Label_0138;
                        }
                        case 2: {
                            if (this.j == 1) {
                                break Label_0152;
                            }
                            if (this.J()) {
                                i = -1;
                                break Label_0197;
                            }
                            i = 1;
                            break Label_0197;
                        }
                        case 1: {
                            if (this.j == 1) {
                                i = -1;
                                break Label_0197;
                            }
                            if (this.J()) {
                                break Label_0152;
                            }
                            break;
                        }
                    }
                    i = -1;
                    break Label_0197;
                }
                i = Integer.MIN_VALUE;
                break Label_0197;
            }
            i = 1;
        }
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        final td td = (td)as.getLayoutParams();
        final boolean b2 = td.b;
        final th a = td.a;
        int n;
        if (i == 1) {
            n = this.i();
        }
        else {
            n = this.c();
        }
        this.bx(n, sq);
        this.bw(i);
        final qy l = this.l;
        l.c = l.d + n;
        l.b = (int)(this.b.k() * 0.33333334f);
        final qy j = this.l;
        j.h = true;
        final int n2 = 0;
        j.a = false;
        this.W(sk, j, sq);
        this.o = this.e;
        final View g = a.g(n, i);
        if (g != null && g != as) {
            return g;
        }
        if (this.bz(i)) {
            for (int k = this.i - 1; k >= 0; --k) {
                final View g2 = this.a[k].g(n, i);
                if (g2 != null && g2 != as) {
                    return g2;
                }
            }
        }
        else {
            for (int n3 = 0; n3 < this.i; ++n3) {
                final View g3 = this.a[n3].g(n, i);
                if (g3 != null && g3 != as) {
                    return g3;
                }
            }
        }
        final boolean b3 = this.d ^ true;
        final boolean b4 = i == -1 && b;
        int n4;
        if (b3 == b4) {
            n4 = a.a();
        }
        else {
            n4 = a.b();
        }
        final View m = this.K(n4);
        if (m != null && m != as) {
            return m;
        }
        if (this.bz(i)) {
            int n5;
            View k2;
            for (i = this.i - 1; i >= 0; --i) {
                if (i != a.e) {
                    if (b3 == b4) {
                        n5 = this.a[i].a();
                    }
                    else {
                        n5 = this.a[i].b();
                    }
                    k2 = this.K(n5);
                    if (k2 != null && k2 != as) {
                        return k2;
                    }
                }
            }
        }
        else {
            int n6;
            View k3;
            for (i = n2; i < this.i; ++i) {
                if (b3 == b4) {
                    n6 = this.a[i].a();
                }
                else {
                    n6 = this.a[i].b();
                }
                k3 = this.K(n6);
                if (k3 != null && k3 != as) {
                    return k3;
                }
            }
        }
        return null;
    }
    
    final int k(int n, final sk sk, final sq sq) {
        if (this.ah() != 0 && n != 0) {
            this.D(n, sq);
            final int w = this.W(sk, this.l, sq);
            if (this.l.b >= w) {
                if (n < 0) {
                    n = -w;
                }
                else {
                    n = w;
                }
            }
            this.b.n(-n);
            this.o = this.e;
            final qy l = this.l;
            l.b = 0;
            this.bs(sk, l);
            return n;
        }
        return 0;
    }
    
    final View l(final boolean b) {
        final int j = this.b.j();
        final int f = this.b.f();
        int i = this.ah() - 1;
        View view = null;
        while (i >= 0) {
            final View at = this.at(i);
            final int d = this.b.d(at);
            final int a = this.b.a(at);
            View view2 = view;
            if (a > j) {
                if (d >= f) {
                    view2 = view;
                }
                else {
                    if (a <= f || !b) {
                        return at;
                    }
                    if ((view2 = view) == null) {
                        view2 = at;
                    }
                }
            }
            --i;
            view = view2;
        }
        return view;
    }
    
    @Override
    public final void n(final sk sk, final sq sq) {
        this.br(sk, sq, true);
    }
    
    @Override
    public final void o(final sq sq) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }
    
    @Override
    public final void p(final Rect rect, int ag, int ag2) {
        final int n = this.ao() + this.ap();
        final int n2 = this.aq() + this.an();
        if (this.j == 1) {
            ag2 = se.ag(ag2, rect.height() + n2, this.al());
            final int ag3 = se.ag(ag, this.k * this.i + n, this.am());
            ag = ag2;
            ag2 = ag3;
        }
        else {
            ag = se.ag(ag, rect.width() + n, this.am());
            final int ag4 = se.ag(ag2, this.k * this.i + n2, this.al());
            ag2 = ag;
            ag = ag4;
        }
        this.aP(ag2, ag);
    }
    
    final View q(final boolean b) {
        final int j = this.b.j();
        final int f = this.b.f();
        final int ah = this.ah();
        View view = null;
        View view2;
        for (int i = 0; i < ah; ++i, view = view2) {
            final View at = this.at(i);
            final int d = this.b.d(at);
            view2 = view;
            if (this.b.a(at) > j) {
                if (d >= f) {
                    view2 = view;
                }
                else {
                    if (d >= j || !b) {
                        return at;
                    }
                    if ((view2 = view) == null) {
                        view2 = at;
                    }
                }
            }
        }
        return view;
    }
    
    @Override
    public final boolean r(final sf sf) {
        return sf instanceof td;
    }
    
    @Override
    public final boolean s() {
        return this.F == null;
    }
    
    final View t() {
        int i = this.ah() - 1;
        final BitSet set = new BitSet(this.i);
        set.set(0, this.i, true);
        int n;
        if (this.j == 1 && this.J()) {
            n = 1;
        }
        else {
            n = -1;
        }
        int n2;
        if (this.e) {
            n2 = -1;
        }
        else {
            n2 = i + 1;
            i = 0;
        }
        int n3;
        if (i < n2) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
    Label_0307_Outer:
        while (i != n2) {
            final View at = this.at(i);
            final td td = (td)at.getLayoutParams();
            if (set.get(td.a.e)) {
                final th a = td.a;
                if (this.e) {
                    if (a.c() < this.b.f()) {
                        final ArrayList a2 = a.a;
                        final boolean b = th.n(a2.get(a2.size() - 1)).b;
                        return at;
                    }
                }
                else if (a.e() > this.b.j()) {
                    final boolean b2 = th.n(a.a.get(0)).b;
                    return at;
                }
                set.clear(td.a.e);
            }
            final boolean b3 = td.b;
            final int n4 = i + n3;
            Label_0414: {
                if (n4 != n2) {
                    final View at2 = this.at(n4);
                    while (true) {
                        Label_0352: {
                            if (this.e) {
                                final int a3 = this.b.a(at);
                                final int a4 = this.b.a(at2);
                                if (a3 < a4) {
                                    return at;
                                }
                                if (a3 == a4) {
                                    break Label_0352;
                                }
                            }
                            else {
                                final int d = this.b.d(at);
                                final int d2 = this.b.d(at2);
                                if (d > d2) {
                                    return at;
                                }
                                if (d != d2) {
                                    break Label_0414;
                                }
                                break Label_0352;
                            }
                            i = n4;
                            continue Label_0307_Outer;
                        }
                        if (td.a.e - ((td)at2.getLayoutParams()).a.e < 0 == n < 0) {
                            continue;
                        }
                        break;
                    }
                    return at;
                }
            }
            i = n4;
        }
        return null;
    }
    
    @Override
    public final void u(final int n, final int n2) {
        this.bq(n, n2, 1);
    }
    
    @Override
    public final void v(final int n, final int n2) {
        this.bq(n, n2, 2);
    }
    
    @Override
    public final void w(final int n, final int n2) {
        this.bq(n, n2, 4);
    }
    
    @Override
    public final int x(final sq sq) {
        return this.N(sq);
    }
    
    @Override
    public final int y(final sq sq) {
        return this.R(sq);
    }
    
    @Override
    public final int z(final sq sq) {
        return this.S(sq);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import java.util.List;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.graphics.PointF;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class LinearLayoutManager extends se implements so
{
    private rc a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final rb f;
    private int g;
    private int[] h;
    public int i;
    rp j;
    boolean k;
    int l;
    int m;
    rd n;
    final ra o;
    
    public LinearLayoutManager() {
        this.i = 1;
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new ra();
        this.f = new rb();
        this.g = 2;
        this.h = new int[2];
        this.R(1);
        this.S(false);
    }
    
    public LinearLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        this.i = 1;
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new ra();
        this.f = new rb();
        this.g = 2;
        this.h = new int[2];
        final sd ar = se.ar(context, set, n, n2);
        this.R(ar.a);
        this.S(ar.c);
        this.q(ar.d);
    }
    
    private final void bA() {
        boolean c;
        if (this.i != 1 && this.W()) {
            c = (this.c ^ true);
        }
        else {
            c = this.c;
        }
        this.k = c;
    }
    
    private final void bB(int n, final int c, final boolean b, final sq sq) {
        this.a.m = this.X();
        this.a.f = n;
        final int[] h = this.h;
        h[0] = 0;
        final int n2 = 1;
        final int n3 = 1;
        h[1] = 0;
        this.M(sq, h);
        int max = Math.max(0, this.h[0]);
        final int max2 = Math.max(0, this.h[1]);
        final rc a = this.a;
        int h2;
        if (n == 1) {
            h2 = max2;
        }
        else {
            h2 = max;
        }
        a.h = h2;
        if (n != 1) {
            max = max2;
        }
        a.i = max;
        if (n == 1) {
            a.h = h2 + this.j.g();
            final View bw = this.bw();
            final rc a2 = this.a;
            if (!this.k) {
                n = n3;
            }
            else {
                n = -1;
            }
            a2.e = n;
            n = se.bd(bw);
            final rc a3 = this.a;
            a2.d = n + a3.e;
            a3.b = this.j.a(bw);
            n = this.j.a(bw) - this.j.f();
        }
        else {
            final View bx = this.bx();
            final rc a4 = this.a;
            a4.h += this.j.j();
            final rc a5 = this.a;
            if (!this.k) {
                n = -1;
            }
            else {
                n = n2;
            }
            a5.e = n;
            n = se.bd(bx);
            final rc a6 = this.a;
            a5.d = n + a6.e;
            a6.b = this.j.d(bx);
            n = -this.j.d(bx) + this.j.j();
        }
        final rc a7 = this.a;
        a7.c = c;
        if (b) {
            a7.c = c - n;
        }
        a7.g = n;
    }
    
    private final void bC(final ra ra) {
        this.bD(ra.b, ra.c);
    }
    
    private final void bD(final int d, final int b) {
        this.a.c = this.j.f() - b;
        final rc a = this.a;
        int e;
        if (!this.k) {
            e = 1;
        }
        else {
            e = -1;
        }
        a.e = e;
        a.d = d;
        a.f = 1;
        a.b = b;
        a.g = Integer.MIN_VALUE;
    }
    
    private final void bE(final ra ra) {
        this.bF(ra.b, ra.c);
    }
    
    private final void bF(int n, final int b) {
        this.a.c = b - this.j.j();
        final rc a = this.a;
        a.d = n;
        final boolean k = this.k;
        n = 1;
        if (!k) {
            n = -1;
        }
        a.e = n;
        a.f = -1;
        a.b = b;
        a.g = Integer.MIN_VALUE;
    }
    
    private final int bq(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        this.N();
        return aah.d(sq, this.j, this.ac(this.e ^ true), this.ab(this.e ^ true), this, this.e, this.k);
    }
    
    private final int br(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        this.N();
        return aah.e(sq, this.j, this.ac(this.e ^ true), this.ab(this.e ^ true), this, this.e);
    }
    
    private final int bs(int n, final sk sk, final sq sq, final boolean b) {
        final int n2 = this.j.f() - n;
        if (n2 > 0) {
            final int n3 = -this.G(-n2, sk, sq);
            if (b) {
                n = this.j.f() - (n + n3);
                if (n > 0) {
                    this.j.n(n);
                    return n + n3;
                }
            }
            return n3;
        }
        return 0;
    }
    
    private final int bt(int n, final sk sk, final sq sq, final boolean b) {
        final int n2 = n - this.j.j();
        if (n2 > 0) {
            int n4;
            final int n3 = n4 = -this.G(n2, sk, sq);
            if (b) {
                n = n + n3 - this.j.j();
                n4 = n3;
                if (n > 0) {
                    this.j.n(-n);
                    n4 = n3 - n;
                }
            }
            return n4;
        }
        return 0;
    }
    
    private final View bu() {
        return this.J(0, this.ah());
    }
    
    private final View bv() {
        return this.J(this.ah() - 1, -1);
    }
    
    private final View bw() {
        int n;
        if (this.k) {
            n = 0;
        }
        else {
            n = this.ah() - 1;
        }
        return this.at(n);
    }
    
    private final View bx() {
        int n;
        if (this.k) {
            n = this.ah() - 1;
        }
        else {
            n = 0;
        }
        return this.at(n);
    }
    
    private final void by(final sk sk, final rc rc) {
        if (rc.a && !rc.m) {
            final int g = rc.g;
            final int i = rc.i;
            if (rc.f == -1) {
                int ah = this.ah();
                if (g >= 0) {
                    final int n = this.j.e() - g + i;
                    if (this.k) {
                        for (int j = 0; j < ah; ++j) {
                            final View at = this.at(j);
                            if (this.j.d(at) < n || this.j.m(at) < n) {
                                this.bz(sk, 0, j);
                                return;
                            }
                        }
                    }
                    else {
                        for (int k = --ah; k >= 0; --k) {
                            final View at2 = this.at(k);
                            if (this.j.d(at2) < n || this.j.m(at2) < n) {
                                this.bz(sk, ah, k);
                                return;
                            }
                        }
                    }
                }
            }
            else if (g >= 0) {
                final int n2 = g - i;
                int ah2 = this.ah();
                if (this.k) {
                    for (int l = --ah2; l >= 0; --l) {
                        final View at3 = this.at(l);
                        if (this.j.a(at3) > n2 || this.j.l(at3) > n2) {
                            this.bz(sk, ah2, l);
                            return;
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < ah2; ++n3) {
                        final View at4 = this.at(n3);
                        if (this.j.a(at4) > n2 || this.j.l(at4) > n2) {
                            this.bz(sk, 0, n3);
                            return;
                        }
                    }
                }
            }
        }
    }
    
    private final void bz(final sk sk, final int n, int i) {
        if (n == i) {
            return;
        }
        int j;
        if (i > (j = n)) {
            --i;
            while (i >= n) {
                this.aK(i, sk);
                --i;
            }
        }
        else {
            while (j > i) {
                this.aK(j, sk);
                --j;
            }
        }
    }
    
    private final int c(final sq sq) {
        if (this.ah() == 0) {
            return 0;
        }
        this.N();
        return aah.c(sq, this.j, this.ac(this.e ^ true), this.ab(this.e ^ true), this, this.e);
    }
    
    @Override
    public final int A(final sq sq) {
        return this.c(sq);
    }
    
    @Override
    public final int B(final sq sq) {
        return this.bq(sq);
    }
    
    @Override
    public final int C(final sq sq) {
        return this.br(sq);
    }
    
    final int D(final int n) {
        switch (n) {
            default: {
                return Integer.MIN_VALUE;
            }
            case 130: {
                if (this.i == 1) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            }
            case 66: {
                if (this.i == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            }
            case 33: {
                if (this.i == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            case 17: {
                if (this.i == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            case 2: {
                if (this.i == 1) {
                    return 1;
                }
                if (this.W()) {
                    return -1;
                }
                return 1;
            }
            case 1: {
                if (this.i == 1) {
                    return -1;
                }
                if (this.W()) {
                    return 1;
                }
                return -1;
            }
        }
    }
    
    final int E(final sk sk, final rc rc, final sq sq, final boolean b) {
        final int c = rc.c;
        final int g = rc.g;
        if (g != Integer.MIN_VALUE) {
            if (c < 0) {
                rc.g = g + c;
            }
            this.by(sk, rc);
        }
        int n = rc.c + rc.h;
        final rb f = this.f;
        while ((rc.m || n > 0) && rc.d(sq)) {
            f.a = 0;
            f.b = false;
            f.c = false;
            f.d = false;
            this.k(sk, sq, rc, f);
            if (f.b) {
                break;
            }
            final int b2 = rc.b;
            final int a = f.a;
            rc.b = b2 + rc.f * a;
            int n2 = 0;
            Label_0191: {
                if (f.c && rc.l == null) {
                    n2 = n;
                    if (sq.g) {
                        break Label_0191;
                    }
                }
                rc.c -= a;
                n2 = n - a;
            }
            final int g2 = rc.g;
            if (g2 != Integer.MIN_VALUE) {
                final int g3 = g2 + a;
                rc.g = g3;
                final int c2 = rc.c;
                if (c2 < 0) {
                    rc.g = g3 + c2;
                }
                this.by(sk, rc);
            }
            n = n2;
            if (!b) {
                continue;
            }
            n = n2;
            if (f.d) {
                break;
            }
        }
        return c - rc.c;
    }
    
    public final int F() {
        final View ad = this.ad(0, this.ah(), false);
        if (ad == null) {
            return -1;
        }
        return se.bd(ad);
    }
    
    final int G(int k, final sk sk, final sq sq) {
        if (this.ah() == 0 || k == 0) {
            return 0;
        }
        this.N();
        this.a.a = true;
        int n;
        if (k > 0) {
            n = 1;
        }
        else {
            n = -1;
        }
        final int abs = Math.abs(k);
        this.bB(n, abs, true, sq);
        final rc a = this.a;
        final int n2 = a.g + this.E(sk, a, sq, false);
        if (n2 < 0) {
            return 0;
        }
        if (abs > n2) {
            k = n * n2;
        }
        this.j.n(-k);
        return this.a.k = k;
    }
    
    @Override
    public final PointF H(int n) {
        if (this.ah() == 0) {
            return null;
        }
        boolean b = false;
        final int bd = se.bd(this.at(0));
        final int n2 = 1;
        if (n < bd) {
            b = true;
        }
        if (b != this.k) {
            n = -1;
        }
        else {
            n = n2;
        }
        if (this.i == 0) {
            return new PointF((float)n, 0.0f);
        }
        return new PointF(0.0f, (float)n);
    }
    
    @Override
    public final Parcelable I() {
        final rd n = this.n;
        if (n != null) {
            return (Parcelable)new rd(n);
        }
        final rd rd = new rd();
        if (this.ah() > 0) {
            this.N();
            final boolean c = this.b ^ this.k;
            rd.c = c;
            if (c) {
                final View bw = this.bw();
                rd.b = this.j.f() - this.j.a(bw);
                rd.a = se.bd(bw);
            }
            else {
                final View bx = this.bx();
                rd.a = se.bd(bx);
                rd.b = this.j.d(bx) - this.j.j();
            }
        }
        else {
            rd.a();
        }
        return (Parcelable)rd;
    }
    
    final View J(final int n, final int n2) {
        this.N();
        if (n2 <= n) {
            if (n2 >= n) {
                return this.at(n);
            }
        }
        final int d = this.j.d(this.at(n));
        final int j = this.j.j();
        int n3;
        if (d < j) {
            n3 = 16388;
        }
        else {
            n3 = 4097;
        }
        int n4;
        if (d < j) {
            n4 = 16644;
        }
        else {
            n4 = 4161;
        }
        View view;
        if (this.i == 0) {
            view = this.r.a(n, n2, n4, n3);
        }
        else {
            view = this.s.a(n, n2, n4, n3);
        }
        return view;
    }
    
    @Override
    public final View K(final int n) {
        final int ah = this.ah();
        if (ah == 0) {
            return null;
        }
        final int n2 = n - se.bd(this.at(0));
        if (n2 >= 0 && n2 < ah) {
            final View at = this.at(n2);
            if (se.bd(at) == n) {
                return at;
            }
        }
        return super.K(n);
    }
    
    @Override
    public final void L(final String s) {
        if (this.n == null) {
            super.L(s);
        }
    }
    
    protected void M(final sq sq, final int[] array) {
        int k;
        if (sq.a != -1) {
            k = this.j.k();
        }
        else {
            k = 0;
        }
        final int f = this.a.f;
        int n;
        if (f == -1) {
            n = 0;
        }
        else {
            n = k;
        }
        if (f != -1) {
            k = 0;
        }
        array[0] = k;
        array[1] = n;
    }
    
    final void N() {
        if (this.a == null) {
            this.a = new rc();
        }
    }
    
    @Override
    public final void O(final AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (this.ah() > 0) {
            accessibilityEvent.setFromIndex(this.F());
            final int ah = this.ah();
            int bd = -1;
            final View ad = this.ad(ah - 1, -1, false);
            if (ad != null) {
                bd = se.bd(ad);
            }
            accessibilityEvent.setToIndex(bd);
        }
    }
    
    @Override
    public final void P(final Parcelable parcelable) {
        if (parcelable instanceof rd) {
            final rd n = (rd)parcelable;
            this.n = n;
            if (this.l != -1) {
                n.a();
            }
            this.aM();
        }
    }
    
    @Override
    public final void Q(final int l) {
        this.l = l;
        this.m = Integer.MIN_VALUE;
        final rd n = this.n;
        if (n != null) {
            n.a();
        }
        this.aM();
    }
    
    public final void R(final int i) {
        if (i != 0 && i != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid orientation:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.L(null);
        if (i == this.i && this.j != null) {
            return;
        }
        final rp q = rp.q(this, i);
        this.j = q;
        this.o.a = q;
        this.i = i;
        this.aM();
    }
    
    public final void S(final boolean c) {
        this.L(null);
        if (c == this.c) {
            return;
        }
        this.c = c;
        this.aM();
    }
    
    @Override
    public final boolean T() {
        return this.i == 0;
    }
    
    @Override
    public final boolean U() {
        return this.i == 1;
    }
    
    @Override
    public final boolean V() {
        return true;
    }
    
    protected final boolean W() {
        return this.ak() == 1;
    }
    
    final boolean X() {
        return this.j.h() == 0 && this.j.e() == 0;
    }
    
    @Override
    public final boolean Y() {
        if (super.B != 1073741824 && super.A != 1073741824) {
            for (int ah = this.ah(), i = 0; i < ah; ++i) {
                final ViewGroup$LayoutParams layoutParams = this.at(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final void Z(int n, int n2, final sq sq, final qt qt) {
        if (1 == this.i) {
            n = n2;
        }
        if (this.ah() != 0 && n != 0) {
            this.N();
            if (n > 0) {
                n2 = 1;
            }
            else {
                n2 = -1;
            }
            this.bB(n2, Math.abs(n), true, sq);
            this.t(sq, this.a, qt);
        }
    }
    
    @Override
    public final void aa(final int n, final qt qt) {
        final rd n2 = this.n;
        int n3 = -1;
        boolean c;
        int n5;
        if (n2 != null && n2.b()) {
            final rd n4 = this.n;
            c = n4.c;
            n5 = n4.a;
        }
        else {
            this.bA();
            final boolean k = this.k;
            final int n6 = n5 = this.l;
            c = k;
            if (n6 == -1) {
                if (k) {
                    n5 = n - 1;
                    c = k;
                }
                else {
                    n5 = 0;
                    c = k;
                }
            }
        }
        if (!c) {
            n3 = 1;
        }
        for (int n7 = 0; n7 < this.g && n5 >= 0 && n5 < n; n5 += n3, ++n7) {
            qt.a(n5, 0);
        }
    }
    
    final View ab(final boolean b) {
        if (this.k) {
            return this.ad(0, this.ah(), b);
        }
        return this.ad(this.ah() - 1, -1, b);
    }
    
    final View ac(final boolean b) {
        if (this.k) {
            return this.ad(this.ah() - 1, -1, b);
        }
        return this.ad(0, this.ah(), b);
    }
    
    final View ad(final int n, final int n2, final boolean b) {
        this.N();
        int n3;
        if (!b) {
            n3 = 320;
        }
        else {
            n3 = 24579;
        }
        View view;
        if (this.i == 0) {
            view = this.r.a(n, n2, n3, 320);
        }
        else {
            view = this.s.a(n, n2, n3, 320);
        }
        return view;
    }
    
    @Override
    public final void ae(final RecyclerView recyclerView) {
    }
    
    @Override
    public final void af(final RecyclerView recyclerView, final int b) {
        final sp sp = new sp(recyclerView.getContext());
        sp.b = b;
        this.aS(sp);
    }
    
    @Override
    public int d(final int n, final sk sk, final sq sq) {
        if (this.i == 1) {
            return 0;
        }
        return this.G(n, sk, sq);
    }
    
    @Override
    public int e(final int n, final sk sk, final sq sq) {
        if (this.i == 0) {
            return 0;
        }
        return this.G(n, sk, sq);
    }
    
    @Override
    public sf f() {
        return new sf(-2, -2);
    }
    
    public View i(final sk sk, final sq sq, final boolean b, final boolean b2) {
        this.N();
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
        final int j = this.j.j();
        final int f = this.j.f();
        View view = null;
        View view3;
        View view2 = view3 = null;
        while (i != n) {
            final View at = this.at(i);
            final int bd = se.bd(at);
            final int d = this.j.d(at);
            final int a2 = this.j.a(at);
            Label_0257: {
                if (bd >= 0 && bd < a) {
                    if (((sf)at.getLayoutParams()).c()) {
                        if (view3 == null) {
                            view3 = at;
                        }
                    }
                    else {
                        final boolean b3 = a2 <= j && d < j;
                        final boolean b4 = d >= f && a2 > f;
                        if (!b3 && !b4) {
                            return at;
                        }
                        Label_0251: {
                            if (b) {
                                if (!b4) {
                                    if (view == null) {
                                        break Label_0251;
                                    }
                                    break Label_0257;
                                }
                            }
                            else if (!b3) {
                                if (view == null) {
                                    break Label_0251;
                                }
                                break Label_0257;
                            }
                            view2 = at;
                            break Label_0257;
                        }
                        view = at;
                    }
                }
            }
            i += n2;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            view = view3;
        }
        return view;
    }
    
    @Override
    public View j(View view, int d, final sk sk, final sq sq) {
        this.bA();
        if (this.ah() == 0) {
            return null;
        }
        d = this.D(d);
        if (d == Integer.MIN_VALUE) {
            return null;
        }
        this.N();
        this.bB(d, (int)(this.j.k() * 0.33333334f), false, sq);
        final rc a = this.a;
        a.g = Integer.MIN_VALUE;
        a.a = false;
        this.E(sk, a, sq, true);
        if (d == -1) {
            if (this.k) {
                view = this.bv();
            }
            else {
                view = this.bu();
            }
            d = -1;
        }
        else if (this.k) {
            view = this.bu();
        }
        else {
            view = this.bv();
        }
        View view2;
        if (d == -1) {
            view2 = this.bx();
        }
        else {
            view2 = this.bw();
        }
        if (!view2.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return view2;
    }
    
    public void k(final sk sk, final sq sq, final rc rc, final rb rb) {
        final View a = rc.a(sk);
        if (a == null) {
            rb.b = true;
            return;
        }
        final sf sf = (sf)a.getLayoutParams();
        if (rc.l == null) {
            if (this.k == (rc.f == -1)) {
                this.ax(a);
            }
            else {
                this.ay(a, 0);
            }
        }
        else if (this.k == (rc.f == -1)) {
            this.av(a);
        }
        else {
            this.aw(a, 0);
        }
        final sf sf2 = (sf)a.getLayoutParams();
        final Rect c = super.q.c(a);
        final int left = c.left;
        final int right = c.right;
        final int top = c.top;
        final int bottom = c.bottom;
        final int ai = se.ai(super.C, super.A, this.ao() + this.ap() + sf2.leftMargin + sf2.rightMargin + (left + right), sf2.width, this.T());
        final int ai2 = se.ai(super.D, super.B, this.aq() + this.an() + sf2.topMargin + sf2.bottomMargin + (top + bottom), sf2.height, this.U());
        if (this.aX(a, ai, ai2, sf2)) {
            a.measure(ai, ai2);
        }
        rb.a = this.j.b(a);
        int n;
        int b;
        int n3;
        int n4;
        if (this.i == 1) {
            int ao;
            if (this.W()) {
                n = super.C - this.ap();
                ao = n - this.j.c(a);
            }
            else {
                ao = this.ao();
                n = this.j.c(a) + ao;
            }
            if (rc.f == -1) {
                b = rc.b;
                final int n2 = b - rb.a;
                n3 = ao;
                n4 = n2;
            }
            else {
                final int b2 = rc.b;
                b = rb.a + b2;
                n3 = ao;
                n4 = b2;
            }
        }
        else {
            final int aq = this.aq();
            final int n5 = this.j.c(a) + aq;
            if (rc.f == -1) {
                final int b3 = rc.b;
                final int a2 = rb.a;
                n = b3;
                n3 = b3 - a2;
                n4 = aq;
                b = n5;
            }
            else {
                final int b4 = rc.b;
                final int a3 = rb.a;
                n3 = b4;
                n = a3 + b4;
                n4 = aq;
                b = n5;
            }
        }
        se.bh(a, n3, n4, n, b);
        if (sf.c() || sf.b()) {
            rb.c = true;
        }
        rb.d = a.hasFocusable();
    }
    
    public void l(final sk sk, final sq sq, final ra ra, final int n) {
    }
    
    @Override
    public void n(final sk sk, final sq sq) {
        final rd n = this.n;
        int n2 = -1;
        if ((n == null && this.l == -1) || sq.a() != 0) {
            final rd n3 = this.n;
            if (n3 != null && n3.b()) {
                this.l = this.n.a;
            }
            this.N();
            this.a.a = false;
            this.bA();
            final View au = this.au();
            final ra o = this.o;
            if (o.e && this.l == -1 && this.n == null) {
                if (au != null && (this.j.d(au) >= this.j.f() || this.j.a(au) <= this.j.j())) {
                    this.o.c(au, se.bd(au));
                }
            }
            else {
                o.d();
                final ra o2 = this.o;
                o2.d = (this.k ^ this.d);
                Label_0918: {
                    if (!sq.g) {
                        final int l = this.l;
                        if (l != -1) {
                            if (l >= 0 && l < sq.a()) {
                                o2.b = this.l;
                                final rd n4 = this.n;
                                if (n4 != null && n4.b()) {
                                    final boolean c = this.n.c;
                                    o2.d = c;
                                    if (c) {
                                        o2.c = this.j.f() - this.n.b;
                                        break Label_0918;
                                    }
                                    o2.c = this.j.j() + this.n.b;
                                    break Label_0918;
                                }
                                else if (this.m == Integer.MIN_VALUE) {
                                    final View k = this.K(this.l);
                                    if (k == null) {
                                        if (this.ah() > 0) {
                                            o2.d = (this.l < se.bd(this.at(0)) == this.k);
                                        }
                                        o2.a();
                                        break Label_0918;
                                    }
                                    if (this.j.b(k) > this.j.k()) {
                                        o2.a();
                                        break Label_0918;
                                    }
                                    if (this.j.d(k) - this.j.j() < 0) {
                                        o2.c = this.j.j();
                                        o2.d = false;
                                        break Label_0918;
                                    }
                                    if (this.j.f() - this.j.a(k) < 0) {
                                        o2.c = this.j.f();
                                        o2.d = true;
                                        break Label_0918;
                                    }
                                    int d;
                                    if (o2.d) {
                                        d = this.j.a(k) + this.j.o();
                                    }
                                    else {
                                        d = this.j.d(k);
                                    }
                                    o2.c = d;
                                    break Label_0918;
                                }
                                else {
                                    final boolean i = this.k;
                                    o2.d = i;
                                    if (i) {
                                        o2.c = this.j.f() - this.m;
                                        break Label_0918;
                                    }
                                    o2.c = this.j.j() + this.m;
                                    break Label_0918;
                                }
                            }
                            else {
                                this.l = -1;
                                this.m = Integer.MIN_VALUE;
                            }
                        }
                    }
                    if (this.ah() != 0) {
                        final View au2 = this.au();
                        if (au2 != null) {
                            final sf sf = (sf)au2.getLayoutParams();
                            if (!sf.c() && sf.a() >= 0 && sf.a() < sq.a()) {
                                o2.c(au2, se.bd(au2));
                                break Label_0918;
                            }
                        }
                        final boolean b = this.b;
                        final boolean d2 = this.d;
                        if (b == d2) {
                            final View j = this.i(sk, sq, o2.d, d2);
                            if (j != null) {
                                o2.b(j, se.bd(j));
                                if (sq.g || !this.s()) {
                                    break Label_0918;
                                }
                                final int d3 = this.j.d(j);
                                final int a = this.j.a(j);
                                final int m = this.j.j();
                                final int f = this.j.f();
                                final boolean b2 = a <= m && d3 < m;
                                final boolean b3 = d3 >= f && a > f;
                                if (b2 || b3) {
                                    int c2;
                                    if (!o2.d) {
                                        c2 = m;
                                    }
                                    else {
                                        c2 = f;
                                    }
                                    o2.c = c2;
                                }
                                break Label_0918;
                            }
                        }
                    }
                    o2.a();
                    int b4;
                    if (this.d) {
                        b4 = sq.a() - 1;
                    }
                    else {
                        b4 = 0;
                    }
                    o2.b = b4;
                }
                this.o.e = true;
            }
            final rc a2 = this.a;
            int f2;
            if (a2.k >= 0) {
                f2 = 1;
            }
            else {
                f2 = -1;
            }
            a2.f = f2;
            final int[] h = this.h;
            h[1] = (h[0] = 0);
            this.M(sq, h);
            final int n5 = Math.max(0, this.h[0]) + this.j.j();
            int n6 = Math.max(0, this.h[1]) + this.j.g();
            int h2 = 0;
            Label_1148: {
                if (sq.g) {
                    final int l2 = this.l;
                    if (l2 != -1 && this.m != Integer.MIN_VALUE) {
                        final View k2 = this.K(l2);
                        if (k2 != null) {
                            int n7;
                            if (this.k) {
                                n7 = this.j.f() - this.j.a(k2) - this.m;
                            }
                            else {
                                n7 = this.m - (this.j.d(k2) - this.j.j());
                            }
                            if (n7 > 0) {
                                h2 = n5 + n7;
                                break Label_1148;
                            }
                            n6 -= n7;
                            h2 = n5;
                            break Label_1148;
                        }
                    }
                }
                h2 = n5;
            }
            final ra o3 = this.o;
            Label_1182: {
                if (o3.d) {
                    if (!this.k) {
                        break Label_1182;
                    }
                }
                else if (this.k) {
                    break Label_1182;
                }
                n2 = 1;
            }
            this.l(sk, sq, o3, n2);
            this.aA(sk);
            this.a.m = this.X();
            final rc a3 = this.a;
            a3.j = sq.g;
            a3.i = 0;
            final ra o4 = this.o;
            int n8;
            int n9;
            if (o4.d) {
                this.bE(o4);
                final rc a4 = this.a;
                a4.h = h2;
                this.E(sk, a4, sq, false);
                final rc a5 = this.a;
                n8 = a5.b;
                final int d4 = a5.d;
                final int c3 = a5.c;
                if (c3 > 0) {
                    n6 += c3;
                }
                this.bC(this.o);
                final rc a6 = this.a;
                a6.h = n6;
                a6.d += a6.e;
                this.E(sk, a6, sq, false);
                final rc a7 = this.a;
                n9 = a7.b;
                final int c4 = a7.c;
                if (c4 > 0) {
                    this.bF(d4, n8);
                    final rc a8 = this.a;
                    a8.h = c4;
                    this.E(sk, a8, sq, false);
                    n8 = this.a.b;
                }
            }
            else {
                this.bC(o4);
                final rc a9 = this.a;
                a9.h = n6;
                this.E(sk, a9, sq, false);
                final rc a10 = this.a;
                final int b5 = a10.b;
                final int d5 = a10.d;
                final int c5 = a10.c;
                int h3 = h2;
                if (c5 > 0) {
                    h3 = h2 + c5;
                }
                this.bE(this.o);
                final rc a11 = this.a;
                a11.h = h3;
                a11.d += a11.e;
                this.E(sk, a11, sq, false);
                final rc a12 = this.a;
                n8 = a12.b;
                final int c6 = a12.c;
                if (c6 > 0) {
                    this.bD(d5, b5);
                    final rc a13 = this.a;
                    a13.h = c6;
                    this.E(sk, a13, sq, false);
                    n9 = this.a.b;
                }
                else {
                    n9 = b5;
                }
            }
            if (this.ah() > 0) {
                if (this.k ^ this.d) {
                    final int bs = this.bs(n9, sk, sq, true);
                    final int n10 = n8 + bs;
                    final int bt = this.bt(n10, sk, sq, false);
                    n8 = n10 + bt;
                    n9 = n9 + bs + bt;
                }
                else {
                    final int bt2 = this.bt(n8, sk, sq, true);
                    final int n11 = n9 + bt2;
                    final int bs2 = this.bs(n11, sk, sq, false);
                    n8 = n8 + bt2 + bs2;
                    n9 = n11 + bs2;
                }
            }
            if (sq.k && this.ah() != 0 && !sq.g) {
                if (this.s()) {
                    final List d6 = sk.d;
                    final int size = d6.size();
                    final int bd = se.bd(this.at(0));
                    int n12 = 0;
                    int h4 = 0;
                    int h5 = 0;
                    while (n12 < size) {
                        final st st = d6.get(n12);
                        if (!st.t()) {
                            if (st.b() < bd != this.k) {
                                h4 += this.j.b(st.a);
                            }
                            else {
                                h5 += this.j.b(st.a);
                            }
                        }
                        ++n12;
                    }
                    this.a.l = d6;
                    if (h4 > 0) {
                        this.bF(se.bd(this.bx()), n8);
                        final rc a14 = this.a;
                        a14.h = h4;
                        a14.c = 0;
                        a14.b();
                        this.E(sk, this.a, sq, false);
                    }
                    if (h5 > 0) {
                        this.bD(se.bd(this.bw()), n9);
                        final rc a15 = this.a;
                        a15.h = h5;
                        a15.c = 0;
                        a15.b();
                        this.E(sk, this.a, sq, false);
                    }
                    this.a.l = null;
                }
            }
            if (!sq.g) {
                final rp j2 = this.j;
                j2.b = j2.k();
            }
            else {
                this.o.d();
            }
            this.b = this.d;
            return;
        }
        this.aH(sk);
    }
    
    @Override
    public void o(final sq sq) {
        this.n = null;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.o.d();
    }
    
    public void q(final boolean d) {
        this.L(null);
        if (this.d == d) {
            return;
        }
        this.d = d;
        this.aM();
    }
    
    @Override
    public boolean s() {
        return this.n == null && this.b == this.d;
    }
    
    public void t(final sq sq, final rc rc, final qt qt) {
        final int d = rc.d;
        if (d >= 0 && d < sq.a()) {
            qt.a(d, Math.max(0, rc.g));
        }
    }
    
    @Override
    public final int x(final sq sq) {
        return this.c(sq);
    }
    
    @Override
    public final int y(final sq sq) {
        return this.bq(sq);
    }
    
    @Override
    public final int z(final sq sq) {
        return this.br(sq);
    }
}

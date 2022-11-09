import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class dd
{
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public int a;
    public float aa;
    dd ab;
    dd ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    final dc i;
    final dc j;
    final dc k;
    final dc l;
    final dc m;
    final dc n;
    final dc o;
    final dc p;
    protected final ArrayList q;
    public dd r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    public dd() {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        final dc i = new dc(this, 2);
        this.i = i;
        final dc j = new dc(this, 3);
        this.j = j;
        final dc k = new dc(this, 4);
        this.k = k;
        final dc l = new dc(this, 5);
        this.l = l;
        final dc m = new dc(this, 6);
        this.m = m;
        final dc n = new dc(this, 8);
        this.n = n;
        final dc o = new dc(this, 9);
        this.o = o;
        this.p = new dc(this, 7);
        final ArrayList q = new ArrayList();
        this.q = q;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        q.add(i);
        q.add(j);
        q.add(k);
        q.add(l);
        q.add(n);
        q.add(o);
        q.add(m);
    }
    
    private final void A(final cz cz, final boolean b, final boolean b2, final dc dc, final dc dc2, int n, final int n2, int n3, final int n4, final float n5, final boolean b3, final boolean b4, final int n6, final int n7, int n8) {
        final db e = cz.e(dc);
        final db e2 = cz.e(dc2);
        final db e3 = cz.e(dc.b);
        final db e4 = cz.e(dc2.b);
        final int a = dc.a();
        final int a2 = dc2.a();
        final int k = this.K;
        final boolean b5 = k != 8;
        if (k == 8) {
            n3 = 0;
        }
        final boolean b6 = (b5 ^ true) | b2;
        if (e3 == null && e4 == null) {
            final cw a3 = cz.a();
            a3.g(e, n);
            cz.g(a3);
            if (!b3) {
                if (b) {
                    cz.g(cz.c(cz, e2, e, n4, true));
                    return;
                }
                if (b6) {
                    cz.g(cz.c(cz, e2, e, n3, false));
                    return;
                }
                final cw a4 = cz.a();
                a4.g(e2, n2);
                cz.g(a4);
            }
        }
        else if (e3 != null && e4 == null) {
            final cw a5 = cz.a();
            a5.h(e, e3, a);
            cz.g(a5);
            if (b) {
                cz.g(cz.c(cz, e2, e, n4, true));
                return;
            }
            if (!b3) {
                if (b6) {
                    final cw a6 = cz.a();
                    a6.h(e2, e, n3);
                    cz.g(a6);
                    return;
                }
                final cw a7 = cz.a();
                a7.g(e2, n2);
                cz.g(a7);
            }
        }
        else if (e3 == null) {
            final cw a8 = cz.a();
            a8.h(e2, e4, -a2);
            cz.g(a8);
            if (b) {
                cz.g(cz.c(cz, e2, e, n4, true));
                return;
            }
            if (!b3) {
                if (b6) {
                    final cw a9 = cz.a();
                    a9.h(e2, e, n3);
                    cz.g(a9);
                    return;
                }
                final cw a10 = cz.a();
                a10.g(e, n);
                cz.g(a10);
            }
        }
        else if (b6) {
            if (b) {
                cz.g(cz.c(cz, e2, e, n4, true));
            }
            else {
                final cw a11 = cz.a();
                a11.h(e2, e, n3);
                cz.g(a11);
            }
            n = dc.h;
            if (n != dc2.h) {
                if (n == 2) {
                    final cw a12 = cz.a();
                    a12.h(e, e3, a);
                    cz.g(a12);
                    final db f = cz.f();
                    final cw a13 = cz.a();
                    a13.j(e2, e4, f, -a2);
                    cz.g(a13);
                    return;
                }
                final db f2 = cz.f();
                final cw a14 = cz.a();
                a14.i(e, e3, f2, a);
                cz.g(a14);
                final cw a15 = cz.a();
                a15.h(e2, e4, -a2);
                cz.g(a15);
            }
            else {
                if (e3 == e4) {
                    cz.g(cz.b(cz, e, e3, 0, 0.5f, e4, e2, 0, true));
                    return;
                }
                if (!b4) {
                    n = dc.i;
                    final db f3 = cz.f();
                    final cw a16 = cz.a();
                    a16.i(e, e3, f3, a);
                    if (n != 2) {
                        cz.k(a16, (int)(-a16.d.a(f3)));
                    }
                    cz.g(a16);
                    n = dc2.i;
                    final db f4 = cz.f();
                    final cw a17 = cz.a();
                    a17.j(e2, e4, f4, -a2);
                    if (n != 2) {
                        cz.k(a17, (int)(-a17.d.a(f4)));
                    }
                    cz.g(a17);
                    cz.g(cz.b(cz, e, e3, a, n5, e4, e2, a2, false));
                }
            }
        }
        else {
            if (b3) {
                cz.i(e, e3, a, 3);
                cz.j(e2, e4, -a2, 3);
                cz.g(cz.b(cz, e, e3, a, n5, e4, e2, a2, true));
                return;
            }
            if (!b4) {
                if (n6 == 1) {
                    if (n7 > n3) {
                        n = n7;
                    }
                    else {
                        n = n3;
                    }
                    Label_0887: {
                        if (n8 > 0) {
                            if (n8 < n) {
                                break Label_0887;
                            }
                            cz.j(e2, e, n8, 3);
                        }
                        n8 = n;
                    }
                    cz.n(e2, e, n8, 3);
                    cz.i(e, e3, a, 2);
                    cz.j(e2, e4, -a2, 2);
                    cz.m(e, e3, a, n5, e4, e2, a2);
                    return;
                }
                if (n7 == 0 && n8 == 0) {
                    final cw a18 = cz.a();
                    a18.h(e, e3, a);
                    cz.g(a18);
                    final cw a19 = cz.a();
                    a19.h(e2, e4, -a2);
                    cz.g(a19);
                    return;
                }
                if (n8 > 0) {
                    cz.j(e2, e, n8, 3);
                }
                cz.i(e, e3, a, 2);
                cz.j(e2, e4, -a2, 2);
                cz.m(e, e3, a, n5, e4, e2, a2);
            }
        }
    }
    
    public final int a() {
        return this.x + this.t;
    }
    
    public final int b() {
        return this.af + this.A;
    }
    
    public final int c() {
        return this.ag + this.B;
    }
    
    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }
    
    public final int e() {
        int t = this.t;
        if (this.ae == 3) {
            int t2;
            if (this.d == 1) {
                t2 = Math.max(this.g, t);
            }
            else {
                t2 = this.g;
                if (t2 > 0) {
                    this.t = t2;
                }
                else {
                    t2 = 0;
                }
            }
            final int h = this.h;
            t = t2;
            if (h > 0) {
                if (h < t2) {
                    return h;
                }
                t = t2;
            }
        }
        return t;
    }
    
    public final int f() {
        int s = this.s;
        if (this.ad == 3) {
            int s2;
            if (this.c == 1) {
                s2 = Math.max(this.e, s);
            }
            else {
                s2 = this.e;
                if (s2 > 0) {
                    this.s = s2;
                }
                else {
                    s2 = 0;
                }
            }
            final int f = this.f;
            s = s2;
            if (f > 0) {
                if (f < s2) {
                    return f;
                }
                s = s2;
            }
        }
        return s;
    }
    
    public final int g() {
        return this.w + this.s;
    }
    
    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }
    
    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }
    
    public void j(final cx cx) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
    
    public final void k(final int t) {
        this.t = t;
        final int e = this.E;
        if (t < e) {
            this.t = e;
        }
    }
    
    public final void l(int d, int s) {
        this.w = d;
        s -= d;
        this.s = s;
        d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
    
    public final void m(final int e) {
        if (e < 0) {
            this.E = 0;
            return;
        }
        this.E = e;
    }
    
    public final void n(final int d) {
        if (d < 0) {
            this.D = 0;
            return;
        }
        this.D = d;
    }
    
    public void o(final int a, final int b) {
        this.A = a;
        this.B = b;
    }
    
    public final void p(int e, int t) {
        this.x = e;
        t -= e;
        this.t = t;
        e = this.E;
        if (t < e) {
            this.t = e;
        }
    }
    
    public final void q(final int s) {
        this.s = s;
        final int d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
    
    public void r() {
        final int w = this.w;
        final int x = this.x;
        final int s = this.s;
        final int t = this.t;
        this.af = w;
        this.ag = x;
        this.y = s + w - w;
        this.z = t + x - x;
    }
    
    public final boolean s() {
        return this.C > 0;
    }
    
    public final boolean t() {
        return this.r == null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(") - (");
        sb.append(this.s);
        sb.append(" x ");
        sb.append(this.t);
        sb.append(") wrap: (");
        sb.append(this.F);
        sb.append(" x ");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }
    
    public dc u(final int n) {
        switch (n - 1) {
            default: {
                return this.p;
            }
            case 8: {
                return this.o;
            }
            case 7: {
                return this.n;
            }
            case 5: {
                return this.m;
            }
            case 4: {
                return this.l;
            }
            case 3: {
                return this.k;
            }
            case 2: {
                return this.j;
            }
            case 1: {
                return this.i;
            }
        }
    }
    
    public final void v(final int n, final dd dd, final int n2, final int n3, final int n4) {
        this.u(n).d(dd.u(n2), n3, n4, 2, 0, true);
    }
    
    public final void w(final int ad) {
        this.ad = ad;
        if (ad == 2) {
            this.q(this.F);
        }
    }
    
    public final void x(final int ae) {
        this.ae = ae;
        if (ae == 2) {
            this.k(this.G);
        }
    }
    
    public void y(final cz cz) {
        final db e = cz.e(this.i);
        final db e2 = cz.e(this.k);
        final db e3 = cz.e(this.j);
        final db e4 = cz.e(this.l);
        final db e5 = cz.e(this.m);
        final dd r = this.r;
        int n3;
        int n4;
        if (r != null) {
            final dc i = this.i;
            final dc b = i.b;
            int n = 0;
            Label_0134: {
                if (b == null || b.b != i) {
                    final dc k = this.k;
                    final dc b2 = k.b;
                    if (b2 == null || b2.b != k) {
                        n = 0;
                        break Label_0134;
                    }
                }
                ((de)r).A(this, 0);
                n = 1;
            }
            final dc j = this.j;
            final dc b3 = j.b;
            int n2 = 0;
            Label_0211: {
                if (b3 == null || b3.b != j) {
                    final dc l = this.l;
                    final dc b4 = l.b;
                    if (b4 == null || b4.b != l) {
                        n2 = 0;
                        break Label_0211;
                    }
                }
                ((de)this.r).A(this, 1);
                n2 = 1;
            }
            final dd r2 = this.r;
            Label_0413: {
                if (r2.ad == 2 && n == 0) {
                    final dc m = this.i;
                    final dc b5 = m.b;
                    Label_0318: {
                        if (b5 != null) {
                            final dd a = b5.a;
                            if (a == r2) {
                                if (a == r2) {
                                    m.i = 2;
                                }
                                break Label_0318;
                            }
                        }
                        final db e6 = cz.e(r2.i);
                        final cw a2 = cz.a();
                        a2.i(e, e6, cz.f(), 0);
                        cz.g(a2);
                    }
                    final dc k2 = this.k;
                    final dc b6 = k2.b;
                    if (b6 != null) {
                        final dd a3 = b6.a;
                        final dd r3 = this.r;
                        if (a3 == r3) {
                            if (a3 == r3) {
                                k2.i = 2;
                            }
                            break Label_0413;
                        }
                    }
                    final db e7 = cz.e(this.r.k);
                    final cw a4 = cz.a();
                    a4.i(e7, e2, cz.f(), 0);
                    cz.g(a4);
                }
            }
            final dd r4 = this.r;
            Label_0620: {
                if (r4.ae == 2 && n2 == 0) {
                    final dc j2 = this.j;
                    final dc b7 = j2.b;
                    Label_0521: {
                        if (b7 != null) {
                            final dd a5 = b7.a;
                            if (a5 == r4) {
                                if (a5 == r4) {
                                    j2.i = 2;
                                }
                                break Label_0521;
                            }
                        }
                        final db e8 = cz.e(r4.j);
                        final cw a6 = cz.a();
                        a6.i(e3, e8, cz.f(), 0);
                        cz.g(a6);
                    }
                    final dc l2 = this.l;
                    final dc b8 = l2.b;
                    if (b8 != null) {
                        final dd a7 = b8.a;
                        final dd r5 = this.r;
                        if (a7 == r5) {
                            if (a7 == r5) {
                                l2.i = 2;
                            }
                            break Label_0620;
                        }
                    }
                    final db e9 = cz.e(this.r.l);
                    final cw a8 = cz.a();
                    a8.i(e9, e4, cz.f(), 0);
                    cz.g(a8);
                }
            }
            n3 = n;
            n4 = n2;
        }
        else {
            n3 = 0;
            n4 = 0;
        }
        final int s = this.s;
        final int d = this.D;
        int n5;
        if (s < d) {
            n5 = d;
        }
        else {
            n5 = s;
        }
        final int t = this.t;
        int e10;
        if (t >= (e10 = this.E)) {
            e10 = t;
        }
        final int ad = this.ad;
        final boolean b9 = ad != 3;
        final int ae = this.ae;
        final boolean b10 = ae != 3;
        boolean b11 = b9;
        if (!b9) {
            final dc i2 = this.i;
            b11 = b9;
            if (i2 != null) {
                final dc k3 = this.k;
                b11 = b9;
                if (k3 != null) {
                    if (i2.b != null) {
                        b11 = b9;
                        if (k3.b == null) {
                            b11 = true;
                        }
                    }
                    else {
                        b11 = true;
                    }
                }
            }
        }
        int n6 = 0;
        Label_0915: {
            if ((n6 = (b10 ? 1 : 0)) == 0) {
                final dc j3 = this.j;
                n6 = (b10 ? 1 : 0);
                if (j3 != null) {
                    final dc l3 = this.l;
                    n6 = (b10 ? 1 : 0);
                    if (l3 != null) {
                        final dc b12 = j3.b;
                        if (b12 != null) {
                            n6 = (b10 ? 1 : 0);
                            if (l3.b != null) {
                                break Label_0915;
                            }
                        }
                        if (this.C != 0) {
                            final dc m2 = this.m;
                            n6 = (b10 ? 1 : 0);
                            if (m2 == null) {
                                break Label_0915;
                            }
                            if (b12 != null) {
                                n6 = (b10 ? 1 : 0);
                                if (m2.b == null) {
                                    n6 = 1;
                                }
                                break Label_0915;
                            }
                        }
                        n6 = 1;
                    }
                }
            }
        }
        int v = this.v;
        float u = this.u;
        int n9 = 0;
        int n10 = 0;
        int n12 = 0;
        boolean b13 = false;
        int n13 = 0;
        Label_1187: {
            Label_1172: {
                int n8;
                if (u > 0.0f) {
                    final int k4 = this.K;
                    final int n7 = n5;
                    n8 = ad;
                    if (k4 != 8) {
                        if ((n9 = ad) == 3) {
                            if (ae == 3) {
                                if (b11 && n6 == 0) {
                                    n9 = 3;
                                    n10 = 0;
                                    final int n11 = 1;
                                    n12 = n7;
                                    b13 = (n6 != 0);
                                    n13 = n11;
                                    break Label_1187;
                                }
                                if (!b11 && n6) {
                                    if (v == -1) {
                                        u = 1.0f / u;
                                        n9 = 3;
                                        n10 = 1;
                                        final int n14 = 1;
                                        n12 = n7;
                                        b13 = (n6 != 0);
                                        n13 = n14;
                                        break Label_1187;
                                    }
                                    n10 = 1;
                                }
                                else {
                                    n10 = v;
                                }
                                n9 = 3;
                                final int n15 = 1;
                                n12 = n7;
                                b13 = (n6 != 0);
                                n13 = n15;
                                break Label_1187;
                            }
                            else {
                                n9 = 3;
                            }
                        }
                        if (n9 == 3) {
                            n12 = (int)(t * u);
                            b11 = true;
                            n10 = 0;
                            n13 = 0;
                            b13 = (n6 != 0);
                            break Label_1187;
                        }
                        n8 = n9;
                        if (ae == 3) {
                            float n16 = u;
                            if (v == -1) {
                                n16 = 1.0f / u;
                            }
                            e10 = (int)(s * n16);
                            v = 1;
                            n6 = (true ? 1 : 0);
                            u = n16;
                            break Label_1172;
                        }
                    }
                }
                else {
                    n8 = ad;
                }
                n9 = n8;
            }
            n12 = n5;
            n13 = 0;
            b13 = (n6 != 0);
            n10 = v;
        }
        boolean b14 = false;
        Label_1218: {
            if (n13 != 0) {
                if (n10 == 0) {
                    b14 = true;
                    break Label_1218;
                }
                if (n10 == -1) {
                    b14 = true;
                    break Label_1218;
                }
            }
            b14 = false;
        }
        final boolean b15 = n9 == 2 && this instanceof de;
        Label_1463: {
            if (this.a != 2) {
                if (b14) {
                    final dc i3 = this.i;
                    if (i3.b != null && this.k.b != null) {
                        final db e11 = cz.e(i3);
                        final db e12 = cz.e(this.k);
                        final db e13 = cz.e(this.i.b);
                        final db e14 = cz.e(this.k.b);
                        cz.i(e11, e13, this.i.a(), 3);
                        cz.j(e12, e14, -this.k.a(), 3);
                        if (n3 == 0) {
                            cz.m(e11, e13, this.i.a(), this.H, e14, e12, this.k.a());
                        }
                        break Label_1463;
                    }
                }
                final dc i4 = this.i;
                final dc k5 = this.k;
                final int w = this.w;
                this.A(cz, b15, b11, i4, k5, w, w + n12, n12, d, this.H, b14, (boolean)(n3 != 0), this.c, this.e, this.f);
            }
        }
        final db db = e;
        if (this.b == 2) {
            return;
        }
        final boolean b16 = this.ae == 2 && this instanceof de;
        boolean b17 = false;
        Label_1535: {
            if (n13 != 0) {
                final int n17 = n10;
                if (n17 == 1) {
                    b17 = true;
                    break Label_1535;
                }
                if (n17 == -1) {
                    b17 = true;
                    break Label_1535;
                }
            }
            b17 = false;
        }
        final int c = this.C;
        Label_2048: {
            if (c > 0) {
                dc l4 = this.l;
                cz.n(e5, e3, c, 5);
                final dc m3 = this.m;
                int c2;
                if (m3.b != null) {
                    c2 = this.C;
                    l4 = m3;
                }
                else {
                    c2 = e10;
                }
                if (b17) {
                    final dc j4 = this.j;
                    if (j4.b != null && this.l.b != null) {
                        final db e15 = cz.e(j4);
                        final db e16 = cz.e(this.l);
                        final db e17 = cz.e(this.j.b);
                        final db e18 = cz.e(this.l.b);
                        cz.i(e15, e17, this.j.a(), 3);
                        cz.j(e16, e18, -this.l.a(), 3);
                        if (n4 == 0) {
                            cz.m(e15, e17, this.j.a(), this.I, e18, e16, this.l.a());
                        }
                        break Label_2048;
                    }
                }
                final dc j5 = this.j;
                final int x = this.x;
                this.A(cz, b16, b13, j5, l4, x, x + c2, c2, this.E, this.I, b17, (boolean)(n4 != 0), this.d, this.g, this.h);
                cz.n(e4, e3, e10, 5);
            }
            else {
                if (b17) {
                    final dc j6 = this.j;
                    if (j6.b != null && this.l.b != null) {
                        final db e19 = cz.e(j6);
                        final db e20 = cz.e(this.l);
                        final db e21 = cz.e(this.j.b);
                        final db e22 = cz.e(this.l.b);
                        cz.i(e19, e21, this.j.a(), 3);
                        cz.j(e20, e22, -this.l.a(), 3);
                        if (n4 == 0) {
                            cz.m(e19, e21, this.j.a(), this.I, e22, e20, this.l.a());
                        }
                        break Label_2048;
                    }
                }
                final dc j7 = this.j;
                final dc l5 = this.l;
                final int x2 = this.x;
                this.A(cz, b16, b13, j7, l5, x2, x2 + e10, e10, this.E, this.I, b17, (boolean)(n4 != 0), this.d, this.g, this.h);
            }
        }
        if (n13 == 0) {
            return;
        }
        final cw a9 = cz.a();
        if (n10 == 0) {
            a9.e(e2, db, e4, e3, u);
            cz.g(a9);
            return;
        }
        if (n10 == 1) {
            a9.e(e4, e3, e2, db, u);
            cz.g(a9);
            return;
        }
        final int e23 = this.e;
        if (e23 > 0) {
            cz.i(e2, db, e23, 3);
        }
        final int g = this.g;
        if (g > 0) {
            cz.i(e4, e3, g, 3);
        }
        a9.e(e2, db, e4, e3, u);
        final db d2 = cz.d();
        final db d3 = cz.d();
        d2.c = 4;
        d3.c = 4;
        a9.c(d2, d3);
        cz.g(a9);
    }
    
    public void z() {
        final int p = cz.p(this.i);
        final int p2 = cz.p(this.j);
        final int n = cz.p(this.k) - p;
        final int n2 = cz.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        int s = n;
        if (this.ad == 1) {
            s = this.s;
            if (n >= s) {
                s = n;
            }
        }
        int t = n2;
        if (this.ae == 1) {
            t = this.t;
            if (n2 >= t) {
                t = n2;
            }
        }
        this.s = s;
        this.t = t;
        final int e = this.E;
        if (t < e) {
            this.t = e;
        }
        final int d = this.D;
        if (s < d) {
            this.s = d;
        }
    }
}

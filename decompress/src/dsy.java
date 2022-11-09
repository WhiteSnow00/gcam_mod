// 
// Decompiled by Procyon v0.6.0
// 

public final class dsy
{
    private final jdk A;
    private final jdk B;
    private final jdk C;
    private final jdk D;
    private final jdk E;
    private final jdk F;
    private final jdn G;
    private final jdn H;
    private final jdn I;
    private final jdk J;
    private final jdk K;
    private final jdk L;
    private final double[] a;
    private final jdk b;
    private final jdk c;
    private final jdk d;
    private final jdk e;
    private final jdk f;
    private final jdk g;
    private final jdk h;
    private final jdk i;
    private final jdk j;
    private final jdn k;
    private final jdn l;
    private final jdn m;
    private final jdn n;
    private final jdn o;
    private final jdn p;
    private final jdn q;
    private final dsz r;
    private long s;
    private long t;
    private float u;
    private boolean v;
    private int w;
    private boolean x;
    private final jdk y;
    private final jdk z;
    
    private dsy() {
        this.a = new double[16];
        this.b = new jdk();
        this.c = new jdk();
        this.d = new jdk();
        this.e = new jdk();
        this.f = new jdk();
        this.g = new jdk();
        this.h = new jdk();
        this.i = new jdk();
        this.j = new jdk();
        this.k = new jdn();
        this.l = new jdn();
        this.m = new jdn();
        this.n = new jdn();
        this.o = new jdn();
        this.p = new jdn();
        this.q = new jdn();
        this.r = new dsz();
        this.v = false;
        this.x = true;
        this.y = new jdk();
        this.z = new jdk();
        this.A = new jdk();
        this.B = new jdk();
        this.C = new jdk();
        this.D = new jdk();
        this.E = new jdk();
        this.F = new jdk();
        this.G = new jdn();
        this.H = new jdn();
        this.I = new jdn();
        this.J = new jdk();
        this.K = new jdk();
        this.L = new jdk();
    }
    
    public static dsy b() {
        final dsy dsy = new dsy();
        dsy.e();
        return dsy;
    }
    
    private final void i(jdk l, final jdn jdn) {
        jdk.c(l, this.p, this.m);
        this.r.a(this.m, this.l, this.L);
        final dsz r = this.r;
        l = this.L;
        final double n = (l.a(0, 0) + l.a(1, 1) + l.a(2, 2) - 1.0) * 0.5;
        jdn.g((l.a(2, 1) - l.a(1, 2)) / 2.0, (l.a(0, 2) - l.a(2, 0)) / 2.0, (l.a(1, 0) - l.a(0, 1)) / 2.0);
        final double b = jdn.b();
        if (n > 0.7071067811865476) {
            if (b > 0.0) {
                jdn.e(Math.asin(b) / b);
            }
            return;
        }
        if (n > -0.7071067811865476) {
            jdn.e(Math.acos(n) / b);
            return;
        }
        final double asin = Math.asin(b);
        final double n2 = l.a(0, 0) - n;
        final double n3 = l.a(1, 1) - n;
        final double n4 = l.a(2, 2) - n;
        final jdn a = r.a;
        final double n5 = n2 * n2;
        final double n6 = n3 * n3;
        if (n5 > n6 && n5 > n4 * n4) {
            a.g(n2, (l.a(1, 0) + l.a(0, 1)) / 2.0, (l.a(0, 2) + l.a(2, 0)) / 2.0);
        }
        else if (n6 > n4 * n4) {
            a.g((l.a(1, 0) + l.a(0, 1)) / 2.0, n3, (l.a(2, 1) + l.a(1, 2)) / 2.0);
        }
        else {
            a.g((l.a(0, 2) + l.a(2, 0)) / 2.0, (l.a(2, 1) + l.a(1, 2)) / 2.0, n4);
        }
        if (jdn.a(a, jdn) < 0.0) {
            a.e(-1.0);
        }
        a.d();
        a.e(3.141592653589793 - asin);
        jdn.f(a);
    }
    
    private final void j() {
        this.c.k(this.J);
        jdk.b(this.d, this.J, this.K);
        jdk.b(this.c, this.K, this.d);
        this.c.h();
    }
    
    public final double a() {
        final double a = this.b.a(2, 0);
        final double a2 = this.b.a(2, 1);
        if (Math.sqrt(a * a + a2 * a2) < 0.1) {
            return 0.0;
        }
        double n2;
        final double n = n2 = -90.0 - Math.atan2(a2, a) / 3.141592653589793 * 180.0;
        if (n < 0.0) {
            n2 = n + 360.0;
        }
        double n3 = n2;
        if (n2 >= 360.0) {
            n3 = n2 - 360.0;
        }
        return n3;
    }
    
    public final void c(final float[] array, final long t) {
        monitorenter(this);
        try {
            this.l.g(array[0], array[1], array[2]);
            if (this.t != 0L) {
                this.i(this.b, this.k);
                for (int i = 0; i < 3; ++i) {
                    final jdn j = this.I;
                    j.h();
                    if (i == 0) {
                        j.a = 1.0E-7;
                    }
                    else if (i == 1) {
                        j.b = 1.0E-7;
                    }
                    else {
                        j.c = 1.0E-7;
                    }
                    dsz.b(j, this.B);
                    jdk.b(this.B, this.b, this.C);
                    this.i(this.C, this.G);
                    final jdn g = this.G;
                    final jdn k = this.k;
                    this.H.g(k.a - g.a, k.b - g.b, k.c - g.c);
                    this.H.e(1.0E7);
                    this.i.g(i, this.H);
                }
                this.i.k(this.D);
                jdk.b(this.d, this.D, this.E);
                jdk.b(this.i, this.E, this.F);
                final jdk f = this.F;
                final jdk g2 = this.g;
                final jdk h = this.h;
                final double[] a = h.a;
                final double[] a2 = f.a;
                final double n = a2[0];
                final double[] a3 = g2.a;
                a[0] = n + a3[0];
                a[1] = a2[1] + a3[1];
                a[2] = a2[2] + a3[2];
                a[3] = a2[3] + a3[3];
                a[4] = a2[4] + a3[4];
                a[5] = a2[5] + a3[5];
                a[6] = a2[6] + a3[6];
                a[7] = a2[7] + a3[7];
                a[8] = a2[8] + a3[8];
                h.l(this.D);
                this.i.k(this.E);
                jdk.b(this.E, this.D, this.F);
                jdk.b(this.d, this.F, this.j);
                jdk.c(this.j, this.k, this.o);
                jdk.b(this.j, this.i, this.D);
                this.E.h();
                final jdk e = this.E;
                final jdk d = this.D;
                final double[] a4 = e.a;
                final double n2 = a4[0];
                final double[] a5 = d.a;
                a4[0] = n2 - a5[0];
                a4[1] -= a5[1];
                a4[2] -= a5[2];
                a4[3] -= a5[3];
                a4[4] -= a5[4];
                a4[5] -= a5[5];
                a4[6] -= a5[6];
                a4[7] -= a5[7];
                a4[8] -= a5[8];
                jdk.b(e, this.d, d);
                this.d.d(this.D);
                dsz.b(this.o, this.c);
                final jdk c = this.c;
                final jdk b = this.b;
                jdk.b(c, b, b);
                this.j();
            }
            else {
                this.r.a(this.p, this.l, this.b);
            }
            this.t = t;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d(final float[] array, final long s) {
        synchronized (this) {
            final long s2 = this.s;
            if (s2 != 0L) {
                final float u = (s - s2) * 1.0E-9f;
                float u2;
                if (u > 0.04f) {
                    if (this.x) {
                        u2 = this.u;
                    }
                    else {
                        u2 = 0.01f;
                    }
                }
                else if (!this.v) {
                    this.u = u;
                    this.w = 1;
                    this.v = true;
                    u2 = u;
                }
                else {
                    this.u = this.u * 0.95f + 0.050000012f * u;
                    final int w = this.w + 1;
                    this.w = w;
                    u2 = u;
                    if (w > 10.0f) {
                        this.x = true;
                        u2 = u;
                    }
                }
                final float n = -u2;
                this.n.g(array[0] * n, array[1] * n, array[2] * n);
                dsz.b(this.n, this.c);
                this.z.d(this.b);
                jdk.b(this.c, this.b, this.z);
                this.b.d(this.z);
                this.j();
                this.A.d(this.e);
                final double n2 = u2 * u2;
                final double[] a = this.A.a;
                final double n3 = a[0];
                Double.isNaN(n2);
                a[0] = n3 * n2;
                final double n4 = a[1];
                Double.isNaN(n2);
                a[1] = n4 * n2;
                final double n5 = a[2];
                Double.isNaN(n2);
                a[2] = n5 * n2;
                final double n6 = a[3];
                Double.isNaN(n2);
                a[3] = n6 * n2;
                final double n7 = a[4];
                Double.isNaN(n2);
                a[4] = n7 * n2;
                final double n8 = a[5];
                Double.isNaN(n2);
                a[5] = n8 * n2;
                final double n9 = a[6];
                Double.isNaN(n2);
                a[6] = n9 * n2;
                final double n10 = a[7];
                Double.isNaN(n2);
                a[7] = n10 * n2;
                final double n11 = a[8];
                Double.isNaN(n2);
                a[8] = n11 * n2;
                final double[] a2 = this.d.a;
                a2[0] += a[0];
                a2[1] += a[1];
                a2[2] += a[2];
                a2[3] += a[3];
                a2[4] += a[4];
                a2[5] += a[5];
                a2[6] += a[6];
                a2[7] += a[7];
                a2[8] += a[8];
            }
            this.s = s;
        }
    }
    
    public final void e() {
        this.s = 0L;
        this.t = 0L;
        this.b.h();
        this.c.h();
        this.d.j();
        this.d.i(25.0);
        this.e.j();
        this.e.i(1.0);
        this.f.j();
        this.f.i(0.0625);
        this.g.j();
        this.g.i(0.5625);
        this.h.j();
        this.i.j();
        this.j.j();
        this.k.h();
        this.l.h();
        this.m.h();
        this.n.h();
        this.o.h();
        this.p.g(0.0, 0.0, 9.81);
        this.q.g(0.0, 1.0, 0.0);
    }
    
    public final void f(double sin) {
        synchronized (this) {
            final double n = (sin - this.a()) / 180.0 * 3.141592653589793;
            sin = Math.sin(n);
            final double cos = Math.cos(n);
            final double[][] array = { { cos, -sin, 0.0 }, { sin, cos, 0.0 }, { 0.0, 0.0, 1.0 } };
            final jdk y = this.y;
            final double[] array2 = array[0];
            sin = array2[0];
            final double n2 = array2[1];
            final double n3 = array2[2];
            final double[] array3 = array[1];
            final double n4 = array3[0];
            final double n5 = array3[1];
            final double n6 = array3[2];
            final double[] array4 = array[2];
            y.f(sin, n2, n3, n4, n5, n6, array4[0], array4[1], array4[2]);
            final jdk b = this.b;
            jdk.b(b, this.y, b);
        }
    }
    
    public final boolean g() {
        return this.t != 0L;
    }
    
    public final double[] h() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.a[j * 4 + i] = this.b.a(i, j);
            }
        }
        final double[] a = this.a;
        a[7] = (a[11] = 0.0);
        a[14] = (a[3] = 0.0);
        a[12] = (a[13] = 0.0);
        a[15] = 1.0;
        return a;
    }
}

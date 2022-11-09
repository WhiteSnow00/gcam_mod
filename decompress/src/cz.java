import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cz
{
    private static int h;
    int a;
    public final cy b;
    public cw[] c;
    public boolean[] d;
    public int e;
    public int f;
    public final cx g;
    private int i;
    private int j;
    private int k;
    private db[] l;
    private int m;
    private cw[] n;
    
    static {
        cz.h = 1000;
    }
    
    public cz() {
        this.a = 0;
        this.b = new cy();
        this.i = 32;
        this.j = 32;
        this.c = null;
        this.d = new boolean[32];
        this.e = 1;
        this.f = 0;
        this.k = 32;
        this.l = new db[cz.h];
        this.m = 0;
        this.n = new cw[32];
        this.c = new cw[32];
        this.r();
        this.g = new cx();
    }
    
    public static cw b(final cz cz, db d, final db db, final int n, final float n2, final db db2, final db db3, final int n3, final boolean b) {
        final cw a = cz.a();
        a.d(d, db, n, n2, db2, db3, n3);
        if (b) {
            d = cz.d();
            final db d2 = cz.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }
    
    public static cw c(final cz cz, final db db, final db db2, final int n, final boolean b) {
        final cw a = cz.a();
        a.h(db, db2, n);
        if (b) {
            cz.k(a, 1);
        }
        return a;
    }
    
    public static final int p(final Object o) {
        final db f = ((dc)o).f;
        if (f != null) {
            return (int)(f.d + 0.5f);
        }
        return 0;
    }
    
    private final void q() {
        final int i = this.i;
        final int j = i + i;
        this.i = j;
        this.c = Arrays.copyOf(this.c, j);
        final cx g = this.g;
        g.a = Arrays.copyOf(g.a, this.i);
        final int k = this.i;
        this.d = new boolean[k];
        this.j = k;
        this.k = k;
        this.b.a.clear();
    }
    
    private final void r() {
        int n = 0;
        while (true) {
            final cw[] c = this.c;
            if (n >= c.length) {
                break;
            }
            final cw cw = c[n];
            if (cw != null) {
                this.g.b.b(cw);
            }
            this.c[n] = null;
            ++n;
        }
    }
    
    private final db s(int h) {
        db db = (db)this.g.c.a();
        if (db == null) {
            db = new db(h);
        }
        else {
            db.b();
            db.h = h;
        }
        final int m = this.m;
        h = cz.h;
        if (m >= h) {
            h = (cz.h = h + h);
            this.l = Arrays.copyOf(this.l, h);
        }
        final db[] l = this.l;
        h = this.m++;
        return l[h] = db;
    }
    
    public final cw a() {
        cw cw = (cw)this.g.b.a();
        if (cw == null) {
            cw = new cw(this.g);
        }
        else {
            cw.a = null;
            final cv d = cw.d;
            d.f = -1;
            d.g = -1;
            d.h = false;
            d.a = 0;
            cw.b = 0.0f;
            cw.e = false;
        }
        return cw;
    }
    
    public final db d() {
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final db s = this.s(4);
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        s.a = n;
        return this.g.a[n] = s;
    }
    
    public final db e(final Object o) {
        if (o == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final dc dc = (dc)o;
        db db = dc.f;
        if (db == null) {
            dc.e();
            db = dc.f;
        }
        final int a = db.a;
        if (a != -1) {
            if (a <= this.a && this.g.a[a] != null) {
                return db;
            }
            if (a != -1) {
                db.b();
            }
        }
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        db.a = n;
        db.h = 1;
        this.g.a[n] = db;
        return db;
    }
    
    public final db f() {
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final db s = this.s(3);
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        s.a = n;
        return this.g.a[n] = s;
    }
    
    public final void g(final cw cw) {
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            this.q();
        }
        final boolean e = cw.e;
        final int n = 0;
        Label_0673: {
            if (!e) {
                if (this.f > 0) {
                    final cv d = cw.d;
                    final cw[] c = this.c;
                    int n2 = d.f;
                    int n3 = 0;
                    while (n2 != -1 && n3 < d.a) {
                        final db db = d.b.a[d.c[n2]];
                        if (db.b != -1) {
                            final float n4 = d.e[n2];
                            d.c(db);
                            final cw cw2 = c[db.b];
                            if (!cw2.e) {
                                final cv d2 = cw2.d;
                                for (int f = d2.f, n5 = 0; f != -1 && n5 < d2.a; f = d2.d[f], ++n5) {
                                    d.e(d.b.a[d2.c[f]], d2.e[f] * n4);
                                }
                            }
                            cw.b += cw2.b * n4;
                            cw2.a.a(cw);
                            n2 = d.f;
                            n3 = 0;
                        }
                        else {
                            n2 = d.d[n2];
                            ++n3;
                        }
                    }
                    if (cw.d.a == 0) {
                        cw.e = true;
                    }
                }
                final float b = cw.b;
                if (b < 0.0f) {
                    cw.b = -b;
                    final cv d3 = cw.d;
                    for (int f2 = d3.f, n6 = 0; f2 != -1 && n6 < d3.a; f2 = d3.d[f2], ++n6) {
                        final float[] e2 = d3.e;
                        e2[f2] = -e2[f2];
                    }
                }
                final cv d4 = cw.d;
                int f3 = d4.f;
                db db2 = null;
                db db3 = null;
                while (true) {
                    for (int n7 = 0; f3 != -1 && n7 < d4.a; f3 = d4.d[f3], ++n7) {
                        final float[] e3 = d4.e;
                        float n8 = e3[f3];
                        if (n8 < 0.0f) {
                            if (n8 > -0.001f) {
                                e3[f3] = 0.0f;
                                n8 = 0.0f;
                            }
                        }
                        else if (n8 < 0.001f) {
                            e3[f3] = 0.0f;
                            n8 = 0.0f;
                        }
                        if (n8 != 0.0f) {
                            final db db4 = d4.b.a[d4.c[f3]];
                            if (db4.h == 1) {
                                if (n8 < 0.0f) {
                                    db2 = db4;
                                    if (db2 != null) {
                                        cw.a(db2);
                                    }
                                    if (cw.d.a == 0) {
                                        cw.e = true;
                                    }
                                    final db a = cw.a;
                                    if (a != null && (a.h == 1 || cw.b >= 0.0f)) {
                                        break Label_0673;
                                    }
                                    return;
                                }
                                else if (db2 == null) {
                                    db2 = db4;
                                }
                            }
                            else if (n8 < 0.0f && (db3 == null || db4.c < db3.c)) {
                                db3 = db4;
                            }
                        }
                    }
                    if (db2 != null) {
                        continue;
                    }
                    db2 = db3;
                    continue;
                }
            }
        }
        final cw cw3 = this.c[this.f];
        if (cw3 != null) {
            this.g.b.b(cw3);
        }
        if (!cw.e) {
            cw.b();
        }
        final cw[] c2 = this.c;
        final int f4 = this.f;
        c2[f4] = cw;
        final db a2 = cw.a;
        a2.b = f4;
        this.f = f4 + 1;
        final int g = a2.g;
        if (g > 0) {
            cw[] n9;
            while (true) {
                n9 = this.n;
                final int length = n9.length;
                if (length >= g) {
                    break;
                }
                this.n = new cw[length + length];
            }
            for (int i = 0; i < g; ++i) {
                n9[i] = cw.a.f[i];
            }
            for (int j = n; j < g; ++j) {
                final cw cw4 = n9[j];
                if (cw4 != cw) {
                    cw4.d.g(cw4, cw);
                    cw4.b();
                }
            }
        }
    }
    
    public final void h(final db a, final int n) {
        final int b = a.b;
        if (b == -1) {
            final cw a2 = this.a();
            a2.a = a;
            final float n2 = (float)n;
            a.d = n2;
            a2.b = n2;
            a2.e = true;
            this.g(a2);
            return;
        }
        final cw cw = this.c[b];
        if (cw.e) {
            cw.b = (float)n;
            return;
        }
        final cw a3 = this.a();
        a3.g(a, n);
        this.g(a3);
    }
    
    public final void i(final db db, final db db2, final int n, final int c) {
        final cw a = this.a();
        final db f = this.f();
        f.c = c;
        a.i(db, db2, f, n);
        this.g(a);
    }
    
    public final void j(final db db, final db db2, final int n, final int c) {
        final cw a = this.a();
        final db f = this.f();
        f.c = c;
        a.j(db, db2, f, n);
        this.g(a);
    }
    
    public final void k(final cw cw, final int n) {
        cw.d.f(this.d(), (float)n);
    }
    
    public final void l() {
        int n = 0;
        cx g;
        while (true) {
            g = this.g;
            final db[] a = g.a;
            if (n >= a.length) {
                break;
            }
            final db db = a[n];
            if (db != null) {
                db.b();
            }
            ++n;
        }
        final da c = g.c;
        final db[] l = this.l;
        final int m = this.m;
        final int length = l.length;
        int n2;
        if ((n2 = m) > length) {
            n2 = length;
        }
        for (final db db2 : l) {
            final int b = c.b;
            final Object[] a2 = c.a;
            if (b < 256) {
                a2[b] = db2;
                c.b = b + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int j = 0; j < this.f; ++j) {
            this.c[j].c = false;
        }
        this.r();
        this.f = 0;
    }
    
    public final void m(db d, db d2, final int n, final float n2, final db db, final db db2, final int n3) {
        final cw a = this.a();
        a.d(d, d2, n, n2, db, db2, n3);
        d2 = this.d();
        d = this.d();
        d2.c = 4;
        d.c = 4;
        a.c(d2, d);
        this.g(a);
    }
    
    public final void n(db d, db d2, final int n, final int n2) {
        final cw a = this.a();
        a.h(d, d2, n);
        d = this.d();
        d2 = this.d();
        d.c = n2;
        d2.c = n2;
        a.c(d, d2);
        this.g(a);
    }
    
    public final void o(final cy cy) {
        while (true) {
            for (int i = 0; i < this.f; ++i) {
                final cw cw = this.c[i];
                if (cw.a.h != 1) {
                    if (cw.b < 0.0f) {
                        int n = 0;
                        int b = -1;
                        int n2 = -1;
                        int n3 = 0;
                        float n4 = Float.MAX_VALUE;
                        while (true) {
                            if (n < this.f) {
                                final cw cw2 = this.c[n];
                                int n5;
                                int n6;
                                int n7;
                                float n8;
                                if (cw2.a.h == 1) {
                                    n5 = b;
                                    n6 = n2;
                                    n7 = n3;
                                    n8 = n4;
                                }
                                else if (cw2.b < 0.0f) {
                                    int n9 = 1;
                                    while (true) {
                                        n5 = b;
                                        n6 = n2;
                                        n7 = n3;
                                        n8 = n4;
                                        if (n9 >= this.e) {
                                            break;
                                        }
                                        final db db = this.g.a[n9];
                                        final float a = cw2.d.a(db);
                                        float n10;
                                        int n11;
                                        int n12;
                                        int n13;
                                        if (a <= 0.0f) {
                                            n10 = n4;
                                            n11 = n3;
                                            n12 = n2;
                                            n13 = b;
                                        }
                                        else {
                                            int n14 = 0;
                                            while (true) {
                                                n13 = b;
                                                n12 = n2;
                                                n11 = n3;
                                                n10 = n4;
                                                if (n14 >= 6) {
                                                    break;
                                                }
                                                final float n15 = db.e[n14] / a;
                                                int n16;
                                                if ((n15 < n4 && n14 == n3) || n14 > (n16 = n3)) {
                                                    n4 = n15;
                                                    b = n;
                                                    n2 = n9;
                                                    n16 = n14;
                                                }
                                                ++n14;
                                                n3 = n16;
                                            }
                                        }
                                        ++n9;
                                        b = n13;
                                        n2 = n12;
                                        n3 = n11;
                                        n4 = n10;
                                    }
                                }
                                else {
                                    n8 = n4;
                                    n7 = n3;
                                    n6 = n2;
                                    n5 = b;
                                }
                                ++n;
                                b = n5;
                                n2 = n6;
                                n3 = n7;
                                n4 = n8;
                            }
                            else {
                                if (b == -1) {
                                    break;
                                }
                                final cw cw3 = this.c[b];
                                cw3.a.b = -1;
                                cw3.a(this.g.a[n2]);
                                cw3.a.b = b;
                                for (int j = 0; j < this.f; ++j) {
                                    this.c[j].k(cw3);
                                }
                                cy.a(this);
                                n = 0;
                                b = -1;
                                n2 = -1;
                                n3 = 0;
                                n4 = Float.MAX_VALUE;
                            }
                        }
                        int k = 0;
                        while (k < this.f) {
                            final cw cw4 = this.c[k];
                            if (cw4.a.h != 1) {
                                if (cw4.b < 0.0f) {
                                    break;
                                }
                            }
                            ++k;
                        }
                        return;
                    }
                }
            }
            int k = 0;
            continue;
        }
    }
}

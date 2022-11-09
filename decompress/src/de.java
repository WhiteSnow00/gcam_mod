import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class de extends di
{
    protected final cz af;
    int ag;
    int ah;
    public int ai;
    public boolean aj;
    public boolean ak;
    private dh am;
    private int an;
    private int ao;
    private dd[] ap;
    private dd[] aq;
    private dd[] ar;
    private final boolean[] as;
    private final dd[] at;
    
    public de() {
        this.af = new cz();
        this.an = 0;
        this.ao = 0;
        this.ap = new dd[4];
        this.aq = new dd[4];
        this.ar = new dd[4];
        this.ai = 2;
        this.as = new boolean[3];
        this.at = new dd[4];
        this.aj = false;
        this.ak = false;
    }
    
    private final int G(final cz cz, final dd[] array, final dd dd, int n, final boolean[] array2) {
        array2[0] = true;
        array2[1] = false;
        array[2] = (array[0] = null);
        array[3] = (array[1] = null);
        if (n == 0) {
            final dc b = dd.i.b;
            boolean x = b == null || b.a == this;
            dd.ab = null;
            dd dd2;
            if (dd.K != 8) {
                dd2 = dd;
            }
            else {
                dd2 = null;
            }
            dd ab = dd;
            dd dd3 = null;
            dd dd4 = dd2;
            n = 0;
            while (ab.k.b != null) {
                ab.ab = null;
                if (ab.K != 8) {
                    if (dd2 == null) {
                        dd2 = ab;
                    }
                    if (dd4 != null && dd4 != ab) {
                        dd4.ab = ab;
                    }
                    dd4 = ab;
                }
                else {
                    final dc i = ab.i;
                    cz.n(i.f, i.b.f, 0, 5);
                    cz.n(ab.k.f, ab.i.f, 0, 5);
                }
                int n2 = n;
                if (ab.K != 8) {
                    n2 = n;
                    if (ab.ad == 3) {
                        if (ab.ae == 3) {
                            array2[0] = false;
                        }
                        n2 = n;
                        if (ab.u <= 0.0f) {
                            array2[0] = false;
                            n2 = n + 1;
                            final dd[] ap = this.ap;
                            final int length = ap.length;
                            if (n2 >= length) {
                                this.ap = Arrays.copyOf(ap, length + length);
                            }
                            this.ap[n] = ab;
                        }
                    }
                }
                final dd a = ab.k.b.a;
                final dc b2 = a.i.b;
                if (b2 == null) {
                    n = n2;
                    break;
                }
                if (b2.a != ab || a == ab) {
                    n = n2;
                    break;
                }
                ab = (dd3 = a);
                n = n2;
            }
            final dc b3 = ab.k.b;
            if (b3 != null && b3.a != this) {
                x = false;
            }
            if (dd.i.b == null || dd3.k.b == null) {
                array2[1] = true;
            }
            dd.X = x;
            dd3.ab = null;
            array[0] = dd;
            array[2] = dd2;
            array[1] = dd3;
            array[3] = dd4;
        }
        else {
            final dc b4 = dd.j.b;
            boolean y = b4 == null || b4.a == this;
            dd.ac = null;
            dd dd5;
            if (dd.K != 8) {
                dd5 = dd;
            }
            else {
                dd5 = null;
            }
            dd ac = dd;
            dd dd6 = dd5;
            dd dd7 = null;
            n = 0;
            while (ac.l.b != null) {
                ac.ac = null;
                if (ac.K != 8) {
                    if (dd5 == null) {
                        dd5 = ac;
                    }
                    if (dd6 != null && dd6 != ac) {
                        dd6.ac = ac;
                    }
                    dd6 = ac;
                }
                else {
                    final dc j = ac.j;
                    cz.n(j.f, j.b.f, 0, 5);
                    cz.n(ac.l.f, ac.j.f, 0, 5);
                }
                int n3;
                if (ac.K != 8) {
                    if (ac.ae == 3) {
                        if (ac.ad == 3) {
                            array2[0] = false;
                        }
                        n3 = n;
                        if (ac.u <= 0.0f) {
                            array2[0] = false;
                            n3 = n + 1;
                            final dd[] ap2 = this.ap;
                            final int length2 = ap2.length;
                            if (n3 >= length2) {
                                this.ap = Arrays.copyOf(ap2, length2 + length2);
                            }
                            this.ap[n] = ac;
                        }
                    }
                    else {
                        n3 = n;
                    }
                }
                else {
                    n3 = n;
                }
                final dd a2 = ac.l.b.a;
                final dc b5 = a2.j.b;
                if (b5 != null) {
                    if (b5.a == ac && a2 != ac) {
                        ac = (dd7 = a2);
                        n = n3;
                        continue;
                    }
                }
                n = n3;
                break;
            }
            final dc b6 = ac.l.b;
            if (b6 != null && b6.a != this) {
                y = false;
            }
            if (dd.j.b == null || dd7.l.b == null) {
                array2[1] = true;
            }
            dd.Y = y;
            dd7.ac = null;
            array[0] = dd;
            array[2] = dd5;
            array[1] = dd7;
            array[3] = dd6;
        }
        return n;
    }
    
    private final void H(final cz cz) {
        int n = 0;
        while (true) {
            boolean b = false;
            if (n >= this.an) {
                break;
            }
            dd dd = this.ar[n];
            final int g = this.G(cz, this.at, dd, 0, this.as);
            dd dd2 = this.at[2];
            Label_3020: {
                if (dd2 != null) {
                    final boolean[] as = this.as;
                    if (as[1]) {
                        int b2 = dd.b();
                        while (dd2 != null) {
                            cz.h(dd2.i.f, b2);
                            final dd ab = dd2.ab;
                            b2 += dd2.i.a() + dd2.h() + dd2.k.a();
                            dd2 = ab;
                        }
                    }
                    else {
                        final int v = dd.V;
                        final int ad = this.ad;
                        final int ai = this.ai;
                        float n2 = 0.0f;
                        if ((ai == 2 || ai == 8) && as[0] && dd.X && v != 2 && ad != 2 && v == 0) {
                            dd dd3 = dd;
                            dd dd4 = null;
                            int n3 = 0;
                            float n4 = 0.0f;
                            int n5 = 0;
                            while (dd3 != null) {
                                if (dd3.K != 8) {
                                    ++n3;
                                    if (dd3.ad != 3) {
                                        final int h = dd3.h();
                                        final dc i = dd3.i;
                                        int a;
                                        if (i.b != null) {
                                            a = i.a();
                                        }
                                        else {
                                            a = 0;
                                        }
                                        final dc k = dd3.k;
                                        int a2;
                                        if (k.b != null) {
                                            a2 = k.a();
                                        }
                                        else {
                                            a2 = 0;
                                        }
                                        n5 = n5 + h + a + a2;
                                    }
                                    else {
                                        n4 += dd3.Z;
                                    }
                                }
                                final dc b3 = dd3.k.b;
                                dd a3;
                                if (b3 != null) {
                                    a3 = b3.a;
                                }
                                else {
                                    a3 = null;
                                }
                                dd dd5 = a3;
                                Label_0413: {
                                    if (a3 != null) {
                                        final dc b4 = a3.i.b;
                                        if (b4 != null) {
                                            dd5 = a3;
                                            if (b4.a == dd3) {
                                                break Label_0413;
                                            }
                                        }
                                        dd5 = null;
                                    }
                                }
                                dd4 = dd3;
                                dd3 = dd5;
                            }
                            int g2;
                            if (dd4 != null) {
                                final dc b5 = dd4.k.b;
                                int w;
                                if (b5 != null) {
                                    w = b5.a.w;
                                }
                                else {
                                    w = 0;
                                }
                                g2 = w;
                                if (b5 != null) {
                                    g2 = w;
                                    if (b5.a == this) {
                                        g2 = this.g();
                                    }
                                }
                            }
                            else {
                                g2 = 0;
                            }
                            final float n6 = g2 - (float)n5;
                            float n7 = n6 / (n3 + 1);
                            float n8;
                            if (g == 0) {
                                n8 = n7;
                            }
                            else {
                                n8 = n6 / g;
                                n7 = 0.0f;
                            }
                            while (dd != null) {
                                final dc j = dd.i;
                                int a4;
                                if (j.b != null) {
                                    a4 = j.a();
                                }
                                else {
                                    a4 = 0;
                                }
                                final dc l = dd.k;
                                int a5;
                                if (l.b != null) {
                                    a5 = l.a();
                                }
                                else {
                                    a5 = 0;
                                }
                                if (dd.K != 8) {
                                    final float n9 = (float)a4;
                                    final float n10 = n7 + n9;
                                    cz.h(dd.i.f, (int)(n10 + 0.5f));
                                    float n11;
                                    if (dd.ad == 3) {
                                        if (n4 == 0.0f) {
                                            n11 = n10 + (n8 - n9 - a5);
                                        }
                                        else {
                                            n11 = n10 + (dd.Z * n6 / n4 - n9 - a5);
                                        }
                                    }
                                    else {
                                        n11 = n10 + dd.h();
                                    }
                                    cz.h(dd.k.f, (int)(n11 + 0.5f));
                                    float n12 = n11;
                                    if (g == 0) {
                                        n12 = n11 + n8;
                                    }
                                    n7 = n12 + a5;
                                }
                                else {
                                    final int n13 = (int)(n7 - n8 / 2.0f + 0.5f);
                                    cz.h(dd.i.f, n13);
                                    cz.h(dd.k.f, n13);
                                }
                                final dc b6 = dd.k.b;
                                dd a6;
                                if (b6 != null) {
                                    a6 = b6.a;
                                }
                                else {
                                    a6 = null;
                                }
                                dd dd6 = null;
                                Label_0851: {
                                    if (a6 != null) {
                                        final dc b7 = a6.i.b;
                                        if (b7 != null && b7.a != dd) {
                                            dd6 = null;
                                            break Label_0851;
                                        }
                                    }
                                    dd6 = a6;
                                }
                                dd dd7 = dd6;
                                if (dd6 == this) {
                                    dd7 = null;
                                }
                                dd = dd7;
                            }
                        }
                        else {
                            dd dd12;
                            dd dd14;
                            dd dd13;
                            dd dd15;
                            if (g != 0) {
                                if (v != 2) {
                                    dd dd8 = null;
                                    while (dd2 != null) {
                                        if (dd2.ad != 3) {
                                            int a7 = dd2.i.a();
                                            if (dd8 != null) {
                                                a7 += dd8.k.a();
                                            }
                                            final dc m = dd2.i;
                                            final dc b8 = m.b;
                                            int n14;
                                            if (b8.a.ad == 3) {
                                                n14 = 2;
                                            }
                                            else {
                                                n14 = 3;
                                            }
                                            cz.i(m.f, b8.f, a7, n14);
                                            final int a8 = dd2.k.a();
                                            final dc i2 = dd2.k.b.a.i;
                                            final dc b9 = i2.b;
                                            int n15 = a8;
                                            if (b9 != null) {
                                                n15 = a8;
                                                if (b9.a == dd2) {
                                                    n15 = a8 + i2.a();
                                                }
                                            }
                                            final dc k2 = dd2.k;
                                            final dc b10 = k2.b;
                                            int n16;
                                            if (b10.a.ad == 3) {
                                                n16 = 2;
                                            }
                                            else {
                                                n16 = 3;
                                            }
                                            cz.j(k2.f, b10.f, -n15, n16);
                                        }
                                        else {
                                            n2 += dd2.Z;
                                            final dc k3 = dd2.k;
                                            int a9;
                                            if (k3.b != null) {
                                                a9 = k3.a();
                                                if (dd2 != this.at[3]) {
                                                    a9 += dd2.k.b.a.i.a();
                                                }
                                            }
                                            else {
                                                a9 = 0;
                                            }
                                            cz.i(dd2.k.f, dd2.i.f, 0, 1);
                                            final dc k4 = dd2.k;
                                            cz.j(k4.f, k4.b.f, -a9, 1);
                                        }
                                        final dd ab2 = dd2.ab;
                                        dd8 = dd2;
                                        dd2 = ab2;
                                    }
                                    if (g == 1) {
                                        final dd dd9 = this.ap[0];
                                        final int a10 = dd9.i.a();
                                        final dc b11 = dd9.i.b;
                                        int n17 = a10;
                                        if (b11 != null) {
                                            n17 = a10 + b11.a();
                                        }
                                        final int a11 = dd9.k.a();
                                        final dc b12 = dd9.k.b;
                                        int n18 = a11;
                                        if (b12 != null) {
                                            n18 = a11 + b12.a();
                                        }
                                        db db = dd.k.b.f;
                                        final dd[] at = this.at;
                                        if (dd9 == at[3]) {
                                            db = at[1].k.b.f;
                                        }
                                        if (dd9.c == 1) {
                                            final dc i3 = dd.i;
                                            cz.i(i3.f, i3.b.f, n17, 1);
                                            cz.j(dd.k.f, db, -n18, 1);
                                            cz.n(dd.k.f, dd.i.f, dd.h(), 2);
                                        }
                                        else {
                                            final dc i4 = dd9.i;
                                            cz.n(i4.f, i4.b.f, n17, 1);
                                            cz.n(dd9.k.f, db, -n18, 1);
                                        }
                                    }
                                    else {
                                        int n19 = 0;
                                        final int n20 = g;
                                        while (true) {
                                            final int n21 = n20 - 1;
                                            if (n19 >= n21) {
                                                break;
                                            }
                                            final dd[] ap = this.ap;
                                            final dd dd10 = ap[n19];
                                            final int n22 = n19 + 1;
                                            final dd dd11 = ap[n22];
                                            final dc i5 = dd10.i;
                                            final db f = i5.f;
                                            final db f2 = dd10.k.f;
                                            final db f3 = dd11.i.f;
                                            db db2 = dd11.k.f;
                                            final dd[] at2 = this.at;
                                            if (dd11 == at2[3]) {
                                                db2 = at2[1].k.f;
                                            }
                                            final int a12 = i5.a();
                                            final dc b13 = dd10.i.b;
                                            int n23 = a12;
                                            if (b13 != null) {
                                                final dc k5 = b13.a.k;
                                                final dc b14 = k5.b;
                                                n23 = a12;
                                                if (b14 != null) {
                                                    n23 = a12;
                                                    if (b14.a == dd10) {
                                                        n23 = a12 + k5.a();
                                                    }
                                                }
                                            }
                                            cz.i(f, dd10.i.b.f, n23, 2);
                                            final int a13 = dd10.k.a();
                                            int n24 = 0;
                                            Label_1815: {
                                                if (dd10.k.b != null) {
                                                    final dd ab3 = dd10.ab;
                                                    if (ab3 != null) {
                                                        final dc i6 = ab3.i;
                                                        int a14;
                                                        if (i6.b != null) {
                                                            a14 = i6.a();
                                                        }
                                                        else {
                                                            a14 = 0;
                                                        }
                                                        n24 = a13 + a14;
                                                        break Label_1815;
                                                    }
                                                }
                                                n24 = a13;
                                            }
                                            cz.j(f2, dd10.k.b.f, -n24, 2);
                                            if (n22 == n21) {
                                                final int a15 = dd11.i.a();
                                                final dc b15 = dd11.i.b;
                                                int n25 = a15;
                                                if (b15 != null) {
                                                    final dc k6 = b15.a.k;
                                                    final dc b16 = k6.b;
                                                    n25 = a15;
                                                    if (b16 != null) {
                                                        n25 = a15;
                                                        if (b16.a == dd11) {
                                                            n25 = a15 + k6.a();
                                                        }
                                                    }
                                                }
                                                cz.i(f3, dd11.i.b.f, n25, 2);
                                                dc dc = dd11.k;
                                                final dd[] at3 = this.at;
                                                if (dd11 == at3[3]) {
                                                    dc = at3[1].k;
                                                }
                                                final int a16 = dc.a();
                                                final dc b17 = dc.b;
                                                int n26 = a16;
                                                if (b17 != null) {
                                                    final dc i7 = b17.a.i;
                                                    final dc b18 = i7.b;
                                                    n26 = a16;
                                                    if (b18 != null) {
                                                        n26 = a16;
                                                        if (b18.a == dd11) {
                                                            n26 = a16 + i7.a();
                                                        }
                                                    }
                                                }
                                                cz.j(db2, dc.b.f, -n26, 2);
                                            }
                                            final int f4 = dd.f;
                                            if (f4 > 0) {
                                                cz.j(f2, f, f4, 2);
                                            }
                                            final cw a17 = cz.a();
                                            a17.f(dd10.Z, n2, dd11.Z, f, dd10.i.a(), f2, dd10.k.a(), f3, dd11.i.a(), db2, dd11.k.a());
                                            cz.g(a17);
                                            n19 = n22;
                                        }
                                    }
                                    break Label_3020;
                                }
                                dd12 = dd2;
                                dd13 = (dd14 = null);
                                dd15 = dd;
                            }
                            else {
                                dd12 = dd2;
                                dd13 = (dd14 = null);
                                b = false;
                                dd15 = dd;
                            }
                            while (true) {
                                final dd dd16 = dd12;
                                if (dd16 == null) {
                                    break;
                                }
                                final dd ab4 = dd16.ab;
                                dd dd17;
                                if (ab4 == null) {
                                    dd17 = this.at[1];
                                    b = true;
                                }
                                else {
                                    dd17 = dd13;
                                }
                                dd a21 = null;
                                Label_2841: {
                                    if (v == 2) {
                                        final dc i8 = dd16.i;
                                        int a18 = i8.a();
                                        if (dd14 != null) {
                                            a18 += dd14.k.a();
                                        }
                                        int n27;
                                        if (dd2 != dd16) {
                                            n27 = 3;
                                        }
                                        else {
                                            n27 = 1;
                                        }
                                        cz.i(i8.f, i8.b.f, a18, n27);
                                        if (dd16.ad == 3) {
                                            final dc k7 = dd16.k;
                                            if (dd16.c == 1) {
                                                cz.n(k7.f, i8.f, Math.max(dd16.e, dd16.h()), 3);
                                            }
                                            else {
                                                cz.i(i8.f, i8.b.f, i8.c, 3);
                                                cz.j(k7.f, i8.f, dd16.e, 3);
                                            }
                                        }
                                    }
                                    else if (v != 0 && b && dd14 != null) {
                                        final dc k8 = dd16.k;
                                        if (k8.b == null) {
                                            cz.h(k8.f, dd16.b() + dd16.y);
                                        }
                                        else {
                                            cz.n(dd16.k.f, dd17.k.b.f, -k8.a(), 5);
                                        }
                                    }
                                    else if (v != 0 && !b && dd14 == null) {
                                        final dc i9 = dd16.i;
                                        if (i9.b == null) {
                                            cz.h(i9.f, dd16.b());
                                        }
                                        else {
                                            cz.n(dd16.i.f, dd15.i.b.f, i9.a(), 5);
                                        }
                                    }
                                    else {
                                        final dc i10 = dd16.i;
                                        final dc k9 = dd16.k;
                                        final int a19 = i10.a();
                                        final int a20 = k9.a();
                                        cz.i(i10.f, i10.b.f, a19, 1);
                                        cz.j(k9.f, k9.b.f, -a20, 1);
                                        final dc b19 = i10.b;
                                        db db3;
                                        if (b19 != null) {
                                            db3 = b19.f;
                                        }
                                        else {
                                            db3 = null;
                                        }
                                        if (dd14 == null) {
                                            final dc b20 = dd15.i.b;
                                            if (b20 != null) {
                                                db3 = b20.f;
                                            }
                                            else {
                                                db3 = null;
                                            }
                                        }
                                        if (ab4 == null) {
                                            final dc b21 = dd17.k.b;
                                            if (b21 != null) {
                                                a21 = b21.a;
                                            }
                                            else {
                                                a21 = null;
                                            }
                                        }
                                        else {
                                            a21 = ab4;
                                        }
                                        if (a21 == null) {
                                            break Label_2841;
                                        }
                                        db db4 = a21.i.f;
                                        if (b) {
                                            final dc b22 = dd17.k.b;
                                            if (b22 != null) {
                                                db4 = b22.f;
                                            }
                                            else {
                                                db4 = null;
                                            }
                                        }
                                        if (db3 != null && db4 != null) {
                                            cz.m(i10.f, db3, a19, 0.5f, db4, k9.f, a20);
                                        }
                                        break Label_2841;
                                    }
                                    a21 = ab4;
                                }
                                if (b) {
                                    a21 = null;
                                }
                                dd14 = dd16;
                                final dd dd18 = dd17;
                                dd12 = a21;
                                dd13 = dd18;
                            }
                            final int n28 = n = n;
                            if (v == 2) {
                                final dc i11 = dd2.i;
                                final dc k10 = dd13.k;
                                final int a22 = i11.a();
                                final int a23 = k10.a();
                                final dc b23 = dd15.i.b;
                                db f5;
                                if (b23 != null) {
                                    f5 = b23.f;
                                }
                                else {
                                    f5 = null;
                                }
                                final dc b24 = dd13.k.b;
                                db f6;
                                if (b24 != null) {
                                    f6 = b24.f;
                                }
                                else {
                                    f6 = null;
                                }
                                n = n28;
                                if (f5 != null) {
                                    n = n28;
                                    if (f6 != null) {
                                        cz.j(k10.f, f6, -a23, 1);
                                        cz.m(i11.f, f5, a22, dd15.H, f6, k10.f, a23);
                                        n = n28;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++n;
        }
    }
    
    private final void I(final cz cz) {
        int n = 0;
        while (true) {
            boolean b = false;
            if (n >= this.ao) {
                break;
            }
            final dd dd = this.aq[n];
            final int g = this.G(cz, this.at, dd, 1, this.as);
            dd dd2 = this.at[2];
            Label_3104: {
                if (dd2 != null) {
                    final boolean[] as = this.as;
                    if (as[1]) {
                        int c = dd.c();
                        while (dd2 != null) {
                            cz.h(dd2.j.f, c);
                            final dd ac = dd2.ac;
                            c += dd2.j.a() + dd2.d() + dd2.l.a();
                            dd2 = ac;
                        }
                    }
                    else {
                        final int w = dd.W;
                        final int ae = this.ae;
                        final int ai = this.ai;
                        float n2 = 0.0f;
                        if ((ai == 2 || ai == 8) && as[0] && dd.Y && w != 2 && ae != 2 && w == 0) {
                            dd dd3 = dd;
                            dd dd4 = null;
                            int n3 = 0;
                            float n4 = 0.0f;
                            int n5 = 0;
                            while (dd3 != null) {
                                if (dd3.K != 8) {
                                    ++n3;
                                    if (dd3.ae != 3) {
                                        final int d = dd3.d();
                                        final dc j = dd3.j;
                                        int a;
                                        if (j.b != null) {
                                            a = j.a();
                                        }
                                        else {
                                            a = 0;
                                        }
                                        final dc l = dd3.l;
                                        int a2;
                                        if (l.b != null) {
                                            a2 = l.a();
                                        }
                                        else {
                                            a2 = 0;
                                        }
                                        n5 = n5 + d + a + a2;
                                    }
                                    else {
                                        n4 += dd3.aa;
                                    }
                                }
                                final dc b2 = dd3.l.b;
                                dd a3;
                                if (b2 != null) {
                                    a3 = b2.a;
                                }
                                else {
                                    a3 = null;
                                }
                                dd dd5 = a3;
                                Label_0413: {
                                    if (a3 != null) {
                                        final dc b3 = a3.j.b;
                                        if (b3 != null) {
                                            dd5 = a3;
                                            if (b3.a == dd3) {
                                                break Label_0413;
                                            }
                                        }
                                        dd5 = null;
                                    }
                                }
                                dd4 = dd3;
                                dd3 = dd5;
                            }
                            int a4;
                            if (dd4 != null) {
                                final dc b4 = dd4.l.b;
                                int w2;
                                if (b4 != null) {
                                    w2 = b4.a.w;
                                }
                                else {
                                    w2 = 0;
                                }
                                a4 = w2;
                                if (b4 != null) {
                                    a4 = w2;
                                    if (b4.a == this) {
                                        a4 = this.a();
                                    }
                                }
                            }
                            else {
                                a4 = 0;
                            }
                            final float n6 = a4 - (float)n5;
                            float n7 = n6 / (n3 + 1);
                            float n8;
                            dd dd6;
                            if (g == 0) {
                                n8 = n7;
                                dd6 = dd;
                            }
                            else {
                                n8 = n6 / g;
                                n7 = 0.0f;
                                dd6 = dd;
                            }
                            while (dd6 != null) {
                                final dc i = dd6.j;
                                int a5;
                                if (i.b != null) {
                                    a5 = i.a();
                                }
                                else {
                                    a5 = 0;
                                }
                                final dc k = dd6.l;
                                int a6;
                                if (k.b != null) {
                                    a6 = k.a();
                                }
                                else {
                                    a6 = 0;
                                }
                                if (dd6.K != 8) {
                                    final float n9 = (float)a5;
                                    final float n10 = n7 + n9;
                                    cz.h(dd6.j.f, (int)(n10 + 0.5f));
                                    float n11;
                                    if (dd6.ae == 3) {
                                        if (n4 == 0.0f) {
                                            n11 = n10 + (n8 - n9 - a6);
                                        }
                                        else {
                                            n11 = n10 + (dd6.aa * n6 / n4 - n9 - a6);
                                        }
                                    }
                                    else {
                                        n11 = n10 + dd6.d();
                                    }
                                    cz.h(dd6.l.f, (int)(n11 + 0.5f));
                                    float n12 = n11;
                                    if (g == 0) {
                                        n12 = n11 + n8;
                                    }
                                    n7 = n12 + a6;
                                }
                                else {
                                    final int n13 = (int)(n7 - n8 / 2.0f + 0.5f);
                                    cz.h(dd6.j.f, n13);
                                    cz.h(dd6.l.f, n13);
                                }
                                final dc b5 = dd6.l.b;
                                dd a7;
                                if (b5 != null) {
                                    a7 = b5.a;
                                }
                                else {
                                    a7 = null;
                                }
                                if (a7 != null) {
                                    final dc b6 = a7.j.b;
                                    if (b6 != null && b6.a != dd6) {
                                        a7 = null;
                                    }
                                }
                                if ((dd6 = a7) == this) {
                                    dd6 = null;
                                }
                            }
                        }
                        else {
                            dd dd11;
                            dd dd13;
                            dd dd12;
                            dd dd14;
                            if (g != 0) {
                                if (w != 2) {
                                    dd dd7 = null;
                                    while (dd2 != null) {
                                        if (dd2.ae != 3) {
                                            int a8 = dd2.j.a();
                                            if (dd7 != null) {
                                                a8 += dd7.l.a();
                                            }
                                            final dc m = dd2.j;
                                            final dc b7 = m.b;
                                            int n14;
                                            if (b7.a.ae == 3) {
                                                n14 = 2;
                                            }
                                            else {
                                                n14 = 3;
                                            }
                                            cz.i(m.f, b7.f, a8, n14);
                                            final int a9 = dd2.l.a();
                                            final dc j2 = dd2.l.b.a.j;
                                            final dc b8 = j2.b;
                                            int n15 = a9;
                                            if (b8 != null) {
                                                n15 = a9;
                                                if (b8.a == dd2) {
                                                    n15 = a9 + j2.a();
                                                }
                                            }
                                            final dc l2 = dd2.l;
                                            final dc b9 = l2.b;
                                            int n16;
                                            if (b9.a.ae == 3) {
                                                n16 = 2;
                                            }
                                            else {
                                                n16 = 3;
                                            }
                                            cz.j(l2.f, b9.f, -n15, n16);
                                        }
                                        else {
                                            n2 += dd2.aa;
                                            final dc l3 = dd2.l;
                                            int a10;
                                            if (l3.b != null) {
                                                a10 = l3.a();
                                                if (dd2 != this.at[3]) {
                                                    a10 += dd2.l.b.a.j.a();
                                                }
                                            }
                                            else {
                                                a10 = 0;
                                            }
                                            cz.i(dd2.l.f, dd2.j.f, 0, 1);
                                            final dc l4 = dd2.l;
                                            cz.j(l4.f, l4.b.f, -a10, 1);
                                        }
                                        final dd ac2 = dd2.ac;
                                        dd7 = dd2;
                                        dd2 = ac2;
                                    }
                                    if (g == 1) {
                                        final dd dd8 = this.ap[0];
                                        final int a11 = dd8.j.a();
                                        final dc b10 = dd8.j.b;
                                        int n17 = a11;
                                        if (b10 != null) {
                                            n17 = a11 + b10.a();
                                        }
                                        final int a12 = dd8.l.a();
                                        final dc b11 = dd8.l.b;
                                        int n18 = a12;
                                        if (b11 != null) {
                                            n18 = a12 + b11.a();
                                        }
                                        db db = dd.l.b.f;
                                        final dd[] at = this.at;
                                        if (dd8 == at[3]) {
                                            db = at[1].l.b.f;
                                        }
                                        if (dd8.d == 1) {
                                            final dc j3 = dd.j;
                                            cz.i(j3.f, j3.b.f, n17, 1);
                                            cz.j(dd.l.f, db, -n18, 1);
                                            cz.n(dd.l.f, dd.j.f, dd.d(), 2);
                                        }
                                        else {
                                            final dc j4 = dd8.j;
                                            cz.n(j4.f, j4.b.f, n17, 1);
                                            cz.n(dd8.l.f, db, -n18, 1);
                                        }
                                    }
                                    else {
                                        int n19 = 0;
                                        final int n20 = g;
                                        while (true) {
                                            final int n21 = n20 - 1;
                                            if (n19 >= n21) {
                                                break;
                                            }
                                            final dd[] ap = this.ap;
                                            final dd dd9 = ap[n19];
                                            final int n22 = n19 + 1;
                                            final dd dd10 = ap[n22];
                                            final dc j5 = dd9.j;
                                            final db f = j5.f;
                                            final db f2 = dd9.l.f;
                                            final db f3 = dd10.j.f;
                                            db db2 = dd10.l.f;
                                            final dd[] at2 = this.at;
                                            if (dd10 == at2[3]) {
                                                db2 = at2[1].l.f;
                                            }
                                            final int a13 = j5.a();
                                            final dc b12 = dd9.j.b;
                                            int n23 = a13;
                                            if (b12 != null) {
                                                final dc l5 = b12.a.l;
                                                final dc b13 = l5.b;
                                                n23 = a13;
                                                if (b13 != null) {
                                                    n23 = a13;
                                                    if (b13.a == dd9) {
                                                        n23 = a13 + l5.a();
                                                    }
                                                }
                                            }
                                            cz.i(f, dd9.j.b.f, n23, 2);
                                            final int a14 = dd9.l.a();
                                            int n24 = 0;
                                            Label_1816: {
                                                if (dd9.l.b != null) {
                                                    final dd ac3 = dd9.ac;
                                                    if (ac3 != null) {
                                                        final dc j6 = ac3.j;
                                                        int a15;
                                                        if (j6.b != null) {
                                                            a15 = j6.a();
                                                        }
                                                        else {
                                                            a15 = 0;
                                                        }
                                                        n24 = a14 + a15;
                                                        break Label_1816;
                                                    }
                                                }
                                                n24 = a14;
                                            }
                                            cz.j(f2, dd9.l.b.f, -n24, 2);
                                            if (n22 == n21) {
                                                final int a16 = dd10.j.a();
                                                final dc b14 = dd10.j.b;
                                                int n25 = a16;
                                                if (b14 != null) {
                                                    final dc l6 = b14.a.l;
                                                    final dc b15 = l6.b;
                                                    n25 = a16;
                                                    if (b15 != null) {
                                                        n25 = a16;
                                                        if (b15.a == dd10) {
                                                            n25 = a16 + l6.a();
                                                        }
                                                    }
                                                }
                                                cz.i(f3, dd10.j.b.f, n25, 2);
                                                dc dc = dd10.l;
                                                final dd[] at3 = this.at;
                                                if (dd10 == at3[3]) {
                                                    dc = at3[1].l;
                                                }
                                                final int a17 = dc.a();
                                                final dc b16 = dc.b;
                                                int n26 = a17;
                                                if (b16 != null) {
                                                    final dc j7 = b16.a.j;
                                                    final dc b17 = j7.b;
                                                    n26 = a17;
                                                    if (b17 != null) {
                                                        n26 = a17;
                                                        if (b17.a == dd10) {
                                                            n26 = a17 + j7.a();
                                                        }
                                                    }
                                                }
                                                cz.j(db2, dc.b.f, -n26, 2);
                                            }
                                            final int h = dd.h;
                                            if (h > 0) {
                                                cz.j(f2, f, h, 2);
                                            }
                                            final cw a18 = cz.a();
                                            a18.f(dd9.aa, n2, dd10.aa, f, dd9.j.a(), f2, dd9.l.a(), f3, dd10.j.a(), db2, dd10.l.a());
                                            cz.g(a18);
                                            n19 = n22;
                                        }
                                    }
                                    break Label_3104;
                                }
                                dd11 = dd2;
                                dd12 = (dd13 = null);
                                dd14 = dd;
                            }
                            else {
                                dd11 = dd2;
                                dd12 = (dd13 = null);
                                b = false;
                                dd14 = dd;
                            }
                            while (true) {
                                final dd dd15 = dd11;
                                if (dd15 == null) {
                                    break;
                                }
                                final dd ac4 = dd15.ac;
                                dd dd16;
                                if (ac4 == null) {
                                    dd16 = this.at[1];
                                    b = true;
                                }
                                else {
                                    dd16 = dd12;
                                }
                                dd a22 = null;
                                Label_2925: {
                                    if (w == 2) {
                                        final dc j8 = dd15.j;
                                        int a19 = j8.a();
                                        if (dd13 != null) {
                                            a19 += dd13.l.a();
                                        }
                                        int n27;
                                        if (dd2 != dd15) {
                                            n27 = 3;
                                        }
                                        else {
                                            n27 = 1;
                                        }
                                        final dc b18 = j8.b;
                                        db db3;
                                        db db4;
                                        if (b18 != null) {
                                            db3 = j8.f;
                                            db4 = b18.f;
                                        }
                                        else {
                                            final dc m2 = dd15.m;
                                            final dc b19 = m2.b;
                                            if (b19 != null) {
                                                db3 = m2.f;
                                                db4 = b19.f;
                                                a19 -= j8.a();
                                            }
                                            else {
                                                db4 = (db3 = null);
                                            }
                                        }
                                        if (db3 != null && db4 != null) {
                                            cz.i(db3, db4, a19, n27);
                                        }
                                        if (dd15.ae == 3) {
                                            final dc l7 = dd15.l;
                                            if (dd15.d == 1) {
                                                cz.n(l7.f, j8.f, Math.max(dd15.g, dd15.d()), 3);
                                            }
                                            else {
                                                cz.i(j8.f, j8.b.f, j8.c, 3);
                                                cz.j(l7.f, j8.f, dd15.g, 3);
                                            }
                                        }
                                    }
                                    else if (w != 0 && b && dd13 != null) {
                                        final dc l8 = dd15.l;
                                        if (l8.b == null) {
                                            cz.h(l8.f, dd15.c() + dd15.z);
                                        }
                                        else {
                                            cz.n(dd15.l.f, dd16.l.b.f, -l8.a(), 5);
                                        }
                                    }
                                    else if (w != 0 && !b && dd13 == null) {
                                        final dc j9 = dd15.j;
                                        if (j9.b == null) {
                                            cz.h(j9.f, dd15.c());
                                        }
                                        else {
                                            cz.n(dd15.j.f, dd14.j.b.f, j9.a(), 5);
                                        }
                                    }
                                    else {
                                        final dc j10 = dd15.j;
                                        final dc l9 = dd15.l;
                                        final int a20 = j10.a();
                                        final int a21 = l9.a();
                                        cz.i(j10.f, j10.b.f, a20, 1);
                                        cz.j(l9.f, l9.b.f, -a21, 1);
                                        final dc b20 = j10.b;
                                        db db5;
                                        if (b20 != null) {
                                            db5 = b20.f;
                                        }
                                        else {
                                            db5 = null;
                                        }
                                        if (dd13 == null) {
                                            final dc b21 = dd14.j.b;
                                            if (b21 != null) {
                                                db5 = b21.f;
                                            }
                                            else {
                                                db5 = null;
                                            }
                                        }
                                        if (ac4 == null) {
                                            final dc b22 = dd16.l.b;
                                            if (b22 != null) {
                                                a22 = b22.a;
                                            }
                                            else {
                                                a22 = null;
                                            }
                                        }
                                        else {
                                            a22 = ac4;
                                        }
                                        if (a22 == null) {
                                            break Label_2925;
                                        }
                                        db db6 = a22.j.f;
                                        if (b) {
                                            final dc b23 = dd16.l.b;
                                            if (b23 != null) {
                                                db6 = b23.f;
                                            }
                                            else {
                                                db6 = null;
                                            }
                                        }
                                        if (db5 != null && db6 != null) {
                                            cz.m(j10.f, db5, a20, 0.5f, db6, l9.f, a21);
                                        }
                                        break Label_2925;
                                    }
                                    a22 = ac4;
                                }
                                if (b) {
                                    a22 = null;
                                }
                                dd13 = dd15;
                                final dd dd17 = dd16;
                                dd11 = a22;
                                dd12 = dd17;
                            }
                            final int n28 = n = n;
                            if (w == 2) {
                                final dc j11 = dd2.j;
                                final dc l10 = dd12.l;
                                final int a23 = j11.a();
                                final int a24 = l10.a();
                                final dc b24 = dd14.j.b;
                                db f4;
                                if (b24 != null) {
                                    f4 = b24.f;
                                }
                                else {
                                    f4 = null;
                                }
                                final dc b25 = dd12.l.b;
                                db f5;
                                if (b25 != null) {
                                    f5 = b25.f;
                                }
                                else {
                                    f5 = null;
                                }
                                n = n28;
                                if (f4 != null) {
                                    n = n28;
                                    if (f5 != null) {
                                        cz.j(l10.f, f5, -a24, 1);
                                        cz.m(j11.f, f4, a23, dd14.I, f5, l10.f, a24);
                                        n = n28;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++n;
        }
    }
    
    final void A(dd a, int n) {
        final int n2 = 0;
        final int n3 = 0;
        dd dd = a;
        if (n != 0) {
            while (true) {
                final dc j = dd.j;
                final dc b = j.b;
                n = n2;
                if (b == null) {
                    break;
                }
                a = b.a;
                final dc b2 = a.l.b;
                n = n2;
                if (b2 == null) {
                    break;
                }
                n = n2;
                if (b2 != j) {
                    break;
                }
                n = n2;
                if (a == dd) {
                    break;
                }
                dd = a;
            }
            int ao;
            while (true) {
                ao = this.ao;
                if (n >= ao) {
                    break;
                }
                if (this.aq[n] == dd) {
                    return;
                }
                ++n;
            }
            final dd[] aq = this.aq;
            n = aq.length;
            if (ao + 1 >= n) {
                this.aq = Arrays.copyOf(aq, n + n);
            }
            final dd[] aq2 = this.aq;
            n = this.ao;
            aq2[n] = dd;
            this.ao = n + 1;
            return;
        }
        while (true) {
            final dc i = a.i;
            final dc b3 = i.b;
            n = n3;
            if (b3 == null) {
                break;
            }
            final dd a2 = b3.a;
            final dc b4 = a2.k.b;
            n = n3;
            if (b4 == null) {
                break;
            }
            n = n3;
            if (b4 != i) {
                break;
            }
            n = n3;
            if (a2 == a) {
                break;
            }
            a = a2;
        }
        while (true) {
            final int an = this.an;
            if (n >= an) {
                final dd[] ar = this.ar;
                n = ar.length;
                if (an + 1 >= n) {
                    this.ar = Arrays.copyOf(ar, n + n);
                }
                final dd[] ar2 = this.ar;
                n = this.an;
                ar2[n] = a;
                this.an = n + 1;
                return;
            }
            if (this.ar[n] == a) {
                break;
            }
            ++n;
        }
    }
    
    public final void B(final dd dd, final boolean[] array) {
        final int ad = dd.ad;
        final boolean b = false;
        int m = 0;
        if (ad == 3 && dd.ae == 3 && dd.u > 0.0f) {
            array[0] = false;
            return;
        }
        int n = dd.f();
        if (dd.ad == 3 && dd.ae != 3 && dd.u > 0.0f) {
            array[0] = false;
            return;
        }
        dd.T = true;
        Label_0789: {
            if (dd instanceof df) {
                final df df = (df)dd;
                if (df.ai == 1) {
                    final int ag = df.ag;
                    if (ag != -1) {
                        m = ag;
                        n = 0;
                    }
                    else {
                        n = df.ah;
                        if (n == -1) {
                            n = 0;
                        }
                    }
                }
                else {
                    m = n;
                }
            }
            else if (!dd.k.c() && !dd.i.c()) {
                m = n + dd.w;
            }
            else {
                final dc k = dd.k;
                final dc b2 = k.b;
                Label_0250: {
                    if (b2 != null) {
                        final dc b3 = dd.i.b;
                        if (b3 != null) {
                            if (b2 != b3) {
                                final dd a = b2.a;
                                if (a != b3.a) {
                                    break Label_0250;
                                }
                                if (a == dd.r) {
                                    break Label_0250;
                                }
                            }
                            array[0] = false;
                            return;
                        }
                    }
                }
                dd dd2 = null;
                int n3;
                dd dd3;
                if (b2 != null) {
                    final dd a2 = b2.a;
                    final int n2 = n3 = k.a() + n;
                    dd3 = a2;
                    if (!a2.t()) {
                        n3 = n2;
                        dd3 = a2;
                        if (!a2.T) {
                            this.B(a2, array);
                            n3 = n2;
                            dd3 = a2;
                        }
                    }
                }
                else {
                    n3 = n;
                    dd3 = null;
                }
                final dc i = dd.i;
                final dc b4 = i.b;
                m = n;
                if (b4 != null) {
                    final dd a3 = b4.a;
                    final int n4 = m = n + i.a();
                    dd2 = a3;
                    if (!a3.t()) {
                        m = n4;
                        dd2 = a3;
                        if (!a3.T) {
                            this.B(a3, array);
                            m = n4;
                            dd2 = a3;
                        }
                    }
                }
                n = n3;
                Label_0598: {
                    if (dd.k.b != null) {
                        n = n3;
                        if (!dd3.t()) {
                            final int g = dd.k.b.g;
                            int n5;
                            if (g == 4) {
                                n5 = n3 + (dd3.N - dd3.f());
                            }
                            else {
                                n5 = n3;
                                if (g == 2) {
                                    n5 = n3 + dd3.N;
                                }
                            }
                            final boolean q = dd3.Q || (dd3.i.b != null && dd3.k.b != null && dd3.ad != 3);
                            dd.Q = q;
                            n = n5;
                            if (q) {
                                final dc b5 = dd3.i.b;
                                if (b5 != null) {
                                    n = n5;
                                    if (b5.a == dd) {
                                        break Label_0598;
                                    }
                                }
                                n = n5 + (n5 - dd3.N);
                            }
                        }
                    }
                }
                if (dd.i.b != null && !dd2.t()) {
                    final int g2 = dd.i.b.g;
                    int n6;
                    if (g2 == 2) {
                        n6 = m + (dd2.M - dd2.f());
                    }
                    else {
                        n6 = m;
                        if (g2 == 4) {
                            n6 = m + dd2.M;
                        }
                    }
                    final boolean p2 = dd2.P || (dd2.i.b != null && dd2.k.b != null && dd2.ad != 3) || b;
                    dd.P = p2;
                    Label_0782: {
                        if (p2) {
                            final dc b6 = dd2.k.b;
                            if (b6 != null) {
                                if (b6.a == dd) {
                                    break Label_0782;
                                }
                            }
                            m = n6 + (n6 - dd2.M);
                            break Label_0789;
                        }
                    }
                    m = n6;
                }
            }
        }
        if (dd.K == 8) {
            final int s = dd.s;
            m -= s;
            n -= s;
        }
        dd.M = m;
        dd.N = n;
    }
    
    public final void C(final dd dd, final boolean[] array) {
        final int ae = dd.ae;
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        if (ae == 3 && dd.ad != 3 && dd.u > 0.0f) {
            array[0] = false;
            return;
        }
        int o = dd.e();
        dd.U = true;
        int l = 0;
        Label_0952: {
            if (dd instanceof df) {
                final df df = (df)dd;
                if (df.ai == 0) {
                    o = df.ag;
                    if (o != -1) {
                        n2 = n;
                    }
                    else {
                        final int ah = df.ah;
                        if (ah != -1) {
                            n2 = ah;
                        }
                        o = 0;
                    }
                }
                else {
                    n2 = o;
                }
                final int n3 = o;
                o = n2;
                l = n3;
            }
            else {
                final dc m = dd.m;
                if (m.b == null && dd.j.b == null && dd.l.b == null) {
                    l = dd.x + o;
                }
                else {
                    final dc b2 = dd.l.b;
                    Label_0238: {
                        if (b2 != null) {
                            final dc b3 = dd.j.b;
                            if (b3 != null) {
                                if (b2 != b3) {
                                    final dd a = b2.a;
                                    if (a != b3.a) {
                                        break Label_0238;
                                    }
                                    if (a == dd.r) {
                                        break Label_0238;
                                    }
                                }
                                array[0] = false;
                                return;
                            }
                        }
                    }
                    if (m.c()) {
                        final dd a2 = dd.m.b.a;
                        if (!a2.U) {
                            this.C(a2, array);
                        }
                        final int max = Math.max(a2.L - a2.t + o, o);
                        int max2 = Math.max(a2.O - a2.t + o, o);
                        int i = max;
                        if (dd.K == 8) {
                            final int t = dd.t;
                            i = max - t;
                            max2 -= t;
                        }
                        dd.L = i;
                        dd.O = max2;
                        return;
                    }
                    final boolean c = dd.j.c();
                    final dd dd2 = null;
                    int n5;
                    dd dd3;
                    if (c) {
                        final dc j = dd.j;
                        final dd a3 = j.b.a;
                        final int n4 = n5 = j.a() + o;
                        dd3 = a3;
                        if (!a3.t()) {
                            n5 = n4;
                            dd3 = a3;
                            if (!a3.U) {
                                this.C(a3, array);
                                n5 = n4;
                                dd3 = a3;
                            }
                        }
                    }
                    else {
                        n5 = o;
                        dd3 = null;
                    }
                    dd dd4;
                    if (dd.l.c()) {
                        final dc k = dd.l;
                        final dd a4 = k.b.a;
                        o += k.a();
                        if (!a4.t() && !a4.U) {
                            this.C(a4, array);
                        }
                        dd4 = a4;
                    }
                    else {
                        dd4 = dd2;
                    }
                    l = n5;
                    Label_0747: {
                        if (dd.j.b != null) {
                            l = n5;
                            if (!dd3.t()) {
                                final int g = dd.j.b.g;
                                int n6;
                                if (g == 3) {
                                    n6 = n5 + (dd3.L - dd3.e());
                                }
                                else {
                                    n6 = n5;
                                    if (g == 5) {
                                        n6 = n5 + dd3.L;
                                    }
                                }
                                boolean r = false;
                                Label_0688: {
                                    if (!dd3.R) {
                                        final dc b4 = dd3.j.b;
                                        if (b4 != null && b4.a != dd) {
                                            final dc b5 = dd3.l.b;
                                            if (b5 != null && b5.a != dd && dd3.ae != 3) {
                                                r = true;
                                                break Label_0688;
                                            }
                                        }
                                        r = false;
                                    }
                                    else {
                                        r = true;
                                    }
                                }
                                dd.R = r;
                                l = n6;
                                if (r) {
                                    final dc b6 = dd3.l.b;
                                    if (b6 != null) {
                                        l = n6;
                                        if (b6.a == dd) {
                                            break Label_0747;
                                        }
                                    }
                                    l = n6 + (n6 - dd3.L);
                                }
                            }
                        }
                    }
                    if (dd.l.b != null && !dd4.t()) {
                        final int g2 = dd.l.b.g;
                        int n7;
                        if (g2 == 5) {
                            n7 = o + (dd4.O - dd4.e());
                        }
                        else {
                            n7 = o;
                            if (g2 == 3) {
                                n7 = o + dd4.O;
                            }
                        }
                        boolean s = false;
                        Label_0892: {
                            if (!dd4.S) {
                                final dc b7 = dd4.j.b;
                                if (b7 != null && b7.a != dd) {
                                    final dc b8 = dd4.l.b;
                                    if (b8 != null && b8.a != dd && dd4.ae != 3) {
                                        s = true;
                                        break Label_0892;
                                    }
                                }
                                s = b;
                            }
                            else {
                                s = true;
                            }
                        }
                        dd.S = s;
                        Label_0946: {
                            if (s) {
                                final dc b9 = dd4.j.b;
                                if (b9 != null) {
                                    if (b9.a == dd) {
                                        break Label_0946;
                                    }
                                }
                                o = n7 + (n7 - dd4.O);
                                break Label_0952;
                            }
                        }
                        o = n7;
                    }
                }
            }
        }
        if (dd.K == 8) {
            final int t2 = dd.t;
            l -= t2;
            o -= t2;
        }
        dd.L = l;
        dd.O = o;
    }
    
    @Override
    public final void D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        de.w:I
        //     4: istore_1       
        //     5: aload_0        
        //     6: getfield        de.x:I
        //     9: istore_2       
        //    10: iconst_0       
        //    11: aload_0        
        //    12: invokevirtual   dd.h:()I
        //    15: invokestatic    java/lang/Math.max:(II)I
        //    18: istore_3       
        //    19: iconst_0       
        //    20: aload_0        
        //    21: invokevirtual   dd.d:()I
        //    24: invokestatic    java/lang/Math.max:(II)I
        //    27: istore          4
        //    29: aload_0        
        //    30: iconst_0       
        //    31: putfield        de.aj:Z
        //    34: aload_0        
        //    35: iconst_0       
        //    36: putfield        de.ak:Z
        //    39: aload_0        
        //    40: getfield        de.r:Ldd;
        //    43: ifnull          315
        //    46: aload_0        
        //    47: getfield        de.am:Ldh;
        //    50: ifnonnull       65
        //    53: aload_0        
        //    54: new             Ldh;
        //    57: dup            
        //    58: aload_0        
        //    59: invokespecial   dh.<init>:(Ldd;)V
        //    62: putfield        de.am:Ldh;
        //    65: aload_0        
        //    66: getfield        de.am:Ldh;
        //    69: astore          5
        //    71: aload           5
        //    73: aload_0        
        //    74: getfield        dd.w:I
        //    77: putfield        dh.a:I
        //    80: aload           5
        //    82: aload_0        
        //    83: getfield        dd.x:I
        //    86: putfield        dh.b:I
        //    89: aload           5
        //    91: aload_0        
        //    92: invokevirtual   dd.h:()I
        //    95: putfield        dh.c:I
        //    98: aload           5
        //   100: aload_0        
        //   101: invokevirtual   dd.d:()I
        //   104: putfield        dh.d:I
        //   107: aload           5
        //   109: getfield        dh.e:Ljava/util/ArrayList;
        //   112: invokevirtual   java/util/ArrayList.size:()I
        //   115: istore          6
        //   117: iconst_0       
        //   118: istore          7
        //   120: iload           7
        //   122: iload           6
        //   124: if_icmpge       251
        //   127: aload           5
        //   129: getfield        dh.e:Ljava/util/ArrayList;
        //   132: iload           7
        //   134: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   137: checkcast       Ldg;
        //   140: astore          8
        //   142: aload           8
        //   144: aload_0        
        //   145: aload           8
        //   147: getfield        dg.a:Ldc;
        //   150: getfield        dc.g:I
        //   153: invokevirtual   dd.u:(I)Ldc;
        //   156: putfield        dg.a:Ldc;
        //   159: aload           8
        //   161: getfield        dg.a:Ldc;
        //   164: astore          9
        //   166: aload           9
        //   168: ifnull          221
        //   171: aload           8
        //   173: aload           9
        //   175: getfield        dc.b:Ldc;
        //   178: putfield        dg.b:Ldc;
        //   181: aload           8
        //   183: aload           9
        //   185: invokevirtual   dc.a:()I
        //   188: putfield        dg.c:I
        //   191: aload           8
        //   193: getfield        dg.a:Ldc;
        //   196: astore          9
        //   198: aload           8
        //   200: aload           9
        //   202: getfield        dc.h:I
        //   205: putfield        dg.e:I
        //   208: aload           8
        //   210: aload           9
        //   212: getfield        dc.e:I
        //   215: putfield        dg.d:I
        //   218: goto            245
        //   221: aload           8
        //   223: aconst_null    
        //   224: putfield        dg.b:Ldc;
        //   227: aload           8
        //   229: iconst_0       
        //   230: putfield        dg.c:I
        //   233: aload           8
        //   235: iconst_2       
        //   236: putfield        dg.e:I
        //   239: aload           8
        //   241: iconst_0       
        //   242: putfield        dg.d:I
        //   245: iinc            7, 1
        //   248: goto            120
        //   251: aload_0        
        //   252: iconst_0       
        //   253: putfield        dd.w:I
        //   256: aload_0        
        //   257: iconst_0       
        //   258: putfield        dd.x:I
        //   261: aload_0        
        //   262: getfield        dd.q:Ljava/util/ArrayList;
        //   265: invokevirtual   java/util/ArrayList.size:()I
        //   268: istore          6
        //   270: iconst_0       
        //   271: istore          7
        //   273: iload           7
        //   275: iload           6
        //   277: if_icmpge       301
        //   280: aload_0        
        //   281: getfield        dd.q:Ljava/util/ArrayList;
        //   284: iload           7
        //   286: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   289: checkcast       Ldc;
        //   292: invokevirtual   dc.b:()V
        //   295: iinc            7, 1
        //   298: goto            273
        //   301: aload_0        
        //   302: aload_0        
        //   303: getfield        de.af:Lcz;
        //   306: getfield        cz.g:Lcx;
        //   309: invokevirtual   dd.j:(Lcx;)V
        //   312: goto            325
        //   315: aload_0        
        //   316: iconst_0       
        //   317: putfield        de.w:I
        //   320: aload_0        
        //   321: iconst_0       
        //   322: putfield        de.x:I
        //   325: aload_0        
        //   326: getfield        de.ae:I
        //   329: istore          10
        //   331: aload_0        
        //   332: getfield        de.ad:I
        //   335: istore          6
        //   337: aload_0        
        //   338: getfield        de.ai:I
        //   341: iconst_2       
        //   342: if_icmpne       1028
        //   345: iload           6
        //   347: istore          7
        //   349: iload           10
        //   351: iconst_2       
        //   352: if_icmpeq       370
        //   355: iload           6
        //   357: iconst_2       
        //   358: if_icmpne       367
        //   361: iconst_2       
        //   362: istore          7
        //   364: goto            370
        //   367: goto            1028
        //   370: aload_0        
        //   371: getfield        de.al:Ljava/util/ArrayList;
        //   374: astore          8
        //   376: aload_0        
        //   377: getfield        de.as:[Z
        //   380: astore          5
        //   382: aload           8
        //   384: invokevirtual   java/util/ArrayList.size:()I
        //   387: istore          11
        //   389: aload           5
        //   391: iconst_0       
        //   392: iconst_1       
        //   393: bastore        
        //   394: iconst_0       
        //   395: istore          12
        //   397: iconst_0       
        //   398: istore          13
        //   400: iconst_0       
        //   401: istore          14
        //   403: iconst_0       
        //   404: istore          15
        //   406: iconst_0       
        //   407: istore          16
        //   409: iconst_0       
        //   410: istore          17
        //   412: iconst_0       
        //   413: istore          18
        //   415: iload           15
        //   417: iload           11
        //   419: if_icmpge       725
        //   422: aload           8
        //   424: iload           15
        //   426: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   429: checkcast       Ldd;
        //   432: astore          9
        //   434: aload           9
        //   436: invokevirtual   dd.t:()Z
        //   439: ifeq            445
        //   442: goto            719
        //   445: aload           9
        //   447: getfield        dd.T:Z
        //   450: ifne            461
        //   453: aload_0        
        //   454: aload           9
        //   456: aload           5
        //   458: invokevirtual   de.B:(Ldd;[Z)V
        //   461: aload           9
        //   463: getfield        dd.U:Z
        //   466: ifne            477
        //   469: aload_0        
        //   470: aload           9
        //   472: aload           5
        //   474: invokevirtual   de.C:(Ldd;[Z)V
        //   477: aload           5
        //   479: iconst_0       
        //   480: baload         
        //   481: ifne            487
        //   484: goto            843
        //   487: aload           9
        //   489: getfield        dd.M:I
        //   492: istore          19
        //   494: aload           9
        //   496: getfield        dd.N:I
        //   499: istore          20
        //   501: aload           9
        //   503: invokevirtual   dd.h:()I
        //   506: istore          6
        //   508: aload           9
        //   510: getfield        dd.L:I
        //   513: istore          21
        //   515: aload           9
        //   517: getfield        dd.O:I
        //   520: istore          22
        //   522: aload           9
        //   524: invokevirtual   dd.d:()I
        //   527: istore          23
        //   529: aload           9
        //   531: getfield        dd.ad:I
        //   534: iconst_4       
        //   535: if_icmpne       566
        //   538: aload           9
        //   540: invokevirtual   dd.h:()I
        //   543: aload           9
        //   545: getfield        dd.i:Ldc;
        //   548: getfield        dc.c:I
        //   551: iadd           
        //   552: aload           9
        //   554: getfield        dd.k:Ldc;
        //   557: getfield        dc.c:I
        //   560: iadd           
        //   561: istore          6
        //   563: goto            576
        //   566: iload           19
        //   568: iload           20
        //   570: iadd           
        //   571: iload           6
        //   573: isub           
        //   574: istore          6
        //   576: aload           9
        //   578: getfield        dd.ae:I
        //   581: iconst_4       
        //   582: if_icmpne       613
        //   585: aload           9
        //   587: invokevirtual   dd.d:()I
        //   590: aload           9
        //   592: getfield        dd.j:Ldc;
        //   595: getfield        dc.c:I
        //   598: iadd           
        //   599: aload           9
        //   601: getfield        dd.l:Ldc;
        //   604: getfield        dc.c:I
        //   607: iadd           
        //   608: istore          21
        //   610: goto            623
        //   613: iload           21
        //   615: iload           22
        //   617: iadd           
        //   618: iload           23
        //   620: isub           
        //   621: istore          21
        //   623: aload           9
        //   625: getfield        dd.K:I
        //   628: istore          23
        //   630: iload           23
        //   632: bipush          8
        //   634: if_icmpne       640
        //   637: iconst_0       
        //   638: istore          21
        //   640: iload           23
        //   642: bipush          8
        //   644: if_icmpne       653
        //   647: iconst_0       
        //   648: istore          6
        //   650: goto            653
        //   653: iload           12
        //   655: aload           9
        //   657: getfield        dd.M:I
        //   660: invokestatic    java/lang/Math.max:(II)I
        //   663: istore          12
        //   665: iload           14
        //   667: aload           9
        //   669: getfield        dd.N:I
        //   672: invokestatic    java/lang/Math.max:(II)I
        //   675: istore          14
        //   677: iload           17
        //   679: aload           9
        //   681: getfield        dd.O:I
        //   684: invokestatic    java/lang/Math.max:(II)I
        //   687: istore          17
        //   689: iload           16
        //   691: aload           9
        //   693: getfield        dd.L:I
        //   696: invokestatic    java/lang/Math.max:(II)I
        //   699: istore          16
        //   701: iload           13
        //   703: iload           6
        //   705: invokestatic    java/lang/Math.max:(II)I
        //   708: istore          13
        //   710: iload           18
        //   712: iload           21
        //   714: invokestatic    java/lang/Math.max:(II)I
        //   717: istore          18
        //   719: iinc            15, 1
        //   722: goto            415
        //   725: iload           12
        //   727: iload           14
        //   729: invokestatic    java/lang/Math.max:(II)I
        //   732: istore          6
        //   734: aload_0        
        //   735: aload_0        
        //   736: getfield        de.D:I
        //   739: iload           6
        //   741: iload           13
        //   743: invokestatic    java/lang/Math.max:(II)I
        //   746: invokestatic    java/lang/Math.max:(II)I
        //   749: putfield        de.ag:I
        //   752: iload           16
        //   754: iload           17
        //   756: invokestatic    java/lang/Math.max:(II)I
        //   759: istore          6
        //   761: aload_0        
        //   762: aload_0        
        //   763: getfield        de.E:I
        //   766: iload           6
        //   768: iload           18
        //   770: invokestatic    java/lang/Math.max:(II)I
        //   773: invokestatic    java/lang/Math.max:(II)I
        //   776: putfield        de.ah:I
        //   779: iconst_0       
        //   780: istore          6
        //   782: iload           6
        //   784: iload           11
        //   786: if_icmpge       843
        //   789: aload           8
        //   791: iload           6
        //   793: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   796: checkcast       Ldd;
        //   799: astore          5
        //   801: aload           5
        //   803: iconst_0       
        //   804: putfield        dd.T:Z
        //   807: aload           5
        //   809: iconst_0       
        //   810: putfield        dd.U:Z
        //   813: aload           5
        //   815: iconst_0       
        //   816: putfield        dd.P:Z
        //   819: aload           5
        //   821: iconst_0       
        //   822: putfield        dd.Q:Z
        //   825: aload           5
        //   827: iconst_0       
        //   828: putfield        dd.R:Z
        //   831: aload           5
        //   833: iconst_0       
        //   834: putfield        dd.S:Z
        //   837: iinc            6, 1
        //   840: goto            782
        //   843: aload_0        
        //   844: getfield        de.as:[Z
        //   847: iconst_0       
        //   848: baload         
        //   849: istore          24
        //   851: iload           24
        //   853: istore          25
        //   855: iload_3        
        //   856: ifle            898
        //   859: iload           24
        //   861: istore          25
        //   863: iload           4
        //   865: ifle            898
        //   868: aload_0        
        //   869: getfield        de.ag:I
        //   872: iload_3        
        //   873: if_icmpgt       895
        //   876: iload           24
        //   878: istore          25
        //   880: aload_0        
        //   881: getfield        de.ah:I
        //   884: iload           4
        //   886: if_icmple       898
        //   889: iconst_0       
        //   890: istore          25
        //   892: goto            898
        //   895: iconst_0       
        //   896: istore          25
        //   898: iload           25
        //   900: ifeq            1018
        //   903: aload_0        
        //   904: getfield        de.ad:I
        //   907: iconst_2       
        //   908: if_icmpne       956
        //   911: aload_0        
        //   912: iconst_1       
        //   913: putfield        de.ad:I
        //   916: iload_3        
        //   917: ifle            941
        //   920: iload_3        
        //   921: aload_0        
        //   922: getfield        de.ag:I
        //   925: if_icmpge       941
        //   928: aload_0        
        //   929: iconst_1       
        //   930: putfield        de.aj:Z
        //   933: aload_0        
        //   934: iload_3        
        //   935: invokevirtual   dd.q:(I)V
        //   938: goto            956
        //   941: aload_0        
        //   942: aload_0        
        //   943: getfield        de.D:I
        //   946: aload_0        
        //   947: getfield        de.ag:I
        //   950: invokestatic    java/lang/Math.max:(II)I
        //   953: invokevirtual   dd.q:(I)V
        //   956: aload_0        
        //   957: getfield        de.ae:I
        //   960: iconst_2       
        //   961: if_icmpne       1015
        //   964: aload_0        
        //   965: iconst_1       
        //   966: putfield        de.ae:I
        //   969: iload           4
        //   971: ifle            997
        //   974: iload           4
        //   976: aload_0        
        //   977: getfield        de.ah:I
        //   980: if_icmpge       997
        //   983: aload_0        
        //   984: iconst_1       
        //   985: putfield        de.ak:Z
        //   988: aload_0        
        //   989: iload           4
        //   991: invokevirtual   dd.k:(I)V
        //   994: goto            1018
        //   997: aload_0        
        //   998: aload_0        
        //   999: getfield        de.E:I
        //  1002: aload_0        
        //  1003: getfield        de.ah:I
        //  1006: invokestatic    java/lang/Math.max:(II)I
        //  1009: invokevirtual   dd.k:(I)V
        //  1012: goto            1018
        //  1015: goto            1018
        //  1018: iload           7
        //  1020: istore          11
        //  1022: iload_2        
        //  1023: istore          23
        //  1025: goto            1038
        //  1028: iconst_0       
        //  1029: istore          25
        //  1031: iload_2        
        //  1032: istore          23
        //  1034: iload           6
        //  1036: istore          11
        //  1038: aload_0        
        //  1039: iconst_0       
        //  1040: putfield        de.an:I
        //  1043: aload_0        
        //  1044: iconst_0       
        //  1045: putfield        de.ao:I
        //  1048: aload_0        
        //  1049: getfield        de.al:Ljava/util/ArrayList;
        //  1052: invokevirtual   java/util/ArrayList.size:()I
        //  1055: istore          20
        //  1057: iconst_0       
        //  1058: istore_2       
        //  1059: iload_2        
        //  1060: iload           20
        //  1062: if_icmpge       1100
        //  1065: aload_0        
        //  1066: getfield        de.al:Ljava/util/ArrayList;
        //  1069: iload_2        
        //  1070: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1073: checkcast       Ldd;
        //  1076: astore          5
        //  1078: aload           5
        //  1080: instanceof      Ldi;
        //  1083: ifeq            1094
        //  1086: aload           5
        //  1088: checkcast       Ldi;
        //  1091: invokevirtual   di.D:()V
        //  1094: iinc            2, 1
        //  1097: goto            1059
        //  1100: iconst_0       
        //  1101: istore          15
        //  1103: iconst_1       
        //  1104: istore          26
        //  1106: iload           10
        //  1108: istore          6
        //  1110: iload           25
        //  1112: istore          24
        //  1114: iload           4
        //  1116: istore_2       
        //  1117: iload_3        
        //  1118: istore          7
        //  1120: iload_1        
        //  1121: istore          21
        //  1123: iload           26
        //  1125: ifeq            3320
        //  1128: iload           15
        //  1130: iconst_1       
        //  1131: iadd           
        //  1132: istore          19
        //  1134: aload_0        
        //  1135: getfield        de.af:Lcz;
        //  1138: invokevirtual   cz.l:()V
        //  1141: aload_0        
        //  1142: aload_0        
        //  1143: getfield        de.af:Lcz;
        //  1146: invokevirtual   de.E:(Lcz;)Z
        //  1149: istore          25
        //  1151: iload           25
        //  1153: ifeq            2624
        //  1156: iload           21
        //  1158: istore          13
        //  1160: iload           7
        //  1162: istore          17
        //  1164: iload_2        
        //  1165: istore          16
        //  1167: iload           24
        //  1169: istore          27
        //  1171: iload           25
        //  1173: istore          26
        //  1175: iload           6
        //  1177: istore          15
        //  1179: aload_0        
        //  1180: getfield        de.af:Lcz;
        //  1183: astore          28
        //  1185: iload           21
        //  1187: istore          13
        //  1189: iload           7
        //  1191: istore          17
        //  1193: iload_2        
        //  1194: istore          16
        //  1196: iload           24
        //  1198: istore          27
        //  1200: iload           25
        //  1202: istore          26
        //  1204: iload           6
        //  1206: istore          15
        //  1208: aload           28
        //  1210: getfield        cz.b:Lcy;
        //  1213: astore          29
        //  1215: iload           21
        //  1217: istore          13
        //  1219: iload           7
        //  1221: istore          17
        //  1223: iload_2        
        //  1224: istore          16
        //  1226: iload           24
        //  1228: istore          27
        //  1230: iload           25
        //  1232: istore          26
        //  1234: iload           6
        //  1236: istore          15
        //  1238: aload           29
        //  1240: aload           28
        //  1242: invokevirtual   cy.a:(Lcz;)V
        //  1245: iload           21
        //  1247: istore          13
        //  1249: iload           7
        //  1251: istore          17
        //  1253: iload_2        
        //  1254: istore          16
        //  1256: iload           24
        //  1258: istore          27
        //  1260: iload           25
        //  1262: istore          26
        //  1264: iload           6
        //  1266: istore          15
        //  1268: aload           28
        //  1270: aload           29
        //  1272: invokevirtual   cz.o:(Lcy;)V
        //  1275: iconst_0       
        //  1276: istore          18
        //  1278: iload           21
        //  1280: istore          13
        //  1282: iload           7
        //  1284: istore          17
        //  1286: iload_2        
        //  1287: istore          16
        //  1289: iload           24
        //  1291: istore          27
        //  1293: iload           25
        //  1295: istore          26
        //  1297: iload           6
        //  1299: istore          15
        //  1301: iload           18
        //  1303: aload           28
        //  1305: getfield        cz.e:I
        //  1308: if_icmpge       1349
        //  1311: iload           21
        //  1313: istore          13
        //  1315: iload           7
        //  1317: istore          17
        //  1319: iload_2        
        //  1320: istore          16
        //  1322: iload           24
        //  1324: istore          27
        //  1326: iload           25
        //  1328: istore          26
        //  1330: iload           6
        //  1332: istore          15
        //  1334: aload           28
        //  1336: getfield        cz.d:[Z
        //  1339: iload           18
        //  1341: iconst_0       
        //  1342: bastore        
        //  1343: iinc            18, 1
        //  1346: goto            1278
        //  1349: iconst_0       
        //  1350: istore          16
        //  1352: iconst_0       
        //  1353: istore          18
        //  1355: iload           16
        //  1357: ifne            2429
        //  1360: iload           21
        //  1362: istore          13
        //  1364: iload           7
        //  1366: istore          17
        //  1368: iload_2        
        //  1369: istore          16
        //  1371: iload           24
        //  1373: istore          27
        //  1375: iload           25
        //  1377: istore          26
        //  1379: iload           6
        //  1381: istore          15
        //  1383: aload           29
        //  1385: getfield        cy.a:Ljava/util/ArrayList;
        //  1388: invokevirtual   java/util/ArrayList.size:()I
        //  1391: istore_3       
        //  1392: iload           25
        //  1394: istore          30
        //  1396: aconst_null    
        //  1397: astore          8
        //  1399: iconst_0       
        //  1400: istore          14
        //  1402: iconst_0       
        //  1403: istore          17
        //  1405: iload           24
        //  1407: istore          26
        //  1409: iload           21
        //  1411: istore          15
        //  1413: iload           14
        //  1415: iload_3        
        //  1416: if_icmpge       1587
        //  1419: aload           29
        //  1421: getfield        cy.a:Ljava/util/ArrayList;
        //  1424: iload           14
        //  1426: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1429: checkcast       Ldb;
        //  1432: astore          9
        //  1434: iconst_5       
        //  1435: istore          21
        //  1437: iload           21
        //  1439: iflt            1568
        //  1442: iload           15
        //  1444: istore          13
        //  1446: iload           7
        //  1448: istore_1       
        //  1449: iload_2        
        //  1450: istore          12
        //  1452: iload           6
        //  1454: istore          16
        //  1456: iload           13
        //  1458: istore          15
        //  1460: aload           9
        //  1462: getfield        db.e:[F
        //  1465: iload           21
        //  1467: faload         
        //  1468: fstore          31
        //  1470: aload           8
        //  1472: astore          5
        //  1474: iload           17
        //  1476: istore          15
        //  1478: aload           8
        //  1480: ifnonnull       1521
        //  1483: aload           8
        //  1485: astore          5
        //  1487: iload           17
        //  1489: istore          15
        //  1491: fload           31
        //  1493: fconst_0       
        //  1494: fcmpg          
        //  1495: ifge            1521
        //  1498: aload           8
        //  1500: astore          5
        //  1502: iload           17
        //  1504: istore          15
        //  1506: iload           21
        //  1508: iload           17
        //  1510: if_icmplt       1521
        //  1513: aload           9
        //  1515: astore          5
        //  1517: iload           21
        //  1519: istore          15
        //  1521: aload           5
        //  1523: astore          8
        //  1525: iload           15
        //  1527: istore          17
        //  1529: fload           31
        //  1531: fconst_0       
        //  1532: fcmpl          
        //  1533: ifle            1558
        //  1536: aload           5
        //  1538: astore          8
        //  1540: iload           15
        //  1542: istore          17
        //  1544: iload           21
        //  1546: iload           15
        //  1548: if_icmple       1558
        //  1551: iload           21
        //  1553: istore          17
        //  1555: aconst_null    
        //  1556: astore          8
        //  1558: iinc            21, -1
        //  1561: iload           13
        //  1563: istore          15
        //  1565: goto            1437
        //  1568: iinc            14, 1
        //  1571: goto            1413
        //  1574: astore          5
        //  1576: iload           15
        //  1578: istore          21
        //  1580: iload           26
        //  1582: istore          24
        //  1584: goto            2601
        //  1587: iload           15
        //  1589: istore          21
        //  1591: iload           26
        //  1593: istore          24
        //  1595: iload           18
        //  1597: istore          17
        //  1599: aload           8
        //  1601: ifnull          1725
        //  1604: iload           7
        //  1606: istore_1       
        //  1607: iload_2        
        //  1608: istore          12
        //  1610: iload           6
        //  1612: istore          16
        //  1614: iload           21
        //  1616: istore          15
        //  1618: aload           28
        //  1620: getfield        cz.d:[Z
        //  1623: astore          5
        //  1625: iload           7
        //  1627: istore_1       
        //  1628: iload_2        
        //  1629: istore          12
        //  1631: iload           6
        //  1633: istore          16
        //  1635: iload           21
        //  1637: istore          15
        //  1639: aload           8
        //  1641: getfield        db.a:I
        //  1644: istore          17
        //  1646: aload           5
        //  1648: iload           17
        //  1650: baload         
        //  1651: ifeq            1663
        //  1654: iconst_0       
        //  1655: istore          15
        //  1657: aconst_null    
        //  1658: astore          8
        //  1660: goto            1732
        //  1663: aload           5
        //  1665: iload           17
        //  1667: iconst_1       
        //  1668: bastore        
        //  1669: iinc            18, 1
        //  1672: iload           7
        //  1674: istore_1       
        //  1675: iload_2        
        //  1676: istore          12
        //  1678: iload           6
        //  1680: istore          16
        //  1682: iload           21
        //  1684: istore          15
        //  1686: iload           18
        //  1688: istore          17
        //  1690: iload           18
        //  1692: aload           28
        //  1694: getfield        cz.e:I
        //  1697: if_icmplt       1725
        //  1700: iconst_1       
        //  1701: istore          15
        //  1703: goto            1732
        //  1706: astore          5
        //  1708: iload_1        
        //  1709: istore          7
        //  1711: iload           12
        //  1713: istore_2       
        //  1714: iload           16
        //  1716: istore          6
        //  1718: iload           15
        //  1720: istore          21
        //  1722: goto            1580
        //  1725: iconst_0       
        //  1726: istore          15
        //  1728: iload           17
        //  1730: istore          18
        //  1732: aload           8
        //  1734: ifnull          2383
        //  1737: ldc_w           3.4028235E38
        //  1740: fstore          31
        //  1742: iconst_0       
        //  1743: istore          14
        //  1745: iconst_m1      
        //  1746: istore          4
        //  1748: iload           18
        //  1750: istore          13
        //  1752: iload           15
        //  1754: istore          17
        //  1756: iload           7
        //  1758: istore_1       
        //  1759: iload_2        
        //  1760: istore          12
        //  1762: iload           6
        //  1764: istore          16
        //  1766: iload           21
        //  1768: istore          15
        //  1770: iload           14
        //  1772: aload           28
        //  1774: getfield        cz.f:I
        //  1777: if_icmpge       2106
        //  1780: iload           7
        //  1782: istore_1       
        //  1783: iload_2        
        //  1784: istore          12
        //  1786: iload           6
        //  1788: istore          16
        //  1790: iload           21
        //  1792: istore          15
        //  1794: aload           28
        //  1796: getfield        cz.c:[Lcw;
        //  1799: iload           14
        //  1801: aaload         
        //  1802: astore          9
        //  1804: iload           7
        //  1806: istore_1       
        //  1807: iload_2        
        //  1808: istore          12
        //  1810: iload           6
        //  1812: istore          16
        //  1814: iload           21
        //  1816: istore          15
        //  1818: aload           9
        //  1820: getfield        cw.a:Ldb;
        //  1823: getfield        db.h:I
        //  1826: iconst_1       
        //  1827: if_icmpne       1837
        //  1830: iload           6
        //  1832: istore          16
        //  1834: goto            2096
        //  1837: iload           7
        //  1839: istore_1       
        //  1840: iload_2        
        //  1841: istore          12
        //  1843: iload           6
        //  1845: istore          16
        //  1847: iload           21
        //  1849: istore          15
        //  1851: aload           9
        //  1853: getfield        cw.d:Lcv;
        //  1856: astore          5
        //  1858: iload           7
        //  1860: istore_1       
        //  1861: iload_2        
        //  1862: istore          12
        //  1864: iload           6
        //  1866: istore          16
        //  1868: iload           21
        //  1870: istore          15
        //  1872: aload           5
        //  1874: getfield        cv.f:I
        //  1877: istore          22
        //  1879: iload_2        
        //  1880: istore_3       
        //  1881: iload           7
        //  1883: istore          12
        //  1885: iload           22
        //  1887: iconst_m1      
        //  1888: if_icmpne       1894
        //  1891: goto            1830
        //  1894: iconst_0       
        //  1895: istore          10
        //  1897: iload           22
        //  1899: iconst_m1      
        //  1900: if_icmpeq       2092
        //  1903: iload           10
        //  1905: aload           5
        //  1907: getfield        cv.a:I
        //  1910: if_icmpge       2092
        //  1913: aload           5
        //  1915: getfield        cv.c:[I
        //  1918: iload           22
        //  1920: iaload         
        //  1921: istore          32
        //  1923: iload           6
        //  1925: istore          16
        //  1927: iload           24
        //  1929: istore          27
        //  1931: iload           21
        //  1933: istore_1       
        //  1934: iload_3        
        //  1935: istore          15
        //  1937: iload           12
        //  1939: istore          18
        //  1941: iload           16
        //  1943: istore          6
        //  1945: iload           32
        //  1947: aload           8
        //  1949: getfield        db.a:I
        //  1952: if_icmpne       2043
        //  1955: iload           24
        //  1957: istore          27
        //  1959: iload           21
        //  1961: istore_1       
        //  1962: iload_3        
        //  1963: istore          15
        //  1965: iload           12
        //  1967: istore          18
        //  1969: iload           16
        //  1971: istore          6
        //  1973: aload           9
        //  1975: getfield        cw.d:Lcv;
        //  1978: aload           8
        //  1980: invokevirtual   cv.a:(Ldb;)F
        //  1983: fstore          33
        //  1985: fload           33
        //  1987: fconst_0       
        //  1988: fcmpg          
        //  1989: ifge            2040
        //  1992: iload           24
        //  1994: istore          27
        //  1996: iload           21
        //  1998: istore_1       
        //  1999: iload_3        
        //  2000: istore          15
        //  2002: iload           12
        //  2004: istore          18
        //  2006: iload           16
        //  2008: istore          6
        //  2010: aload           9
        //  2012: getfield        cw.b:F
        //  2015: fneg           
        //  2016: fload           33
        //  2018: fdiv           
        //  2019: fstore          33
        //  2021: fload           33
        //  2023: fload           31
        //  2025: fcmpg          
        //  2026: ifge            2040
        //  2029: fload           33
        //  2031: fstore          31
        //  2033: iload           14
        //  2035: istore          4
        //  2037: goto            2096
        //  2040: goto            2096
        //  2043: iload           24
        //  2045: istore          27
        //  2047: iload           21
        //  2049: istore_1       
        //  2050: iload_3        
        //  2051: istore          15
        //  2053: iload           12
        //  2055: istore          18
        //  2057: iload           16
        //  2059: istore          6
        //  2061: aload           5
        //  2063: getfield        cv.d:[I
        //  2066: iload           22
        //  2068: iaload         
        //  2069: istore          22
        //  2071: iinc            10, 1
        //  2074: iload           16
        //  2076: istore          6
        //  2078: goto            1897
        //  2081: astore          5
        //  2083: iload_3        
        //  2084: istore_2       
        //  2085: iload           12
        //  2087: istore          7
        //  2089: goto            2601
        //  2092: iload           6
        //  2094: istore          16
        //  2096: iinc            14, 1
        //  2099: iload           16
        //  2101: istore          6
        //  2103: goto            1756
        //  2106: iload_2        
        //  2107: istore          16
        //  2109: iload           6
        //  2111: istore_2       
        //  2112: iload           13
        //  2114: istore          18
        //  2116: iload           16
        //  2118: istore          15
        //  2120: iload           7
        //  2122: istore          6
        //  2124: iload_2        
        //  2125: istore          14
        //  2127: iload           4
        //  2129: iflt            2394
        //  2132: iload           24
        //  2134: istore          27
        //  2136: iload           21
        //  2138: istore_1       
        //  2139: iload           16
        //  2141: istore          15
        //  2143: iload           7
        //  2145: istore          18
        //  2147: iload_2        
        //  2148: istore          6
        //  2150: aload           28
        //  2152: getfield        cz.c:[Lcw;
        //  2155: iload           4
        //  2157: aaload         
        //  2158: astore          5
        //  2160: iload           24
        //  2162: istore          27
        //  2164: iload           21
        //  2166: istore_1       
        //  2167: iload           16
        //  2169: istore          15
        //  2171: iload           7
        //  2173: istore          18
        //  2175: iload_2        
        //  2176: istore          6
        //  2178: aload           5
        //  2180: getfield        cw.a:Ldb;
        //  2183: iconst_m1      
        //  2184: putfield        db.b:I
        //  2187: iload           24
        //  2189: istore          27
        //  2191: iload           21
        //  2193: istore_1       
        //  2194: iload           16
        //  2196: istore          15
        //  2198: iload           7
        //  2200: istore          18
        //  2202: iload_2        
        //  2203: istore          6
        //  2205: aload           5
        //  2207: aload           8
        //  2209: invokevirtual   cw.a:(Ldb;)V
        //  2212: iload           24
        //  2214: istore          27
        //  2216: iload           21
        //  2218: istore_1       
        //  2219: iload           16
        //  2221: istore          15
        //  2223: iload           7
        //  2225: istore          18
        //  2227: iload_2        
        //  2228: istore          6
        //  2230: aload           5
        //  2232: getfield        cw.a:Ldb;
        //  2235: iload           4
        //  2237: putfield        db.b:I
        //  2240: iconst_0       
        //  2241: istore          14
        //  2243: iload           24
        //  2245: istore          27
        //  2247: iload           21
        //  2249: istore_1       
        //  2250: iload           16
        //  2252: istore          15
        //  2254: iload           7
        //  2256: istore          18
        //  2258: iload_2        
        //  2259: istore          6
        //  2261: iload           14
        //  2263: aload           28
        //  2265: getfield        cz.f:I
        //  2268: if_icmpge       2308
        //  2271: iload           24
        //  2273: istore          27
        //  2275: iload           21
        //  2277: istore_1       
        //  2278: iload           16
        //  2280: istore          15
        //  2282: iload           7
        //  2284: istore          18
        //  2286: iload_2        
        //  2287: istore          6
        //  2289: aload           28
        //  2291: getfield        cz.c:[Lcw;
        //  2294: iload           14
        //  2296: aaload         
        //  2297: aload           5
        //  2299: invokevirtual   cw.k:(Lcw;)V
        //  2302: iinc            14, 1
        //  2305: goto            2243
        //  2308: iload           24
        //  2310: istore          27
        //  2312: iload           21
        //  2314: istore_1       
        //  2315: iload           16
        //  2317: istore          15
        //  2319: iload           7
        //  2321: istore          18
        //  2323: iload_2        
        //  2324: istore          6
        //  2326: aload           29
        //  2328: aload           28
        //  2330: invokevirtual   cy.a:(Lcz;)V
        //  2333: aload           28
        //  2335: aload           29
        //  2337: invokevirtual   cz.o:(Lcy;)V
        //  2340: goto            2368
        //  2343: astore          5
        //  2345: iload           24
        //  2347: istore          27
        //  2349: iload           21
        //  2351: istore_1       
        //  2352: iload           16
        //  2354: istore          15
        //  2356: iload           7
        //  2358: istore          18
        //  2360: iload_2        
        //  2361: istore          6
        //  2363: aload           5
        //  2365: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2368: iload           17
        //  2370: istore          6
        //  2372: iload           13
        //  2374: istore          18
        //  2376: iload           16
        //  2378: istore          15
        //  2380: goto            2408
        //  2383: iload           6
        //  2385: istore          14
        //  2387: iload           7
        //  2389: istore          6
        //  2391: iload_2        
        //  2392: istore          15
        //  2394: iconst_1       
        //  2395: istore          16
        //  2397: iload           14
        //  2399: istore_2       
        //  2400: iload           6
        //  2402: istore          7
        //  2404: iload           16
        //  2406: istore          6
        //  2408: iload           30
        //  2410: istore          25
        //  2412: iload_2        
        //  2413: istore          17
        //  2415: iload           6
        //  2417: istore          16
        //  2419: iload           15
        //  2421: istore_2       
        //  2422: iload           17
        //  2424: istore          6
        //  2426: goto            1355
        //  2429: iload_2        
        //  2430: istore          16
        //  2432: iload           25
        //  2434: istore          26
        //  2436: iload           6
        //  2438: istore_2       
        //  2439: iconst_0       
        //  2440: istore          17
        //  2442: iload           24
        //  2444: istore          27
        //  2446: iload           21
        //  2448: istore_1       
        //  2449: iload           16
        //  2451: istore          15
        //  2453: iload           7
        //  2455: istore          18
        //  2457: iload_2        
        //  2458: istore          6
        //  2460: iload           17
        //  2462: aload           28
        //  2464: getfield        cz.f:I
        //  2467: if_icmpge       2535
        //  2470: iload           24
        //  2472: istore          27
        //  2474: iload           21
        //  2476: istore_1       
        //  2477: iload           16
        //  2479: istore          15
        //  2481: iload           7
        //  2483: istore          18
        //  2485: iload_2        
        //  2486: istore          6
        //  2488: aload           28
        //  2490: getfield        cz.c:[Lcw;
        //  2493: iload           17
        //  2495: aaload         
        //  2496: astore          5
        //  2498: iload           24
        //  2500: istore          27
        //  2502: iload           21
        //  2504: istore_1       
        //  2505: iload           16
        //  2507: istore          15
        //  2509: iload           7
        //  2511: istore          18
        //  2513: iload_2        
        //  2514: istore          6
        //  2516: aload           5
        //  2518: getfield        cw.a:Ldb;
        //  2521: aload           5
        //  2523: getfield        cw.b:F
        //  2526: putfield        db.d:F
        //  2529: iinc            17, 1
        //  2532: goto            2442
        //  2535: iload           24
        //  2537: istore          25
        //  2539: iload           21
        //  2541: istore          6
        //  2543: iload_2        
        //  2544: istore          21
        //  2546: goto            2647
        //  2549: astore          5
        //  2551: iload           25
        //  2553: istore          30
        //  2555: iload           27
        //  2557: istore          24
        //  2559: iload_1        
        //  2560: istore          21
        //  2562: iload           15
        //  2564: istore_2       
        //  2565: iload           18
        //  2567: istore          7
        //  2569: iload           6
        //  2571: istore          18
        //  2573: goto            2605
        //  2576: astore          5
        //  2578: iload           13
        //  2580: istore          21
        //  2582: iload           17
        //  2584: istore          7
        //  2586: iload           16
        //  2588: istore_2       
        //  2589: iload           27
        //  2591: istore          24
        //  2593: iload           26
        //  2595: istore          30
        //  2597: iload           15
        //  2599: istore          6
        //  2601: iload           6
        //  2603: istore          18
        //  2605: iload           30
        //  2607: istore          26
        //  2609: iload           24
        //  2611: istore          25
        //  2613: iload           21
        //  2615: istore          6
        //  2617: iload           18
        //  2619: istore          21
        //  2621: goto            2671
        //  2624: iload           21
        //  2626: istore          18
        //  2628: iload           25
        //  2630: istore          26
        //  2632: iload           6
        //  2634: istore          21
        //  2636: iload_2        
        //  2637: istore          16
        //  2639: iload           18
        //  2641: istore          6
        //  2643: iload           24
        //  2645: istore          25
        //  2647: iload           16
        //  2649: istore_2       
        //  2650: goto            2676
        //  2653: astore          5
        //  2655: iload           21
        //  2657: istore          18
        //  2659: iload           24
        //  2661: istore          25
        //  2663: iload           6
        //  2665: istore          21
        //  2667: iload           18
        //  2669: istore          6
        //  2671: aload           5
        //  2673: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2676: iload           26
        //  2678: ifeq            2794
        //  2681: aload_0        
        //  2682: getfield        de.as:[Z
        //  2685: astore          8
        //  2687: aload           8
        //  2689: iconst_2       
        //  2690: iconst_0       
        //  2691: bastore        
        //  2692: aload_0        
        //  2693: invokevirtual   dd.z:()V
        //  2696: aload_0        
        //  2697: getfield        de.al:Ljava/util/ArrayList;
        //  2700: invokevirtual   java/util/ArrayList.size:()I
        //  2703: istore          15
        //  2705: iconst_0       
        //  2706: istore          18
        //  2708: iload           18
        //  2710: iload           15
        //  2712: if_icmpge       2892
        //  2715: aload_0        
        //  2716: getfield        de.al:Ljava/util/ArrayList;
        //  2719: iload           18
        //  2721: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2724: checkcast       Ldd;
        //  2727: astore          5
        //  2729: aload           5
        //  2731: invokevirtual   dd.z:()V
        //  2734: aload           5
        //  2736: getfield        dd.ad:I
        //  2739: iconst_3       
        //  2740: if_icmpne       2761
        //  2743: aload           5
        //  2745: invokevirtual   dd.h:()I
        //  2748: aload           5
        //  2750: getfield        dd.F:I
        //  2753: if_icmpge       2761
        //  2756: aload           8
        //  2758: iconst_2       
        //  2759: iconst_1       
        //  2760: bastore        
        //  2761: aload           5
        //  2763: getfield        dd.ae:I
        //  2766: iconst_3       
        //  2767: if_icmpne       2788
        //  2770: aload           5
        //  2772: invokevirtual   dd.d:()I
        //  2775: aload           5
        //  2777: getfield        dd.G:I
        //  2780: if_icmpge       2788
        //  2783: aload           8
        //  2785: iconst_2       
        //  2786: iconst_1       
        //  2787: bastore        
        //  2788: iinc            18, 1
        //  2791: goto            2708
        //  2794: aload_0        
        //  2795: invokevirtual   dd.z:()V
        //  2798: iconst_0       
        //  2799: istore          18
        //  2801: iload           18
        //  2803: iload           20
        //  2805: if_icmpge       2892
        //  2808: aload_0        
        //  2809: getfield        de.al:Ljava/util/ArrayList;
        //  2812: iload           18
        //  2814: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2817: checkcast       Ldd;
        //  2820: astore          5
        //  2822: aload           5
        //  2824: getfield        dd.ad:I
        //  2827: iconst_3       
        //  2828: if_icmpne       2854
        //  2831: aload           5
        //  2833: invokevirtual   dd.h:()I
        //  2836: aload           5
        //  2838: getfield        dd.F:I
        //  2841: if_icmpge       2854
        //  2844: aload_0        
        //  2845: getfield        de.as:[Z
        //  2848: iconst_2       
        //  2849: iconst_1       
        //  2850: bastore        
        //  2851: goto            2892
        //  2854: aload           5
        //  2856: getfield        dd.ae:I
        //  2859: iconst_3       
        //  2860: if_icmpne       2886
        //  2863: aload           5
        //  2865: invokevirtual   dd.d:()I
        //  2868: aload           5
        //  2870: getfield        dd.G:I
        //  2873: if_icmpge       2886
        //  2876: aload_0        
        //  2877: getfield        de.as:[Z
        //  2880: iconst_2       
        //  2881: iconst_1       
        //  2882: bastore        
        //  2883: goto            2892
        //  2886: iinc            18, 1
        //  2889: goto            2801
        //  2892: iload           19
        //  2894: bipush          8
        //  2896: if_icmpge       3086
        //  2899: aload_0        
        //  2900: getfield        de.as:[Z
        //  2903: iconst_2       
        //  2904: baload         
        //  2905: ifeq            3086
        //  2908: iconst_0       
        //  2909: istore          16
        //  2911: iconst_0       
        //  2912: istore          15
        //  2914: iconst_0       
        //  2915: istore          18
        //  2917: iload           16
        //  2919: iload           20
        //  2921: if_icmpge       2980
        //  2924: aload_0        
        //  2925: getfield        de.al:Ljava/util/ArrayList;
        //  2928: iload           16
        //  2930: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2933: checkcast       Ldd;
        //  2936: astore          5
        //  2938: iload           15
        //  2940: aload           5
        //  2942: getfield        dd.w:I
        //  2945: aload           5
        //  2947: invokevirtual   dd.h:()I
        //  2950: iadd           
        //  2951: invokestatic    java/lang/Math.max:(II)I
        //  2954: istore          15
        //  2956: iload           18
        //  2958: aload           5
        //  2960: getfield        dd.x:I
        //  2963: aload           5
        //  2965: invokevirtual   dd.d:()I
        //  2968: iadd           
        //  2969: invokestatic    java/lang/Math.max:(II)I
        //  2972: istore          18
        //  2974: iinc            16, 1
        //  2977: goto            2917
        //  2980: aload_0        
        //  2981: getfield        de.D:I
        //  2984: iload           15
        //  2986: invokestatic    java/lang/Math.max:(II)I
        //  2989: istore          15
        //  2991: aload_0        
        //  2992: getfield        de.E:I
        //  2995: iload           18
        //  2997: invokestatic    java/lang/Math.max:(II)I
        //  3000: istore          18
        //  3002: iload           11
        //  3004: iconst_2       
        //  3005: if_icmpne       3037
        //  3008: aload_0        
        //  3009: invokevirtual   dd.h:()I
        //  3012: iload           15
        //  3014: if_icmpge       3037
        //  3017: aload_0        
        //  3018: iload           15
        //  3020: invokevirtual   dd.q:(I)V
        //  3023: aload_0        
        //  3024: iconst_2       
        //  3025: putfield        de.ad:I
        //  3028: iconst_1       
        //  3029: istore          25
        //  3031: iconst_1       
        //  3032: istore          24
        //  3034: goto            3048
        //  3037: iconst_0       
        //  3038: istore          26
        //  3040: iload           25
        //  3042: istore          24
        //  3044: iload           26
        //  3046: istore          25
        //  3048: iload           21
        //  3050: iconst_2       
        //  3051: if_icmpne       3083
        //  3054: aload_0        
        //  3055: invokevirtual   dd.d:()I
        //  3058: iload           18
        //  3060: if_icmpge       3083
        //  3063: aload_0        
        //  3064: iload           18
        //  3066: invokevirtual   dd.k:(I)V
        //  3069: aload_0        
        //  3070: iconst_2       
        //  3071: putfield        de.ae:I
        //  3074: iconst_1       
        //  3075: istore          25
        //  3077: iconst_1       
        //  3078: istore          24
        //  3080: goto            3097
        //  3083: goto            3097
        //  3086: iconst_0       
        //  3087: istore          26
        //  3089: iload           25
        //  3091: istore          24
        //  3093: iload           26
        //  3095: istore          25
        //  3097: aload_0        
        //  3098: getfield        de.D:I
        //  3101: aload_0        
        //  3102: invokevirtual   dd.h:()I
        //  3105: invokestatic    java/lang/Math.max:(II)I
        //  3108: istore          18
        //  3110: iload           18
        //  3112: aload_0        
        //  3113: invokevirtual   dd.h:()I
        //  3116: if_icmple       3139
        //  3119: aload_0        
        //  3120: iload           18
        //  3122: invokevirtual   dd.q:(I)V
        //  3125: aload_0        
        //  3126: iconst_1       
        //  3127: putfield        de.ad:I
        //  3130: iconst_1       
        //  3131: istore          25
        //  3133: iconst_1       
        //  3134: istore          24
        //  3136: goto            3139
        //  3139: aload_0        
        //  3140: getfield        de.E:I
        //  3143: aload_0        
        //  3144: invokevirtual   dd.d:()I
        //  3147: invokestatic    java/lang/Math.max:(II)I
        //  3150: istore          18
        //  3152: iload           18
        //  3154: aload_0        
        //  3155: invokevirtual   dd.d:()I
        //  3158: if_icmple       3181
        //  3161: aload_0        
        //  3162: iload           18
        //  3164: invokevirtual   dd.k:(I)V
        //  3167: aload_0        
        //  3168: iconst_1       
        //  3169: putfield        de.ae:I
        //  3172: iconst_1       
        //  3173: istore          25
        //  3175: iconst_1       
        //  3176: istore          24
        //  3178: goto            3181
        //  3181: iload           24
        //  3183: ifne            3297
        //  3186: aload_0        
        //  3187: getfield        de.ad:I
        //  3190: iconst_2       
        //  3191: if_icmpne       3241
        //  3194: iload           7
        //  3196: ifle            3241
        //  3199: aload_0        
        //  3200: invokevirtual   dd.h:()I
        //  3203: istore          15
        //  3205: iload           7
        //  3207: istore          18
        //  3209: iload           15
        //  3211: iload           18
        //  3213: if_icmple       3241
        //  3216: aload_0        
        //  3217: iconst_1       
        //  3218: putfield        de.aj:Z
        //  3221: aload_0        
        //  3222: iconst_1       
        //  3223: putfield        de.ad:I
        //  3226: aload_0        
        //  3227: iload           18
        //  3229: invokevirtual   dd.q:(I)V
        //  3232: iconst_1       
        //  3233: istore          25
        //  3235: iconst_1       
        //  3236: istore          24
        //  3238: goto            3241
        //  3241: aload_0        
        //  3242: getfield        de.ae:I
        //  3245: iconst_2       
        //  3246: if_icmpne       3294
        //  3249: iload_2        
        //  3250: ifle            3294
        //  3253: aload_0        
        //  3254: invokevirtual   dd.d:()I
        //  3257: istore          15
        //  3259: iload_2        
        //  3260: istore          18
        //  3262: iload           15
        //  3264: iload           18
        //  3266: if_icmple       3294
        //  3269: aload_0        
        //  3270: iconst_1       
        //  3271: putfield        de.ak:Z
        //  3274: aload_0        
        //  3275: iconst_1       
        //  3276: putfield        de.ae:I
        //  3279: aload_0        
        //  3280: iload           18
        //  3282: invokevirtual   dd.k:(I)V
        //  3285: iconst_1       
        //  3286: istore          25
        //  3288: iconst_1       
        //  3289: istore          24
        //  3291: goto            3297
        //  3294: goto            3297
        //  3297: iload           21
        //  3299: istore          18
        //  3301: iload           19
        //  3303: istore          15
        //  3305: iload           6
        //  3307: istore          21
        //  3309: iload           25
        //  3311: istore          26
        //  3313: iload           18
        //  3315: istore          6
        //  3317: goto            1123
        //  3320: iconst_0       
        //  3321: istore_2       
        //  3322: aload_0        
        //  3323: getfield        de.r:Ldd;
        //  3326: ifnull          3485
        //  3329: aload_0        
        //  3330: getfield        de.D:I
        //  3333: aload_0        
        //  3334: invokevirtual   dd.h:()I
        //  3337: invokestatic    java/lang/Math.max:(II)I
        //  3340: istore          7
        //  3342: aload_0        
        //  3343: getfield        de.E:I
        //  3346: aload_0        
        //  3347: invokevirtual   dd.d:()I
        //  3350: invokestatic    java/lang/Math.max:(II)I
        //  3353: istore          21
        //  3355: aload_0        
        //  3356: getfield        de.am:Ldh;
        //  3359: astore          5
        //  3361: aload_0        
        //  3362: aload           5
        //  3364: getfield        dh.a:I
        //  3367: putfield        dd.w:I
        //  3370: aload_0        
        //  3371: aload           5
        //  3373: getfield        dh.b:I
        //  3376: putfield        dd.x:I
        //  3379: aload_0        
        //  3380: aload           5
        //  3382: getfield        dh.c:I
        //  3385: invokevirtual   dd.q:(I)V
        //  3388: aload_0        
        //  3389: aload           5
        //  3391: getfield        dh.d:I
        //  3394: invokevirtual   dd.k:(I)V
        //  3397: aload           5
        //  3399: getfield        dh.e:Ljava/util/ArrayList;
        //  3402: invokevirtual   java/util/ArrayList.size:()I
        //  3405: istore          18
        //  3407: iload_2        
        //  3408: iload           18
        //  3410: if_icmpge       3470
        //  3413: aload           5
        //  3415: getfield        dh.e:Ljava/util/ArrayList;
        //  3418: iload_2        
        //  3419: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3422: checkcast       Ldg;
        //  3425: astore          8
        //  3427: aload_0        
        //  3428: aload           8
        //  3430: getfield        dg.a:Ldc;
        //  3433: getfield        dc.g:I
        //  3436: invokevirtual   dd.u:(I)Ldc;
        //  3439: aload           8
        //  3441: getfield        dg.b:Ldc;
        //  3444: aload           8
        //  3446: getfield        dg.c:I
        //  3449: iconst_m1      
        //  3450: aload           8
        //  3452: getfield        dg.e:I
        //  3455: aload           8
        //  3457: getfield        dg.d:I
        //  3460: iconst_0       
        //  3461: invokevirtual   dc.d:(Ldc;IIIIZ)V
        //  3464: iinc            2, 1
        //  3467: goto            3407
        //  3470: aload_0        
        //  3471: iload           7
        //  3473: invokevirtual   dd.q:(I)V
        //  3476: aload_0        
        //  3477: iload           21
        //  3479: invokevirtual   dd.k:(I)V
        //  3482: goto            3497
        //  3485: aload_0        
        //  3486: iload           21
        //  3488: putfield        de.w:I
        //  3491: aload_0        
        //  3492: iload           23
        //  3494: putfield        de.x:I
        //  3497: iload           24
        //  3499: ifeq            3514
        //  3502: aload_0        
        //  3503: iload           11
        //  3505: putfield        de.ad:I
        //  3508: aload_0        
        //  3509: iload           6
        //  3511: putfield        de.ae:I
        //  3514: aload_0        
        //  3515: aload_0        
        //  3516: getfield        de.af:Lcz;
        //  3519: getfield        cz.g:Lcx;
        //  3522: invokevirtual   dd.j:(Lcx;)V
        //  3525: aload_0        
        //  3526: getfield        dd.r:Ldd;
        //  3529: astore          5
        //  3531: aload_0        
        //  3532: astore          8
        //  3534: aload           5
        //  3536: ifnull          3557
        //  3539: aload           5
        //  3541: getfield        dd.r:Ldd;
        //  3544: astore          9
        //  3546: aload           5
        //  3548: astore          8
        //  3550: aload           9
        //  3552: astore          5
        //  3554: goto            3534
        //  3557: aload_0        
        //  3558: aload           8
        //  3560: if_acmpne       3567
        //  3563: aload_0        
        //  3564: invokevirtual   dd.r:()V
        //  3567: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1134   1151   2653   2671   Ljava/lang/Exception;
        //  1179   1185   2576   2601   Ljava/lang/Exception;
        //  1208   1215   2576   2601   Ljava/lang/Exception;
        //  1238   1245   2576   2601   Ljava/lang/Exception;
        //  1268   1275   2576   2601   Ljava/lang/Exception;
        //  1301   1311   2576   2601   Ljava/lang/Exception;
        //  1334   1343   2576   2601   Ljava/lang/Exception;
        //  1383   1392   2576   2601   Ljava/lang/Exception;
        //  1419   1434   1574   1580   Ljava/lang/Exception;
        //  1460   1470   1706   1725   Ljava/lang/Exception;
        //  1618   1625   1706   1725   Ljava/lang/Exception;
        //  1639   1646   1706   1725   Ljava/lang/Exception;
        //  1690   1700   1706   1725   Ljava/lang/Exception;
        //  1770   1780   1706   1725   Ljava/lang/Exception;
        //  1794   1804   1706   1725   Ljava/lang/Exception;
        //  1818   1830   1706   1725   Ljava/lang/Exception;
        //  1851   1858   1706   1725   Ljava/lang/Exception;
        //  1872   1879   1706   1725   Ljava/lang/Exception;
        //  1903   1923   2081   2092   Ljava/lang/Exception;
        //  1945   1955   2549   2576   Ljava/lang/Exception;
        //  1973   1985   2549   2576   Ljava/lang/Exception;
        //  2010   2021   2549   2576   Ljava/lang/Exception;
        //  2061   2071   2549   2576   Ljava/lang/Exception;
        //  2150   2160   2549   2576   Ljava/lang/Exception;
        //  2178   2187   2549   2576   Ljava/lang/Exception;
        //  2205   2212   2549   2576   Ljava/lang/Exception;
        //  2230   2240   2549   2576   Ljava/lang/Exception;
        //  2261   2271   2549   2576   Ljava/lang/Exception;
        //  2289   2302   2549   2576   Ljava/lang/Exception;
        //  2326   2333   2549   2576   Ljava/lang/Exception;
        //  2333   2340   2343   2368   Ljava/lang/Exception;
        //  2363   2368   2549   2576   Ljava/lang/Exception;
        //  2460   2470   2549   2576   Ljava/lang/Exception;
        //  2488   2498   2549   2576   Ljava/lang/Exception;
        //  2516   2529   2549   2576   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1521:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean E(final cz cz) {
        this.y(cz);
        final int size = this.al.size();
        final int ai = this.ai;
        boolean b;
        if (ai != 2 && ai != 4) {
            b = true;
        }
        else {
            final int size2 = this.al.size();
            for (int i = 0; i < size2; ++i) {
                final dd dd = this.al.get(i);
                dd.a = -1;
                dd.b = -1;
                if (dd.ad == 3 || dd.ae == 3) {
                    dd.a = 1;
                    dd.b = 1;
                }
            }
            int j = 0;
            int n = 0;
            int n2 = 0;
            while (j == 0) {
                int k = 0;
                int n3 = 0;
                int n4 = 0;
                while (k < size2) {
                    final dd dd2 = this.al.get(k);
                    Label_1321: {
                        if (dd2.a == -1) {
                            final int ad = this.ad;
                            if (ad == 2) {
                                dd2.a = 1;
                            }
                            else {
                                final int ad2 = dd2.ad;
                                if (ad2 == 3) {
                                    dd2.a = 1;
                                }
                                else if (ad != 2 && ad2 == 4) {
                                    final dc l = dd2.i;
                                    l.f = cz.e(l);
                                    final dc m = dd2.k;
                                    m.f = cz.e(m);
                                    final int c = dd2.i.c;
                                    final int n5 = this.h() - dd2.k.c;
                                    cz.h(dd2.i.f, c);
                                    cz.h(dd2.k.f, n5);
                                    dd2.l(c, n5);
                                    dd2.a = 2;
                                }
                                else {
                                    final dc i2 = dd2.i;
                                    final dc b2 = i2.b;
                                    if (b2 != null) {
                                        final dc b3 = dd2.k.b;
                                        if (b3 != null) {
                                            if (b2.a == this && b3.a == this) {
                                                int a = i2.a();
                                                final int a2 = dd2.k.a();
                                                int n6;
                                                if (this.ad == 3) {
                                                    n6 = this.h() - a2;
                                                }
                                                else {
                                                    a += (int)((this.h() - a - a2 - dd2.h()) * dd2.H + 0.5f);
                                                    n6 = a + dd2.h();
                                                }
                                                final dc i3 = dd2.i;
                                                i3.f = cz.e(i3);
                                                final dc k2 = dd2.k;
                                                k2.f = cz.e(k2);
                                                cz.h(dd2.i.f, a);
                                                cz.h(dd2.k.f, n6);
                                                dd2.a = 2;
                                                dd2.l(a, n6);
                                                break Label_1321;
                                            }
                                            dd2.a = 1;
                                            break Label_1321;
                                        }
                                    }
                                    if (b2 != null && b2.a == this) {
                                        final int a3 = i2.a();
                                        final int n7 = dd2.h() + a3;
                                        final dc i4 = dd2.i;
                                        i4.f = cz.e(i4);
                                        final dc k3 = dd2.k;
                                        k3.f = cz.e(k3);
                                        cz.h(dd2.i.f, a3);
                                        cz.h(dd2.k.f, n7);
                                        dd2.a = 2;
                                        dd2.l(a3, n7);
                                    }
                                    else {
                                        final dc b4 = dd2.k.b;
                                        if (b4 != null && b4.a == this) {
                                            i2.f = cz.e(i2);
                                            final dc k4 = dd2.k;
                                            k4.f = cz.e(k4);
                                            final int n8 = this.h() - dd2.k.a();
                                            final int n9 = n8 - dd2.h();
                                            cz.h(dd2.i.f, n9);
                                            cz.h(dd2.k.f, n8);
                                            dd2.a = 2;
                                            dd2.l(n9, n8);
                                        }
                                        else if (b2 != null && b2.a.a == 2) {
                                            final db f = b2.f;
                                            i2.f = cz.e(i2);
                                            final dc k5 = dd2.k;
                                            k5.f = cz.e(k5);
                                            final int n10 = (int)(f.d + dd2.i.a() + 0.5f);
                                            final int n11 = dd2.h() + n10;
                                            cz.h(dd2.i.f, n10);
                                            cz.h(dd2.k.f, n11);
                                            dd2.a = 2;
                                            dd2.l(n10, n11);
                                        }
                                        else if (b4 != null && b4.a.a == 2) {
                                            final db f2 = b4.f;
                                            i2.f = cz.e(i2);
                                            final dc k6 = dd2.k;
                                            k6.f = cz.e(k6);
                                            final int n12 = (int)(f2.d - dd2.k.a() + 0.5f);
                                            final int n13 = n12 - dd2.h();
                                            cz.h(dd2.i.f, n13);
                                            cz.h(dd2.k.f, n12);
                                            dd2.a = 2;
                                            dd2.l(n13, n12);
                                        }
                                        else if (b2 == null && b4 == null) {
                                            if (dd2 instanceof df) {
                                                final df df = (df)dd2;
                                                if (df.ai == 1) {
                                                    i2.f = cz.e(i2);
                                                    final dc k7 = dd2.k;
                                                    k7.f = cz.e(k7);
                                                    final int ag = df.ag;
                                                    float n14;
                                                    if (ag != -1) {
                                                        n14 = (float)ag;
                                                    }
                                                    else if (df.ah != -1) {
                                                        n14 = (float)(this.h() - df.ah);
                                                    }
                                                    else {
                                                        n14 = this.h() * df.af;
                                                    }
                                                    final int n15 = (int)(n14 + 0.5f);
                                                    cz.h(dd2.i.f, n15);
                                                    cz.h(dd2.k.f, n15);
                                                    dd2.a = 2;
                                                    dd2.b = 2;
                                                    dd2.l(n15, n15);
                                                    dd2.p(0, this.d());
                                                }
                                            }
                                            else {
                                                i2.f = cz.e(i2);
                                                final dc k8 = dd2.k;
                                                k8.f = cz.e(k8);
                                                final int w = dd2.w;
                                                final int h = dd2.h();
                                                cz.h(dd2.i.f, w);
                                                cz.h(dd2.k.f, w + h);
                                                dd2.a = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Label_3060: {
                        if (dd2.b == -1) {
                            final int ae = this.ae;
                            if (ae == 2) {
                                dd2.b = 1;
                            }
                            else {
                                final int ae2 = dd2.ae;
                                if (ae2 == 3) {
                                    dd2.b = 1;
                                }
                                else if (ae != 2 && ae2 == 4) {
                                    final dc j2 = dd2.j;
                                    j2.f = cz.e(j2);
                                    final dc l2 = dd2.l;
                                    l2.f = cz.e(l2);
                                    final int c2 = dd2.j.c;
                                    final int n16 = this.d() - dd2.l.c;
                                    cz.h(dd2.j.f, c2);
                                    cz.h(dd2.l.f, n16);
                                    if (dd2.C > 0 || dd2.K == 8) {
                                        final dc m2 = dd2.m;
                                        m2.f = cz.e(m2);
                                        cz.h(dd2.m.f, dd2.C + c2);
                                    }
                                    dd2.p(c2, n16);
                                    dd2.b = 2;
                                }
                                else {
                                    final dc j3 = dd2.j;
                                    final dc b5 = j3.b;
                                    if (b5 != null) {
                                        final dc b6 = dd2.l.b;
                                        if (b6 != null) {
                                            if (b5.a == this && b6.a == this) {
                                                int a4 = j3.a();
                                                final int a5 = dd2.l.a();
                                                int n17;
                                                if (this.ae == 3) {
                                                    n17 = dd2.d() + a4;
                                                }
                                                else {
                                                    a4 = (int)(a4 + (this.d() - a4 - a5 - dd2.d()) * dd2.I + 0.5f);
                                                    n17 = dd2.d() + a4;
                                                }
                                                final dc j4 = dd2.j;
                                                j4.f = cz.e(j4);
                                                final dc l3 = dd2.l;
                                                l3.f = cz.e(l3);
                                                cz.h(dd2.j.f, a4);
                                                cz.h(dd2.l.f, n17);
                                                if (dd2.C > 0 || dd2.K == 8) {
                                                    final dc m3 = dd2.m;
                                                    m3.f = cz.e(m3);
                                                    cz.h(dd2.m.f, dd2.C + a4);
                                                }
                                                dd2.b = 2;
                                                dd2.p(a4, n17);
                                                break Label_3060;
                                            }
                                            dd2.b = 1;
                                            break Label_3060;
                                        }
                                    }
                                    if (b5 != null && b5.a == this) {
                                        final int a6 = j3.a();
                                        final int n18 = dd2.d() + a6;
                                        final dc j5 = dd2.j;
                                        j5.f = cz.e(j5);
                                        final dc l4 = dd2.l;
                                        l4.f = cz.e(l4);
                                        cz.h(dd2.j.f, a6);
                                        cz.h(dd2.l.f, n18);
                                        if (dd2.C > 0 || dd2.K == 8) {
                                            final dc m4 = dd2.m;
                                            m4.f = cz.e(m4);
                                            cz.h(dd2.m.f, dd2.C + a6);
                                        }
                                        dd2.b = 2;
                                        dd2.p(a6, n18);
                                    }
                                    else {
                                        final dc b7 = dd2.l.b;
                                        if (b7 != null && b7.a == this) {
                                            j3.f = cz.e(j3);
                                            final dc l5 = dd2.l;
                                            l5.f = cz.e(l5);
                                            final int n19 = this.d() - dd2.l.a();
                                            final int n20 = n19 - dd2.d();
                                            cz.h(dd2.j.f, n20);
                                            cz.h(dd2.l.f, n19);
                                            if (dd2.C > 0 || dd2.K == 8) {
                                                final dc m5 = dd2.m;
                                                m5.f = cz.e(m5);
                                                cz.h(dd2.m.f, dd2.C + n20);
                                            }
                                            dd2.b = 2;
                                            dd2.p(n20, n19);
                                        }
                                        else if (b5 != null && b5.a.b == 2) {
                                            final db f3 = b5.f;
                                            j3.f = cz.e(j3);
                                            final dc l6 = dd2.l;
                                            l6.f = cz.e(l6);
                                            final int n21 = (int)(f3.d + dd2.j.a() + 0.5f);
                                            final int n22 = dd2.d() + n21;
                                            cz.h(dd2.j.f, n21);
                                            cz.h(dd2.l.f, n22);
                                            if (dd2.C > 0 || dd2.K == 8) {
                                                final dc m6 = dd2.m;
                                                m6.f = cz.e(m6);
                                                cz.h(dd2.m.f, dd2.C + n21);
                                            }
                                            dd2.b = 2;
                                            dd2.p(n21, n22);
                                        }
                                        else if (b7 != null && b7.a.b == 2) {
                                            final db f4 = b7.f;
                                            j3.f = cz.e(j3);
                                            final dc l7 = dd2.l;
                                            l7.f = cz.e(l7);
                                            final int n23 = (int)(f4.d - dd2.l.a() + 0.5f);
                                            final int n24 = n23 - dd2.d();
                                            cz.h(dd2.j.f, n24);
                                            cz.h(dd2.l.f, n23);
                                            if (dd2.C > 0 || dd2.K == 8) {
                                                final dc m7 = dd2.m;
                                                m7.f = cz.e(m7);
                                                cz.h(dd2.m.f, dd2.C + n24);
                                            }
                                            dd2.b = 2;
                                            dd2.p(n24, n23);
                                        }
                                        else {
                                            final dc b8 = dd2.m.b;
                                            if (b8 != null && b8.a.b == 2) {
                                                final db f5 = b8.f;
                                                j3.f = cz.e(j3);
                                                final dc l8 = dd2.l;
                                                l8.f = cz.e(l8);
                                                final int n25 = (int)(f5.d - dd2.C + 0.5f);
                                                final int n26 = dd2.d() + n25;
                                                cz.h(dd2.j.f, n25);
                                                cz.h(dd2.l.f, n26);
                                                final dc m8 = dd2.m;
                                                m8.f = cz.e(m8);
                                                cz.h(dd2.m.f, dd2.C + n25);
                                                dd2.b = 2;
                                                dd2.p(n25, n26);
                                            }
                                            else if (b8 == null && b5 == null && b7 == null) {
                                                if (dd2 instanceof df) {
                                                    final df df2 = (df)dd2;
                                                    if (df2.ai == 0) {
                                                        j3.f = cz.e(j3);
                                                        final dc l9 = dd2.l;
                                                        l9.f = cz.e(l9);
                                                        final int ag2 = df2.ag;
                                                        float n27;
                                                        if (ag2 != -1) {
                                                            n27 = (float)ag2;
                                                        }
                                                        else if (df2.ah != -1) {
                                                            n27 = (float)(this.d() - df2.ah);
                                                        }
                                                        else {
                                                            n27 = this.d() * df2.af;
                                                        }
                                                        final int n28 = (int)(n27 + 0.5f);
                                                        cz.h(dd2.j.f, n28);
                                                        cz.h(dd2.l.f, n28);
                                                        dd2.b = 2;
                                                        dd2.a = 2;
                                                        dd2.p(n28, n28);
                                                        dd2.l(0, this.h());
                                                    }
                                                }
                                                else {
                                                    j3.f = cz.e(j3);
                                                    final dc l10 = dd2.l;
                                                    l10.f = cz.e(l10);
                                                    final int x = dd2.x;
                                                    final int d = dd2.d();
                                                    cz.h(dd2.j.f, x);
                                                    cz.h(dd2.l.f, d + x);
                                                    if (dd2.C > 0 || dd2.K == 8) {
                                                        final dc m9 = dd2.m;
                                                        m9.f = cz.e(m9);
                                                        cz.h(dd2.m.f, x + dd2.C);
                                                    }
                                                    dd2.b = 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int n29 = n3;
                    if (dd2.b == -1) {
                        n29 = n3 + 1;
                    }
                    int n30 = n4;
                    if (dd2.a == -1) {
                        n30 = n4 + 1;
                    }
                    ++k;
                    n3 = n29;
                    n4 = n30;
                }
                int n32 = 0;
                Label_3153: {
                    while (true) {
                        int n31 = 0;
                        Label_3133: {
                            if (n3 != 0) {
                                n31 = n3;
                                break Label_3133;
                            }
                            if (n4 != 0) {
                                n31 = 0;
                                break Label_3133;
                            }
                            n32 = 1;
                            break Label_3153;
                        }
                        if (n == n31 && n2 == n4) {
                            continue;
                        }
                        break;
                    }
                    n32 = 0;
                }
                n = n3;
                j = n32;
                n2 = n4;
            }
            int n33 = 0;
            int n34 = 0;
            int n36 = 0;
            int n37;
            for (int n35 = 0; n35 < size2; ++n35, n33 = n36, n34 = n37) {
                final dd dd3 = this.al.get(n35);
                final int a7 = dd3.a;
                Label_3222: {
                    if (a7 != 1) {
                        n36 = n33;
                        if (a7 != -1) {
                            break Label_3222;
                        }
                    }
                    n36 = n33 + 1;
                }
                final int b9 = dd3.b;
                if (b9 != 1) {
                    n37 = n34;
                    if (b9 != -1) {
                        continue;
                    }
                }
                n37 = n34 + 1;
            }
            if (n33 == 0) {
                if (n34 == 0) {
                    return false;
                }
                b = false;
            }
            else {
                b = false;
            }
        }
        for (int n38 = 0; n38 < size; ++n38) {
            final dd dd4 = this.al.get(n38);
            if (dd4 instanceof de) {
                int ad3 = dd4.ad;
                final int ae3 = dd4.ae;
                if (ad3 == 2) {
                    dd4.w(1);
                    ad3 = 2;
                }
                int n39;
                if ((n39 = ae3) == 2) {
                    dd4.x(1);
                    n39 = 2;
                }
                dd4.y(cz);
                if (ad3 == 2) {
                    dd4.w(2);
                }
                if (n39 == 2) {
                    dd4.x(2);
                }
            }
            else {
                if (b) {
                    if (this.ad != 2 && dd4.ad == 4) {
                        final dc i5 = dd4.i;
                        i5.f = cz.e(i5);
                        final dc k9 = dd4.k;
                        k9.f = cz.e(k9);
                        final int c3 = dd4.i.c;
                        final int n40 = this.h() - dd4.k.c;
                        cz.h(dd4.i.f, c3);
                        cz.h(dd4.k.f, n40);
                        dd4.l(c3, n40);
                        dd4.a = 2;
                    }
                    if (this.ae != 2) {
                        if (dd4.ae == 4) {
                            final dc j6 = dd4.j;
                            j6.f = cz.e(j6);
                            final dc l11 = dd4.l;
                            l11.f = cz.e(l11);
                            final int c4 = dd4.j.c;
                            final int n41 = this.d() - dd4.l.c;
                            cz.h(dd4.j.f, c4);
                            cz.h(dd4.l.f, n41);
                            if (dd4.C > 0 || dd4.K == 8) {
                                final dc m10 = dd4.m;
                                m10.f = cz.e(m10);
                                cz.h(dd4.m.f, dd4.C + c4);
                            }
                            dd4.p(c4, n41);
                            dd4.b = 2;
                        }
                    }
                }
                dd4.y(cz);
            }
        }
        if (this.an > 0) {
            this.H(cz);
        }
        if (this.ao > 0) {
            this.I(cz);
        }
        return true;
    }
    
    @Override
    public final void i() {
        this.af.l();
        super.i();
    }
}

import android.graphics.Rect;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzw
{
    private final haw a;
    private final haq b;
    private final hax c;
    private final gzx d;
    private final gzs e;
    private final hao f;
    private final niz g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private List k;
    
    public gzw(final haw a, final haq b, final hax c, final gzx d, final gzs e, final hao f, final niz g, final boolean h, final boolean i, final boolean j, final kjk kjk) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = j;
        this.g = g;
        this.f = f;
        this.k = new ArrayList();
        kjk.c(e);
        kjk.c(a);
    }
    
    public final had a(final lju lju, final gzn gzn) {
        final int j = gzn.j;
        float b;
        if (j != 2) {
            if (j == 3) {
                b = 1.0f;
            }
            else {
                b = 0.0f;
            }
        }
        else {
            b = 1.0f;
        }
        final int i = gzn.i;
        float c;
        if (i != 4) {
            if (i == 2) {
                c = 1.0f;
            }
            else {
                c = 0.0f;
            }
        }
        else {
            c = 1.0f;
        }
        final int k = gzn.k;
        float d;
        if (k != 2) {
            if (k == 3) {
                d = 1.0f;
            }
            else {
                d = 0.0f;
            }
        }
        else {
            d = 1.0f;
        }
        final gzm[] p2 = gzn.p;
        p2.getClass();
        final int length = p2.length;
        final float e = (float)length;
        final Rect s = gzn.s;
        p2.getClass();
        float f;
        if (length == 0) {
            f = 0.0f;
        }
        else {
            int l = 0;
            float n = 0.0f;
            while (l < length) {
                final gzm gzm = p2[l];
                final int width = s.width();
                final int height = s.height();
                final Rect a = gzm.a;
                final float n2 = (float)width;
                final float n3 = n2 * 0.04f;
                final float n4 = (float)height;
                final float n5 = 0.04f * n4;
                n += Math.min(1.0f - hff.b(-(a.left - n2 * 0.15f) / n3), Math.min(1.0f - hff.b((a.right - n2 * 0.85f) / n3), Math.min(1.0f - hff.b(-(a.top - 0.15f * n4) / n5), 1.0f - hff.b((a.bottom - n4 * 0.85f) / n5)))) / p2.length;
                ++l;
            }
            f = n;
        }
        final float a2 = this.b.a(gzn);
        float m;
        if (gzn.l == 0) {
            m = 1.0f;
        }
        else {
            m = 0.0f;
        }
        final hax c2 = this.c;
        final float a3 = c2.a * 0.85f + gzn.o * 0.14999998f;
        c2.a = a3;
        float n6 = (a3 * (float)(1.0 - 2.0 / (1.0 / Math.pow(gzn.c / 1000000.0f, 6.0) + 1.0)) + 1.0f) / 2.0f;
        final float a4 = this.e.a(lju, gzn);
        final float a5 = this.f.a(lju);
        final niz b2 = this.e.b();
        final niz b3 = this.a.b(lju, gzn);
        final niz b4 = haa.b(this.g, lju.d());
        float b5;
        if (b3.g()) {
            b5 = ((hat)b3.c()).b;
        }
        else {
            b5 = 0.0f;
        }
        final boolean q = gzn.q;
        final boolean c3 = this.e.c();
        hba hba;
        if (this.j) {
            if (this.i && e == 0.0f) {
                final haz haz = new haz();
                haz.b = 0.00405f;
                haz.d = 0.06617f;
                haz.e = 0.01806f;
                haz.g = 0.04254f;
                haz.h = 0.20591f;
                haz.i = 0.02346f;
                hba = haz.a();
            }
            else {
                final haz haz2 = new haz();
                haz2.b = 0.00544f;
                haz2.c = 0.03901f;
                haz2.d = 0.85416f;
                haz2.g = 0.1014f;
                hba = haz2.a();
            }
        }
        else if (this.i && e == 0.0f) {
            final haz haz3 = new haz();
            haz3.a = 1.6E-4f;
            haz3.d = 0.03037f;
            haz3.e = 0.00614f;
            haz3.g = 0.01661f;
            haz3.h = 0.08336f;
            haz3.i = 0.00359f;
            hba = haz3.a();
        }
        else {
            final haz haz4 = new haz();
            haz4.c = 0.04085f;
            haz4.d = 0.86336f;
            haz4.f = 0.00393f;
            haz4.g = 0.09186f;
            hba = haz4.a();
        }
        final float n7 = hba.i * a5 + (hba.a * b + 0.0f + hba.b * c + d * 0.0f + e * 0.0f + hba.c * f + hba.d * b5 + hba.e * a2 + hba.f * m + hba.g * n6 + hba.h * a4);
        float l2;
        float n13;
        if (this.h) {
            final ArrayList list = new ArrayList();
            float k2;
            float j2;
            if (b3.g()) {
                for (final has has : ((hat)b3.c()).a) {
                    final okt m2 = oos.g.m();
                    final long a7 = has.a;
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final oos oos = (oos)m2.b;
                    final int a8 = oos.a | 0x1;
                    oos.a = a8;
                    oos.b = a7;
                    final float c4 = has.c;
                    oos.a = (a8 | 0x4);
                    oos.d = c4;
                    if (has.b.g()) {
                        final long longValue = (long)has.b.c();
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final oos oos2 = (oos)m2.b;
                        oos2.a |= 0x2;
                        oos2.c = longValue;
                    }
                    if (has.f.g()) {
                        final Iterable iterable = (Iterable)has.f.c();
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final oos oos3 = (oos)m2.b;
                        final ole e2 = oos3.e;
                        if (!e2.c()) {
                            oos3.e = oky.w(e2);
                        }
                        ojf.e(iterable, oos3.e);
                    }
                    if (has.g.g()) {
                        final Iterable iterable2 = (Iterable)has.g.c();
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final oos oos4 = (oos)m2.b;
                        final ole f2 = oos4.f;
                        if (!f2.c()) {
                            oos4.f = oky.w(f2);
                        }
                        ojf.e(iterable2, oos4.f);
                    }
                    list.add(m2.h());
                }
                final float n9 = n6;
                k2 = a4;
                l2 = a5;
                j2 = n9;
            }
            else {
                final float n10 = n6;
                k2 = a4;
                l2 = a5;
                j2 = n10;
            }
            final okt m3 = ool.r.m();
            if (m3.c) {
                m3.m();
                m3.c = false;
            }
            final ool ool = (ool)m3.b;
            final int a9 = ool.a | 0x1;
            ool.a = a9;
            ool.b = b;
            final int a10 = a9 | 0x2;
            ool.a = a10;
            ool.c = c;
            final int a11 = a10 | 0x4;
            ool.a = a11;
            ool.d = d;
            final int a12 = a11 | 0x8;
            ool.a = a12;
            ool.e = e;
            final int a13 = a12 | 0x10;
            ool.a = a13;
            ool.f = f;
            final int a14 = a13 | 0x20;
            ool.a = a14;
            ool.g = b5;
            final int a15 = a14 | 0x40;
            ool.a = a15;
            ool.h = a2;
            final int a16 = a15 | 0x80;
            ool.a = a16;
            ool.i = m;
            final int a17 = a16 | 0x100;
            ool.a = a17;
            ool.j = j2;
            final int a18 = a17 | 0x200;
            ool.a = a18;
            ool.k = k2;
            ool.a = (a18 | 0x400);
            ool.l = l2;
            float c5;
            if (b3.g()) {
                c5 = ((hat)b3.c()).c;
            }
            else {
                c5 = 0.0f;
            }
            if (m3.c) {
                m3.m();
                m3.c = false;
            }
            final ool ool2 = (ool)m3.b;
            ool2.a |= 0x800;
            ool2.o = c5;
            float d2;
            if (b3.g()) {
                d2 = ((hat)b3.c()).d;
            }
            else {
                d2 = 0.0f;
            }
            if (m3.c) {
                m3.m();
                m3.c = false;
            }
            final ool ool3 = (ool)m3.b;
            ool3.a |= 0x1000;
            ool3.p = d2;
            float e3;
            if (b3.g()) {
                e3 = ((hat)b3.c()).e;
            }
            else {
                e3 = 0.0f;
            }
            if (m3.c) {
                m3.m();
                m3.c = false;
            }
            final ool ool4 = (ool)m3.b;
            ool4.a |= 0x2000;
            ool4.q = e3;
            final olj m4 = ool4.m;
            if (!m4.c()) {
                ool4.m = oky.C(m4);
            }
            ojf.e(list, ool4.m);
            if (b2.g()) {
                final float[] array = (float[])b2.c();
                int n11;
                if (this.k.isEmpty()) {
                    this.k = new ArrayList(Collections.nCopies(array.length, 0.0f));
                    n11 = 0;
                }
                else {
                    n11 = 0;
                }
                while (n11 < array.length) {
                    this.k.set(n11, array[n11]);
                    ++n11;
                }
                final List k3 = this.k;
                if (m3.c) {
                    m3.m();
                    m3.c = false;
                }
                final ool ool5 = (ool)m3.b;
                final ole n12 = ool5.n;
                if (!n12.c()) {
                    ool5.n = oky.w(n12);
                }
                ojf.e(k3, ool5.n);
            }
            final ool ool6 = (ool)m3.h();
            final okt m5 = oom.m.m();
            final float a19 = hba.a;
            if (m5.c) {
                m5.m();
                m5.c = false;
            }
            final oom oom = (oom)m5.b;
            final int a20 = oom.a | 0x1;
            oom.a = a20;
            oom.b = a19;
            final float b6 = hba.b;
            final int a21 = a20 | 0x2;
            oom.a = a21;
            oom.c = b6;
            final int a22 = 0x4 | a21;
            oom.a = a22;
            oom.d = 0.0f;
            final int a23 = a22 | 0x8;
            oom.a = a23;
            oom.e = 0.0f;
            final float c6 = hba.c;
            final int a24 = a23 | 0x10;
            oom.a = a24;
            oom.f = c6;
            final float d3 = hba.d;
            final int a25 = a24 | 0x20;
            oom.a = a25;
            oom.g = d3;
            final float e4 = hba.e;
            final int a26 = a25 | 0x40;
            oom.a = a26;
            oom.h = e4;
            final float f3 = hba.f;
            final int a27 = a26 | 0x80;
            oom.a = a27;
            oom.i = f3;
            final float g = hba.g;
            final int a28 = a27 | 0x100;
            oom.a = a28;
            oom.j = g;
            final float h = hba.h;
            final int a29 = a28 | 0x200;
            oom.a = a29;
            oom.k = h;
            final float i2 = hba.i;
            oom.a = (a29 | 0x400);
            oom.l = i2;
            this.d.a(lju.d(), ool6, (oom)m5.h());
            n13 = k2;
            n6 = j2;
        }
        else {
            n13 = a4;
            l2 = a5;
        }
        return new had(lju.d(), n7, b, c, d, e, f, b5, a2, m, n6, l2, n13, q, c3, b3, b4, b2);
    }
}

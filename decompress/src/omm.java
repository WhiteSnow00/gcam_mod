import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class omm implements omy
{
    private final omj a;
    private final boolean b;
    private final pjf c;
    
    private omm(final pjf c, final omj a, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = (a instanceof okw);
        this.a = a;
    }
    
    static omm c(final pjf pjf, final okn okn, final omj omj) {
        return new omm(pjf, omj, null, null);
    }
    
    @Override
    public final int a(final Object o) {
        final onk d = pjf.D(o);
        int e = d.e;
        int i = 0;
        if (e == -1) {
            e = 0;
            for (int j = 0; j < d.b; ++j) {
                final int n = d.c[j];
                final ojw ojw = (ojw)d.d[j];
                final int ab = okg.ab(1);
                e += ab + ab + okg.ac(2, onx.a(n)) + okg.H(3, ojw);
            }
            d.e = e;
        }
        int n2 = e;
        if (this.b) {
            final okp b = okn.b(o);
            int n3 = 0;
            while (i < b.b.a()) {
                n3 += b.b(b.b.f(i));
                ++i;
            }
            final Iterator iterator = b.b.c().iterator();
            while (iterator.hasNext()) {
                n3 += b.b((Map.Entry)iterator.next());
            }
            n2 = e + n3;
        }
        return n2;
    }
    
    @Override
    public final int b(final Object o) {
        int hashCode = pjf.D(o).hashCode();
        if (this.b) {
            hashCode = hashCode * 53 + okn.b(o).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final Object e() {
        return this.a.aS().k();
    }
    
    @Override
    public final void f(final Object o) {
        pjf.G(o);
        okn.f(o);
    }
    
    @Override
    public final void g(final Object o, final Object o2) {
        omz.V(o, o2);
        if (this.b) {
            omz.T(o, o2);
        }
    }
    
    @Override
    public final void h(final Object o, final omu omu, final okm okm) {
        final pjf c = this.c;
        final Object f = pjf.F(o);
        final okp c2 = okn.c(o);
        try {
        Label_0236_Outer:
            while (omu.c() != Integer.MAX_VALUE) {
                final int d = omu.d();
                if (d == onx.a) {
                    int j = 0;
                    okk d2 = null;
                    ojw q = null;
                    while (true) {
                        while (omu.c() != Integer.MAX_VALUE) {
                            final int d3 = omu.d();
                            if (d3 == onx.c) {
                                j = omu.j();
                                d2 = okm.d(this.a, j);
                            }
                            else if (d3 == onx.d) {
                                if (d2 != null) {
                                    okn.d(omu, d2, okm, c2);
                                }
                                else {
                                    q = omu.q();
                                }
                            }
                            else {
                                if (omu.U()) {
                                    continue Label_0236_Outer;
                                }
                                if (omu.d() != onx.b) {
                                    throw olm.b();
                                }
                                if (q == null) {
                                    continue Label_0236_Outer;
                                }
                                if (d2 == null) {
                                    pjf.B(f, j, q);
                                    continue Label_0236_Outer;
                                }
                                final omj k = d2.c.aS().k();
                                final ByteBuffer wrap = ByteBuffer.wrap(q.B());
                                if (!wrap.hasArray()) {
                                    throw new IllegalArgumentException("Direct buffers not yet supported");
                                }
                                final ojm ojm = new ojm(wrap);
                                omr.a.b(k).h(k, ojm, okm);
                                c2.l(d2.d, k);
                                if (ojm.c() == Integer.MAX_VALUE) {
                                    continue Label_0236_Outer;
                                }
                                throw olm.b();
                            }
                        }
                        continue;
                    }
                }
                boolean b;
                if (onx.b(d) == 2) {
                    final okk d4 = okm.d(this.a, onx.a(d));
                    if (d4 != null) {
                        okn.d(omu, d4, okm, c2);
                        continue;
                    }
                    b = c.A(f, omu);
                }
                else {
                    b = omu.U();
                }
                if (!b) {
                    break;
                }
            }
            pjf.E(o, (onk)f);
        }
        finally {
            pjf.E(o, (onk)f);
            while (true) {}
        }
    }
    
    @Override
    public final void i(final Object o, final byte[] array, int i, final int n, final ojl ojl) {
        final oky oky = (oky)o;
        onk aa = oky.aA;
        if (aa == onk.a) {
            aa = onk.c();
            oky.aA = aa;
        }
        final okp j = ((okw)o).i();
        okk okk = null;
        while (i < n) {
            i = okn.s(array, i, ojl);
            final int a = ojl.a;
            if (a != onx.a) {
                if (onx.b(a) == 2) {
                    okk = ojl.d.d(this.a, onx.a(a));
                    if (okk != null) {
                        i = okn.m(omr.a.a(okk.c.getClass()), array, i, n, ojl);
                        j.l(okk.d, ojl.c);
                    }
                    else {
                        i = okn.r(a, array, i, n, aa, ojl);
                    }
                }
                else {
                    i = okn.w(a, array, i, n, ojl);
                }
            }
            else {
                int a2 = 0;
                Object o2 = null;
                int n2;
                while (true) {
                    n2 = i;
                    if (i >= n) {
                        break;
                    }
                    i = okn.s(array, i, ojl);
                    final int a3 = ojl.a;
                    final int b = onx.b(a3);
                    switch (onx.a(a3)) {
                        case 3: {
                            if (okk != null) {
                                i = okn.m(omr.a.a(okk.c.getClass()), array, i, n, ojl);
                                j.l(okk.d, ojl.c);
                                continue;
                            }
                            if (b == 2) {
                                i = okn.j(array, i, ojl);
                                o2 = ojl.c;
                                continue;
                            }
                            break;
                        }
                        case 2: {
                            if (b == 0) {
                                i = okn.s(array, i, ojl);
                                a2 = ojl.a;
                                okk = ojl.d.d(this.a, a2);
                                continue;
                            }
                            break;
                        }
                    }
                    n2 = i;
                    if (a3 == onx.b) {
                        break;
                    }
                    i = okn.w(a3, array, i, n, ojl);
                }
                if (o2 != null) {
                    aa.e(onx.c(a2, 2), o2);
                }
                i = n2;
            }
        }
        if (i == n) {
            return;
        }
        throw olm.g();
    }
    
    @Override
    public final boolean j(final Object o, final Object o2) {
        return pjf.D(o).equals(pjf.D(o2)) && (!this.b || okn.b(o).equals(okn.b(o2)));
    }
    
    @Override
    public final boolean k(final Object o) {
        return okn.b(o).i();
    }
    
    @Override
    public final void l(final Object o, final okh okh) {
        final Iterator d = okn.b(o).d();
        while (d.hasNext()) {
            final Map.Entry entry = d.next();
            final okx okx = (okx)entry.getKey();
            if (okx.a() != onw.i) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof olp) {
                okh.l(okx.b, ((olp)entry).a.getValue().a());
            }
            else {
                okh.l(okx.b, entry.getValue());
            }
        }
        final onk d2 = pjf.D(o);
        for (int i = 0; i < d2.b; ++i) {
            okh.l(onx.a(d2.c[i]), d2.d[i]);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmo implements fnb
{
    private final eya a;
    private final hfn b;
    private final gkw c;
    private final hew d;
    private final klj e;
    private final klv f;
    private final klj g;
    private final hkc h;
    private final hgg i;
    private final hif j;
    private final hio k;
    private final grh l;
    private hwe m;
    private final hgn n;
    private final hwz o;
    
    public fmo(final eya a, final hwz o, final hfn b, final gkw c, final hew d, final klv e, final klv f, final klj g, final hkc h, final hgn n, final hgg i, final hif j, final grh l, final hio k) {
        this.a = a;
        this.o = o;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.n = n;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final oey a(final fvp fvp, final flq flq, final fvo fvo, final fxu fxu, final boolean b, final boolean b2, final hwe hwe) {
        throw null;
    }
    
    @Override
    public final oey d(final flv flv, final fvo fvo, final boolean b, final hwe m) {
        this.m = m;
        final flq b2 = flv.b;
        final long currentTimeMillis = System.currentTimeMillis();
        hie hie;
        if (this.k == hio.k) {
            hie = this.j.a(currentTimeMillis, drk.e, "PORTRAIT");
        }
        else if (this.k == hio.q) {
            final hif j = this.j;
            drk drk;
            if (j.a.b(cyn.c)) {
                drk = drk.j;
            }
            else {
                drk = drk.h;
            }
            hie = j.a(currentTimeMillis, drk, "LASAGNA");
        }
        else {
            hie = this.j.d(currentTimeMillis);
        }
        final hgn n = this.n;
        final hio k = this.k;
        final String a = this.o.a(currentTimeMillis);
        final btl c = this.a.c();
        final niz i = niz.i(this.m);
        final Object value = n.a.get();
        final gxa gxa = (gxa)n.b.get();
        gxa.getClass();
        final kse kse = (kse)n.c.get();
        kse.getClass();
        a.getClass();
        final hgm hgm = new hgm((hfk)value, gxa, kse, k, a, c, hie, i);
        final kre a2 = b2.d.a;
        kre kre;
        if (gko.b(this.c.l())) {
            kre = a2.d();
        }
        else {
            kre = a2.e();
        }
        this.b.e(hgm);
        this.i.a(hgm);
        hgm.P(kre);
        final fvn fvn = new fvn(this.c.c().e, fvo, this.d.a, flv.c.l(), flv.c.K(), klu.a(false), false, false);
        final fxu c2 = flv.c;
        final boolean b3 = (int)this.h.c(hjq.c) != inp.a.e;
        final boolean b4 = c2.l() == lfu.a;
        hkl hkl;
        if (b4) {
            hkl = hjq.i;
        }
        else {
            hkl = hjq.j;
        }
        final huz l = hgm.k();
        final ezc a3 = ezd.a();
        a3.b = 2;
        final String s = hgm.s();
        final String j2 = llk.c.j;
        final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf(j2).length());
        sb.append(s);
        sb.append(".");
        sb.append(j2);
        a3.d(sb.toString());
        a3.g(b4);
        a3.n((float)this.g.aQ());
        a3.e((String)this.h.c(hkl));
        a3.h(b3);
        a3.l((boolean)this.f.aQ());
        a3.m((float)((hjg)this.e.aQ()).g);
        a3.a = b;
        a3.b(c2.h());
        a3.j((Boolean)this.h.c(hjq.k));
        a3.k(false);
        a3.l((boolean)this.f.aQ());
        a3.i(hgm.j() == hip.b);
        a3.c(this.l.d());
        l.e(a3.a());
        return flv.f(fvn, hgm);
    }
}

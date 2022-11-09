import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.os.SystemClock;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmu implements fnb
{
    private final hwz A;
    private final gkn B;
    public final fcp a;
    public final Handler b;
    private final eya c;
    private final niz d;
    private final hfn e;
    private final gkw f;
    private final hew g;
    private final gha h;
    private final klv i;
    private final klj j;
    private final klv k;
    private final klv l;
    private final klv m;
    private final hkc n;
    private final cxl o;
    private final hgr p;
    private final hgg q;
    private final klj r;
    private final dev s;
    private final grh t;
    private hwe u;
    private final klv v;
    private final hif w;
    private final duq x;
    private final hbm y;
    private final lmo z;
    
    public fmu(final eya c, final niz d, final hwz a, final hfn e, final gkw f, final hew g, final gha h, final klv i, final klv k, final klj j, final klv l, final klv m, final hkc n, final klv r, final fcp a2, final cxl o, final hgr p27, final hgg q, final dev s, final grh t, final klv v, final gkn b, final duq x, final hif w, final hbm y, final lmo z, final byte[] array) {
        this.c = c;
        this.d = d;
        this.A = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.r = r;
        this.a = a2;
        this.o = o;
        this.p = p27;
        this.q = q;
        this.s = s;
        this.t = t;
        this.v = v;
        this.B = b;
        this.b = kpo.d(Looper.getMainLooper());
        this.x = x;
        this.w = w;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public final oey a(final fvp fvp, final flq flq, final fvo fvo, final fxu fxu, final boolean b, final boolean b2, final hwe u) {
        final boolean b3 = false;
        final kkz kkz = new kkz(false);
        this.u = u;
        boolean b4 = false;
        Label_0146: {
            if (this.o.k(cxz.r) && (boolean)this.l.aQ() && (boolean)this.m.aQ()) {
                if (fxu.H()) {
                    if (this.r.aQ() == jbm.h) {
                        b4 = !this.o.k(cxz.q);
                        break Label_0146;
                    }
                    this.o.b();
                }
                b4 = true;
            }
            else {
                b4 = false;
            }
        }
        final fvn fvn = new fvn(this.f.c().e, fvo, this.g.a, fxu.l(), fxu.K(), kkz, b4, b2);
        hio hio = hio.b;
        if (fvn.i) {
            hio = hio.o;
        }
        else if (this.x.a().aQ()) {
            hio = hio.m;
        }
        else if (this.h.aQ() == ggz.a) {
            hio = hio.c;
        }
        else if (this.h.aQ() == ggz.b) {
            hio = hio.d;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        SystemClock.elapsedRealtime();
        if (hio == hio.o) {
            final cxl o = this.o;
            final cxo a = cxw.a;
            o.e();
        }
        final hie d = this.w.d(currentTimeMillis);
        final btl c = this.c.c();
        String s;
        if (hio == hio.o) {
            s = this.A.c(currentTimeMillis, new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss_'LS'", Locale.US));
        }
        else {
            s = this.A.a(currentTimeMillis);
        }
        final hgr p7 = this.p;
        final niz d2 = this.d;
        final klv g = fvn.g;
        final niz i = niz.i(this.u);
        final niz j = niz.i(this.s);
        final hbm y = this.y;
        final hgt hgt = (hgt)p7;
        final Object value = hgt.a.get();
        final dyy dyy = (dyy)hgt.b.get();
        dyy.getClass();
        final klj klj = (klj)hgt.c.get();
        klj.getClass();
        final gha gha = (gha)hgt.d.get();
        gha.getClass();
        hgt.e.get().getClass();
        final kse kse = (kse)hgt.f.get();
        kse.getClass();
        final gxa gxa = (gxa)hgt.g.get();
        gxa.getClass();
        s.getClass();
        g.getClass();
        hio.getClass();
        y.getClass();
        final hgs hgs = new hgs((hfk)value, dyy, klj, gha, kse, gxa, s, c, d, d2, g, i, j, hio, y);
        final kre a2 = flq.d.a;
        kre kre;
        if (gko.b(this.f.l())) {
            kre = a2.d();
        }
        else {
            kre = a2.e();
        }
        this.e.e(hgs);
        this.q.a(hgs);
        if (fvn.i) {
            hgs.u(new fmt(new fms(this)));
        }
        hgs.P(kre);
        final boolean b5 = (int)this.n.c(hjq.c) != inp.a.e;
        final boolean b6 = fxu.l() == lfu.a;
        hkl hkl;
        if (b6) {
            hkl = hjq.j;
        }
        else {
            hkl = hjq.i;
        }
        final huz k = hgs.k();
        final ezc a3 = ezd.a();
        a3.b = 2;
        final String s2 = hgs.s();
        final String l = llk.c.j;
        final StringBuilder sb = new StringBuilder(s2.length() + 1 + String.valueOf(l).length());
        sb.append(s2);
        sb.append(".");
        sb.append(l);
        a3.d(sb.toString());
        a3.g(b6);
        a3.n((float)this.j.aQ());
        a3.e((String)this.n.c(hkl));
        a3.h(b5);
        a3.m((float)((hjg)this.i.aQ()).g);
        a3.a = b;
        a3.b(fxu.h());
        a3.j((Boolean)this.n.c(hjq.k));
        a3.k((Boolean)this.l.aQ());
        a3.l((boolean)this.k.aQ());
        a3.c(this.t.d());
        final okt m = nzi.d.m();
        final boolean booleanValue = (boolean)this.v.aQ();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzi nzi = (nzi)m.b;
        nzi.a |= 0x1;
        nzi.b = booleanValue;
        this.B.c();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzi nzi2 = (nzi)m.b;
        nzi2.a |= 0x2;
        nzi2.c = false;
        a3.f((nzi)m.h());
        a3.i(hgs.j() == hip.b || b3);
        k.e(a3.a());
        return fvp.f(fvn, hgs);
    }
    
    @Override
    public final oey d(final flv flv, final fvo fvo, final boolean b, final hwe hwe) {
        throw null;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.performance.primes.transmitter.clearcut;

import java.util.Iterator;
import java.util.concurrent.Executor;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import android.util.Log;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import android.content.Context;

public final class ClearcutMetricSnapshotTransmitter implements mmv
{
    private volatile jpg a;
    private volatile jpg b;
    
    @Override
    public final oey a(Context d, mmt mmt) {
        final okk h = mna.h;
        mmt.j(h);
        njo.e(mmt.f.b.get(h.d) != null, "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        psp psp;
        if ((psp = mmt.b) == null) {
            psp = psp.t;
        }
        final okt okt = (okt)psp.H(5);
        okt.o(psp);
        mni.b(mni.a, okt);
        prb prb;
        if ((prb = ((psp)okt.b).j) == null) {
            prb = prb.c;
        }
        if ((prb.a & 0x1) != 0x0) {
            prb prb2;
            if ((prb2 = ((psp)okt.b).j) == null) {
                prb2 = prb.c;
            }
            pra pra;
            if ((pra = prb2.b) == null) {
                pra = pra.k;
            }
            final okt okt2 = (okt)pra.H(5);
            okt2.o(pra);
            mni.b(mni.b, okt2);
            prb prb3;
            if ((prb3 = ((psp)okt.b).j) == null) {
                prb3 = prb.c;
            }
            final okt okt3 = (okt)prb3.H(5);
            okt3.o(prb3);
            if (okt3.c) {
                okt3.m();
                okt3.c = false;
            }
            final prb prb4 = (prb)okt3.b;
            final pra b = (pra)okt2.h();
            b.getClass();
            prb4.b = b;
            prb4.a |= 0x1;
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final psp psp2 = (psp)okt.b;
            final prb j = (prb)okt3.h();
            j.getClass();
            psp2.j = j;
            psp2.a |= 0x200;
        }
        psc psc;
        if ((psc = ((psp)okt.b).g) == null) {
            psc = psc.l;
        }
        if ((psc.a & 0x100) != 0x0) {
            psc psc2;
            if ((psc2 = ((psp)okt.b).g) == null) {
                psc2 = psc.l;
            }
            ocd ocd;
            if ((ocd = psc2.j) == null) {
                ocd = ocd.d;
            }
            final okt okt4 = (okt)ocd.H(5);
            okt4.o(ocd);
            occ occ;
            if ((occ = ((ocd)okt4.b).b) == null) {
                occ = occ.f;
            }
            final okt okt5 = (okt)occ.H(5);
            okt5.o(occ);
            final String c = ((occ)okt5.b).c;
            if (!c.isEmpty()) {
                final long longValue = ofz.a(c);
                if (okt5.c) {
                    okt5.m();
                    okt5.c = false;
                }
                final occ occ2 = (occ)okt5.b;
                final int a = occ2.a | 0x4;
                occ2.a = a;
                occ2.d = longValue;
                occ2.a = (a & 0xFFFFFFFD);
                occ2.c = occ.f.c;
            }
            final occ b2 = (occ)okt5.h();
            if (okt4.c) {
                okt4.m();
                okt4.c = false;
            }
            final ocd ocd2 = (ocd)okt4.b;
            b2.getClass();
            ocd2.b = b2;
            ocd2.a |= 0x1;
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)ocd2.c);
            if (okt4.c) {
                okt4.m();
                okt4.c = false;
            }
            ((ocd)okt4.b).c = oky.B();
            for (final occ occ3 : unmodifiableList) {
                final okt okt6 = (okt)occ3.H(5);
                okt6.o(occ3);
                final String c2 = ((occ)okt6.b).c;
                if (!c2.isEmpty()) {
                    final long longValue2 = ofz.a(c2);
                    if (okt6.c) {
                        okt6.m();
                        okt6.c = false;
                    }
                    final occ occ4 = (occ)okt6.b;
                    final int a2 = occ4.a | 0x4;
                    occ4.a = a2;
                    occ4.d = longValue2;
                    occ4.a = (a2 & 0xFFFFFFFD);
                    occ4.c = occ.f.c;
                }
                final occ occ5 = (occ)okt6.h();
                if (okt4.c) {
                    okt4.m();
                    okt4.c = false;
                }
                final ocd ocd3 = (ocd)okt4.b;
                occ5.getClass();
                ocd3.b();
                ocd3.c.add(occ5);
            }
            psc psc3;
            if ((psc3 = ((psp)okt.b).g) == null) {
                psc3 = psc.l;
            }
            final okt okt7 = (okt)psc3.H(5);
            okt7.o(psc3);
            final ocd i = (ocd)okt4.h();
            if (okt7.c) {
                okt7.m();
                okt7.c = false;
            }
            final psc psc4 = (psc)okt7.b;
            i.getClass();
            psc4.j = i;
            psc4.a |= 0x100;
            final psc g = (psc)okt7.h();
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final psp psp3 = (psp)okt.b;
            g.getClass();
            psp3.g = g;
            psp3.a |= 0x40;
        }
        psj psj;
        if ((psj = ((psp)okt.b).i) == null) {
            psj = psj.k;
        }
        if (psj.j.size() != 0) {
            psj psj2;
            if ((psj2 = ((psp)okt.b).i) == null) {
                psj2 = psj.k;
            }
            final okt okt8 = (okt)psj2.H(5);
            okt8.o(psj2);
            for (int k = 0; k < ((psj)okt8.b).j.size(); ++k) {
                final psi psi = ((psj)okt8.b).j.get(k);
                final okt okt9 = (okt)psi.H(5);
                okt9.o(psi);
                if (!TextUtils.isEmpty((CharSequence)((psi)okt9.b).b)) {
                    if (okt9.c) {
                        okt9.m();
                        okt9.c = false;
                    }
                    ((psi)okt9.b).c = oky.z();
                    final List a3 = mni.a(((psi)okt9.b).b);
                    if (okt9.c) {
                        okt9.m();
                        okt9.c = false;
                    }
                    final psi psi2 = (psi)okt9.b;
                    final oli c3 = psi2.c;
                    if (!c3.c()) {
                        psi2.c = oky.A(c3);
                    }
                    ojf.e(a3, psi2.c);
                }
                if (okt9.c) {
                    okt9.m();
                    okt9.c = false;
                }
                final psi psi3 = (psi)okt9.b;
                psi3.a &= 0xFFFFFFFE;
                psi3.b = psi.f.b;
                if (okt8.c) {
                    okt8.m();
                    okt8.c = false;
                }
                final psj psj3 = (psj)okt8.b;
                final psi psi4 = (psi)okt9.h();
                psi4.getClass();
                psj3.i();
                psj3.j.set(k, psi4);
            }
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final psp psp4 = (psp)okt.b;
            final psj l = (psj)okt8.h();
            l.getClass();
            psp4.i = l;
            psp4.a |= 0x100;
        }
        prq prq;
        if ((prq = ((psp)okt.b).f) == null) {
            prq = prq.b;
        }
        if (prq.a.size() != 0) {
            prq prq2;
            if ((prq2 = ((psp)okt.b).f) == null) {
                prq2 = prq.b;
            }
            final okt okt10 = (okt)prq2.H(5);
            okt10.o(prq2);
            for (int n = 0; n < ((prq)okt10.b).a.size(); ++n) {
                final prp prp = ((prq)okt10.b).a.get(n);
                final okt okt11 = (okt)prp.H(5);
                okt11.o(prp);
                if (!TextUtils.isEmpty((CharSequence)((prp)okt11.b).d)) {
                    if (okt11.c) {
                        okt11.m();
                        okt11.c = false;
                    }
                    ((prp)okt11.b).e = oky.z();
                    final List a4 = mni.a(((prp)okt11.b).d);
                    if (okt11.c) {
                        okt11.m();
                        okt11.c = false;
                    }
                    final prp prp2 = (prp)okt11.b;
                    final oli e = prp2.e;
                    if (!e.c()) {
                        prp2.e = oky.A(e);
                    }
                    ojf.e(a4, prp2.e);
                }
                if (okt11.c) {
                    okt11.m();
                    okt11.c = false;
                }
                final prp prp3 = (prp)okt11.b;
                prp3.a &= 0xFFF7FFFF;
                prp3.d = prp.g.d;
                if (okt10.c) {
                    okt10.m();
                    okt10.c = false;
                }
                final prq prq3 = (prq)okt10.b;
                final prp prp4 = (prp)okt11.h();
                prp4.getClass();
                final olj a5 = prq3.a;
                if (!a5.c()) {
                    prq3.a = oky.C(a5);
                }
                prq3.a.set(n, prp4);
            }
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final psp psp5 = (psp)okt.b;
            final prq f = (prq)okt10.h();
            f.getClass();
            psp5.f = f;
            psp5.a |= 0x20;
        }
        prs prs;
        if ((prs = ((psp)okt.b).m) == null) {
            prs = prs.f;
        }
        if (prs.d.size() != 0) {
            prs prs2;
            if ((prs2 = ((psp)okt.b).m) == null) {
                prs2 = prs.f;
            }
            final okt okt12 = (okt)prs2.H(5);
            okt12.o(prs2);
            for (int n2 = 0; n2 < ((prs)okt12.b).d.size(); ++n2) {
                final prt prt = ((prs)okt12.b).d.get(n2);
                final okt okt13 = (okt)prt.H(5);
                okt13.o(prt);
                mni.b(mni.c, okt13);
                if (okt12.c) {
                    okt12.m();
                    okt12.c = false;
                }
                final prs prs3 = (prs)okt12.b;
                final prt prt2 = (prt)okt13.h();
                prt2.getClass();
                final olj d2 = prs3.d;
                if (!d2.c()) {
                    prs3.d = oky.C(d2);
                }
                prs3.d.set(n2, prt2);
            }
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final psp psp6 = (psp)okt.b;
            final prs m = (prs)okt12.h();
            m.getClass();
            psp6.m = m;
            psp6.a |= 0x4000;
        }
        final psp psp7 = (psp)okt.h();
        final okk h2 = mna.h;
        mmt.j(h2);
        Object o = mmt.f.k(h2.d);
        if (o == null) {
            o = h2.b;
        }
        else {
            h2.d(o);
        }
        final mna mna = (mna)o;
        final String b3 = mna.b;
        if (mna.d) {
            mmt = (mmt)this.b;
            if (mmt == null) {
                synchronized (this) {
                    mmt = (mmt)this.b;
                    if (mmt == null) {
                        mmt = (mmt)new jpg(d, b3, jpf.f, jpl.b(d), new jpp(d));
                        this.b = (jpg)mmt;
                    }
                }
            }
        }
        else if ((mmt = (mmt)this.a) == null) {
            synchronized (this) {
                mmt = (mmt)this.a;
                if (mmt == null) {
                    mmt = (mmt)new jpg(d, b3);
                    this.a = (jpg)mmt;
                }
            }
        }
        final jpd jpd = new jpd((jpg)mmt, null, new jpa(psp7));
        final String e2 = mna.e;
        if (!njb.d(e2)) {
            if (jpd.a.b()) {
                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
            }
            final okv i2 = jpd.i;
            if (i2.c) {
                i2.m();
                i2.c = false;
            }
            final ouf ouf = (ouf)i2.b;
            final ouf j2 = ouf.j;
            e2.getClass();
            ouf.a |= 0x1000000;
            ouf.i = e2;
        }
        if (!mna.d) {
            if ((mna.a & 0x2) != 0x0) {
                final String c4 = mna.c;
                if (jpd.a.b()) {
                    Log.e("ClearcutLogger", "addMendelPackage forbidden on deidentified logger");
                }
                if (jpd.c == null) {
                    jpd.c = new ArrayList();
                }
                jpd.c.add(c4);
            }
            if ((mna.a & 0x10) != 0x0) {
                final String f2 = mna.f;
                if (!jpd.a.g.contains(jpf.d)) {
                    throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                }
                jpd.e = f2;
            }
        }
        final jqz a6 = jpd.a();
        final ofn f3 = ofn.f();
        final los f4 = new los(f3);
        d = (Context)((BasePendingResult)a6).d;
        monitorenter(d);
        try {
            jvu.g(((BasePendingResult)a6).h ^ true, "Result has already been consumed.");
            final jrh j3 = ((BasePendingResult)a6).j;
            jvu.g(true, "Cannot set callbacks if then() has been called.");
            synchronized (((BasePendingResult)a6).d) {
                monitorexit(((BasePendingResult)a6).d);
                if (((BasePendingResult)a6).k()) {
                    ((BasePendingResult)a6).e.a(f4, ((BasePendingResult)a6).g());
                }
                else {
                    ((BasePendingResult)a6).f = f4;
                }
                monitorexit(d);
                return odg.h(f3, new nis(), odx.a);
            }
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
}

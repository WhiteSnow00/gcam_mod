import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;
import android.os.Process;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.UUID;
import android.graphics.PointF;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvm implements eyt
{
    private static final nsd j;
    public final String a;
    public final pii b;
    public final long c;
    public final String d;
    public final String e;
    public final cyn f;
    public final boolean g;
    public final Context h;
    public final AtomicBoolean i;
    private long k;
    private final AtomicInteger l;
    private final eze m;
    private final List n;
    private long o;
    private boolean p;
    private long q;
    private final Executor r;
    private final LinkedHashMap s;
    private long t;
    private final hvg u;
    private final dfu v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    static {
        j = nsd.g("com/google/android/apps/camera/stats/UsageStatisticsImpl");
    }
    
    public hvm(final eze m, final Context h, final long c, final String d, final String e, final Executor r, final cyn f, final boolean g, final pii b, final dfu v, final String a) {
        this.l = new AtomicInteger(0);
        this.n = new ArrayList();
        this.o = 0L;
        this.p = true;
        this.q = 0L;
        this.w = 1;
        this.s = new LinkedHashMap();
        this.x = 1;
        this.y = 1;
        this.z = 1;
        this.i = new AtomicBoolean(false);
        this.m = m;
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.r = r;
        this.f = f;
        this.g = g;
        this.b = b;
        this.v = v;
        this.a = a;
        this.u = new hvg();
    }
    
    private final void aA(int a, final obj d, final obb e, final nxm f, final obw g) {
        final okt m = nyn.h.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyn nyn = (nyn)m.b;
        nyn.b = a - 1;
        a = (nyn.a | 0x1);
        nyn.a = a;
        final int w = this.w;
        if (w != 0) {
            nyn.c = w - 1;
            a |= 0x2;
            nyn.a = a;
            int a2 = a;
            if (d != null) {
                nyn.d = d;
                a2 = (a | 0x8);
                nyn.a = a2;
            }
            a = a2;
            if (e != null) {
                nyn.e = e;
                a = (a2 | 0x10);
                nyn.a = a;
            }
            int a3 = a;
            if (f != null) {
                nyn.f = f;
                a3 = (a | 0x20);
                nyn.a = a3;
            }
            if (g != null) {
                nyn.g = g;
                nyn.a = (a3 | 0x40);
            }
            final okt i = nxt.ak.m();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nxt nxt = (nxt)i.b;
            nxt.d = 12;
            nxt.a |= 0x1;
            final nyn k = (nyn)m.h();
            k.getClass();
            nxt.k = k;
            nxt.a |= 0x100;
            this.av(i);
            return;
        }
        throw null;
    }
    
    private static final nyk aB(int a, final int n) {
        final okt m = nyk.d.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyk nyk = (nyk)m.b;
        if (a == 0) {
            throw null;
        }
        nyk.b = a - 1;
        a = (nyk.a | 0x1);
        nyk.a = a;
        if (n != 0) {
            nyk.c = n - 1;
            nyk.a = (a | 0x2);
            return (nyk)m.h();
        }
        throw null;
    }
    
    private static final int aC(final hio hio) {
        if (hio == hio.c) {
            return 14;
        }
        if (hio == hio.b) {
            return 13;
        }
        if (hio == hio.d) {
            return 12;
        }
        return 1;
    }
    
    private static void aw(int f, final String s, final long n, final nxs nxs) {
        Level level = null;
        switch (f) {
            default: {
                level = Level.WARNING;
                break;
            }
            case 4: {
                level = Level.INFO;
                break;
            }
        }
        final nsa nsa = (nsa)hvm.j.f(level).E(2532);
        if ((f = oce.f(nxs.b)) == 0) {
            f = 1;
        }
        --f;
        final cyn a = cyn.a;
        final lfu a2 = lfu.a;
        final hio a3 = hio.a;
        final obl a4 = obl.a;
        String string = null;
        switch (f) {
            default: {
                final StringBuilder sb = new StringBuilder(20);
                sb.append("-UNKNOWN-");
                sb.append(f);
                string = sb.toString();
                break;
            }
            case 14: {
                string = "-API2_LIMITED";
                break;
            }
            case 13: {
                string = "-API2_HDR_PLUS";
                break;
            }
            case 12: {
                string = "-API2_ZSL";
                break;
            }
            case 11: {
                string = "-API2_AUTO_HDR_PLUS";
                break;
            }
            case 10: {
                string = "-API2_LEGACY";
                break;
            }
            case 9: {
                string = "-API2BETA_HDR_PLUS";
                break;
            }
            case 1: {
                string = "-API1_JPEG";
                break;
            }
            case 0: {
                string = "-UNKNOWN";
                break;
            }
        }
        nsa.y("%s%s %d", s, string, n);
    }
    
    private final void ax(final njp njp) {
        this.r.execute(new hvj(this, njp, this.k, this.l.getAndIncrement(), this.w));
    }
    
    private static final nxr ay(final lfu lfu) {
        if (lfu != null) {
            final cyn a = cyn.a;
            final hio a2 = hio.a;
            final obl a3 = obl.a;
            switch (lfu.ordinal()) {
                case 2: {
                    return nxr.a;
                }
                case 1: {
                    return nxr.c;
                }
                case 0: {
                    return nxr.b;
                }
            }
        }
        return nxr.a;
    }
    
    private static final obo az(final PointF pointF) {
        final okt m = obo.d.m();
        if (pointF != null) {
            final float x = pointF.x;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obo obo = (obo)m.b;
            obo.a |= 0x1;
            obo.b = x;
            final float y = pointF.y;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obo obo2 = (obo)m.b;
            obo2.a |= 0x2;
            obo2.c = y;
        }
        return (obo)m.h();
    }
    
    @Override
    public final void A(final oax t) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 48;
        nxt.a |= 0x1;
        t.getClass();
        nxt.T = t;
        nxt.b |= 0x800000;
        this.av(m);
    }
    
    @Override
    public final void B() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 21;
        nxt.a |= 0x1;
        final okt i = nya.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nya nya = (nya)i.b;
        nya.b = 1;
        nya.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nya q = (nya)i.h();
        q.getClass();
        nxt2.q = q;
        nxt2.a |= 0x20000;
        this.av(m);
    }
    
    @Override
    public final void C() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 21;
        nxt.a |= 0x1;
        final okt i = nya.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nya nya = (nya)i.b;
        nya.b = 3;
        nya.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nya q = (nya)i.h();
        q.getClass();
        nxt2.q = q;
        nxt2.a |= 0x20000;
        this.av(m);
    }
    
    @Override
    public final void D(final obg ah) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 61;
        nxt.a |= 0x1;
        ah.getClass();
        nxt.ah = ah;
        nxt.c |= 0x20;
        this.av(m);
    }
    
    @Override
    public final void E(final nzf ae) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 58;
        nxt.a |= 0x1;
        ae.getClass();
        nxt.ae = ae;
        nxt.c |= 0x4;
        this.av(m);
    }
    
    @Override
    public final void F(final nzg ad) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 57;
        nxt.a |= 0x1;
        ad.getClass();
        nxt.ad = ad;
        nxt.c |= 0x2;
        this.av(m);
    }
    
    @Override
    public final void G(final obq y) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 52;
        nxt.a |= 0x1;
        y.getClass();
        nxt.Y = y;
        nxt.b |= 0x10000000;
        this.av(m);
    }
    
    @Override
    public final void H(final obv n) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 42;
        nxt.a |= 0x1;
        n.getClass();
        nxt.N = n;
        nxt.b |= 0x10000;
        this.av(m);
    }
    
    @Override
    public final void I(int n, final float b, final float c, final lfu lfu) {
        final okt m = obw.e.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obw obw = (obw)m.b;
        final int a = obw.a | 0x1;
        obw.a = a;
        obw.b = b;
        obw.a = (a | 0x2);
        obw.c = c;
        final nxr ay = ay(lfu);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obw obw2 = (obw)m.b;
        obw2.d = ay.d;
        obw2.a |= 0x4;
        final obw obw3 = (obw)m.h();
        final cyn a2 = cyn.a;
        final lfu a3 = lfu.a;
        final hio a4 = hio.a;
        final obl a5 = obl.a;
        switch (n - 1) {
            default: {
                n = 1;
                break;
            }
            case 10: {
                n = 20;
                break;
            }
            case 9: {
                n = 19;
                break;
            }
            case 8: {
                n = 18;
                break;
            }
            case 7: {
                n = 17;
                break;
            }
            case 6: {
                n = 16;
                break;
            }
            case 5: {
                n = 15;
                break;
            }
            case 4: {
                n = 14;
                break;
            }
            case 3: {
                n = 13;
                break;
            }
            case 2: {
                n = 10;
                break;
            }
            case 1: {
                n = 9;
                break;
            }
        }
        this.aA(n, null, null, null, obw3);
    }
    
    @Override
    public final void J() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 21;
        nxt.a |= 0x1;
        final okt i = nya.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nya nya = (nya)i.b;
        nya.b = 2;
        nya.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nya q = (nya)i.h();
        q.getClass();
        nxt2.q = q;
        nxt2.a |= 0x20000;
        this.av(m);
    }
    
    @Override
    public final void K() {
        this.k = UUID.randomUUID().getLeastSignificantBits();
    }
    
    @Override
    public final void L(final jby jby, final boolean c) {
        final okt m = obj.d.m();
        final okt i = obn.f.m();
        final float a = jby.a;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final obn obn = (obn)i.b;
        final int a2 = obn.a | 0x1;
        obn.a = a2;
        obn.b = a;
        final float b = jby.b;
        final int a3 = a2 | 0x2;
        obn.a = a3;
        obn.c = b;
        final float c2 = jby.c;
        final int a4 = a3 | 0x4;
        obn.a = a4;
        obn.d = c2;
        final float d = jby.d;
        obn.a = (a4 | 0x8);
        obn.e = d;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obj obj = (obj)m.b;
        final obn b2 = (obn)i.h();
        b2.getClass();
        obj.b = b2;
        obj.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obj obj2 = (obj)m.b;
        obj2.a |= 0x8;
        obj2.c = c;
        this.aA(2, (obj)m.h(), null, null, null);
    }
    
    @Override
    public final void M(final lfu lfu, final obl obl, long o, final long c, final boolean t, final boolean b, final nnx nnx, final nnx nnx2, final nnx nnx3) {
        final eyy eyy = new eyy(11, lfu.equals(lfu.a));
        eyy.c(b);
        final okt m = obm.u.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obm obm = (obm)m.b;
        final int a = obm.a | 0x1;
        obm.a = a;
        obm.b = o;
        final int a2 = a | 0x2;
        obm.a = a2;
        obm.c = c;
        obm.d = obl.g;
        final int a3 = a2 | 0x4;
        obm.a = a3;
        obm.a = (a3 | 0x40000);
        obm.t = t;
        for (final obl obl2 : obl.values()) {
            if (nnx.containsKey(obl2) && nnx2.containsKey(obl2)) {
                if (nnx3.containsKey(obl2)) {
                    final cyn a4 = cyn.a;
                    final hio a5 = hio.a;
                    switch (obl2.ordinal()) {
                        case 5: {
                            final int intValue = (int)nnx.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm2 = (obm)m.b;
                            obm2.a |= 0x80;
                            obm2.i = intValue;
                            o = (long)nnx2.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm3 = (obm)m.b;
                            obm3.a |= 0x1000;
                            obm3.n = o;
                            o = (long)nnx3.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm4 = (obm)m.b;
                            obm4.a |= 0x20000;
                            obm4.s = o;
                            break;
                        }
                        case 4: {
                            final int intValue2 = (int)nnx.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm5 = (obm)m.b;
                            obm5.a |= 0x40;
                            obm5.h = intValue2;
                            o = (long)nnx2.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm6 = (obm)m.b;
                            obm6.a |= 0x800;
                            obm6.m = o;
                            o = (long)nnx3.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm7 = (obm)m.b;
                            obm7.a |= 0x10000;
                            obm7.r = o;
                            break;
                        }
                        case 3: {
                            final int intValue3 = (int)nnx.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm8 = (obm)m.b;
                            obm8.a |= 0x20;
                            obm8.g = intValue3;
                            o = (long)nnx2.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm9 = (obm)m.b;
                            obm9.a |= 0x400;
                            obm9.l = o;
                            o = (long)nnx3.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm10 = (obm)m.b;
                            obm10.a |= 0x8000;
                            obm10.q = o;
                            break;
                        }
                        case 2: {
                            final int intValue4 = (int)nnx.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm11 = (obm)m.b;
                            obm11.a |= 0x10;
                            obm11.f = intValue4;
                            o = (long)nnx2.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm12 = (obm)m.b;
                            obm12.a |= 0x200;
                            obm12.k = o;
                            o = (long)nnx3.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm13 = (obm)m.b;
                            obm13.a |= 0x4000;
                            obm13.p = o;
                            break;
                        }
                        case 1: {
                            final int intValue5 = (int)nnx.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm14 = (obm)m.b;
                            obm14.a |= 0x8;
                            obm14.e = intValue5;
                            o = (long)nnx2.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm15 = (obm)m.b;
                            obm15.a |= 0x100;
                            obm15.j = o;
                            o = (long)nnx3.get(obl2);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final obm obm16 = (obm)m.b;
                            obm16.a |= 0x2000;
                            obm16.o = o;
                            break;
                        }
                    }
                }
            }
        }
        final obm c2 = (obm)m.h();
        if (c2 != null) {
            final okt a6 = eyy.a;
            if (a6.c) {
                a6.m();
                a6.c = false;
            }
            final nyd nyd = (nyd)a6.b;
            final nyd q = nyd.Q;
            nyd.C = c2;
            nyd.b |= 0x10;
        }
        this.at(eyy);
    }
    
    @Override
    public final void N(final int n, final List list, final niz niz, final niz niz2) {
        if (n != 0) {
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final Iterator iterator = this.s.keySet().iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                int i = 0;
                if (!hasNext) {
                    break;
                }
                final String s = (String)iterator.next();
                if (this.s.get(s) == null || elapsedRealtime <= 30000L) {
                    continue;
                }
                final okt m = nxt.ak.m();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nxt nxt = (nxt)m.b;
                nxt.d = 5;
                nxt.a |= 0x1;
                final okt j = oae.f.m();
                if (j.c) {
                    j.m();
                    j.c = false;
                }
                final oae oae = (oae)j.b;
                oae.b = 6;
                oae.a |= 0x1;
                final eze k = this.m;
                Object c = k.c;
                synchronized (c) {
                    final byte[] digest = k.b.digest(s.getBytes(eze.a));
                    final StringBuilder sb = new StringBuilder();
                    while (i < digest.length) {
                        sb.append(Integer.toString((digest[i] & 0xFF) + 256, 16).substring(1));
                        ++i;
                    }
                    final String string = sb.toString();
                    monitorexit(c);
                    final String substring = string.substring(0, 10);
                    if (j.c) {
                        j.m();
                        j.c = false;
                    }
                    c = j.b;
                    substring.getClass();
                    final int a = ((oae)c).a | 0x8;
                    ((oae)c).a = a;
                    ((oae)c).c = substring;
                    final int a2 = a | 0x20;
                    ((oae)c).a = a2;
                    ((oae)c).e = 0.0f;
                    ((oae)c).a = (a2 | 0x10);
                    ((oae)c).d = 0.0f;
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    c = m.b;
                    final oae h = (oae)j.h();
                    h.getClass();
                    ((nxt)c).h = h;
                    ((nxt)c).a |= 0x20;
                    this.av(m);
                    iterator.remove();
                }
            }
            final okt l = nxo.g.m();
            if (list != null && !list.isEmpty()) {
                if (l.c) {
                    l.m();
                    l.c = false;
                }
                final nxo nxo = (nxo)l.b;
                final olj e = nxo.e;
                if (!e.c()) {
                    nxo.e = oky.C(e);
                }
                ojf.e(list, nxo.e);
            }
            if (niz.g()) {
                final nzv b = (nzv)niz.c();
                if (l.c) {
                    l.m();
                    l.c = false;
                }
                final nxo nxo2 = (nxo)l.b;
                nxo2.b = b;
                nxo2.a |= 0x2;
            }
            final nxz f = (nxz)((njd)niz2).a;
            if (l.c) {
                l.m();
                l.c = false;
            }
            final nxo nxo3 = (nxo)l.b;
            nxo3.f = f;
            nxo3.a |= 0x8;
            final List n2 = this.n;
            final olj c2 = nxo3.c;
            if (!c2.c()) {
                nxo3.c = oky.C(c2);
            }
            ojf.e(n2, nxo3.c);
            this.n.clear();
            if (n == 2) {
                if (!this.p) {
                    final float d = (elapsedRealtimeNanos - this.q) / 1.0E9f;
                    if (l.c) {
                        l.m();
                        l.c = false;
                    }
                    final nxo nxo4 = (nxo)l.b;
                    nxo4.a |= 0x4;
                    nxo4.d = d;
                }
                else {
                    if (l.c) {
                        l.m();
                        l.c = false;
                    }
                    final nxo nxo5 = (nxo)l.b;
                    nxo5.a |= 0x4;
                    nxo5.d = -1.0f;
                }
            }
            this.p = true;
            this.q = 0L;
            final okt m2 = nxt.ak.m();
            if (m2.c) {
                m2.m();
                m2.c = false;
            }
            final nxt nxt2 = (nxt)m2.b;
            nxt2.d = 14;
            nxt2.a |= 0x1;
            final nxo m3 = (nxo)l.h();
            m3.getClass();
            nxt2.m = m3;
            nxt2.a |= 0x2000;
            this.av(m2);
            return;
        }
        throw null;
    }
    
    @Override
    public final void O(final int n, final String c, final Throwable t, int i, int length, int lineNumber, final List list, final List list2, final kst kst, final boolean k) {
        final okt m = nxu.m.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxu nxu = (nxu)m.b;
        nxu.b = n - 1;
        final int a = nxu.a | 0x1;
        nxu.a = a;
        final int a2 = a | 0x40;
        nxu.a = a2;
        nxu.g = lineNumber;
        final String e = this.e;
        e.getClass();
        lineNumber = (a2 | 0x4);
        nxu.a = lineNumber;
        nxu.d = e;
        if (c != null) {
            lineNumber |= 0x2;
            nxu.a = lineNumber;
            nxu.c = c;
        }
        int a3 = lineNumber;
        if (i != -1) {
            a3 = (lineNumber | 0x8);
            nxu.a = a3;
            nxu.e = i;
        }
        if (length != -1) {
            nxu.a = (a3 | 0x10);
            nxu.f = length;
        }
        if (t != null) {
            final okt j = nzr.b.m();
            for (Throwable cause = t; cause != null; cause = cause.getCause()) {
                final okt l = nzs.d.m();
                final String simpleName = cause.getClass().getSimpleName();
                if (l.c) {
                    l.m();
                    l.c = false;
                }
                final nzs nzs = (nzs)l.b;
                simpleName.getClass();
                nzs.a |= 0x1;
                nzs.b = simpleName;
                final StackTraceElement[] stackTrace = cause.getStackTrace();
                StackTraceElement stackTraceElement;
                okt m2;
                String className;
                nzt nzt;
                String methodName;
                nzt nzt2;
                nzt nzt3;
                String fileName;
                nzt nzt4;
                nzs nzs2;
                nzt nzt5;
                olj c2;
                for (length = stackTrace.length, i = 0; i < length; ++i) {
                    stackTraceElement = stackTrace[i];
                    m2 = nzt.f.m();
                    className = stackTraceElement.getClassName();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    nzt = (nzt)m2.b;
                    className.getClass();
                    nzt.a |= 0x1;
                    nzt.b = className;
                    methodName = stackTraceElement.getMethodName();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    nzt2 = (nzt)m2.b;
                    methodName.getClass();
                    nzt2.a |= 0x2;
                    nzt2.c = methodName;
                    lineNumber = stackTraceElement.getLineNumber();
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    nzt3 = (nzt)m2.b;
                    nzt3.a |= 0x8;
                    nzt3.e = lineNumber;
                    fileName = stackTraceElement.getFileName();
                    if (fileName != null) {
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        nzt4 = (nzt)m2.b;
                        nzt4.a |= 0x4;
                        nzt4.d = fileName;
                    }
                    if (l.c) {
                        l.m();
                        l.c = false;
                    }
                    nzs2 = (nzs)l.b;
                    nzt5 = (nzt)m2.h();
                    nzt5.getClass();
                    c2 = nzs2.c;
                    if (!c2.c()) {
                        nzs2.c = oky.C(c2);
                    }
                    nzs2.c.add(nzt5);
                }
                if (j.c) {
                    j.m();
                    j.c = false;
                }
                final nzr nzr = (nzr)j.b;
                final nzs nzs3 = (nzs)l.h();
                nzs3.getClass();
                final olj a4 = nzr.a;
                if (!a4.c()) {
                    nzr.a = oky.C(a4);
                }
                nzr.a.add(nzs3);
            }
            final nzr h = (nzr)j.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxu nxu2 = (nxu)m.b;
            h.getClass();
            nxu2.h = h;
            nxu2.a |= 0x80;
        }
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(ay((lfu)iterator.next()));
        }
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxu nxu3 = (nxu)m.b;
        final olf i2 = nxu3.i;
        if (!i2.c()) {
            nxu3.i = oky.y(i2);
        }
        final Iterator iterator2 = list3.iterator();
        while (iterator2.hasNext()) {
            nxu3.i.g(((nxr)iterator2.next()).d);
        }
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxu nxu4 = (nxu)m.b;
        final olj l2 = nxu4.l;
        if (!l2.c()) {
            nxu4.l = oky.C(l2);
        }
        ojf.e(list2, nxu4.l);
        if (kst != kst.m) {
            i = kst.t;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxu nxu5 = (nxu)m.b;
            nxu5.a |= 0x100;
            nxu5.j = i;
        }
        if (n == 3) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxu nxu6 = (nxu)m.b;
            nxu6.a |= 0x200;
            nxu6.k = k;
        }
        final okt m3 = nxt.ak.m();
        if (m3.c) {
            m3.m();
            m3.c = false;
        }
        final nxt nxt = (nxt)m3.b;
        nxt.d = 7;
        nxt.a |= 0x1;
        final nxu j2 = (nxu)m.h();
        j2.getClass();
        nxt.j = j2;
        nxt.a |= 0x80;
        this.av(m3);
    }
    
    @Override
    public final void P(int n, final int n2, final int n3, final lfu lfu, final int n4) {
        final okt m = nxx.g.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxx nxx = (nxx)m.b;
        nxx.b = n - 1;
        n = (nxx.a | 0x1);
        nxx.a = n;
        nxx.c = n2 - 1;
        n |= 0x2;
        nxx.a = n;
        nxx.d = n3 - 1;
        nxx.a = (n | 0x4);
        if (lfu != null) {
            final nxr ay = ay(lfu);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxx nxx2 = (nxx)m.b;
            nxx2.e = ay.d;
            nxx2.a |= 0x8;
        }
        if (n4 != 0) {
            final nxx nxx3 = (nxx)m.b;
            nxx3.f = n4 - 1;
            nxx3.a |= 0x10;
        }
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 56;
        nxt.a |= 0x1;
        final nxx ac = (nxx)m.h();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        ac.getClass();
        nxt2.ac = ac;
        nxt2.c |= 0x1;
        this.av(i);
    }
    
    @Override
    public final void Q(int a, final oaq c, final oat d, final obe f, final Long n) {
        this.o = SystemClock.elapsedRealtime();
        final okt m = nyc.g.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyc nyc = (nyc)m.b;
        nyc.b = a - 1;
        final int a2 = nyc.a | 0x1;
        nyc.a = a2;
        a = a2;
        if (c != null) {
            nyc.c = c;
            a = (a2 | 0x4);
            nyc.a = a;
        }
        int a3 = a;
        if (d != null) {
            nyc.d = d;
            a3 = (a | 0x10);
            nyc.a = a3;
        }
        if (f != null) {
            nyc.f = f;
            nyc.a = (a3 | 0x40);
        }
        if (n != null) {
            final long longValue = n;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyc nyc2 = (nyc)m.b;
            nyc2.a |= 0x20;
            nyc2.e = longValue;
        }
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 13;
        nxt.a |= 0x1;
        final nyc l = (nyc)m.h();
        l.getClass();
        nxt.l = l;
        nxt.a |= 0x200;
        this.av(i);
    }
    
    @Override
    public final void R(int y, int a, final long d, final long n) {
        final long o = this.o;
        final long k = jxc.k(this.t);
        final long t = this.t;
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 23;
        nxt.a |= 0x1;
        final okt i = nym.h.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nym nym = (nym)i.b;
        nym.b = y - 1;
        y = (nym.a | 0x1);
        nym.a = y;
        nym.c = a - 1;
        y |= 0x2;
        nym.a = y;
        y |= 0x4;
        nym.a = y;
        nym.d = d;
        a = (y | 0x8);
        nym.a = a;
        nym.e = n;
        y = this.y;
        if (y != 0) {
            nym.f = y - 1;
            y = (a | 0x10);
            nym.a = y;
            final boolean g = d - t < 3000000000L && o < k;
            nym.a = (y | 0x20);
            nym.g = g;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxt nxt2 = (nxt)m.b;
            final nym s = (nym)i.h();
            s.getClass();
            nxt2.s = s;
            nxt2.a |= 0x80000;
            this.av(m);
            this.y = 1;
            this.t = n;
            return;
        }
        throw null;
    }
    
    @Override
    public final void S(final int n, final int n2) {
        this.T(n, n2, 0L, 0L);
    }
    
    @Override
    public final void T(int w, int n, final long f, final long g) {
        final okt m = oak.h.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oak oak = (oak)m.b;
        oak.c = w - 1;
        final int a = oak.a | 0x2;
        oak.a = a;
        oak.d = n - 1;
        n = (a | 0x4);
        oak.a = n;
        final int w2 = this.w;
        if (w2 != 0) {
            oak.b = w2 - 1;
            n |= 0x1;
            oak.a = n;
            n |= 0x10;
            oak.a = n;
            oak.f = f;
            oak.a = (n | 0x20);
            oak.g = g;
            if ((n = w) == 3) {
                if (this.o != 0L && (w2 == 8 || w2 == 6 || w2 == 2 || w2 == 9 || w2 == 12)) {
                    final float f2 = jxc.f(SystemClock.elapsedRealtime() - this.o);
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oak oak2 = (oak)m.b;
                    oak2.a |= 0x8;
                    oak2.e = f2;
                    n = 3;
                }
                else {
                    n = 3;
                }
            }
            this.o = 0L;
            w = this.w;
            if (w != 1 && n != 28 && w != n) {
                final okt i = nxt.ak.m();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nxt nxt = (nxt)i.b;
                nxt.d = 1;
                nxt.a |= 0x1;
                final oak f3 = (oak)m.h();
                f3.getClass();
                nxt.f = f3;
                nxt.a |= 0x8;
                this.av(i);
            }
            this.w = n;
            return;
        }
        throw null;
    }
    
    @Override
    public final void U(final int n) {
        this.aA(n, null, null, null, null);
    }
    
    @Override
    public final void V(final int n) {
        final okt m = nyo.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyo nyo = (nyo)m.b;
        nyo.b = n - 1;
        nyo.a |= 0x1;
        this.ax(new hvi((nyo)m.h()));
    }
    
    @Override
    public final void W(int n, final String d, final String c) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 39;
        nxt.a |= 0x1;
        final okt i = oag.e.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oag oag = (oag)i.b;
        oag.b = n - 1;
        n = (oag.a | 0x1);
        oag.a = n;
        d.getClass();
        n |= 0x4;
        oag.a = n;
        oag.d = d;
        c.getClass();
        oag.a = (n | 0x2);
        oag.c = c;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final oag h = (oag)i.h();
        h.getClass();
        nxt2.H = h;
        nxt2.b |= 0x400;
        this.av(m);
    }
    
    @Override
    public final void X(int a, final int n) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 65;
        nxt.a |= 0x1;
        final okt i = nxq.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxq nxq = (nxq)i.b;
        if (a != 0) {
            nxq.b = a - 1;
            a = (nxq.a | 0x1);
            nxq.a = a;
            nxq.a = (a | 0x2);
            nxq.c = n;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxt nxt2 = (nxt)m.b;
            final nxq aj = (nxq)i.h();
            aj.getClass();
            nxt2.aj = aj;
            nxt2.c |= 0x200;
            this.av(m);
            return;
        }
        throw null;
    }
    
    @Override
    public final void Y(int a, final String c) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 41;
        nxt.a |= 0x1;
        final okt i = nyb.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyb nyb = (nyb)i.b;
        nyb.b = a - 1;
        a = (nyb.a | 0x1);
        nyb.a = a;
        c.getClass();
        nyb.a = (a | 0x2);
        nyb.c = c;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nyb j = (nyb)i.h();
        j.getClass();
        nxt2.M = j;
        nxt2.b |= 0x8000;
        this.av(m);
    }
    
    @Override
    public final void Z(final long c, final hio hio, final int n, final int n2, final Throwable t) {
        final okt m = nxs.c.m();
        final int ac = aC(hio);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxs nxs = (nxs)m.b;
        nxs.b = ac - 1;
        nxs.a |= 0x2;
        final nxs b = (nxs)m.h();
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 20;
        nxt.a |= 0x1;
        final okt j = nye.f.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nye nye = (nye)j.b;
        nye.a |= 0x2;
        nye.c = c;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nye nye2 = (nye)j.b;
        final int a = nye2.a | 0x4;
        nye2.a = a;
        nye2.d = elapsedRealtimeNanos;
        b.getClass();
        nye2.b = b;
        nye2.a = (a | 0x1);
        final nyk ab = aB(n, n2);
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nye nye3 = (nye)j.b;
        ab.getClass();
        nye3.e = ab;
        nye3.a |= 0x8;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        final nye p5 = (nye)j.h();
        p5.getClass();
        nxt2.p = p5;
        nxt2.a |= 0x10000;
        this.av(i);
        aw(5, "onCaptureCanceled", c, b);
        this.v.a((dgh)t);
    }
    
    @Override
    public final long a() {
        return this.k;
    }
    
    @Override
    public final void aa(final long c, final hio hio, final int n, final int n2, final Throwable t) {
        final okt m = nxs.c.m();
        final int ac = aC(hio);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxs nxs = (nxs)m.b;
        nxs.b = ac - 1;
        nxs.a |= 0x2;
        final nxs b = (nxs)m.h();
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 25;
        nxt.a |= 0x1;
        final okt j = nyg.f.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyg nyg = (nyg)j.b;
        nyg.a |= 0x2;
        nyg.c = c;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyg nyg2 = (nyg)j.b;
        final int a = nyg2.a | 0x4;
        nyg2.a = a;
        nyg2.d = elapsedRealtimeNanos;
        b.getClass();
        nyg2.b = b;
        nyg2.a = (a | 0x1);
        final nyk ab = aB(n, n2);
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyg nyg3 = (nyg)j.b;
        ab.getClass();
        nyg3.e = ab;
        nyg3.a |= 0x8;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        final nyg u = (nyg)j.h();
        u.getClass();
        nxt2.u = u;
        nxt2.a |= 0x200000;
        this.av(i);
        aw(5, "onCaptureFailed", c, b);
        final dfu v = this.v;
        dgi dgi;
        if (t instanceof dgi) {
            dgi = (dgi)t;
        }
        else {
            dgi = new dgi(t);
        }
        v.a(dgi);
    }
    
    @Override
    public final void ab(final long k, final long l, final long b, final long c, final long d, final long g, final long h, final long e, final long f, final List list, final long i, final hio hio, int a, final int n) {
        final okt m = nxs.c.m();
        final int ac = aC(hio);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxs nxs = (nxs)m.b;
        nxs.b = ac - 1;
        nxs.a |= 0x2;
        final nxs b2 = (nxs)m.h();
        final okt j = nyj.m.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyj nyj = (nyj)j.b;
        final int a2 = nyj.a | 0x1;
        nyj.a = a2;
        nyj.b = b;
        int a3 = a2;
        if (c > 0L) {
            a3 = (a2 | 0x2);
            nyj.a = a3;
            nyj.c = c;
        }
        int a4 = a3;
        if (d > 0L) {
            a4 = (a3 | 0x4);
            nyj.a = a4;
            nyj.d = d;
        }
        int a5 = a4;
        if (g > 0L) {
            a5 = (a4 | 0x200);
            nyj.a = a5;
            nyj.g = g;
        }
        int a6 = a5;
        if (h > 0L) {
            a6 = (a5 | 0x400);
            nyj.a = a6;
            nyj.h = h;
        }
        int a7 = a6;
        if (i > 0L) {
            a7 = (a6 | 0x1000);
            nyj.a = a7;
            nyj.i = i;
        }
        int a8 = a7;
        if (e > 0L) {
            a8 = (a7 | 0x20);
            nyj.a = a8;
            nyj.e = e;
        }
        int a9 = a8;
        if (f > 0L) {
            a9 = (a8 | 0x40);
            nyj.a = a9;
            nyj.f = f;
        }
        int a10 = a9;
        if (k > 0L) {
            a10 = (a9 | 0x2000);
            nyj.a = a10;
            nyj.k = k;
        }
        if (l > 0L) {
            nyj.a = (a10 | 0x4000);
            nyj.l = l;
        }
        if (list != null) {
            final olj j2 = nyj.j;
            if (!j2.c()) {
                nyj.j = oky.C(j2);
            }
            ojf.e(list, nyj.j);
        }
        final okt m2 = nyf.e.m();
        if (m2.c) {
            m2.m();
            m2.c = false;
        }
        final nyf nyf = (nyf)m2.b;
        final nyj c2 = (nyj)j.h();
        c2.getClass();
        nyf.c = c2;
        nyf.a |= 0x2;
        if (m2.c) {
            m2.m();
            m2.c = false;
        }
        final nyf nyf2 = (nyf)m2.b;
        b2.getClass();
        nyf2.b = b2;
        nyf2.a |= 0x1;
        final nyk ab = aB(a, n);
        if (m2.c) {
            m2.m();
            m2.c = false;
        }
        final nyf nyf3 = (nyf)m2.b;
        ab.getClass();
        nyf3.d = ab;
        nyf3.a |= 0x4;
        final nyf o = (nyf)m2.h();
        final okt m3 = nxt.ak.m();
        if (m3.c) {
            m3.m();
            m3.c = false;
        }
        final nxt nxt = (nxt)m3.b;
        nxt.d = 19;
        a = (nxt.a | 0x1);
        nxt.a = a;
        o.getClass();
        nxt.o = o;
        nxt.a = (0x8000 | a);
        this.av(m3);
        aw(4, "onCapturePersisted", b, b2);
    }
    
    @Override
    public final void ac(final long c, final hio hio, final int n, final int n2) {
        final okt m = nxs.c.m();
        final int ac = aC(hio);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxs nxs = (nxs)m.b;
        nxs.b = ac - 1;
        nxs.a |= 0x2;
        final nxs b = (nxs)m.h();
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 26;
        nxt.a |= 0x1;
        final okt j = nyh.f.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyh nyh = (nyh)j.b;
        nyh.a |= 0x2;
        nyh.c = c;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyh nyh2 = (nyh)j.b;
        final int a = nyh2.a | 0x4;
        nyh2.a = a;
        nyh2.d = elapsedRealtimeNanos;
        b.getClass();
        nyh2.b = b;
        nyh2.a = (a | 0x1);
        final nyk ab = aB(n, n2);
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyh nyh3 = (nyh)j.b;
        ab.getClass();
        nyh3.e = ab;
        nyh3.a |= 0x8;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        final nyh v = (nyh)j.h();
        v.getClass();
        nxt2.v = v;
        nxt2.a |= 0x400000;
        this.av(i);
        aw(4, "onCaptureStartCommitted", c, b);
    }
    
    @Override
    public final void ad(int n) {
        if (n == 3) {
            this.x = 3;
            return;
        }
        final int x = this.x;
        if (x != 1) {
            n = x;
        }
        this.x = 1;
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 60;
        nxt.a |= 0x1;
        final okt i = nys.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nys nys = (nys)i.b;
        if (n != 0) {
            nys.b = n - 1;
            nys.a |= 0x1;
            final nys ag = (nys)i.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxt nxt2 = (nxt)m.b;
            ag.getClass();
            nxt2.ag = ag;
            nxt2.c |= 0x10;
            this.av(m);
            return;
        }
        throw null;
    }
    
    @Override
    public final void ae(int a, final long c) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 64;
        nxt.a |= 0x1;
        final okt i = obx.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final obx obx = (obx)i.b;
        obx.b = a - 1;
        a = (obx.a | 0x1);
        obx.a = a;
        obx.a = (a | 0x2);
        obx.c = c;
        final obx ai = (obx)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        ai.getClass();
        nxt2.ai = ai;
        nxt2.c |= 0x100;
        this.av(m);
    }
    
    @Override
    public final void af(final int z) {
        this.z = z;
    }
    
    @Override
    public final void ag(int n, final boolean e, final int d) {
        final okt m = obi.f.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obi obi = (obi)m.b;
        obi.b = 1;
        final int a = obi.a | 0x1;
        obi.a = a;
        if (n != 0) {
            obi.c = n - 1;
            n = (a | 0x2);
            obi.a = n;
            n |= 0x4;
            obi.a = n;
            obi.d = d;
            obi.a = (n | 0x8);
            obi.e = e;
            final obi ab = (obi)m.h();
            final okt i = nxt.ak.m();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nxt nxt = (nxt)i.b;
            nxt.d = 55;
            nxt.a |= 0x1;
            ab.getClass();
            nxt.ab = ab;
            nxt.b |= Integer.MIN_VALUE;
            this.av(i);
            return;
        }
        throw null;
    }
    
    @Override
    public final void ah(int a, final int n, final float d, final float e, final lfu lfu) {
        final okt m = nxm.g.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxm nxm = (nxm)m.b;
        nxm.b = a - 1;
        a = (nxm.a | 0x1);
        nxm.a = a;
        nxm.c = n - 1;
        a |= 0x2;
        nxm.a = a;
        a |= 0x4;
        nxm.a = a;
        nxm.d = d;
        nxm.a = (a | 0x8);
        nxm.e = e;
        final nxr ay = ay(lfu);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxm nxm2 = (nxm)m.b;
        nxm2.f = ay.d;
        nxm2.a |= 0x10;
        this.aA(12, null, null, (nxm)m.h(), null);
    }
    
    @Override
    public final void ai(int a, final boolean c) {
        final okt m = obb.d.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obb obb = (obb)m.b;
        obb.b = a - 1;
        a = (obb.a | 0x1);
        obb.a = a;
        obb.a = (a | 0x2);
        obb.c = c;
        this.aA(8, null, (obb)m.h(), null, null);
    }
    
    @Override
    public final void aj(int z, final lfu lfu, final boolean b, final boolean b2, final obs obs, final int n, final boolean b3) {
        this.o = SystemClock.elapsedRealtime();
        final eyy eyy = new eyy(z, lfu == lfu.a);
        if (!b) {
            z = 2;
        }
        else {
            z = 4;
        }
        eyy.h(z);
        eyy.b(b2);
        eyy.e(obs);
        eyy.i(n);
        eyy.c(b3);
        z = this.z;
        if (z != 1) {
            eyy.g(z);
            this.z = 1;
        }
        this.at(eyy);
    }
    
    @Override
    public final void ak(final int n, final int n2, final int n3, final boolean b, final boolean b2, final boolean b3) {
        this.ax(new hvk(this, n, n3, b, b2, b3, SystemClock.uptimeMillis() - Process.getStartUptimeMillis(), n2));
    }
    
    @Override
    public final void al(int a, final int n, final float n2, final float c) {
        final eyy eyy = new eyy(a, false);
        eyy.f(1.0f);
        eyy.d(n2);
        if (a == 12) {
            final okt m = oao.d.m();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oao oao = (oao)m.b;
            oao.b = n - 1;
            a = (oao.a | 0x1);
            oao.a = a;
            oao.a = (a | 0x2);
            oao.c = c;
            final oao p4 = (oao)m.h();
            if (p4 != null) {
                final okt a2 = eyy.a;
                if (a2.c) {
                    a2.m();
                    a2.c = false;
                }
                final nyd nyd = (nyd)a2.b;
                final nyd q = nyd.Q;
                nyd.p = p4;
                nyd.a |= 0x10000;
            }
        }
        this.at(eyy);
    }
    
    @Override
    public final void am(int n, final lfu lfu, final kva kva, final float n2, final boolean b, final float n3, final obt i, final int n4, final boolean b2) {
        this.o = SystemClock.elapsedRealtime();
        final eyy eyy = new eyy(n, lfu == lfu.a);
        eyy.f(n2);
        if (!b) {
            n = 2;
        }
        else {
            n = 4;
        }
        eyy.h(n);
        eyy.d(n3);
        eyy.i(n4);
        final okt a = eyy.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        i.getClass();
        nyd.I = i;
        nyd.b |= 0x400;
        eyy.c(b2);
        if (kva != null) {
            eyy.a(kva);
        }
        this.at(eyy);
    }
    
    @Override
    public final void an(int a, final long f, final long g, final float c, final boolean d) {
        final eyy eyy = new eyy(23, false);
        eyy.f(1.0f);
        final okt m = nzl.h.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzl nzl = (nzl)m.b;
        nzl.b = a - 1;
        a = (nzl.a | 0x1);
        nzl.a = a;
        a |= 0x100;
        nzl.a = a;
        nzl.f = f;
        a |= 0x200;
        nzl.a = a;
        nzl.g = g;
        a |= 0x40;
        nzl.a = a;
        nzl.d = d;
        nzl.e = 2;
        a |= 0x80;
        nzl.a = a;
        nzl.a = (a | 0x20);
        nzl.c = c;
        final nzl x = (nzl)m.h();
        if (x != null) {
            final okt a2 = eyy.a;
            if (a2.c) {
                a2.m();
                a2.c = false;
            }
            final nyd nyd = (nyd)a2.b;
            final nyd q = nyd.Q;
            nyd.x = x;
            nyd.a |= 0x40000000;
        }
        this.at(eyy);
    }
    
    @Override
    public final void ao() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 53;
        nxt.a |= 0x1;
        final okt i = obp.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final obp obp = (obp)i.b;
        obp.b = 1;
        obp.a |= 0x1;
        final obp z = (obp)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        z.getClass();
        nxt2.Z = z;
        nxt2.b |= 0x20000000;
        this.av(m);
    }
    
    @Override
    public final void ap(int s, final ezd ezd, final ExifInterface exifInterface, final boolean b, final Float n, final List list, final oac r, int b2, final dua dua, final Long n2, final Integer n3, final oaf u, final nyx v, final oav w, final nxk d, final nyw y, final Long n4, final Long n5, final boolean g, final boolean h, final oby l, final nxn m, final nxl n6, final nyy p25, final boolean b3) {
        this.o = SystemClock.elapsedRealtime();
        final okt i = oap.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oap oap = (oap)i.b;
        oap.a |= 0x2;
        oap.b = b;
        if (n4 == null) {
            a.l(hvm.j.c(), "Submitting log event with zero file size", '\u09e5');
        }
        long c;
        if (n4 != null) {
            c = n4 / 1024L;
        }
        else {
            c = 0L;
        }
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oap oap2 = (oap)i.b;
        oap2.a |= 0x4;
        oap2.c = c;
        final eyy eyy = new eyy(s, ezd.a);
        eyy.a(exifInterface);
        eyy.f(ezd.b);
        final String c2 = ezd.c;
        if (c2 != null) {
            if (c2.equals("off")) {
                s = 2;
            }
            else if (c2.equals("auto")) {
                s = 3;
            }
            else if (!c2.equals("on") && !c2.equals("torch")) {
                s = 1;
            }
            else {
                s = 4;
            }
            final okt a = eyy.a;
            if (a.c) {
                a.m();
                a.c = false;
            }
            final nyd nyd = (nyd)a.b;
            final nyd q = nyd.Q;
            nyd.j = s - 1;
            nyd.a |= 0x100;
        }
        eyy.b(ezd.d);
        final boolean e = ezd.e;
        final okt a2 = eyy.a;
        if (a2.c) {
            a2.m();
            a2.c = false;
        }
        final nyd nyd2 = (nyd)a2.b;
        final nyd q2 = nyd.Q;
        nyd2.b |= 0x40;
        nyd2.E = e;
        final float f = ezd.f;
        final okt a3 = eyy.a;
        if (a3.c) {
            a3.m();
            a3.c = false;
        }
        final nyd nyd3 = (nyd)a3.b;
        nyd3.a |= 0x80;
        nyd3.i = f;
        final oap j = (oap)i.h();
        if (j != null) {
            final okt a4 = eyy.a;
            if (a4.c) {
                a4.m();
                a4.c = false;
            }
            final nyd nyd4 = (nyd)a4.b;
            nyd4.m = j;
            nyd4.a |= 0x1000;
        }
        eyy.d(n);
        final boolean booleanValue = ezd.g;
        final okt a5 = eyy.a;
        if (a5.c) {
            a5.m();
            a5.c = false;
        }
        final nyd nyd5 = (nyd)a5.b;
        nyd5.a |= 0x200;
        nyd5.k = booleanValue;
        final okt a6 = eyy.a;
        if (a6.c) {
            a6.m();
            a6.c = false;
        }
        final nyd nyd6 = (nyd)a6.b;
        nyd6.t = b2 - 1;
        nyd6.a |= 0x4000000;
        final boolean booleanValue2 = ezd.j;
        final okt a7 = eyy.a;
        if (a7.c) {
            a7.m();
            a7.c = false;
        }
        final nyd nyd7 = (nyd)a7.b;
        nyd7.b |= 0x4;
        nyd7.A = booleanValue2;
        s = ezd.o;
        final okt a8 = eyy.a;
        if (a8.c) {
            a8.m();
            a8.c = false;
        }
        final nyd nyd8 = (nyd)a8.b;
        if (s != 0) {
            nyd8.B = s - 1;
            nyd8.b |= 0x8;
            final nyr k = ezd.k;
            final okt a9 = eyy.a;
            if (a9.c) {
                a9.m();
                a9.c = false;
            }
            final nyd nyd9 = (nyd)a9.b;
            k.getClass();
            nyd9.F = k;
            nyd9.b |= 0x80;
            final okt a10 = eyy.a;
            if (a10.c) {
                a10.m();
                a10.c = false;
            }
            final nyd nyd10 = (nyd)a10.b;
            nyd10.b |= 0x100;
            nyd10.G = g;
            final okt a11 = eyy.a;
            if (a11.c) {
                a11.m();
                a11.c = false;
            }
            final nyd nyd11 = (nyd)a11.b;
            nyd11.b |= 0x200;
            nyd11.H = h;
            final nzi l2 = ezd.l;
            final okt a12 = eyy.a;
            if (a12.c) {
                a12.m();
                a12.c = false;
            }
            final nyd nyd12 = (nyd)a12.b;
            l2.getClass();
            nyd12.J = l2;
            nyd12.b |= 0x800;
            eyy.c(b3);
            if (r != null) {
                final okt a13 = eyy.a;
                if (a13.c) {
                    a13.m();
                    a13.c = false;
                }
                final nyd nyd13 = (nyd)a13.b;
                nyd13.r = r;
                nyd13.a |= 0x200000;
            }
            if (list != null) {
                final Rect h2 = ezd.h;
                final okt a14 = eyy.a;
                if (a14.c) {
                    a14.m();
                    a14.c = false;
                }
                ((nyd)a14.b).l = oky.B();
                final Iterator iterator = list.iterator();
                s = 0;
                while (iterator.hasNext()) {
                    final gzm gzm = (gzm)iterator.next();
                    final float k2 = gzm.k;
                    if ((k2 != 0.0f || gzm.j != 0.0f || gzm.l != 0.0f) && Math.abs(k2) <= 5.0f && Math.abs(gzm.j) <= 10.0f) {
                        final okt a15 = eyy.a;
                        final Rect a16 = gzm.a;
                        final okt m2 = nyv.i.m();
                        final float b4 = (float)a16.left;
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final nyv nyv = (nyv)m2.b;
                        nyv.a |= 0x1;
                        nyv.b = b4;
                        final float d2 = (float)a16.top;
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final nyv nyv2 = (nyv)m2.b;
                        nyv2.a |= 0x4;
                        nyv2.d = d2;
                        final float c3 = (float)a16.right;
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final nyv nyv3 = (nyv)m2.b;
                        nyv3.a |= 0x2;
                        nyv3.c = c3;
                        final float e2 = (float)a16.bottom;
                        if (m2.c) {
                            m2.m();
                            m2.c = false;
                        }
                        final nyv nyv4 = (nyv)m2.b;
                        final int a17 = nyv4.a | 0x8;
                        nyv4.a = a17;
                        nyv4.e = e2;
                        b2 = gzm.b;
                        nyv4.a = (a17 | 0x40);
                        nyv4.h = (float)b2;
                        if (h2 != null) {
                            final float f2 = (float)h2.right;
                            if (m2.c) {
                                m2.m();
                                m2.c = false;
                            }
                            final nyv nyv5 = (nyv)m2.b;
                            nyv5.a |= 0x10;
                            nyv5.f = f2;
                            final float g2 = (float)h2.bottom;
                            if (m2.c) {
                                m2.m();
                                m2.c = false;
                            }
                            final nyv nyv6 = (nyv)m2.b;
                            nyv6.a |= 0x20;
                            nyv6.g = g2;
                        }
                        final nyv nyv7 = (nyv)m2.h();
                        if (a15.c) {
                            a15.m();
                            a15.c = false;
                        }
                        final nyd nyd14 = (nyd)a15.b;
                        nyv7.getClass();
                        final olj l3 = nyd14.l;
                        if (!l3.c()) {
                            nyd14.l = oky.C(l3);
                        }
                        nyd14.l.add(nyv7);
                        if (++s >= 5) {
                            break;
                        }
                        continue;
                    }
                }
            }
            if (dua != null) {
                final okt a18 = eyy.a;
                final nzk a19 = dua.a;
                if (a18.c) {
                    a18.m();
                    a18.c = false;
                }
                final nyd nyd15 = (nyd)a18.b;
                a19.getClass();
                nyd15.o = a19;
                nyd15.a |= 0x4000;
            }
            if (n2 != null) {
                final okt m3 = obs.z.m();
                final long longValue = n2;
                if (m3.c) {
                    m3.m();
                    m3.c = false;
                }
                final obs obs = (obs)m3.b;
                obs.a |= 0x2;
                obs.c = longValue;
                eyy.e((obs)m3.h());
            }
            if (n3 != null) {
                s = n3;
                final okt a20 = eyy.a;
                if (a20.c) {
                    a20.m();
                    a20.c = false;
                }
                final nyd nyd16 = (nyd)a20.b;
                nyd16.a |= 0x2000000;
                nyd16.s = s;
            }
            if (u != null) {
                final okt a21 = eyy.a;
                if (a21.c) {
                    a21.m();
                    a21.c = false;
                }
                final nyd nyd17 = (nyd)a21.b;
                nyd17.u = u;
                nyd17.a |= 0x8000000;
            }
            if (v != null) {
                final okt a22 = eyy.a;
                if (a22.c) {
                    a22.m();
                    a22.c = false;
                }
                final nyd nyd18 = (nyd)a22.b;
                nyd18.v = v;
                nyd18.a |= 0x10000000;
            }
            if (w != null) {
                final okt a23 = eyy.a;
                if (a23.c) {
                    a23.m();
                    a23.c = false;
                }
                final nyd nyd19 = (nyd)a23.b;
                nyd19.w = w;
                nyd19.a |= 0x20000000;
            }
            if (y != null) {
                final okt a24 = eyy.a;
                if (a24.c) {
                    a24.m();
                    a24.c = false;
                }
                final nyd nyd20 = (nyd)a24.b;
                nyd20.y = y;
                nyd20.a |= Integer.MIN_VALUE;
            }
            if (d != null) {
                final okt a25 = eyy.a;
                if (a25.c) {
                    a25.m();
                    a25.c = false;
                }
                final nyd nyd21 = (nyd)a25.b;
                nyd21.D = d;
                nyd21.b |= 0x20;
            }
            if (m != null) {
                final okt a26 = eyy.a;
                if (a26.c) {
                    a26.m();
                    a26.c = false;
                }
                final nyd nyd22 = (nyd)a26.b;
                nyd22.M = m;
                nyd22.b |= 0x8000;
            }
            if (n6 != null) {
                final okt a27 = eyy.a;
                if (a27.c) {
                    a27.m();
                    a27.c = false;
                }
                final nyd nyd23 = (nyd)a27.b;
                nyd23.N = n6;
                nyd23.b |= 0x10000;
            }
            if (p25 != null) {
                final okt a28 = eyy.a;
                if (a28.c) {
                    a28.m();
                    a28.c = false;
                }
                final nyd nyd24 = (nyd)a28.b;
                nyd24.P = p25;
                nyd24.b |= 0x40000;
            }
            s = this.z;
            if (s != 1) {
                eyy.g(s);
                this.z = 1;
            }
            if (n5 != null) {
                final okt m4 = nyj.m.m();
                final long longValue2 = n5;
                if (m4.c) {
                    m4.m();
                    m4.c = false;
                }
                final nyj nyj = (nyj)m4.b;
                nyj.a |= 0x1;
                nyj.b = longValue2;
                final nyj q3 = (nyj)m4.h();
                final okt a29 = eyy.a;
                if (a29.c) {
                    a29.m();
                    a29.c = false;
                }
                final nyd nyd25 = (nyd)a29.b;
                q3.getClass();
                nyd25.q = q3;
                nyd25.a |= 0x80000;
            }
            if (l != null) {
                final okt a30 = eyy.a;
                if (a30.c) {
                    a30.m();
                    a30.c = false;
                }
                final nyd nyd26 = (nyd)a30.b;
                nyd26.L = l;
                nyd26.b |= 0x2000;
            }
            this.at(eyy);
            return;
        }
        throw null;
    }
    
    @Override
    public final void aq(int a, final int c, final float d) {
        final okt m = oaq.f.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaq oaq = (oaq)m.b;
        final int a2 = oaq.a | 0x2;
        oaq.a = a2;
        oaq.b = a;
        a = (a2 | 0x4);
        oaq.a = a;
        oaq.c = c;
        a |= 0x8;
        oaq.a = a;
        oaq.d = d;
        oaq.e = 3;
        oaq.a = (a | 0x10);
        this.Q(6, (oaq)m.h(), null, null, null);
    }
    
    @Override
    public final void ar() {
        this.y = 2;
    }
    
    @Override
    public final void as(final List list) {
        for (final lfl lfl : list) {
            this.O(11, null, null, 0, 0, 0, nns.l(), nns.m(lfl.a), kst.a(lfl.b), false);
        }
    }
    
    public final void at(final eyy eyy) {
        this.r.execute(new hvl(this, eyy));
    }
    
    @Override
    public final void au(int h, final kst kst, final String d, int t) {
        final int i = nvb.i(h - 1);
        t = (h = nvb.h(t - 1));
        if (t == 0) {
            h = 1;
        }
        if (i == 0) {
            t = 3;
        }
        else {
            t = i;
        }
        final okt m = oal.f.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oal oal = (oal)m.b;
        oal.b = t - 1;
        final int a = oal.a | 0x1;
        oal.a = a;
        t = kst.t;
        final int a2 = a | 0x2;
        oal.a = a2;
        oal.c = t;
        oal.e = h - 1;
        h = (a2 | 0x8);
        oal.a = h;
        if (d != null) {
            oal.a = (h | 0x4);
            oal.d = d;
        }
        final okt j = nxt.ak.m();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nxt nxt = (nxt)j.b;
        nxt.d = 22;
        nxt.a |= 0x1;
        final oal r = (oal)m.h();
        r.getClass();
        nxt.r = r;
        nxt.a |= 0x40000;
        this.av(j);
    }
    
    public final void av(final okt okt) {
        this.ax(new hvh(okt));
    }
    
    @Override
    public final void b(int a, final int c, final int d, final int e) {
        final okt m = nyt.f.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyt nyt = (nyt)m.b;
        final int a2 = nyt.a | 0x1;
        nyt.a = a2;
        nyt.b = a;
        a = (a2 | 0x2);
        nyt.a = a;
        nyt.c = c;
        a |= 0x4;
        nyt.a = a;
        nyt.d = d;
        nyt.a = (a | 0x8);
        nyt.e = e;
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 54;
        nxt.a |= 0x1;
        final okt j = nxv.d.m();
        final nyt c2 = (nyt)m.h();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nxv nxv = (nxv)j.b;
        c2.getClass();
        nxv.c = c2;
        nxv.a |= 0x2;
        final nxv aa = (nxv)j.h();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        aa.getClass();
        nxt2.aa = aa;
        nxt2.b |= 0x40000000;
        this.av(i);
    }
    
    @Override
    public final void c(final String b, int a, final int d, final int e, final int f, final int g, final long h) {
        final okt m = nyz.i.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyz nyz = (nyz)m.b;
        b.getClass();
        final int a2 = nyz.a | 0x1;
        nyz.a = a2;
        nyz.b = b;
        final int a3 = a2 | 0x2;
        nyz.a = a3;
        nyz.c = a;
        a = (a3 | 0x4);
        nyz.a = a;
        nyz.d = d;
        a |= 0x8;
        nyz.a = a;
        nyz.e = e;
        a |= 0x10;
        nyz.a = a;
        nyz.f = f;
        a |= 0x20;
        nyz.a = a;
        nyz.g = g;
        nyz.a = (a | 0x40);
        nyz.h = h;
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 54;
        nxt.a |= 0x1;
        final okt j = nxv.d.m();
        final nyz b2 = (nyz)m.h();
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nxv nxv = (nxv)j.b;
        b2.getClass();
        nxv.b = b2;
        nxv.a |= 0x1;
        final nxv aa = (nxv)j.h();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt2 = (nxt)i.b;
        aa.getClass();
        nxt2.aa = aa;
        nxt2.b |= 0x40000000;
        this.av(i);
    }
    
    @Override
    public final void d(final boolean b, final PointF pointF) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 12;
        nxt.a |= 0x1;
        final okt i = nza.d.m();
        int n;
        if (!b) {
            n = 3;
        }
        else {
            n = 2;
        }
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nza nza = (nza)i.b;
        nza.b = n - 1;
        nza.a |= 0x1;
        final obo az = az(pointF);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nza nza2 = (nza)i.b;
        az.getClass();
        nza2.c = az;
        nza2.a |= 0x2;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nza j = (nza)i.h();
        j.getClass();
        nxt2.I = j;
        nxt2.b |= 0x800;
        this.av(m);
    }
    
    @Override
    public final void e(final boolean b, final PointF pointF, final long d, final int f, int f2) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 12;
        nxt.a |= 0x1;
        final okt i = nzb.g.m();
        int n;
        if (!b) {
            n = 3;
        }
        else {
            n = 2;
        }
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nzb nzb = (nzb)i.b;
        nzb.b = n - 1;
        nzb.a |= 0x1;
        final obo az = az(pointF);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nzb nzb2 = (nzb)i.b;
        az.getClass();
        nzb2.c = az;
        final int a = nzb2.a | 0x2;
        nzb2.a = a;
        nzb2.a = (a | 0x4);
        nzb2.d = d;
        f2 = ofi.F(f2);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nzb nzb3 = (nzb)i.b;
        if (f2 != 0) {
            nzb3.e = f2 - 1;
            f2 = (nzb3.a | 0x10);
            nzb3.a = f2;
            nzb3.a = (f2 | 0x20);
            nzb3.f = f;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxt nxt2 = (nxt)m.b;
            final nzb j = (nzb)i.h();
            j.getClass();
            nxt2.J = j;
            nxt2.b |= 0x1000;
            this.av(m);
            return;
        }
        throw null;
    }
    
    @Override
    public final void f(final boolean b) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 49;
        nxt.a |= 0x1;
        final okt i = nzj.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nzj nzj = (nzj)i.b;
        nzj.a |= 0x1;
        nzj.b = b;
        final nzj u = (nzj)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        u.getClass();
        nxt2.U = u;
        nxt2.b |= 0x1000000;
        this.av(m);
    }
    
    @Override
    public final void g(final nzm p) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 44;
        nxt.a |= 0x1;
        p.getClass();
        nxt.P = p;
        nxt.b |= 0x40000;
        this.av(m);
    }
    
    @Override
    public final void h() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 28;
        nxt.a |= 0x1;
        final okt i = oaz.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oaz oaz = (oaz)i.b;
        oaz.b = 1;
        final int a = oaz.a | 0x1;
        oaz.a = a;
        oaz.c = 1;
        oaz.a = (a | 0x2);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final oaz a2 = (oaz)i.h();
        a2.getClass();
        nxt2.A = a2;
        nxt2.a |= 0x40000000;
        this.av(m);
    }
    
    @Override
    public final void i() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 28;
        nxt.a |= 0x1;
        final okt i = oaz.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oaz oaz = (oaz)i.b;
        oaz.b = 2;
        final int a = oaz.a | 0x1;
        oaz.a = a;
        oaz.c = 1;
        oaz.a = (a | 0x2);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final oaz a2 = (oaz)i.h();
        a2.getClass();
        nxt2.A = a2;
        nxt2.a |= 0x40000000;
        this.av(m);
    }
    
    @Override
    public final void j() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 7;
        nxt.a |= 0x1;
        final okt i = nxu.m.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxu nxu = (nxu)i.b;
        nxu.b = 8;
        final int a = nxu.a | 0x1;
        nxu.a = a;
        final String e = this.e;
        e.getClass();
        nxu.a = (a | 0x4);
        nxu.d = e;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nxu j = (nxu)i.h();
        j.getClass();
        nxt2.j = j;
        nxt2.a |= 0x80;
        this.av(m);
    }
    
    @Override
    public final void k() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 32;
        nxt.a |= 0x1;
        final okt i = nxi.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxi nxi = (nxi)i.b;
        nxi.b = 1;
        nxi.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nxi d = (nxi)i.h();
        d.getClass();
        nxt2.D = d;
        nxt2.b |= 0x8;
        this.av(m);
    }
    
    @Override
    public final void l() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 32;
        nxt.a |= 0x1;
        final okt i = nxi.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxi nxi = (nxi)i.b;
        nxi.b = 4;
        nxi.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nxi d = (nxi)i.h();
        d.getClass();
        nxt2.D = d;
        nxt2.b |= 0x8;
        this.av(m);
    }
    
    @Override
    public final void m() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 51;
        nxt.a |= 0x1;
        final okt i = nxh.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxh nxh = (nxh)i.b;
        nxh.b = 4;
        nxh.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nxh w = (nxh)i.h();
        w.getClass();
        nxt2.W = w;
        nxt2.b |= 0x4000000;
        this.av(m);
    }
    
    @Override
    public final void n(final boolean b, final float c, final jbm jbm) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 59;
        nxt.a |= 0x1;
        final okt i = nyl.e.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyl nyl = (nyl)i.b;
        final int a = nyl.a | 0x1;
        nyl.a = a;
        nyl.b = b;
        nyl.a = (a | 0x2);
        nyl.c = c;
        final int f = jbk.f(jbm);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyl nyl2 = (nyl)i.b;
        nyl2.d = f - 1;
        nyl2.a |= 0x4;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nyl af = (nyl)i.h();
        af.getClass();
        nxt2.af = af;
        nxt2.c |= 0x8;
        this.av(m);
    }
    
    @Override
    public final void o(String g, final Object o, final Object o2) {
        final okt m = oay.h.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oay oay = (oay)m.b;
        g.getClass();
        final int a = oay.a | 0x2;
        oay.a = a;
        oay.c = g;
        if (o2 instanceof Boolean) {
            oay.b = 1;
            oay.a = (a | 0x1);
            final boolean booleanValue = (boolean)o;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oay oay2 = (oay)m.b;
            oay2.a |= 0x4;
            oay2.d = booleanValue;
            final boolean booleanValue2 = (boolean)o2;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oay oay3 = (oay)m.b;
            oay3.a |= 0x8;
            oay3.e = booleanValue2;
        }
        else if (o2 instanceof String) {
            oay.b = 2;
            final int a2 = a | 0x1;
            oay.a = a2;
            g = (String)o;
            g.getClass();
            final int a3 = a2 | 0x10;
            oay.a = a3;
            oay.f = g;
            g = (String)o2;
            g.getClass();
            oay.a = (a3 | 0x20);
            oay.g = g;
        }
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 33;
        nxt.a |= 0x1;
        final oay e = (oay)m.h();
        e.getClass();
        nxt.E = e;
        nxt.b |= 0x10;
        this.av(i);
    }
    
    @Override
    public final void p(final long c, final eza eza) {
        final okt m = nxs.c.m();
        final int ac = aC(eza.a);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxs nxs = (nxs)m.b;
        nxs.b = ac - 1;
        final int a = nxs.a;
        int n = 2;
        nxs.a = (a | 0x2);
        final nxs b = (nxs)m.h();
        final okt i = nyi.h.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyi nyi = (nyi)i.b;
        final int a2 = nyi.a | 0x2;
        nyi.a = a2;
        nyi.c = c;
        b.getClass();
        nyi.b = b;
        nyi.a = (a2 | 0x1);
        final hio a3 = eza.a;
        final cyn a4 = cyn.a;
        final lfu a5 = lfu.a;
        final hio a6 = hio.a;
        final obl a7 = obl.a;
        switch (a3.ordinal()) {
            default: {
                n = 1;
                break;
            }
            case 15: {
                n = 35;
                break;
            }
            case 14:
            case 18: {
                n = 32;
                break;
            }
            case 13: {
                n = 11;
                break;
            }
            case 12: {
                n = 29;
                break;
            }
            case 11: {
                n = 23;
                break;
            }
            case 10: {
                n = 22;
                break;
            }
            case 9:
            case 17: {
                n = 9;
                break;
            }
            case 8: {
                n = 20;
                break;
            }
            case 6: {
                n = 6;
                break;
            }
            case 5: {
                n = 12;
                break;
            }
            case 4: {
                n = 18;
                break;
            }
            case 2:
            case 3: {
                n = 8;
                break;
            }
            case 1:
            case 7:
            case 16: {
                break;
            }
            case 0: {
                n = 1;
                break;
            }
        }
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyi nyi2 = (nyi)i.b;
        nyi2.d = n - 1;
        nyi2.a |= 0x4;
        final oaf b2 = eza.b;
        if (b2 != null) {
            int j;
            if ((j = nvb.j(b2.h)) == 0) {
                j = 1;
            }
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nyi nyi3 = (nyi)i.b;
            nyi3.e = j - 1;
            nyi3.a |= 0x8;
        }
        if (eza.a == hio.o) {
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nyi nyi4 = (nyi)i.b;
            nyi4.f = 4;
            nyi4.a |= 0x10;
        }
        else if (b2 != null) {
            int k;
            if ((k = nvb.k(b2.l)) == 0) {
                k = 1;
            }
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nyi nyi5 = (nyi)i.b;
            nyi5.f = k - 1;
            nyi5.a |= 0x10;
        }
        final Float c2 = eza.c;
        if (c2 != null) {
            final float floatValue = c2;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nyi nyi6 = (nyi)i.b;
            nyi6.a |= 0x20;
            nyi6.g = floatValue;
        }
        final okt l = nxt.ak.m();
        if (l.c) {
            l.m();
            l.c = false;
        }
        final nxt nxt = (nxt)l.b;
        nxt.d = 18;
        nxt.a |= 0x1;
        final nyi n2 = (nyi)i.h();
        n2.getClass();
        nxt.n = n2;
        nxt.a |= 0x4000;
        this.av(l);
        aw(4, "onCaptureStarted", c, b);
    }
    
    @Override
    public final void q(final nzy s) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 47;
        nxt.a |= 0x1;
        s.getClass();
        nxt.S = s;
        nxt.b |= 0x400000;
        this.av(m);
    }
    
    @Override
    public final void r(final oai o) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 43;
        nxt.a |= 0x1;
        o.getClass();
        nxt.O = o;
        nxt.b |= 0x20000;
        this.av(m);
    }
    
    @Override
    public final void s(final gjp gjp) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 45;
        nxt.a |= 0x1;
        final okt i = oan.c.m();
        final oam oam = this.u.a.get(gjp);
        oam.getClass();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oan oan = (oan)i.b;
        oan.b = oam.aj;
        oan.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final oan q = (oan)i.h();
        q.getClass();
        nxt2.Q = q;
        nxt2.b |= 0x80000;
        this.av(m);
    }
    
    @Override
    public final void t() {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 32;
        nxt.a |= 0x1;
        final okt i = nxi.c.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxi nxi = (nxi)i.b;
        nxi.b = 2;
        nxi.a |= 0x1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final nxi d = (nxi)i.h();
        d.getClass();
        nxt2.D = d;
        nxt2.b |= 0x8;
        this.av(m);
    }
    
    @Override
    public final void u(final boolean p) {
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!this.p && p) {
            final long q = this.q;
            if (q != 0L) {
                final okt m = nxt.ak.m();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nxt nxt = (nxt)m.b;
                nxt.d = 24;
                nxt.a |= 0x1;
                final okt i = nxp.e.m();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nxp nxp = (nxp)i.b;
                final int a = nxp.a | 0x1;
                nxp.a = a;
                nxp.b = q;
                final int a2 = a | 0x2;
                nxp.a = a2;
                nxp.c = elapsedRealtimeNanos;
                final int w = this.w;
                if (w == 0) {
                    throw null;
                }
                nxp.d = w - 1;
                nxp.a = (a2 | 0x4);
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nxt nxt2 = (nxt)m.b;
                final nxp t = (nxp)i.h();
                t.getClass();
                nxt2.t = t;
                nxt2.a |= 0x100000;
                this.av(m);
            }
        }
        this.q = elapsedRealtimeNanos;
        this.p = p;
    }
    
    @Override
    public final void v(final long b, final List list) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 40;
        nxt.a |= 0x1;
        final okt i = obd.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final obd obd = (obd)i.b;
        obd.a |= 0x1;
        obd.b = b;
        final olj c = obd.c;
        if (!c.c()) {
            obd.c = oky.C(c);
        }
        ojf.e(list, obd.c);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt2 = (nxt)m.b;
        final obd k = (obd)i.h();
        k.getClass();
        nxt2.K = k;
        nxt2.b |= 0x2000;
        this.av(m);
    }
    
    @Override
    public final void w(final obk f) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 37;
        nxt.a |= 0x1;
        f.getClass();
        nxt.F = f;
        nxt.b |= 0x100;
        this.av(m);
    }
    
    @Override
    public final void x(final Throwable t, final int n) {
        this.O(10, null, t, -1, -1, n, nns.l(), nns.l(), kst.m, false);
    }
    
    @Override
    public final void y(final String b, final boolean c, final hio hio, final String e, final int f) {
        final okt m = nzu.g.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzu nzu = (nzu)m.b;
        b.getClass();
        final int a = nzu.a | 0x1;
        nzu.a = a;
        nzu.b = b;
        nzu.a = (a | 0x2);
        nzu.c = c;
        final cyn a2 = cyn.a;
        final lfu a3 = lfu.a;
        final hio a4 = hio.a;
        final obl a5 = obl.a;
        switch (hio.ordinal()) {
            default: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu2 = (nzu)m.b;
                nzu2.d = 0;
                nzu2.a |= 0x4;
                break;
            }
            case 10: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu3 = (nzu)m.b;
                nzu3.d = 32;
                nzu3.a |= 0x4;
                break;
            }
            case 9: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu4 = (nzu)m.b;
                nzu4.d = 10;
                nzu4.a |= 0x4;
                break;
            }
            case 6: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu5 = (nzu)m.b;
                nzu5.d = 20;
                nzu5.a |= 0x4;
                break;
            }
            case 5: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu6 = (nzu)m.b;
                nzu6.d = 20;
                nzu6.a |= 0x4;
                break;
            }
            case 4: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu7 = (nzu)m.b;
                nzu7.d = 31;
                nzu7.a |= 0x4;
                break;
            }
            case 3: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu8 = (nzu)m.b;
                nzu8.d = 3;
                nzu8.a |= 0x4;
                break;
            }
            case 2: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu9 = (nzu)m.b;
                nzu9.d = 2;
                nzu9.a |= 0x4;
                break;
            }
            case 1: {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzu nzu10 = (nzu)m.b;
                nzu10.d = 1;
                nzu10.a |= 0x4;
                break;
            }
        }
        if (e != null) {
            final nzu nzu11 = (nzu)m.b;
            nzu11.a |= 0x8;
            nzu11.e = e;
        }
        if (f != 0) {
            final nzu nzu12 = (nzu)m.b;
            nzu12.a |= 0x10;
            nzu12.f = f;
        }
        final okt i = nxt.ak.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxt nxt = (nxt)i.b;
        nxt.d = 30;
        nxt.a |= 0x1;
        final nzu b2 = (nzu)m.h();
        b2.getClass();
        nxt.B = b2;
        nxt.b |= 0x1;
        this.av(i);
    }
    
    @Override
    public final void z(final oau g) {
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 38;
        nxt.a |= 0x1;
        g.getClass();
        nxt.G = g;
        nxt.b |= 0x200;
        this.av(m);
    }
}

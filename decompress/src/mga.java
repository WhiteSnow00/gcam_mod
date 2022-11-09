import android.os.Process;
import android.content.Context;
import java.util.List;
import java.util.Collections;
import android.os.health.HealthStats;

// 
// Decompiled by Procyon v0.6.0
// 

public class mga
{
    static mgk d(final Long n, final Long n2, final HealthStats healthStats, final pqz pqz, final mfv mfv) {
        final mgn a = mfv.a;
        final okt m = prj.an.m();
        final long a2 = mhz.a(healthStats, 10001);
        long n3 = 0L;
        final int n4 = 0;
        if (a2 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj = (prj)m.b;
            prj.a |= 0x1;
            prj.c = a2;
        }
        final long a3 = mhz.a(healthStats, 10002);
        if (a3 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj2 = (prj)m.b;
            prj2.a |= 0x2;
            prj2.d = a3;
        }
        final long a4 = mhz.a(healthStats, 10003);
        if (a4 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj3 = (prj)m.b;
            prj3.a |= 0x4;
            prj3.e = a4;
        }
        final long a5 = mhz.a(healthStats, 10004);
        if (a5 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj4 = (prj)m.b;
            prj4.a |= 0x8;
            prj4.f = a5;
        }
        m.R(mhz.b(healthStats, 10005));
        m.S(mhz.b(healthStats, 10006));
        m.T(mhz.b(healthStats, 10007));
        m.Q(mhz.b(healthStats, 10008));
        m.P(mhz.b(healthStats, 10009));
        m.L(mhz.b(healthStats, 10010));
        final pri f = mhz.f(healthStats, 10011);
        if (f != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj5 = (prj)m.b;
            prj5.m = f;
            prj5.a |= 0x10;
        }
        m.M(mhz.b(healthStats, 10012));
        m.O(mgg.a.d(mhz.d(healthStats, 10014)));
        m.N(mgf.a.d(mhz.d(healthStats, 10015)));
        final long a6 = mhz.a(healthStats, 10016);
        if (a6 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj6 = (prj)m.b;
            prj6.a |= 0x20;
            prj6.r = a6;
        }
        final long a7 = mhz.a(healthStats, 10017);
        if (a7 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj7 = (prj)m.b;
            prj7.a |= 0x40;
            prj7.s = a7;
        }
        final long a8 = mhz.a(healthStats, 10018);
        if (a8 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj8 = (prj)m.b;
            prj8.a |= 0x80;
            prj8.t = a8;
        }
        final long a9 = mhz.a(healthStats, 10019);
        if (a9 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj9 = (prj)m.b;
            prj9.a |= 0x100;
            prj9.u = a9;
        }
        final long a10 = mhz.a(healthStats, 10020);
        if (a10 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj10 = (prj)m.b;
            prj10.a |= 0x200;
            prj10.v = a10;
        }
        final long a11 = mhz.a(healthStats, 10021);
        if (a11 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj11 = (prj)m.b;
            prj11.a |= 0x400;
            prj11.w = a11;
        }
        final long a12 = mhz.a(healthStats, 10022);
        if (a12 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj12 = (prj)m.b;
            prj12.a |= 0x800;
            prj12.x = a12;
        }
        final long a13 = mhz.a(healthStats, 10023);
        if (a13 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj13 = (prj)m.b;
            prj13.a |= 0x1000;
            prj13.y = a13;
        }
        final long a14 = mhz.a(healthStats, 10024);
        if (a14 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj14 = (prj)m.b;
            prj14.a |= 0x2000;
            prj14.z = a14;
        }
        final long a15 = mhz.a(healthStats, 10025);
        if (a15 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj15 = (prj)m.b;
            prj15.a |= 0x4000;
            prj15.A = a15;
        }
        final long a16 = mhz.a(healthStats, 10026);
        if (a16 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj16 = (prj)m.b;
            prj16.a |= 0x8000;
            prj16.B = a16;
        }
        final long a17 = mhz.a(healthStats, 10027);
        if (a17 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj17 = (prj)m.b;
            prj17.a |= 0x10000;
            prj17.C = a17;
        }
        final long a18 = mhz.a(healthStats, 10028);
        if (a18 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj18 = (prj)m.b;
            prj18.a |= 0x20000;
            prj18.D = a18;
        }
        final long a19 = mhz.a(healthStats, 10029);
        if (a19 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj19 = (prj)m.b;
            prj19.a |= 0x40000;
            prj19.E = a19;
        }
        final pri f2 = mhz.f(healthStats, 10030);
        if (f2 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj20 = (prj)m.b;
            prj20.F = f2;
            prj20.a |= 0x80000;
        }
        final long a20 = mhz.a(healthStats, 10031);
        if (a20 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj21 = (prj)m.b;
            prj21.a |= 0x100000;
            prj21.G = a20;
        }
        final pri f3 = mhz.f(healthStats, 10032);
        if (f3 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj22 = (prj)m.b;
            prj22.H = f3;
            prj22.a |= 0x200000;
        }
        final pri f4 = mhz.f(healthStats, 10033);
        if (f4 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj23 = (prj)m.b;
            prj23.I = f4;
            prj23.a |= 0x400000;
        }
        final pri f5 = mhz.f(healthStats, 10034);
        if (f5 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj24 = (prj)m.b;
            prj24.J = f5;
            prj24.a |= 0x800000;
        }
        final pri f6 = mhz.f(healthStats, 10035);
        if (f6 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj25 = (prj)m.b;
            prj25.K = f6;
            prj25.a |= 0x1000000;
        }
        final pri f7 = mhz.f(healthStats, 10036);
        if (f7 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj26 = (prj)m.b;
            prj26.L = f7;
            prj26.a |= 0x2000000;
        }
        final pri f8 = mhz.f(healthStats, 10037);
        if (f8 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj27 = (prj)m.b;
            prj27.M = f8;
            prj27.a |= 0x4000000;
        }
        final pri f9 = mhz.f(healthStats, 10038);
        if (f9 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj28 = (prj)m.b;
            prj28.N = f9;
            prj28.a |= 0x8000000;
        }
        final pri f10 = mhz.f(healthStats, 10039);
        if (f10 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj29 = (prj)m.b;
            prj29.O = f10;
            prj29.a |= 0x10000000;
        }
        final pri f11 = mhz.f(healthStats, 10040);
        if (f11 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj30 = (prj)m.b;
            prj30.P = f11;
            prj30.a |= 0x20000000;
        }
        final pri f12 = mhz.f(healthStats, 10041);
        if (f12 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj31 = (prj)m.b;
            prj31.Q = f12;
            prj31.a |= 0x40000000;
        }
        final pri f13 = mhz.f(healthStats, 10042);
        if (f13 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj32 = (prj)m.b;
            prj32.R = f13;
            prj32.a |= Integer.MIN_VALUE;
        }
        final pri f14 = mhz.f(healthStats, 10043);
        if (f14 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj33 = (prj)m.b;
            prj33.S = f14;
            prj33.b |= 0x1;
        }
        final pri f15 = mhz.f(healthStats, 10044);
        if (f15 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj34 = (prj)m.b;
            prj34.T = f15;
            prj34.b |= 0x2;
        }
        final long a21 = mhz.a(healthStats, 10045);
        if (a21 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj35 = (prj)m.b;
            prj35.b |= 0x4;
            prj35.U = a21;
        }
        final long a22 = mhz.a(healthStats, 10046);
        if (a22 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj36 = (prj)m.b;
            prj36.b |= 0x8;
            prj36.V = a22;
        }
        final long a23 = mhz.a(healthStats, 10047);
        if (a23 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj37 = (prj)m.b;
            prj37.b |= 0x10;
            prj37.W = a23;
        }
        final long a24 = mhz.a(healthStats, 10048);
        if (a24 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj38 = (prj)m.b;
            prj38.b |= 0x20;
            prj38.X = a24;
        }
        final long a25 = mhz.a(healthStats, 10049);
        if (a25 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj39 = (prj)m.b;
            prj39.b |= 0x40;
            prj39.Y = a25;
        }
        final long a26 = mhz.a(healthStats, 10050);
        if (a26 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj40 = (prj)m.b;
            prj40.b |= 0x80;
            prj40.Z = a26;
        }
        final long a27 = mhz.a(healthStats, 10051);
        if (a27 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj41 = (prj)m.b;
            prj41.b |= 0x100;
            prj41.aa = a27;
        }
        final long a28 = mhz.a(healthStats, 10052);
        if (a28 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj42 = (prj)m.b;
            prj42.b |= 0x200;
            prj42.ab = a28;
        }
        final long a29 = mhz.a(healthStats, 10053);
        if (a29 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj43 = (prj)m.b;
            prj43.b |= 0x400;
            prj43.ac = a29;
        }
        final long a30 = mhz.a(healthStats, 10054);
        if (a30 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj44 = (prj)m.b;
            prj44.b |= 0x800;
            prj44.ad = a30;
        }
        final long a31 = mhz.a(healthStats, 10055);
        if (a31 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj45 = (prj)m.b;
            prj45.b |= 0x1000;
            prj45.ae = a31;
        }
        final long a32 = mhz.a(healthStats, 10056);
        if (a32 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj46 = (prj)m.b;
            prj46.b |= 0x2000;
            prj46.af = a32;
        }
        final long a33 = mhz.a(healthStats, 10057);
        if (a33 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj47 = (prj)m.b;
            prj47.b |= 0x4000;
            prj47.ag = a33;
        }
        final long a34 = mhz.a(healthStats, 10058);
        if (a34 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj48 = (prj)m.b;
            prj48.b |= 0x8000;
            prj48.ah = a34;
        }
        final long a35 = mhz.a(healthStats, 10059);
        if (a35 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj49 = (prj)m.b;
            prj49.b |= 0x10000;
            prj49.ai = a35;
        }
        final pri f16 = mhz.f(healthStats, 10061);
        if (f16 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj50 = (prj)m.b;
            prj50.aj = f16;
            prj50.b |= 0x20000;
        }
        final long a36 = mhz.a(healthStats, 10062);
        if (a36 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj51 = (prj)m.b;
            prj51.b |= 0x40000;
            prj51.ak = a36;
        }
        final long a37 = mhz.a(healthStats, 10063);
        if (a37 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj52 = (prj)m.b;
            prj52.b |= 0x80000;
            prj52.al = a37;
        }
        final long a38 = mhz.a(healthStats, 10064);
        if (a38 != 0L) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj53 = (prj)m.b;
            prj53.b |= 0x100000;
            prj53.am = a38;
        }
        final prj prj54 = (prj)m.h();
        final okt okt = (okt)prj54.H(5);
        okt.o(prj54);
        final mgd b = a.b;
        Collections.unmodifiableList((List<?>)((prj)okt.b).g);
        for (int i = 0; i < ((prj)okt.b).g.size(); ++i) {
            okt.ad(i, b.c(1, okt.E(i)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).h);
        for (int j = 0; j < ((prj)okt.b).h.size(); ++j) {
            okt.ae(j, b.c(1, okt.F(j)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).i);
        for (int k = 0; k < ((prj)okt.b).i.size(); ++k) {
            okt.af(k, b.c(1, okt.G(k)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).j);
        for (int l = 0; l < ((prj)okt.b).j.size(); ++l) {
            okt.ac(l, b.c(1, okt.H(l)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).k);
        for (int n5 = 0; n5 < ((prj)okt.b).k.size(); ++n5) {
            okt.Z(n5, b.c(2, okt.I(n5)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).l);
        for (int n6 = 0; n6 < ((prj)okt.b).l.size(); ++n6) {
            okt.W(n6, b.c(3, okt.J(n6)));
        }
        Collections.unmodifiableList((List<?>)((prj)okt.b).n);
        for (int n7 = n4; n7 < ((prj)okt.b).n.size(); ++n7) {
            okt.Y(n7, b.c(5, okt.K(n7)));
        }
        final prj prj55 = (prj)okt.h();
        final String c = mfv.c;
        if (c != null) {
            n3 = c.hashCode();
        }
        return new mgk(prj55, n, n2, 367660599L, n3, pqz, null, null);
    }
    
    public static prx e(final String e, final Context context) {
        final okt m = prx.f.m();
        final long elapsedCpuTime = Process.getElapsedCpuTime();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prx prx = (prx)m.b;
        prx.a |= 0x1;
        prx.b = elapsedCpuTime;
        final boolean c = mfs.c(context);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prx prx2 = (prx)m.b;
        prx2.a |= 0x2;
        prx2.c = c;
        final int activeCount = Thread.activeCount();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prx prx3 = (prx)m.b;
        final int a = prx3.a | 0x4;
        prx3.a = a;
        prx3.d = activeCount;
        if (e != null) {
            prx3.a = (a | 0x8);
            prx3.e = e;
        }
        return (prx)m.h();
    }
    
    public static mde f(final Object o) {
        return new mdi(o);
    }
    
    public static mde g(final luy luy) {
        return new mdc(luy);
    }
}

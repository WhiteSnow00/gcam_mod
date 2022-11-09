import android.os.health.TimerStat;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import android.os.health.HealthStats;

// 
// Decompiled by Procyon v0.6.0
// 

public class mhz
{
    public static long a(final HealthStats healthStats, final int n) {
        if (healthStats != null && healthStats.hasMeasurement(n)) {
            return healthStats.getMeasurement(n);
        }
        return 0L;
    }
    
    public static List b(final HealthStats healthStats, final int n) {
        List<Object> list;
        if (healthStats != null && healthStats.hasTimers(n)) {
            list = mgj.a.d(healthStats.getTimers(n));
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    public static Map d(final HealthStats healthStats, final int n) {
        Map<Object, Object> map;
        if (healthStats != null && healthStats.hasStats(n)) {
            map = healthStats.getStats(n);
        }
        else {
            map = Collections.emptyMap();
        }
        return map;
    }
    
    public static prd e(final String c) {
        final okt m = prd.d.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prd prd = (prd)m.b;
        prd.a |= 0x2;
        prd.c = c;
        return (prd)m.h();
    }
    
    public static pri f(final HealthStats healthStats, final int n) {
        if (healthStats != null && healthStats.hasTimer(n)) {
            return h(null, healthStats.getTimer(n));
        }
        return null;
    }
    
    public static pri g(final pri pri, pri pri2) {
        if (pri != null && pri2 != null) {
            int b = pri.b - pri2.b;
            final long c = pri.c - pri2.c;
            if (b == 0) {
                if (c == 0L) {
                    return null;
                }
                b = 0;
            }
            final okt m = pri.e.m();
            prd d;
            if ((d = pri.d) == null) {
                d = prd.d;
            }
            if (m.c) {
                m.m();
                m.c = false;
            }
            pri2 = (pri)m.b;
            d.getClass();
            pri2.d = d;
            final int a = pri2.a | 0x4;
            pri2.a = a;
            final int a2 = a | 0x1;
            pri2.a = a2;
            pri2.b = b;
            pri2.a = (a2 | 0x2);
            pri2.c = c;
            return (pri)m.h();
        }
        return pri;
    }
    
    public static pri h(final String s, final TimerStat timerStat) {
        final okt m = pri.e.m();
        final int count = timerStat.getCount();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final pri pri = (pri)m.b;
        pri.a |= 0x1;
        pri.b = count;
        final long time = timerStat.getTime();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final pri pri2 = (pri)m.b;
        final int a = pri2.a | 0x2;
        pri2.a = a;
        pri2.c = time;
        if (pri2.b < 0) {
            pri2.a = (a | 0x1);
            pri2.b = 0;
        }
        if (s != null) {
            final prd e = e(s);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pri pri3 = (pri)m.b;
            e.getClass();
            pri3.d = e;
            pri3.a |= 0x4;
        }
        final pri pri4 = (pri)m.b;
        if (pri4.b == 0 && pri4.c == 0L) {
            return null;
        }
        return (pri)m.h();
    }
    
    public static prj i(prj prj, final prj prj2) {
        if (prj == null || prj2 == null) {
            return prj;
        }
        final okt m = prj.an.m();
        if ((prj.a & 0x1) != 0x0) {
            final long c = prj.c - prj2.c;
            if (c != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj3 = (prj)m.b;
                prj3.a |= 0x1;
                prj3.c = c;
            }
        }
        if ((prj.a & 0x2) != 0x0) {
            final long d = prj.d - prj2.d;
            if (d != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj4 = (prj)m.b;
                prj4.a |= 0x2;
                prj4.d = d;
            }
        }
        if ((prj.a & 0x4) != 0x0) {
            final long e = prj.e - prj2.e;
            if (e != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj5 = (prj)m.b;
                prj5.a |= 0x4;
                prj5.e = e;
            }
        }
        if ((prj.a & 0x8) != 0x0) {
            final long f = prj.f - prj2.f;
            if (f != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj6 = (prj)m.b;
                prj6.a |= 0x8;
                prj6.f = f;
            }
        }
        m.R(mgj.a.e(prj.g, prj2.g));
        m.S(mgj.a.e(prj.h, prj2.h));
        m.T(mgj.a.e(prj.i, prj2.i));
        m.Q(mgj.a.e(prj.j, prj2.j));
        m.P(mgj.a.e(prj.k, prj2.k));
        m.L(mgj.a.e(prj.l, prj2.l));
        pri pri;
        if ((prj.a & 0x10) != 0x0) {
            if ((pri = prj.m) == null) {
                pri = pri.e;
            }
        }
        else {
            pri = null;
        }
        pri pri2;
        if ((prj2.a & 0x10) != 0x0) {
            if ((pri2 = prj2.m) == null) {
                pri2 = pri.e;
            }
        }
        else {
            pri2 = null;
        }
        final pri g = g(pri, pri2);
        if (g != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prj prj7 = (prj)m.b;
            prj7.m = g;
            prj7.a |= 0x10;
        }
        m.M(mgj.a.e(prj.n, prj2.n));
        m.O(mgg.a.e(prj.p, prj2.p));
        m.N(mgf.a.e(prj.q, prj2.q));
        if ((prj.a & 0x20) != 0x0) {
            final long r = prj.r - prj2.r;
            if (r != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj8 = (prj)m.b;
                prj8.a |= 0x20;
                prj8.r = r;
            }
        }
        if ((prj.a & 0x40) != 0x0) {
            final long s = prj.s - prj2.s;
            if (s != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj9 = (prj)m.b;
                prj9.a |= 0x40;
                prj9.s = s;
            }
        }
        if ((prj.a & 0x80) != 0x0) {
            final long t = prj.t - prj2.t;
            if (t != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj10 = (prj)m.b;
                prj10.a |= 0x80;
                prj10.t = t;
            }
        }
        if ((prj.a & 0x100) != 0x0) {
            final long u = prj.u - prj2.u;
            if (u != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj11 = (prj)m.b;
                prj11.a |= 0x100;
                prj11.u = u;
            }
        }
        if ((prj.a & 0x200) != 0x0) {
            final long v = prj.v - prj2.v;
            if (v != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj12 = (prj)m.b;
                prj12.a |= 0x200;
                prj12.v = v;
            }
        }
        if ((prj.a & 0x400) != 0x0) {
            final long w = prj.w - prj2.w;
            if (w != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj13 = (prj)m.b;
                prj13.a |= 0x400;
                prj13.w = w;
            }
        }
        if ((prj.a & 0x800) != 0x0) {
            final long n = prj.x - prj2.x;
            if (n != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).P(n);
            }
        }
        if ((prj.a & 0x1000) != 0x0) {
            final long n2 = prj.y - prj2.y;
            if (n2 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).Q(n2);
            }
        }
        if ((prj.a & 0x2000) != 0x0) {
            final long n3 = prj.z - prj2.z;
            if (n3 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).R(n3);
            }
        }
        if ((prj.a & 0x4000) != 0x0) {
            final long n4 = prj.A - prj2.A;
            if (n4 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).S(n4);
            }
        }
        if ((prj.a & 0x8000) != 0x0) {
            final long n5 = prj.B - prj2.B;
            if (n5 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).T(n5);
            }
        }
        if ((prj.a & 0x10000) != 0x0) {
            final long n6 = prj.C - prj2.C;
            if (n6 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).U(n6);
            }
        }
        if ((prj.a & 0x20000) != 0x0) {
            final long n7 = prj.D - prj2.D;
            if (n7 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).V(n7);
            }
        }
        if ((prj.a & 0x40000) != 0x0) {
            final long n8 = prj.E - prj2.E;
            if (n8 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).W(n8);
            }
        }
        pri pri3;
        if ((prj.a & 0x80000) != 0x0) {
            if ((pri3 = prj.F) == null) {
                pri3 = pri.e;
            }
        }
        else {
            pri3 = null;
        }
        pri pri4;
        if ((0x80000 & prj2.a) != 0x0) {
            if ((pri4 = prj2.F) == null) {
                pri4 = pri.e;
            }
        }
        else {
            pri4 = null;
        }
        final pri g2 = g(pri3, pri4);
        if (g2 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).X(g2);
        }
        if ((prj.a & 0x100000) != 0x0) {
            final long n9 = prj.G - prj2.G;
            if (n9 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).Y(n9);
            }
        }
        pri pri5;
        if ((prj.a & 0x200000) != 0x0) {
            if ((pri5 = prj.H) == null) {
                pri5 = pri.e;
            }
        }
        else {
            pri5 = null;
        }
        pri pri6;
        if ((0x200000 & prj2.a) != 0x0) {
            if ((pri6 = prj2.H) == null) {
                pri6 = pri.e;
            }
        }
        else {
            pri6 = null;
        }
        final pri g3 = g(pri5, pri6);
        if (g3 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).Z(g3);
        }
        pri pri7;
        if ((prj.a & 0x400000) != 0x0) {
            if ((pri7 = prj.I) == null) {
                pri7 = pri.e;
            }
        }
        else {
            pri7 = null;
        }
        pri pri8;
        if ((prj2.a & 0x400000) != 0x0) {
            if ((pri8 = prj2.I) == null) {
                pri8 = pri.e;
            }
        }
        else {
            pri8 = null;
        }
        final pri g4 = g(pri7, pri8);
        if (g4 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).aa(g4);
        }
        pri pri9;
        if ((prj.a & 0x800000) != 0x0) {
            if ((pri9 = prj.J) == null) {
                pri9 = pri.e;
            }
        }
        else {
            pri9 = null;
        }
        pri pri10;
        if ((prj2.a & 0x800000) != 0x0) {
            if ((pri10 = prj2.J) == null) {
                pri10 = pri.e;
            }
        }
        else {
            pri10 = null;
        }
        final pri g5 = g(pri9, pri10);
        if (g5 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ab(g5);
        }
        pri pri11;
        if ((prj.a & 0x1000000) != 0x0) {
            if ((pri11 = prj.K) == null) {
                pri11 = pri.e;
            }
        }
        else {
            pri11 = null;
        }
        pri pri12;
        if ((prj2.a & 0x1000000) != 0x0) {
            if ((pri12 = prj2.K) == null) {
                pri12 = pri.e;
            }
        }
        else {
            pri12 = null;
        }
        final pri g6 = g(pri11, pri12);
        if (g6 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ac(g6);
        }
        pri pri13;
        if ((prj.a & 0x2000000) != 0x0) {
            if ((pri13 = prj.L) == null) {
                pri13 = pri.e;
            }
        }
        else {
            pri13 = null;
        }
        pri pri14;
        if ((prj2.a & 0x2000000) != 0x0) {
            if ((pri14 = prj2.L) == null) {
                pri14 = pri.e;
            }
        }
        else {
            pri14 = null;
        }
        final pri g7 = g(pri13, pri14);
        if (g7 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ad(g7);
        }
        pri pri15;
        if ((prj.a & 0x4000000) != 0x0) {
            if ((pri15 = prj.M) == null) {
                pri15 = pri.e;
            }
        }
        else {
            pri15 = null;
        }
        pri pri16;
        if ((prj2.a & 0x4000000) != 0x0) {
            if ((pri16 = prj2.M) == null) {
                pri16 = pri.e;
            }
        }
        else {
            pri16 = null;
        }
        final pri g8 = g(pri15, pri16);
        if (g8 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ae(g8);
        }
        pri pri17;
        if ((prj.a & 0x8000000) != 0x0) {
            if ((pri17 = prj.N) == null) {
                pri17 = pri.e;
            }
        }
        else {
            pri17 = null;
        }
        pri pri18;
        if ((prj2.a & 0x8000000) != 0x0) {
            if ((pri18 = prj2.N) == null) {
                pri18 = pri.e;
            }
        }
        else {
            pri18 = null;
        }
        final pri g9 = g(pri17, pri18);
        if (g9 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).af(g9);
        }
        pri pri19;
        if ((prj.a & 0x10000000) != 0x0) {
            if ((pri19 = prj.O) == null) {
                pri19 = pri.e;
            }
        }
        else {
            pri19 = null;
        }
        pri pri20;
        if ((prj2.a & 0x10000000) != 0x0) {
            if ((pri20 = prj2.O) == null) {
                pri20 = pri.e;
            }
        }
        else {
            pri20 = null;
        }
        final pri g10 = g(pri19, pri20);
        if (g10 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ag(g10);
        }
        pri pri21;
        if ((prj.a & 0x20000000) != 0x0) {
            if ((pri21 = prj.P) == null) {
                pri21 = pri.e;
            }
        }
        else {
            pri21 = null;
        }
        pri pri22;
        if ((prj2.a & 0x20000000) != 0x0) {
            if ((pri22 = prj2.P) == null) {
                pri22 = pri.e;
            }
        }
        else {
            pri22 = null;
        }
        final pri g11 = g(pri21, pri22);
        if (g11 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ah(g11);
        }
        pri pri23;
        if ((prj.a & 0x40000000) != 0x0) {
            if ((pri23 = prj.Q) == null) {
                pri23 = pri.e;
            }
        }
        else {
            pri23 = null;
        }
        pri pri24;
        if ((prj2.a & 0x40000000) != 0x0) {
            if ((pri24 = prj2.Q) == null) {
                pri24 = pri.e;
            }
        }
        else {
            pri24 = null;
        }
        final pri g12 = g(pri23, pri24);
        if (g12 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ai(g12);
        }
        pri pri25;
        if ((prj.a & Integer.MIN_VALUE) != 0x0) {
            if ((pri25 = prj.R) == null) {
                pri25 = pri.e;
            }
        }
        else {
            pri25 = null;
        }
        pri pri26;
        if ((prj2.a & Integer.MIN_VALUE) != 0x0) {
            if ((pri26 = prj2.R) == null) {
                pri26 = pri.e;
            }
        }
        else {
            pri26 = null;
        }
        final pri g13 = g(pri25, pri26);
        if (g13 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).aj(g13);
        }
        pri pri27;
        if ((prj.b & 0x1) != 0x0) {
            if ((pri27 = prj.S) == null) {
                pri27 = pri.e;
            }
        }
        else {
            pri27 = null;
        }
        pri pri28;
        if ((prj2.b & 0x1) != 0x0) {
            if ((pri28 = prj2.S) == null) {
                pri28 = pri.e;
            }
        }
        else {
            pri28 = null;
        }
        final pri g14 = g(pri27, pri28);
        if (g14 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).ak(g14);
        }
        pri pri29;
        if ((prj.b & 0x2) != 0x0) {
            if ((pri29 = prj.T) == null) {
                pri29 = pri.e;
            }
        }
        else {
            pri29 = null;
        }
        pri pri30;
        if ((prj2.b & 0x2) != 0x0) {
            if ((pri30 = prj2.T) == null) {
                pri30 = pri.e;
            }
        }
        else {
            pri30 = null;
        }
        final pri g15 = g(pri29, pri30);
        if (g15 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            ((prj)m.b).al(g15);
        }
        if ((prj.b & 0x4) != 0x0) {
            final long n10 = prj.U - prj2.U;
            if (n10 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).am(n10);
            }
        }
        if ((prj.b & 0x8) != 0x0) {
            final long n11 = prj.V - prj2.V;
            if (n11 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).an(n11);
            }
        }
        if ((prj.b & 0x10) != 0x0) {
            final long n12 = prj.W - prj2.W;
            if (n12 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).ao(n12);
            }
        }
        if ((prj.b & 0x20) != 0x0) {
            final long n13 = prj.X - prj2.X;
            if (n13 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).ap(n13);
            }
        }
        if ((prj.b & 0x40) != 0x0) {
            final long n14 = prj.Y - prj2.Y;
            if (n14 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).aq(n14);
            }
        }
        if ((prj.b & 0x80) != 0x0) {
            final long n15 = prj.Z - prj2.Z;
            if (n15 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).ar(n15);
            }
        }
        if ((prj.b & 0x100) != 0x0) {
            final long n16 = prj.aa - prj2.aa;
            if (n16 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).as(n16);
            }
        }
        if ((prj.b & 0x200) != 0x0) {
            final long n17 = prj.ab - prj2.ab;
            if (n17 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).at(n17);
            }
        }
        if ((prj.b & 0x400) != 0x0) {
            final long n18 = prj.ac - prj2.ac;
            if (n18 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).au(n18);
            }
        }
        if ((prj.b & 0x800) != 0x0) {
            final long n19 = prj.ad - prj2.ad;
            if (n19 != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                ((prj)m.b).av(n19);
            }
        }
        if ((prj.b & 0x1000) != 0x0) {
            final long ae = prj.ae - prj2.ae;
            if (ae != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj14 = (prj)m.b;
                prj14.b |= 0x1000;
                prj14.ae = ae;
            }
        }
        if ((prj.b & 0x2000) != 0x0) {
            final long af = prj.af - prj2.af;
            if (af != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj15 = (prj)m.b;
                prj15.b |= 0x2000;
                prj15.af = af;
            }
        }
        if ((prj.b & 0x4000) != 0x0) {
            final long ag = prj.ag - prj2.ag;
            if (ag != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj16 = (prj)m.b;
                prj16.b |= 0x4000;
                prj16.ag = ag;
            }
        }
        if ((prj.b & 0x8000) != 0x0) {
            final long ah = prj.ah - prj2.ah;
            if (ah != 0L) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prj prj17 = (prj)m.b;
                prj17.b |= 0x8000;
                prj17.ah = ah;
            }
        }
        if ((prj.b & 0x10000) != 0x0) {
            final long n20 = prj.ai - prj2.ai;
            if (n20 != 0L) {
                m.U(n20);
            }
        }
        pri ax;
        if (prj.aw()) {
            ax = prj.ax();
        }
        else {
            ax = null;
        }
        pri ax2;
        if (prj2.aw()) {
            ax2 = prj2.ax();
        }
        else {
            ax2 = null;
        }
        final pri g16 = g(ax, ax2);
        if (g16 != null) {
            m.X(g16);
        }
        if (prj.ay()) {
            final long n21 = prj.ak - prj2.ak;
            if (n21 != 0L) {
                m.ab(n21);
            }
        }
        if (prj.az()) {
            final long n22 = prj.al - prj2.al;
            if (n22 != 0L) {
                m.aa(n22);
            }
        }
        if (prj.aA()) {
            final long n23 = prj.am - prj2.am;
            if (n23 != 0L) {
                m.V(n23);
            }
        }
        prj = (prj)m.h();
        if (n(prj)) {
            return null;
        }
        return prj;
    }
    
    public static boolean j(final pre pre) {
        boolean b = false;
        if (pre != null) {
            if (pre.b.size() != 0) {
                return b;
            }
            if (pre.c.size() != 0) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static boolean l(final prg prg) {
        boolean b = true;
        if (prg != null) {
            if (prg.b <= 0L && prg.c <= 0L && prg.d <= 0L && prg.e <= 0L && prg.f <= 0L) {
                if (prg.g > 0L) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static boolean m(final prh prh) {
        boolean b = false;
        if (prh != null) {
            if (prh.b > 0L) {
                return b;
            }
            if (prh.c > 0L) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    static boolean n(final prj prj) {
        boolean b = true;
        if (prj != null) {
            if (prj.c <= 0L && prj.d <= 0L && prj.e <= 0L && prj.f <= 0L && prj.g.size() == 0 && prj.h.size() == 0 && prj.i.size() == 0 && prj.j.size() == 0 && prj.k.size() == 0 && prj.l.size() == 0 && prj.n.size() == 0 && prj.o.size() == 0 && prj.p.size() == 0 && prj.q.size() == 0 && prj.r <= 0L && prj.s <= 0L && prj.t <= 0L && prj.u <= 0L && prj.v <= 0L && prj.w <= 0L && prj.x <= 0L && prj.y <= 0L && prj.z <= 0L && prj.A <= 0L && prj.B <= 0L && prj.C <= 0L && prj.D <= 0L && prj.E <= 0L && prj.G <= 0L && prj.U <= 0L && prj.V <= 0L && prj.W <= 0L && prj.X <= 0L && prj.Y <= 0L && prj.Z <= 0L && prj.aa <= 0L && prj.ab <= 0L && prj.ac <= 0L && prj.ad <= 0L && prj.ae <= 0L && prj.af <= 0L && prj.ag <= 0L && prj.ah <= 0L && prj.ai <= 0L && prj.ak <= 0L && prj.al <= 0L) {
                if (prj.am > 0L) {
                    return false;
                }
            }
            else {
                b = false;
            }
        }
        return b;
    }
}

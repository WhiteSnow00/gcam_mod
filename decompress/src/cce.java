import java.util.concurrent.Future;
import java.util.Map;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import j$.util.Collection$_EL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.Iterator;
import java.util.Collection;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cce implements krc, cej, ceh, cif, bjj
{
    public static final nsd a;
    public final fwk A;
    public final ceo B;
    private final Executor C;
    private final gkw D;
    private final itn E;
    private final cfr F;
    private final ccq G;
    private final jcs H;
    private long I;
    private final cqu J;
    public final lfu b;
    public final kjm c;
    public final cqs d;
    public final cde e;
    public final Object f;
    public final List g;
    public final cfg h;
    public final bjx i;
    public final cqp j;
    public final cid k;
    public final hyi l;
    public final ckg m;
    public final niz n;
    public final cjj o;
    public final cxl p;
    public final cij q;
    public final ScheduledExecutorService r;
    public final hwl s;
    public final pii t;
    public final oui u;
    public final cfo v;
    public boolean w;
    public ScheduledFuture x;
    public ccs y;
    public ccd z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/Video2ActiveCamcorderCaptureSession");
    }
    
    public cce(final Executor c, final kjm c2, final gkw d, final itn e, final cqs d2, final cde e2, final cfr f, final cqu j, final ccq g, final cid k, final cfm cfm, final crg crg, final bjx i, final fwk a, final cqp l, final hyi m, final ckg m2, final niz n, final cjj o, final cxl p28, final cij q, final ScheduledExecutorService r, final hwl s, final pii t, final oui u, final jcs h, final ceo b, final cfo v) {
        this.f = new Object();
        this.g = new ArrayList();
        this.w = false;
        this.i = i;
        this.A = a;
        this.j = l;
        this.b = crg.e();
        this.C = c;
        this.c = c2;
        this.D = d;
        this.E = e;
        this.d = d2;
        this.e = e2;
        this.F = f;
        this.J = j;
        this.G = g;
        this.h = cfm.a();
        this.k = k;
        this.m = m2;
        this.l = m;
        this.n = n;
        this.o = o;
        this.p = p28;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.H = h;
        this.B = b;
        this.v = v;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        return this.m.a(bjz);
    }
    
    @Override
    public final void aU(final kov kov) {
        if (kov.k) {
            final cxo a = cwv.a;
            this.n(new cbw(this, kov));
            return;
        }
        this.e.aU(kov);
    }
    
    public final oey b(final boolean b) {
        final Object f = this.f;
        monitorenter(f);
        try {
            if (this.z != ccd.e) {
                cce.a.c().E(335).r("Trying to stop recording but state is: %s", this.z);
                final oey n = ofi.n(new cgs(new ArrayList(), new ArrayList(), null));
                monitorexit(f);
                return n;
            }
            this.m(ccd.d);
            this.s.i(hwk.c);
            final ArrayList list = new ArrayList(this.g);
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((ceh)iterator.next()).d();
            }
            final ccs y = this.y;
            y.getClass();
            final oey c = y.c(b);
            this.y = null;
            ofi.w(c, new ccb(this, list), this.C);
            ofi.w(c, new cca(this, 2), this.c);
            monitorexit(f);
            return c;
        }
        finally {
            monitorexit(f);
            while (true) {}
        }
    }
    
    public final void c() {
        this.D.b(cce.class);
        final cfr f = this.F;
        final Object d = f.d;
        monitorenter(d);
        try {
            f.b();
            if (!f.e) {
                monitorexit(d);
            }
            else {
                f.e = false;
                f.b.aR(f.a(f.a.c()));
                monitorexit(d);
            }
            this.E.h();
            this.E.f();
            this.J.a.b(2131886107);
            this.H.b();
            final ceo b = this.B;
            if (b.a() && b.d.g()) {
                synchronized (b.c) {
                    ((htz)b.d.c()).c();
                    b.f = 3;
                }
            }
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            if (this.z == ccd.b) {
                cce.a.b().E(338).o("Capture session has been closed.");
                return;
            }
            this.F.close();
            if (this.z == ccd.c) {
                this.c.execute(new cbv(this, 1));
            }
            final ccd z = this.z;
            Label_0147: {
                if (z == ccd.e) {
                    try {
                        this.b(true).get();
                        break Label_0147;
                    }
                    catch (final ExecutionException z) {}
                    catch (final InterruptedException ex) {}
                    cce.a.b().E(337).r("failed to close current recording: %s", z);
                }
            }
            if (this.z == ccd.c || this.z == ccd.d) {
                this.c.execute(new cbv(this));
            }
            this.g.clear();
            this.l.a();
            this.q.d();
            this.m(ccd.b);
            this.k.b(cic.c);
            this.k.b(cic.b);
        }
    }
    
    @Override
    public final void d() {
    }
    
    public final void e() {
        this.b(false);
        this.e.l(false);
    }
    
    public final void f() {
        this.m.e();
        this.I = System.currentTimeMillis();
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j(final cgs cgs) {
        for (final cgi cgi : cgs.a) {
            final cqs d = this.d;
            final lfu b = this.b;
            final int c = d.e.c(hwk.a, hwk.b);
            final int c2 = d.e.c(hwk.c, hwk.d);
            final okt m = obs.z.m();
            final float b2 = (float)TimeUnit.MILLISECONDS.toSeconds(cgi.e);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs = (obs)m.b;
            obs.a |= 0x1;
            obs.b = b2;
            final int a = cgi.b().c().a;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs2 = (obs)m.b;
            obs2.a |= 0x8;
            obs2.e = a;
            final int b3 = cgi.b().c().b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs3 = (obs)m.b;
            obs3.a |= 0x4;
            obs3.d = b3;
            final long a2 = cgi.a();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs4 = (obs)m.b;
            obs4.a |= 0x2;
            obs4.c = a2;
            int i;
            if (cgi.b.c == kmt.a) {
                i = -1;
            }
            else {
                i = cgi.b.c.i;
            }
            final float f = (float)i;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs5 = (obs)m.b;
            final int a3 = obs5.a | 0x10;
            obs5.a = a3;
            obs5.f = f;
            final knc b4 = cgi.b;
            final int e = b4.e;
            final int a4 = a3 | 0x80;
            obs5.a = a4;
            obs5.i = e;
            final int f2 = b4.f;
            obs5.a = (a4 | 0x100);
            obs5.j = f2;
            final boolean c3 = d.b.c();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs6 = (obs)m.b;
            final int a5 = obs6.a | 0x20;
            obs6.a = a5;
            obs6.g = c3;
            final int g = cgi.g;
            final int a6 = a5 | 0x40;
            obs6.a = a6;
            obs6.h = g;
            final int h = cgi.h;
            final int a7 = a6 | 0x800;
            obs6.a = a7;
            obs6.m = h;
            final long l = cgi.l;
            obs6.a = (a7 | 0x200);
            obs6.k = l;
            final Map j = cgi.m;
            final okt k = obr.k.m();
            for (final kov kov : j.keySet()) {
                final Integer n = j.get(kov);
                if (n != null) {
                    final clp a8 = clp.a;
                    final kov a9 = kov.a;
                    final jbm a10 = jbm.a;
                    switch (kov.ordinal()) {
                        default: {
                            continue;
                        }
                        case 9: {
                            final int intValue = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr = (obr)k.b;
                            obr.a |= 0x100;
                            obr.j = intValue;
                            continue;
                        }
                        case 8: {
                            final int intValue2 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr2 = (obr)k.b;
                            obr2.a |= 0x80;
                            obr2.i = intValue2;
                            continue;
                        }
                        case 6:
                        case 7: {
                            final int intValue3 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr3 = (obr)k.b;
                            obr3.a |= 0x40;
                            obr3.h = intValue3;
                            continue;
                        }
                        case 5: {
                            final int intValue4 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr4 = (obr)k.b;
                            obr4.a |= 0x20;
                            obr4.g = intValue4;
                            continue;
                        }
                        case 4: {
                            final int intValue5 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr5 = (obr)k.b;
                            obr5.a |= 0x10;
                            obr5.f = intValue5;
                            continue;
                        }
                        case 3: {
                            final int intValue6 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr6 = (obr)k.b;
                            obr6.a |= 0x8;
                            obr6.e = intValue6;
                            continue;
                        }
                        case 2: {
                            final int intValue7 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr7 = (obr)k.b;
                            obr7.a |= 0x4;
                            obr7.d = intValue7;
                            continue;
                        }
                        case 1: {
                            final int intValue8 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr8 = (obr)k.b;
                            obr8.a |= 0x2;
                            obr8.c = intValue8;
                            continue;
                        }
                        case 0: {
                            final int intValue9 = n;
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final obr obr9 = (obr)k.b;
                            obr9.a |= 0x1;
                            obr9.b = intValue9;
                            continue;
                        }
                    }
                }
            }
            final obr l2 = (obr)k.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs7 = (obs)m.b;
            l2.getClass();
            obs7.l = l2;
            final int a11 = obs7.a | 0x400;
            obs7.a = a11;
            final int i2 = cgi.i;
            final int a12 = a11 | 0x1000;
            obs7.a = a12;
            obs7.n = i2;
            final int j2 = cgi.j;
            final int a13 = a12 | 0x2000;
            obs7.a = a13;
            obs7.o = j2;
            final int k2 = cgi.k;
            obs7.a = (a13 | 0x4000);
            obs7.p = k2;
            final int a14 = cgi.c.a(1);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs8 = (obs)m.b;
            obs8.a |= 0x8000;
            obs8.q = a14;
            final int a15 = cgi.c.a(2);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs9 = (obs)m.b;
            final int a16 = obs9.a | 0x10000;
            obs9.a = a16;
            obs9.r = a15;
            final int a17 = 0x20000 | a16;
            obs9.a = a17;
            obs9.s = c;
            obs9.a = (0x40000 | a17);
            obs9.t = c2;
            final Iterable iterable = (Iterable)Collection$_EL.stream((Collection)cgi.o).map((Function)new cqr(d, b)).collect(Collectors.toList());
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs10 = (obs)m.b;
            final olf u = obs10.u;
            if (!u.c()) {
                obs10.u = oky.y(u);
            }
            final Iterator iterator3 = iterable.iterator();
            while (iterator3.hasNext()) {
                obs10.u.g(((obu)iterator3.next()).g);
            }
            final int p = cgi.p;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obs obs11 = (obs)m.b;
            final int a18 = obs11.a | 0x80000;
            obs11.a = a18;
            obs11.v = p;
            final float r = cgi.r;
            final int a19 = a18 | 0x100000;
            obs11.a = a19;
            obs11.w = r;
            final long s = cgi.s;
            final int a20 = 0x200000 | a19;
            obs11.a = a20;
            obs11.x = s;
            final long t = cgi.t;
            obs11.a = (a20 | 0x400000);
            obs11.y = t;
            d.a.aj(cqs.c(d.c.a(), false), b, cgi.d, (int)d.b.a.c(hjq.c) != inp.a.e, (obs)m.h(), d.d.c().j, cgi.a.b() == hip.b);
        }
        final Iterator iterator4 = cgs.b.iterator();
        while (iterator4.hasNext()) {
            this.d.b((cgh)iterator4.next(), this.b);
        }
    }
    
    @Override
    public final void k(final boolean b) {
        kjm.a();
        synchronized (this.f) {
            if (this.z == ccd.e) {
                this.b(b);
            }
            else {
                if (this.z == ccd.a) {
                    synchronized (this.f) {
                        if (this.o()) {
                            cce.a.c().E(352).o("Not starting recording since the device is thermally throttled");
                            return;
                        }
                        final hyj b2 = this.l.b;
                        final hyj a = hyj.a;
                        final boolean b3 = false;
                        if (b2 == a) {
                            a.l(cce.a.c(), "Can't get current device storage.", '\u0162');
                        }
                        else if (!b2.c()) {
                            cce.a.c().E(351).o("Not starting recording since the device storage is low.");
                            this.l(false);
                            return;
                        }
                        if (this.w) {
                            this.w = false;
                            return;
                        }
                        this.m(ccd.c);
                        this.s.a();
                        this.s.i(hwk.a);
                        this.E.g();
                        this.D.a(cce.class);
                        final cfr f = this.F;
                        Object o = f.d;
                        synchronized (o) {
                            f.b();
                            if (f.e) {
                                monitorexit(o);
                            }
                            else {
                                f.e = true;
                                monitorexit(o);
                            }
                            this.J.a.b(2131886106);
                            final cde e = this.e;
                            o = e.d;
                            final boolean b4 = e.s.d.a() > 1;
                            final boolean g = e.s.i.g();
                            final imq a2 = imr.a();
                            a2.e(b4);
                            a2.c(klq.d(klq.j(e.n.a().q, btt.h), e.n.a().o));
                            a2.b(klq.d(klq.j(e.n.a().q, btt.i), e.n.a().p));
                            a2.d(g ^ true);
                            ((ims)o).d(a2.a());
                            e.d.f();
                            e.r.c();
                            e.a.e(true);
                            if (e.k.g()) {
                                ((cor)e.k.c()).d(false);
                                ((cor)e.k.c()).b(true);
                                if (e.l.a().equals(clp.b) && e.n(e.q)) {
                                    e.e.F();
                                }
                            }
                            this.E.e();
                            this.H.a();
                            final ceo b5 = this.B;
                            Label_0661: {
                                if (!b5.a()) {
                                    break Label_0661;
                                }
                                o = b5.c;
                                synchronized (o) {
                                    if (b5.d.g()) {
                                        ((htz)b5.d.c()).b();
                                    }
                                    b5.f = 2;
                                    monitorexit(o);
                                    o = this.x;
                                    if (o != null && !((Future)o).isDone()) {
                                        this.x.cancel(true);
                                        this.f();
                                    }
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    final long i = this.I;
                                    long n = 500L;
                                    if (currentTimeMillis - i >= 500L) {
                                        n = 300L;
                                    }
                                    final ccs a3 = this.G.a(this, this.v);
                                    this.y = a3;
                                    synchronized (a3.f) {
                                        final int e2 = a3.E;
                                        Label_1246: {
                                            if (e2 != 1) {
                                                final Object b6 = new(java.lang.IllegalStateException.class)();
                                                final String a4 = ccr.a(e2);
                                                final StringBuilder sb = new StringBuilder(a4.length() + 37);
                                                sb.append("Trying to start recording with state=");
                                                sb.append(a4);
                                                new IllegalStateException(sb.toString());
                                                final oey oey = ofi.m((Throwable)b6);
                                                monitorexit(a3.f);
                                                break Label_1246;
                                            }
                                            Object f2 = a3.f;
                                            synchronized (f2) {
                                                final ccz j = a3.i;
                                                final cfo m = a3.m;
                                                Object b6 = j.d;
                                                synchronized (b6) {
                                                    Object o2 = j.c;
                                                    Label_1000: {
                                                        if (o2 != null) {
                                                            monitorexit(b6);
                                                        }
                                                        else {
                                                            try {
                                                                o2 = j.b;
                                                                if (o2 != null) {
                                                                    o2 = ((Future<cil>)o2).get();
                                                                    monitorexit(b6);
                                                                    break Label_1000;
                                                                }
                                                                o2 = j.a(m);
                                                                monitorexit(b6);
                                                                break Label_1000;
                                                            }
                                                            catch (final ExecutionException o2) {}
                                                            catch (final InterruptedException ex) {}
                                                            ccz.a.b().h((Throwable)o2).E(370).o("Error creating video recorder: ");
                                                            monitorexit(b6);
                                                            o2 = null;
                                                        }
                                                    }
                                                    Label_1170: {
                                                        if (o2 != null && !((cil)o2).c.get()) {
                                                            if (((cil)o2).a.a() == (int)((kkz)a3.n.m).d) {
                                                                if (((hje)a3.n.q.aQ()).equals(((cil)o2).d)) {
                                                                    final boolean booleanValue = (boolean)a3.y.c(hjq.R);
                                                                    final boolean b7 = ((cil)o2).e == hip.b || b3;
                                                                    b6 = o2;
                                                                    if (booleanValue == b7) {
                                                                        break Label_1170;
                                                                    }
                                                                }
                                                            }
                                                            ((cil)o2).close();
                                                            b6 = a3.i.a(a3.m);
                                                        }
                                                        else {
                                                            b6 = a3.i.a(a3.m);
                                                        }
                                                    }
                                                    b6.getClass();
                                                    a3.B = (cil)b6;
                                                    a3.j.a(cic.c).c((krc)b6);
                                                    monitorexit(f2);
                                                    final oey oey = ofn.f();
                                                    b6 = a3.s;
                                                    f2 = new ccl(a3, (ofn)oey);
                                                    ((ScheduledExecutorService)b6).schedule((Runnable)f2, n, TimeUnit.MILLISECONDS);
                                                    monitorexit(a3.f);
                                                    b6 = new cca(this);
                                                    ofi.w(oey, (oen)b6, odx.a);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cce.a.c().E(345).r("Shutter button click ignored with state = %s", this.z);
            }
        }
    }
    
    public final void l(final boolean b) {
        this.c.execute(new cbx(this, b));
    }
    
    public final void m(final ccd z) {
        synchronized (this.f) {
            this.z = z;
        }
    }
    
    public final void n(final Runnable runnable) {
        ofi.w(this.b(false), new cbz(runnable), this.c);
    }
    
    public final boolean o() {
        final cij q = this.q;
        return q.a().a(q.l);
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import android.view.Surface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class iba implements kmj
{
    final /* synthetic */ ibf a;
    
    public iba(final ibf a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Exception ex) {
        a.k(ibf.a.b(), "Camcorder.onError(): %s", ex, '\u0a45');
        synchronized (this.a.o) {
            this.a.C.clear();
            final ibp aa = this.a.aa;
            aa.getClass();
            a.k(ibu.a.b(), "onRecordingError() %s", ex, '\u0a51');
            aa.g.j.aR(iah.j);
            final efm d = aa.d;
            final irg irg = new irg();
            final Context e = aa.e;
            irg.e = e;
            irg.h = 11;
            irg.a = false;
            irg.d = e.getString(2131952773);
            irg.g = aa.f.k(cxr.at);
            d.e(irg.a());
            aa.g.i(true);
            aa.a.b(new ibo(aa.c));
        }
    }
    
    @Override
    public final void b() {
        final ibp aa = this.a.aa;
        aa.getClass();
        aa.g.j.aR(iah.g);
    }
    
    @Override
    public final void c() {
        final ibp aa = this.a.aa;
        aa.getClass();
        aa.g.j.aR(iah.h);
        aa.g.f();
    }
    
    @Override
    public final void d() {
        synchronized (this.a.o) {
            final boolean k = this.a.d.k(cyl.d);
            boolean b = true;
            if (k) {
                final ibf a = this.a;
                final ias v = a.v;
                final kmq ab = a.ab;
                final ida s = a.S;
                final idd v2 = a.C.get(0);
                synchronized (v.s) {
                    v.B = null;
                    v.v = null;
                    v.u = null;
                    v.w = nii.a;
                    monitorexit(v.s);
                    v.e.set(0L);
                    v.f.set(0L);
                    v.g.set(0L);
                    v.b.set(false);
                    v.h.set(0L);
                    v.j.set(0L);
                    v.i.set(0L);
                    v.k.set(0L);
                    v.m.set(0L);
                    v.l.set(0L);
                    v.c.set(false);
                    v.p.set(0L);
                    v.o.set(0L);
                    v.n.set(0L);
                    final Object l = v.s;
                    synchronized (v.s) {
                        v.B = ab;
                        v.v = v2;
                        v.u = s;
                        synchronized (ab.d) {
                            if (ab.e == kmp.d) {
                                b = false;
                            }
                            njo.p(b, "Camcorder is closed already");
                            final niz c = ab.a.c();
                            njo.e(c.g(), "Input surface is not available.");
                            final Surface surface = (Surface)c.c();
                            monitorexit(ab.d);
                            v.A = lfe.f(surface, 5);
                        }
                    }
                }
            }
            final ibf a2 = this.a;
            final iaa i = a2.l;
            final idd h = a2.C.get(0);
            final ida s2 = this.a.S;
            Object l = i.x;
            synchronized (l) {
                i.G = s2;
                i.H = h;
                monitorexit(l);
                i.o.set(i.K.f);
                l = new Timer();
                i.L = (Timer)l;
                final Timer j = i.L;
                l = new hzz(i);
                j.scheduleAtFixedRate((TimerTask)l, 0L, TimeUnit.SECONDS.toMillis(1L));
                i.c.set(true);
                final ibp aa = this.a.aa;
                aa.getClass();
                if (!((iah)aa.g.j.d).equals(iah.j)) {
                    aa.g.j.aR(iah.h);
                    final kjm a3 = aa.a;
                    l = aa.b;
                    l.getClass();
                    a3.b(new ibk((icm)l, 4));
                    aa.g.h(false);
                    aa.g.f();
                }
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this.a.o) {
            if (this.a.d.k(cyl.d)) {
                this.a.d();
            }
            final ArrayList list = (ArrayList)this.a.C.clone();
            this.a.C.clear();
            final ibf a = this.a;
            final ibp aa = a.aa;
            aa.getClass();
            final ida s = a.S;
            final ibu g = aa.g;
            g.m.execute(new ibj(g, list, s));
            aa.a.b(new ibo(aa.c, 1));
        }
    }
}

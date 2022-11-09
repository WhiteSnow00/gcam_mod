import java.util.concurrent.atomic.AtomicBoolean;
import com.google.googlex.gcam.BurstSpec;
import com.integrity.annotations.PaiConfiguration;
import java.util.Iterator;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eie implements eii, dwc
{
    private static final nsd b;
    public final Map a;
    private final dty c;
    private final duq d;
    private final dxk e;
    private final Executor f;
    private final int g;
    private final ehu h;
    private final cxl i;
    private final eif j;
    private int k;
    private boolean l;
    
    static {
        b = nsd.g("com/google/android/apps/camera/kepler/AstrolapseProcessorImpl");
    }
    
    public eie(final dty c, final duq d, final dxk e, final ehu h, final eif j, final cxl i, final Executor f) {
        this.a = new HashMap();
        this.c = c;
        this.d = d;
        this.h = h;
        this.j = j;
        this.e = e;
        this.f = f;
        this.k = (int)i.a(cxs.r).e(15);
        this.g = (int)i.a(cxs.t).e(150000);
        this.i = i;
    }
    
    private final void l(final dxh dxh, final String s) {
        final eid eid = this.a.get(dxh);
        if (eid != null && eid.c.get()) {
            this.h.a(dxh);
        }
        this.j(dxh, s);
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.l = false;
        this.l(dxh, dvv.getMessage());
    }
    
    @Override
    public final void d(final him him) {
        final nsx a = ntf.a;
        final int a2 = him.a;
        while (true) {
            for (final dxh dxh : this.a.keySet()) {
                if (dxh.c.b.h().equals(him)) {
                    final dxh dxh2 = dxh;
                    if (dxh2 == null) {
                        return;
                    }
                    this.l(dxh2, "Shot aborted.");
                    return;
                }
            }
            final dxh dxh2 = null;
            continue;
        }
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    @Override
    public void e(final dxh dxh, final kvs kvs) {
        final eid eid = this.a.get(dxh);
        if (!this.d.n() || eid == null) {
            kvs.close();
            return;
        }
        final gtn a = eid.a;
        if (a.i < this.k) {
            final nsx a2 = ntf.a;
            a.c(kvs);
            boolean l = this.l;
            if (!this.i.k(cxs.ag)) {
                l &= (eid.a.i == this.k);
            }
            if (l) {
                if (!eid.c.getAndSet(true)) {
                    final ofn f = ofn.f();
                    final ehu h = this.h;
                    final dxh b = eid.b;
                    final gtn a3 = eid.a;
                    final int k = this.k;
                    final eih eih = (eih)eid.d;
                    eih.a(eih.a.a);
                    h.c(b, a3, k, eih.a.a, f);
                    ofi.w(f, new eic(this, eid), this.f);
                }
                this.h.d(eid.b);
            }
            return;
        }
        kvs.close();
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        if (this.d.n()) {
            final nsx a = ntf.a;
            njo.o(this.a.containsKey(dxh) ^ true);
            final Map a2 = this.a;
            final dtx a3 = this.c.a();
            final eif j = this.j;
            final hhy b = dxh.c.b;
            final cxl b2 = j.b;
            final cxo a4 = cxs.a;
            b2.c();
            a2.put(dxh, new eid(new gtn(dxh.c, a3, burstSpec, ljm), dxh, new AtomicBoolean(), new eih(j.a, j.c, b.k())));
            if (burstSpec != null) {
                this.k = Math.min((int)burstSpec.b().a(), this.k);
            }
        }
    }
    
    @Override
    public final void g(final him him) {
        this.e.a(him).e(this);
    }
    
    @Override
    public final void h(final dxh dxh) {
        final nsx a = ntf.a;
        dxh.a();
        final eid eid = this.a.get(dxh);
        if (eid != null) {
            if (eid.c.get() && eid.a.i < this.k) {
                this.l(dxh, "Kelper not produced since not enough frames.");
                return;
            }
            if (!eid.c.get()) {
                this.j(dxh, "Kepler was never initiated.");
            }
        }
    }
    
    public final void j(final dxh dxh, final String s) {
        final nsa nsa = (nsa)eie.b.c().g(ntf.a, "KeplerProcessorImpl").E(1224);
        final int a = dxh.a();
        String s2 = s;
        if (s == null) {
            s2 = "Unknown";
        }
        nsa.t("Shot cancelled. Shot id: %d. Reason: %s", a, s2);
        final eid eid = this.a.remove(dxh);
        if (eid != null) {
            eid.a.b();
            final eih eih = (eih)eid.d;
            eih.a.b();
            eih.b.d();
            eih.c.q();
        }
    }
    
    @Override
    public final void k(final long n) {
        synchronized (this) {
            final nsx a = ntf.a;
            if (n >= this.g) {
                this.l = true;
            }
        }
    }
    
    @Override
    public final void n(final dxh dxh) {
        this.l = false;
        this.d(dxh.c.b.h());
    }
}

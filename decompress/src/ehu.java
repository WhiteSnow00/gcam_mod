import com.google.googlex.gcam.FrameRequest;
import java.util.List;
import java.util.Collection;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehu
{
    public static final nsd a;
    public final long b;
    public final oui c;
    public final dxk d;
    public final fxu e;
    public final Executor f;
    public final ehy g;
    public final kse h;
    public final fbe i;
    public final Map j;
    private final int k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/kepler/AstrolapseController");
    }
    
    public ehu(final cxl cxl, final oui c, final dxk d, final fxu e, final Executor f, final ehy g, final kse h, final fbe i) {
        this.j = new HashMap();
        this.k = (int)cxl.a(cxs.s).c();
        this.b = (int)cxl.a(cxs.u).e(100);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final dxh dxh) {
        synchronized (this) {
            final nsx a = ntf.a;
            dxh.a();
            final eht eht = this.j.get(dxh);
            if (eht == null) {
                ehu.a.b().g(ntf.a, "KeplerController").E(1206).p("Missing InflightSession for shot id %s", dxh.a());
                return;
            }
            this.b(eht);
        }
    }
    
    public final void b(final eht eht) {
        monitorenter(this);
        try {
            final Iterator iterator = eht.f.iterator();
            while (iterator.hasNext()) {
                ((gtn)iterator.next()).d();
            }
            eht.g.cancel(true);
            eht.h.cancel(true);
            eht.b.d();
            final ehz n = eht.n;
            if (n != null) {
                n.c();
            }
            this.j.remove(eht.a);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final dxh dxh, final gtn gtn, final int n, final lkb lkb, final ofn ofn) {
        synchronized (this) {
            final nsx a = ntf.a;
            dxh.a();
            njo.o(this.j.containsKey(dxh) ^ true);
            this.j.put(dxh, new eht(dxh, gtn, n, lkb, ofn));
        }
    }
    
    public final void d(final dxh dxh) {
        monitorenter(this);
        try {
            final nsx a = ntf.a;
            dxh.a();
            final eht eht = this.j.get(dxh);
            if (eht == null) {
                ehu.a.b().g(ntf.a, "KeplerController").E(1202).p("Missing InflightSession for shot id %s", dxh.a());
                ofi.n(false);
                monitorexit(this);
                return;
            }
            final gtn b = eht.b;
            final gen b2 = b.b;
            final gen gen = new gen(b2.a, b2.b, new gek(), new gfe());
            final List a2 = b.a();
            List list;
            if (((nql)a2).c < this.k) {
                list = new ArrayList();
            }
            else {
                final BurstSpec f = b.f;
                if (f == null) {
                    throw new IllegalStateException("PayloadBurstSpec not provided");
                }
                final ArrayList list2 = new ArrayList();
                for (int i = eht.f.size(); i < ((nql)a2).c; ++i) {
                    final int k = this.k;
                    nqe nqe;
                    int n;
                    if (i < k) {
                        nqe = nqe.e(0, this.k - 1);
                        n = i;
                    }
                    else {
                        nqe = nqe.e(i - k + 1, i);
                        n = this.k - 1;
                    }
                    final FrameRequestVector frameRequestVector = new FrameRequestVector(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
                    for (int j = (int)nqe.i(); j <= (int)nqe.j(); ++j) {
                        final FrameRequest b3 = f.b().b(j);
                        GcamModuleJNI.FrameRequestVector_add(frameRequestVector.a, frameRequestVector, b3.a, b3);
                    }
                    final BurstSpec burstSpec = new BurstSpec();
                    GcamModuleJNI.BurstSpec_frame_requests_set(burstSpec.a, burstSpec, frameRequestVector.a, frameRequestVector);
                    final gtn gtn = new gtn(gen, b.j, burstSpec, b.e);
                    gtn.c.o(n);
                    final nns b4 = ((nns)a2).b((int)nqe.i(), (int)nqe.j() + 1);
                    final Iterator<Object> iterator = b4.iterator();
                    while (iterator.hasNext()) {
                        final kvs a3 = iterator.next().a();
                        if (a3 != null) {
                            gtn.c(a3);
                        }
                    }
                    b4.size();
                    list2.add(gtn);
                }
                list = list2;
            }
            eht.f.addAll(list);
            this.f.execute(new ehq(this, list, eht, dxh, ofn.f()));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}

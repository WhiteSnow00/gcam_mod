import java.util.Iterator;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igi implements igo
{
    private static final nsd b;
    public final List a;
    private final hze c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;
    private kkz g;
    private volatile PointF h;
    private volatile niz i;
    private final AtomicInteger j;
    private final Executor k;
    private final Executor l;
    private final kse m;
    
    static {
        b = nsd.g("com/google/android/apps/camera/tracking/TrackingControllerImpl");
    }
    
    public igi(final hzg hzg, final Executor executor, final hzf hzf, final Executor k, final Executor l, final kse m) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.i = nii.a;
        this.j = new AtomicInteger(0);
        this.a = new ArrayList();
        this.g = new kkz(igr.b());
        final hzi a = hzj.a();
        a.c(executor);
        a.a = "FocusTracking";
        a.d(new igf(this, 1));
        a.e(new igf(this));
        a.f(hzf);
        this.c = a.a();
        this.k = k;
        this.l = l;
        this.m = m;
        hzg.d(this);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final klj b(final PointF h) {
        this.m.f("startTracking");
        monitorenter(this);
        try {
            final kkz g = new kkz(igr.b());
            this.g = g;
            if (this.i.g() && !this.d) {
                this.e = true;
                this.f = true;
                this.h = h;
                this.j.set(0);
                monitorexit(this);
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((ign)iterator.next()).q();
                }
                final igq a = igr.a();
                a.a = 2;
                a.f(igk.a);
                a.d(new RectF(h.x, h.y, h.x, h.y));
                a.b(1.0f);
                a.e(0L);
                g.aR(a.a());
                this.m.g();
                return kld.c(g);
            }
            this.i.g();
            monitorexit(this);
            return g;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final hzf hzf) {
        this.c.c(hzf);
    }
    
    @Override
    public final krc d(final niz niz, final niz i) {
        synchronized (this) {
            this.h();
            this.i = i;
            return new ige(this, i);
        }
    }
    
    @Override
    public final void e(final ign ign) {
        this.a.add(ign);
    }
    
    @Override
    public final void f(final lju lju) {
        synchronized (this) {
            if (!this.i.g()) {
                return;
            }
            if (!this.f) {
                return;
            }
            igr igr;
            if (this.e) {
                this.e = false;
                igr = ((igj)this.i.c()).b(lju, this.h);
            }
            else {
                igr = ((igj)this.i.c()).c(lju);
            }
            monitorexit(this);
            if (this.d) {
                a.l(igi.b.c(), "tracking is disabled due the thermal issue", '\u0aa6');
            }
            else {
                if (igr.c < 0.6f) {
                    this.j.incrementAndGet();
                }
                else {
                    this.j.set(0);
                }
                if (this.j.get() <= 10) {
                    synchronized (this) {
                        final kkz g = this.g;
                        monitorexit(this);
                        this.k.execute(new igg(this, g, igr));
                        return;
                    }
                }
            }
            this.h();
        }
    }
    
    @Override
    public final void g(final ign ign) {
        this.a.remove(ign);
    }
    
    @Override
    public final void h() {
        this.m.f("stopTracking");
        monitorenter(this);
        try {
            if (this.i.g() && this.f) {
                final kkz g = this.g;
                this.f = false;
                this.e = false;
                ((igj)this.i.c()).a();
                monitorexit(this);
                final igr igr = (igr)g.d;
                final igq a = igr.a();
                a.d(igr.b);
                a.e(igr.e);
                a.c(igr.d);
                a.f(igr.a);
                g.aR(a.a());
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((ign)iterator.next()).r();
                }
                this.m.g();
                return;
            }
            this.m.g();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean i() {
        return this.i.g();
    }
    
    public final void j(final niz niz) {
        synchronized (this) {
            this.h();
            final niz i = this.i;
            if (i.g() && niz.g() && i.c() == niz.c()) {
                this.i = nii.a;
                this.l.execute(new igh((igj)i.c()));
            }
        }
    }
    
    public final void k(final boolean d) {
        this.d = d;
        if (d) {
            this.h();
        }
    }
}

import android.os.Looper;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class enq implements fmd
{
    public final oui a;
    public final klr b;
    public boolean c;
    private final fda d;
    private final oui e;
    private final ihp f;
    private final String g;
    
    public enq(final fda d, final oui a, final oui e, final ihp f, final Resources resources) {
        this.c = true;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.b = new klr(new eno(this));
        this.g = resources.getString(2131952173);
    }
    
    @Override
    public final oey a(final int n) {
        synchronized (this) {
            this.c = false;
            this.b.c();
            final fcp fcp = (fcp)this.e.get();
            final kjk n2 = fcp.n;
            final fct m = fcp.m;
            krc krc;
            if (!m.g.b()) {
                krc = m.e.e(m.d);
            }
            else {
                krc = bqx.h;
            }
            n2.c(krc);
            fcp.q = true;
            fcp.r = false;
            if (fcp.s) {
                final jbj v = fcp.v;
                final ZoomLockView a = v.a;
                final jbi h = new jbi(v);
                if (a.h == null) {
                    a.h = h;
                }
                final ZoomLockView a2 = v.a;
                if (a2.getVisibility() == 8) {
                    a2.c.start();
                }
            }
            this.d.d();
            final enm enm = (enm)this.a.get();
            enm.V.aR(true);
            final jjb j = enm.j;
            if (j != null) {
                j.i(true);
                enm.j.g();
            }
            final dgn k = enm.k;
            if (k != null) {
                k.d();
            }
            if (enm.x.g()) {
                ((bvb)enm.x.c()).m();
            }
            enm.y.g().e();
            final gjj w = enm.W;
            if (w.C()) {
                w.g();
            }
            enm.s.l(false);
            enm.l.d(false);
            enm.A.b();
            enm.ad.k(efo.d);
            final enm enm2 = (enm)this.a.get();
            if (enm2.F != null) {
                enm2.I.f();
                enm2.K(true);
            }
            ((enm)this.a.get()).B.a();
            return ofi.n(true);
        }
    }
    
    @Override
    public final oey b(final int n) {
        synchronized (this) {
            this.d.c();
            ((fcp)this.e.get()).a();
            this.f.h(this.g);
            kpo.d(Looper.getMainLooper()).post((Runnable)new enp(this));
            ((enm)this.a.get()).B.b();
            return ofi.n(true);
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            if (!this.c) {
                this.b(4);
            }
        }
    }
}

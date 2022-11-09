import com.google.android.apps.camera.bottombar.BottomBarListener;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpc extends bqw implements ceh
{
    public final cbh b;
    public final BottomBarController c;
    public final cde d;
    public final Object e;
    private final bqm f;
    private final Resources g;
    private final ckq h;
    private final pii i;
    private final BottomBarListener j;
    private final niz k;
    private final cph l;
    private final cxl m;
    private final boolean n;
    private final kkz o;
    
    public fpc(final bqm f, final cbh b, final Resources g, final BottomBarController c, final pii pii, final ckq h, final pii i, final niz k, final cxl m, final kkz o, final boolean n) {
        this.e = new Object();
        this.f = f;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = (cde)pii.get();
        this.h = h;
        this.i = i;
        this.j = new fpa(this);
        this.k = k;
        this.l = new fpb(this);
        this.m = m;
        this.o = o;
        this.n = n;
    }
    
    @Override
    public final void bq(final boolean b) {
        synchronized (this.e) {
            this.b.j(b);
        }
    }
    
    @Override
    public final void br() {
        synchronized (this.e) {
            this.d.c(this.f.g(), jbm.f);
            this.b.b();
        }
    }
    
    public final void bs() {
        synchronized (this.e) {
            this.d.e();
            monitorexit(this.e);
            if (this.n) {
                this.o.aR(kmt.h);
            }
        }
    }
    
    public final void bt() {
        synchronized (this.e) {
            monitorexit(this.e);
        }
    }
    
    @Override
    public final String c() {
        return this.g.getString(2131952779);
    }
    
    @Override
    public final void close() {
        synchronized (this.e) {
            this.b.m();
        }
    }
    
    @Override
    public final void d() {
        this.d.j(true);
    }
    
    @Override
    public final void f(final int n) {
        synchronized (this.e) {
            this.b.e(n);
        }
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
    }
    
    @Override
    public final void k(final boolean b) {
        this.b.g(b);
    }
    
    public final void m() {
        synchronized (this.e) {
            this.c.addListener(this.j);
            this.d.h();
            this.b.l(true);
            this.b.a(this);
            if (this.k.g()) {
                ((cpf)this.k.c()).a(this.l);
            }
        }
    }
    
    public final void o() {
        synchronized (this.e) {
            this.d.i();
            this.b.m();
            this.b.k(this);
            this.c.removeListener(this.j);
            if (this.k.g()) {
                ((cpf)this.k.c()).e(this.l);
            }
        }
    }
    
    @Override
    public final boolean q() {
        synchronized (this.e) {
            return this.b.n();
        }
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    public final void u(final int n) {
        final Object e = this.e;
        monitorenter(e);
        try {
            kmt kmt = kmt.g;
            final boolean k = this.m.k(cwv.H);
            Label_0065: {
                if (n == 0) {
                    if (k) {
                        kmt = kmt.h;
                        break Label_0065;
                    }
                }
                else {
                    if (n != 1) {
                        break Label_0065;
                    }
                    if (!k) {
                        kmt = kmt.h;
                        break Label_0065;
                    }
                }
                kmt = kmt.g;
            }
            final ckp a = this.h.a(jbm.f);
            a.aQ();
            if (kmt != a.aQ()) {
                a.aR(kmt);
                ((iyc)this.i).a().e.n(jbm.f, new foz(this));
            }
            monitorexit(e);
        }
        finally {
            monitorexit(e);
            while (true) {}
        }
    }
}

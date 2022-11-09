import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpz extends bqw implements ceh
{
    public static final nsd b;
    public final cbh c;
    public final cde d;
    public final cfs e;
    public final Object f;
    public final bqm g;
    public niz h;
    public boolean i;
    public cfo j;
    private final Resources k;
    private final BottomBarController l;
    private final cjj m;
    private final BottomBarListener n;
    private final Executor o;
    
    static {
        b = nsd.g("com/google/android/apps/camera/modules/videointent/VideoIntentModule");
    }
    
    public fpz(final bqm g, final cbh c, final Resources k, final BottomBarController l, final pii pii, final cfs e, final Executor o, final cjj m) {
        this.f = new Object();
        this.h = nii.a;
        this.i = false;
        this.g = g;
        this.c = c;
        this.k = k;
        this.l = l;
        this.d = (cde)pii.get();
        this.m = m;
        this.n = new fpy(this);
        this.e = e;
        this.o = o;
    }
    
    @Override
    public final void br() {
        synchronized (this.f) {
            this.d.c(this.g.g(), jbm.i);
            this.c.b();
        }
    }
    
    public final void bs() {
        synchronized (this.f) {
            this.d.e();
        }
    }
    
    public final void bt() {
        synchronized (this.f) {
            monitorexit(this.f);
        }
    }
    
    @Override
    public final String c() {
        return this.k.getString(2131952779);
    }
    
    @Override
    public final void close() {
        this.o.execute(new fpw(this, 1));
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
        synchronized (this.f) {
            final cbh c = this.c;
            synchronized (c.v) {
                final cce q = c.q;
                monitorexit(c.v);
                this.j = q.v;
            }
        }
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j(final cgs cgs) {
        synchronized (this.f) {
            if (cgs.a.isEmpty()) {
                mcn.n().execute(new fpw(this));
            }
            else {
                final cgi cgi = cgs.a.get(0);
                final cfo j = this.j;
                if (j == null) {
                    fpz.b.b().E(1764).o("Session config is null.");
                    return;
                }
                final niz i = j.j;
                this.h = i;
                if (!i.g()) {
                    final niz k = niz.i(((hia)cgi.a.c().c()).a.b());
                    this.h = k;
                    ((Uri)k.c()).getPath();
                    this.m.c(cgi);
                }
                final cde d = this.d;
                final Bitmap c = cgs.c;
                c.getClass();
                d.i.b(c);
                this.d.j(true);
            }
        }
    }
    
    @Override
    public final void k(final boolean b) {
        this.d.o();
        synchronized (this.f) {
            if (this.d.o() == 4) {
                njo.p(this.h.g(), "URI not set.");
                final Intent intent = new Intent();
                intent.setData((Uri)this.h.c());
                intent.addFlags(1);
                this.i = true;
                this.g.n(intent);
            }
            else {
                this.c.g(b);
            }
        }
    }
    
    public final void m() {
        synchronized (this.f) {
            this.l.addListener(this.n);
            this.d.h();
            this.c.l(this.d.o() != 4);
            this.c.a(this);
        }
    }
    
    public final void o() {
        synchronized (this.f) {
            this.d.i();
            this.c.m();
            this.c.k(this);
            this.l.removeListener(this.n);
        }
    }
    
    @Override
    public final boolean q() {
        if (this.d.o() == 4) {
            this.v();
            return true;
        }
        return this.c.n();
    }
    
    public final void u() {
        if (this.h.g()) {
            this.o.execute(new fpx(this, (Uri)this.h.c()));
        }
    }
    
    public final void v() {
        this.u();
        this.d.i.a();
        mcn.n().execute(new cda(this.d, 2));
        this.c.o(2);
    }
}

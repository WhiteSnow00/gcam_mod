import android.graphics.PointF;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bju implements bkv, kri
{
    public final bke a;
    public jck b;
    public jck c;
    final bmk d;
    public ofn e;
    public boolean f;
    public boolean g;
    public final fwx h;
    public final jda i;
    private final kjm j;
    private final kjk k;
    private final crg l;
    private final cxl m;
    private final niz n;
    private final klj o;
    private krc p;
    private int q;
    private final kjf r;
    private final gkn s;
    
    public bju(final kjm j, final bke a, final crg l, final cxl m, final gkn s, final niz n, final klj o, final klj klj, final lfg lfg, final byte[] array) {
        final kjk k = new kjk();
        this.k = k;
        this.b = null;
        this.c = null;
        this.d = new bmk();
        this.f = true;
        this.r = new bjt(this);
        this.j = j;
        this.a = a;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.h = new fwx(lfg.f());
        this.i = new jda(2);
        this.p = new kqz();
        this.g = false;
        this.s = s;
        k.c(klj.a(this, j));
        this.q = 0;
    }
    
    private final boolean f(final gzr gzr) {
        synchronized (this) {
            if (gzr.b()) {
                if (++this.q > 17) {
                    return true;
                }
            }
            else {
                this.q = 0;
            }
            return false;
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            this.f = true;
            this.s.b();
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            this.f = false;
            this.s.b();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.f = false;
            this.p.close();
            monitorexit(this);
            this.k.close();
        }
    }
    
    public final void d(final fwl fwl) {
        synchronized (this) {
            if (!this.f) {
                return;
            }
            final fwj b = fwl.b;
            if (!this.n.g()) {
                final boolean b2 = this.d.b(b.b);
                if (fwl.b.e.g()) {
                    final PointF a = ((fwi)fwl.b.e.c()).a;
                    boolean b3;
                    if (this.l.e() == lfu.a) {
                        final cxl m = this.m;
                        final cxm a2 = cxk.a;
                        m.e();
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    if (fwl.a.b != gzr.b && fwl.b.b == gzr.b && this.e == null) {
                        final jck b4 = this.b;
                        if (b4 != null) {
                            b4.c();
                        }
                        final jck c = this.c;
                        if (c != null) {
                            c.c();
                        }
                        if (!b3) {
                            this.b = this.a.e(niz.i(a), (int)(fwl.b.f * (float)this.o.aQ()));
                        }
                        else {
                            this.b = this.a.e(nii.a, 0);
                        }
                        this.b.b(new bjq(this));
                        if (this.b != null) {
                            this.e = ofn.f();
                            knf.g(this.b.a(), this.e, this.r, this.j);
                        }
                    }
                    if (!b2) {
                        if (this.e != null && !b3) {
                            this.a.m(a, (float)(int)(fwl.b.f * (float)this.o.aQ()));
                        }
                    }
                    else {
                        final ofn e = this.e;
                        if (e != null) {
                            e.o(true);
                        }
                    }
                }
                return;
            }
            if (this.l.e() != lfu.a) {
                int f;
                if (b.e.g() && ((fwi)b.e.c()).b) {
                    f = (int)(b.f * (float)this.o.aQ());
                }
                else {
                    f = b.f;
                }
                final float n = (float)f;
                this.i.a(n);
                final boolean f2 = this.f(b.b);
                if (b.e.g() && !f2) {
                    if (this.g) {
                        return;
                    }
                    final fwi fwi = (fwi)b.e.c();
                    final boolean b5 = fwi.b;
                    if (b.b == gzr.b || b5) {
                        if (!this.e(niz.i(fwi.a), f)) {
                            return;
                        }
                        this.g = true;
                        if (fwi.b) {
                            this.i.b();
                            this.i.a(n);
                            final klj b6 = ((igo)this.n.c()).b(this.h.a(fwi.a));
                            this.p.close();
                            this.p = b6.a(new bjr(this), kjm.a);
                        }
                    }
                    return;
                }
                else {
                    if (!this.g) {
                        return;
                    }
                    this.p.close();
                    ((igo)this.n.c()).h();
                    synchronized (this) {
                        if (!this.g) {
                            monitorexit(this);
                        }
                        else {
                            monitorexit(this);
                            final jck b7 = this.b;
                            if (b7 != null) {
                                b7.c();
                            }
                            if (this.c == null) {
                                (this.c = this.a.d()).b(new bjq(this, 1));
                            }
                        }
                        this.g = false;
                        this.i.b();
                        return;
                    }
                }
            }
            final cxl i = this.m;
            final cxm a3 = cxk.a;
            i.e();
        }
    }
    
    public final boolean e(final niz niz, final int n) {
        if (this.c == null) {
            this.a.k(niz, n);
            return true;
        }
        return false;
    }
}

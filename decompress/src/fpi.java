import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpi extends bqw
{
    private static final nsd m;
    public final Object b;
    public final pii c;
    public final pii d;
    public final pii e;
    public final kjm f;
    public final ijx g;
    public final niz h;
    public final pii i;
    public final cfm j;
    public final jjb k;
    public jbm l;
    private final kjk n;
    private bqw o;
    
    static {
        m = nsd.g("com/google/android/apps/camera/modules/video/OneVideoModule");
    }
    
    public fpi(final pii c, final pii d, final pii e, final ijx g, final kjm f, final niz h, final pii i, final clu clu, final cfm j, final klv klv, final jjb k) {
        this.b = new Object();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        final kjk n = new kjk();
        this.n = n;
        final jbm l = (jbm)klv.aQ();
        this.l = l;
        if (l.equals(jbm.c)) {
            this.o = (bqw)c.get();
        }
        else if (this.l.equals(jbm.n)) {
            this.o = (bqw)e.get();
        }
        else if (this.l.equals(jbm.f)) {
            this.o = (bqw)d.get();
        }
        else {
            a.k(fpi.m.c(), "Fall back to default mode since the initial mode is unsupported: %s", klv.aQ(), '\u06cb');
            this.o = (bqw)c.get();
        }
        if (h.g()) {
            n.c(((cor)h.c()).k(new fpf(this)));
        }
        n.c(clu.b(new fpe(this)));
    }
    
    @Override
    public final void bq(final boolean b) {
        synchronized (this.b) {
            this.o.bq(b);
        }
    }
    
    @Override
    public final void br() {
        synchronized (this.b) {
            this.o.br();
        }
    }
    
    public final void bs() {
        synchronized (this.b) {
            this.o.bv();
        }
    }
    
    public final void bt() {
        synchronized (this.b) {
            this.o.l();
        }
    }
    
    @Override
    public final void bu(final asx asx) {
        synchronized (this.b) {
            this.o.bu(asx);
        }
    }
    
    @Override
    public final String c() {
        synchronized (this.b) {
            return this.o.c();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.b) {
            this.o.close();
            monitorexit(this.b);
            this.n.close();
        }
    }
    
    @Override
    public final void e(final Configuration configuration) {
        synchronized (this.b) {
            this.o.e(configuration);
        }
    }
    
    @Override
    public final void f(final int n) {
        synchronized (this.b) {
            this.o.f(n);
        }
    }
    
    public final void m() {
        synchronized (this.b) {
            this.o.n();
        }
    }
    
    public final void o() {
        synchronized (this.b) {
            this.o.p();
        }
    }
    
    @Override
    public final boolean q() {
        synchronized (this.b) {
            return this.o.q();
        }
    }
    
    @Override
    public final boolean s() {
        synchronized (this.b) {
            return this.o.s();
        }
    }
    
    public final void u(final bqw o, final jbm l) {
        synchronized (this.b) {
            this.bv();
            this.p();
            this.o = o;
            this.l = l;
            this.br();
            this.n();
            this.l();
        }
    }
}

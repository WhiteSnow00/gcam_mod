import android.content.pm.ResolveInfo;

// 
// Decompiled by Procyon v0.6.0
// 

class hqx implements hqt
{
    final /* synthetic */ hrc b;
    
    public hqx(final hrc b) {
        this.b = b;
    }
    
    private final void t() {
        this.b.p.c();
        this.b.p.a();
    }
    
    private final void u(final long n) {
        final hrc b = this.b;
        b.o.removeCallbacks(b.q);
        final hrc b2 = this.b;
        b2.o.postDelayed(b2.q, n);
    }
    
    @Override
    public void a() {
        this.b.q(false, true);
    }
    
    @Override
    public void b(final bqr bqr, final boolean b) {
        this.q(bqr, b);
    }
    
    @Override
    public final void bw() {
        this.r();
        this.t();
    }
    
    @Override
    public void d(final bqr bqr, final boolean b) {
        this.q(bqr, b);
    }
    
    @Override
    public final void f() {
        final hrc b = this.b;
        final hsw s = b.s;
        final hqo n = b.n;
        final bqr b2 = b.m.b();
        b2.getClass();
        s.b(n.a(b2));
        ofi.w(this.b.s.a(), new hqw(this), mcn.n());
        this.b.r.b();
    }
    
    @Override
    public final void g() {
        final hrc b = this.b;
        b.o.removeCallbacks(b.q);
    }
    
    @Override
    public void j() {
    }
    
    @Override
    public final void p(final long n) {
        this.u(n);
        this.t();
    }
    
    public final void q(final bqr bqr, final boolean b) {
        this.b.r(bqr);
        final hqs p2 = this.b.p;
        int n;
        if (!b) {
            n = 3;
        }
        else {
            n = 2;
        }
        p2.e(n);
    }
    
    public final void r() {
        this.u(this.b.j.getInteger(2131492980));
    }
}

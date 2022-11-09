// 
// Decompiled by Procyon v0.6.0
// 

class clz extends clv
{
    final /* synthetic */ cma b;
    
    public clz(final cma b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        if (this.b.f.d() == this.b.g.b(clp.d)) {
            this.b.f.p(false);
        }
    }
    
    @Override
    public void b() {
        final cma b = this.b;
        if (!b.l) {
            return;
        }
        b.f.g();
        if (this.b.f.d() == this.b.g.b(clp.d)) {
            final jjb f = this.b.f;
            f.B(f.a(false, jbm.c));
        }
    }
    
    @Override
    public void d() {
        if (this.b.f.d() == this.b.g.b(clp.d)) {
            this.b.f.p(false);
        }
    }
    
    @Override
    public final void f() {
        this.b.f.g();
        this.b.f.w(jiq.a);
        final float b = this.b.g.b(clp.d);
        if (this.b.f.d() < b) {
            this.b.f.B(b);
            this.b.f.r(b);
        }
        final cma b2 = this.b;
        b2.f.t(b2.g.b(clp.d));
        if (this.b.j.g()) {
            ((cpu)this.b.j.c()).l();
            this.b.m.a(ihn.b);
        }
    }
    
    @Override
    public final void g() {
        this.b.m.a(ihn.a);
        this.b.f.q();
        this.b.f.o();
        if (this.b.j.g()) {
            ((cpu)this.b.j.c()).b();
        }
    }
}

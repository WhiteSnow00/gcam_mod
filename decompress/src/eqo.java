// 
// Decompiled by Procyon v0.6.0
// 

final class eqo extends fvs
{
    final /* synthetic */ equ a;
    
    public eqo(final equ a) {
        this.a = a;
    }
    
    @Override
    public final void A() {
        this.a.v.a();
        this.a.G.d();
        this.a.d.g().n();
        if (this.a.F.a().aQ()) {
            this.a.x.q();
        }
        this.a.x.r();
    }
    
    @Override
    public final void B() {
        this.a.e.execute(new eqn(this));
    }
    
    @Override
    public final void D(final float n) {
        this.F(n, -1L);
    }
    
    @Override
    public final void F(final float n, final long n2) {
        if (this.a.F.a().aQ()) {
            this.a.G.e(n);
            this.a.x.E((int)(100.0f * n), n2, false);
            if (n == 1.0f) {
                this.a.H.a(n2);
                this.a.x.q();
            }
        }
        else {
            this.a.v.f((int)(100.0f * n));
            if (n == 0.0f) {
                this.a.d.g().m();
            }
            else if (n == 1.0f) {
                this.a.d.g().n();
            }
        }
        if (n == 1.0f) {
            this.a.h.b(2131886084);
        }
    }
}

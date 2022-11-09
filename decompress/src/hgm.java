// 
// Decompiled by Procyon v0.6.0
// 

public final class hgm extends hfx
{
    public niz c;
    private final kse d;
    
    public hgm(final hfk hfk, final gxa gxa, final kse d, final hio hio, final String s, final btl btl, final hie hie, final niz niz) {
        super(hfk.a(hio, s, btl, hie, gxa, niz));
        this.c = nii.a;
        this.d = d;
    }
    
    @Override
    public final void B() {
        if (!this.t().b() && !this.t().a()) {
            this.H("finish");
            this.t().f(2, 3);
            this.x().g();
            return;
        }
        this.I("finish. Ignoring as session was already finished.");
    }
    
    @Override
    public final void P(final kre kre) {
        this.d.f("MultiImageCaptureSession#startEmpty");
        super.P(kre);
        this.t().f(1, 2);
        this.J(this.v().b(kre, this.h()));
        final hfu o = this.o();
        final eyz a = eza.a();
        a.a = this.i();
        o.c(a.a());
        this.d.g();
    }
}

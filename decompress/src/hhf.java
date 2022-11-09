import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhf extends hfx
{
    private final gha c;
    private final klj d;
    private final kse e;
    
    public hhf(final hfk hfk, final kse e, final klj d, final gha c, final gxa gxa, final String s, final btl btl, final hie hie) {
        super(hfk.a(hio.b, s, btl, hie, gxa, nii.a));
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void P(final kre kre) {
        super.P(kre);
        this.t().f(1, 2);
        this.e.h("RewindCaptureSession#insertEmptyPlaceholder");
        this.J(this.v().b(kre, this.h()));
        this.e.g();
        final hfu o = this.o();
        final eyz a = eza.a();
        a.a = this.i();
        a.c = (Float)this.d.aQ();
        o.c(a.a());
    }
    
    @Override
    public final oey r(final byte[] array, final hwr hwr) {
        array.getClass();
        this.H("saveAndFinish");
        if (this.t().a()) {
            this.I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return ofi.n(this.h());
        }
        this.t().d(2, 3);
        hwr.d = this.e().b();
        hwr.e = false;
        hwr.f = (ggz)this.c.aQ();
        this.t().e(3);
        final niz z = this.z(hwr);
        ofi.w(this.E(), new hhe(this), odx.a);
        this.F().execute(new hhd(this, array, z, hwr));
        return this.p();
    }
}

import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgb extends hfx
{
    public hgb(final hfk hfk, final String s, final btl btl, final hie hie) {
        super(hfk.a(hio.l, s, btl, hie, null, nii.a));
    }
    
    @Override
    public final void P(final kre kre) {
        synchronized (this) {
            super.P(kre);
            this.t().f(1, 2);
            this.J(this.v().b(kre, this.h()));
            super.b.G(this.h());
            final hfu o = this.o();
            final eyz a = eza.a();
            a.a = this.i();
            o.c(a.a());
        }
    }
    
    @Override
    public final oey r(final byte[] array, final hwr hwr) {
        synchronized (this) {
            this.H("saveAndFinish");
            if (this.t().a()) {
                this.I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
                return this.p();
            }
            this.t().d(2, 3);
            hwr.d = this.e().b();
            this.t().e(3);
            final ExifInterface exifInterface = (ExifInterface)hwr.c.f();
            if (exifInterface != null) {
                this.k().o(exifInterface);
            }
            this.F().execute(new hga(this, array, this.f()));
            return this.p();
        }
    }
}

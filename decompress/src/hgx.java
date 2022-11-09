import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgx extends hfx
{
    public static final nsd c;
    public final hij d;
    public final ReentrantLock e;
    
    static {
        c = nsd.g("com/google/android/apps/camera/session/PhotosphereCaptureSession");
    }
    
    public hgx(final hfk hfk, final gxa gxa, final hij d, final String s, final btl btl, final hie hie) {
        super(hfk.a(hio.g, s, btl, hie, gxa, nii.a));
        this.e = new ReentrantLock();
        this.d = d;
    }
    
    @Override
    public final void B() {
        this.H("finish");
        if (this.t().c()) {
            this.t().f(2, 3);
            this.F().execute(new hgv(this, 1));
            return;
        }
        throw new IllegalStateException("Cannot call finish without calling startSession first.");
    }
    
    public final void K() {
        this.H("updatePreview");
        if (!this.t().c()) {
            this.I("Ignoring updatePreview. CaptureSession is not started.");
            return;
        }
        this.F().execute(new hgv(this));
    }
    
    @Override
    public final void P(final kre kre) {
        super.P(kre);
        this.t().f(1, 2);
        this.J(this.v().b(kre, this.h()));
        super.b.G(this.h());
        final hfu o = this.o();
        final eyz a = eza.a();
        a.a = this.i();
        o.c(a.a());
    }
    
    @Override
    public final oey r(final byte[] array, final hwr hwr) {
        array.getClass();
        final llk a = hwr.a;
        ExifInterface a2 = (ExifInterface)hwr.c.f();
        this.H("saveAndFinish");
        if (this.t().a()) {
            this.I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return this.p();
        }
        this.t().d(2, 3);
        hwr.d = this.e().b();
        this.t().e(3);
        if (this.e().b().g() && a == llk.c && a2 != null) {
            final kvj kvj = new kvj(a2);
            kvj.d((Location)this.e().b().c());
            a2 = kvj.a;
        }
        if (a2 != null) {
            super.b.k.a(a2);
            this.k().o(a2);
        }
        this.F().execute(new hgw(this, array, niz.h(a2), hwr));
        return this.p();
    }
}

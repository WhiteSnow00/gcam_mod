import java.io.FileOutputStream;
import com.google.googlex.gcam.DebugParams;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgk extends hfx
{
    public final dyy c;
    public final niz d;
    public niz e;
    private final kse f;
    private final klj g;
    
    public hgk(final hfk hfk, final kse f, final dyy c, final klj g, final gxa gxa, final String s, final btl btl, final hie hie, final niz niz) {
        super(hfk.a(hio.m, s, btl, hie, gxa, niz));
        this.d = nii.a;
        this.e = nii.a;
        this.c = c;
        this.g = g;
        this.f = f;
    }
    
    public final void K(final niz niz, byte[] byteArray, final niz niz2) {
        final hia f = this.f();
        if (niz.g()) {
            final FileOutputStream e = f.a.e();
            try {
                final OutputStream m = ((ExifInterface)niz.c()).m(e);
                try {
                    apf apf;
                    if ((apf = lmx.n(byteArray)) == null) {
                        apf = lmx.a();
                    }
                    lmx.k(apf, drk.f.c());
                    lmx.i(apf, lmr.a);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    lmx.p(byteArray, byteArrayOutputStream, apf, (apf)lmx.c(((ExifInterface)niz.c()).by).f());
                    byteArray = byteArrayOutputStream.toByteArray();
                    m.write(byteArray);
                    if (niz2.g()) {
                        if (this.m().g()) {
                            dyz.a((byte[])niz2.c(), ((DebugParams)this.m().c()).a().a());
                        }
                        final byte[] array = (byte[])niz2.c();
                        m.write((byte[])niz2.c());
                    }
                    this.k().m(byteArray.length);
                    m.close();
                    e.close();
                }
                finally {
                    try {
                        m.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)niz).addSuppressed(t);
                    }
                }
            }
            finally {
                try {
                    e.close();
                }
                finally {
                    final Throwable t2;
                    ((Throwable)niz).addSuppressed(t2);
                }
            }
        }
        this.k().m(lpy.f(byteArray, f.a));
        f.c();
    }
    
    @Override
    public final void P(final kre kre) {
        this.f.f("LongExposureCaptureSession#startEmpty");
        super.P(kre);
        this.t().f(1, 2);
        this.f.h("LongExposureCaptureSession#insertEmptyPlaceholder");
        this.J(this.v().b(kre, this.h()));
        this.f.g();
        final hfu o = this.o();
        final eyz a = eza.a();
        a.a = this.i();
        a.c = (Float)this.g.aQ();
        o.c(a.a());
    }
    
    @Override
    public final oey r(final byte[] array, final hwr hwr) {
        array.getClass();
        this.H("saveAndFinish");
        if (this.t().a()) {
            this.I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return this.p();
        }
        this.t().d(2, 3);
        hwr.d = this.e().b();
        hwr.e = false;
        hwr.f = ggz.a;
        this.t().e(3);
        this.F().execute(new hgi(this, array, this.z(hwr), hwr));
        return this.p();
    }
}

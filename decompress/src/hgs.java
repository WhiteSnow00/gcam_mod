import java.util.concurrent.Executor;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgs extends hfx
{
    private static final nsd d;
    public niz c;
    private final dyy e;
    private final klj f;
    private final klj g;
    private final niz h;
    private final gha i;
    private final kse j;
    private final hbm k;
    private niz l;
    
    static {
        d = nsd.g("com/google/android/apps/camera/session/PhotoCaptureSession");
    }
    
    public hgs(final hfk hfk, final dyy e, final klj g, final gha i, final kse j, final gxa gxa, final String s, final btl btl, final hie hie, final niz l, final klj f, final niz niz, final niz h, final hio hio, final hbm k) {
        super(hfk.a(hio, s, btl, hie, gxa, niz));
        this.c = nii.a;
        this.e = e;
        this.l = l;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        final cxo a = cxr.a;
        this.j = j;
        this.k = k;
        super.b.v(new hgo(this));
    }
    
    public final InputStream K(final niz niz, final InputStream inputStream) {
        if (niz.g()) {
            return this.e.b(inputStream, (dyv)niz.c(), this.m());
        }
        return inputStream;
    }
    
    public final byte[] N(final byte[] array) {
        Object o = ((dev)((njd)this.h).a).a(this.h());
        if (((niz)o).g()) {
            while (true) {
                this.H("Writing depth data into the jpeg image");
                final deu deu = (deu)((niz)o).c();
                while (true) {
                    try {
                        try {
                            this.j.f("ddepth");
                            o = DynamicDepthUtils.d(array, deu.a, deu.b);
                            try {
                                this.k().p();
                                deu.a();
                                this.j.g();
                            }
                            catch (final Exception ex) {}
                        }
                        finally {}
                    }
                    catch (final Exception ex) {
                        o = null;
                    }
                    final Exception ex;
                    hgs.d.b().h(ex).E(2305).o("Error writing depth data into jpeg.");
                    continue;
                }
                if (o == null) {
                    hfx.a.b().E(2282).x("[%s] %s", this.h(), "Couldn't write depth data, using original stream");
                    break;
                }
                return (byte[])o;
                deu.a();
                this.j.g();
            }
        }
        return array;
    }
    
    @Override
    public final void P(final kre kre) {
        this.j.f("PhotoCaptureSession#startEmpty");
        super.P(kre);
        this.t().f(1, 2);
        this.j.h("insertEmptyPlaceholder");
        this.J(this.v().b(kre, this.h()));
        this.j.g();
        oaf b;
        if (this.l.g()) {
            b = ((fer)this.l.c()).b();
            this.l = nii.a;
        }
        else {
            b = null;
        }
        final hfu o = this.o();
        final eyz a = eza.a();
        a.a = this.i();
        a.b = b;
        a.c = (Float)this.g.aQ();
        o.c(a.a());
        this.p().d(new aas(14), odx.a);
    }
    
    @Override
    public final oey r(final byte[] array, final hwr hwr) {
        this.H("saveAndFinish");
        if (this.t().a()) {
            this.I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return this.p();
        }
        this.t().d(2, 3);
        hwr.d = this.e().b();
        hwr.e = (boolean)this.f.aQ();
        hwr.f = (ggz)this.i.aQ();
        this.t().e(3);
        final niz o = super.b.o(hwr, this.k);
        final niz a = dyv.a(this.l());
        ofi.w(this.E(), new hgq(this), odx.a);
        this.F().execute(new hgp(this, hwr, o, array, a));
        return this.p();
    }
}

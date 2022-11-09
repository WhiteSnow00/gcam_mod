import android.hardware.camera2.CaptureRequest$Key;
import java.util.Set;
import android.hardware.camera2.CaptureRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnw
{
    public final kwd a;
    public final kzl b;
    private final kwz c;
    private final gdg d;
    private final glv e;
    private final kse f;
    private final gow g;
    private final gnu h;
    
    public gnw(final kwd a, final kzl b, final kwz c, final gdg d, final glv e, final kse f, final gow g, final gnu h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final gfg a(final int n) {
        final kwd a = this.a;
        final kwz c = this.c;
        final kzl b = this.b;
        final gdg d = this.d;
        final gnf gnf = new gnf();
        final glv e = this.e;
        final kww a2 = kwx.a();
        a2.c(1);
        a2.b(4);
        a2.e(4);
        a2.d(true);
        return new gfd(new goa(a, c, b, d, n, gnf, e, a2.a(), this.f), 3, false);
    }
    
    public final gfg b(final kvw kvw, final gfg gfg) {
        final gov a = this.g.a(1000000000L, kvw, nov.G(kvw.a()), 1);
        final gnv gnv = new gnv(gfg, kvw);
        final CaptureRequest$Key a2 = jlg.a;
        final Integer value = 1;
        final Integer value2 = 0;
        noi noi;
        if (a2 != null) {
            noi = noi.K(kxc.p(CaptureRequest.EDGE_MODE, value), kxc.p(CaptureRequest.NOISE_REDUCTION_MODE, value), kxc.p(CaptureRequest.FLASH_MODE, value2), kxc.p(jlg.a, value2));
        }
        else {
            noi = noi.J(kxc.p(CaptureRequest.EDGE_MODE, value), kxc.p(CaptureRequest.NOISE_REDUCTION_MODE, value), kxc.p(CaptureRequest.FLASH_MODE, value2));
        }
        return new gfd(new gql(a, gnv, noi, this.d, this.c.a(), this.f, this.h), 4, false);
    }
}

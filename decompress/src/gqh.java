import java.util.List;
import java.util.Set;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqh implements gfg
{
    private static final nsd a;
    private final kwd b;
    private final klj c;
    private final gue d;
    private final gqr e;
    private final kse f;
    private final fyr g;
    private final gnu h;
    private final kjk i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleHdrPlusImageCaptureCommand");
    }
    
    public gqh(final kwd b, final klj c, final gue d, final kse f, final gqr e, final fyr g, final gnu h, final kjk i) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final klj a() {
        return this.c;
    }
    
    @Override
    public final klj b() {
        return klq.g(fzu.e());
    }
    
    @Override
    public final void c(gff b, gen gen) {
        this.f.f("pckSingleHdr#acquiringFrame");
        final gud a = this.d.a();
        this.h.b(gen.b);
        final Throwable t = null;
        Object o = null;
        Label_0381: {
            while (true) {
                try {
                    final gun gun = new gun(noi.H(new gup(CaptureResult.SENSOR_TIMESTAMP, this.g.d() - 1000000000L)));
                    kvs kvs = this.d.e();
                    if (kvs != null) {
                        gen.b.D(true);
                    }
                    if (kvs == null || !gun.a(kvs)) {
                        if (kvs != null) {
                            kvs.close();
                        }
                        final kzl l = this.d.l();
                        gqh.a.c().E(1969).r("ZSL frame not available, submitting request to %s", l);
                        kvs = this.b.q(l);
                        kwp.j(kvs);
                    }
                    if (kvs.b() != null && kvs.g()) {
                        final nns m = nns.m(kvs);
                        gen.c.e().e();
                        this.f.h("pckSingleHdr#process");
                        this.e.g(m, b, gen);
                    }
                    else {
                        gen.c.f();
                        gen.b.w(new dgg((Throwable)null));
                    }
                    a.a();
                    return;
                }
                catch (final dgi dgi) {
                    gen.c.f();
                    b = (gff)gen.b;
                    if (this.i.a()) {
                        ((hhy)b).w(new dgg(dgi));
                        continue;
                    }
                    gen = (gen)new dgi(dgi);
                    ((hhy)b).C(iwx.a, (Throwable)gen);
                    continue;
                }
                catch (final RuntimeException ex) {}
                catch (final InterruptedException ex2) {}
                finally {
                    o = t;
                    break Label_0381;
                }
                break;
            }
            o = b;
            try {
                throw o;
            }
            finally {}
        }
        gen.c.f();
        final hhy b2 = gen.b;
        if (!this.i.a()) {
            dgi dgi2;
            if (o != null) {
                dgi2 = new dgi((Throwable)o);
            }
            else {
                dgi2 = new dgi("Image capture failed. Aborting capture!");
            }
            b2.C(iwx.a, dgi2);
        }
        else {
            b2.w(new dgg((Throwable)o));
        }
        a.a();
        throw b;
    }
}

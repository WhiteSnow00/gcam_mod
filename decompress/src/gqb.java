import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqb
{
    public static final nsd a;
    public final kwd b;
    public final gsh c;
    public final gue d;
    public final gry e;
    public final gqr f;
    public final dus g;
    public final kse h;
    public final gnu i;
    public final guo j;
    public final guk k;
    public final Executor l;
    private final dvj m;
    private final gpl n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckShastaZslController");
    }
    
    public gqb(final dvj m, final kwd b, final gsh c, final gpl n, final gry e, final gue d, final gqr f, final dus g, final kse h, final gnu i, final guo j, final guk k, final Executor l) {
        this.m = m;
        this.b = b;
        this.n = n;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final List a(dxh c, ljm kuw, grx grx, final kzl kzl, final kwh kwh) {
        this.h.f("ShastaZslController#getPslFrames");
        Object o = new ArrayList();
        Object j = null;
        Label_0356: {
            Label_0348: {
                try {
                    Object e = grx.e();
                    final grx grx2 = null;
                    grx = null;
                    Label_0145: {
                        if (e == null) {
                            grx = grx2;
                        }
                        else {
                            while (true) {
                                try {
                                    try {
                                        this.h.f("PckShastaZslController#buildBurstSpec");
                                        j = this.m.j(c, (lju)e, (ljm)kuw, true);
                                        ((krc)e).close();
                                        grx = (grx)this.h;
                                        ((kse)grx).g();
                                        grx = (grx)j;
                                    }
                                    finally {}
                                }
                                catch (final kuw kuw2) {
                                    gqb.a.b().E(1944).r("Unable to build payloadBurstSpec %s", kuw2);
                                    ((krc)e).close();
                                    grx = (grx)this.h;
                                    continue;
                                }
                                break;
                            }
                            break Label_0145;
                            ((krc)e).close();
                            this.h.g();
                        }
                    }
                    c = (dxh)o;
                    Label_0299: {
                        if (grx == null) {
                            break Label_0299;
                        }
                        if (((BurstSpec)grx).b().d()) {
                            break Label_0299;
                        }
                        this.h.f("buildRequest");
                        final kyh f = kwh.f();
                        f.c();
                        grx = (grx)((BurstSpec)grx).b();
                        final int n = (int)((FrameRequestVector)grx).a();
                        this.h.h("buildPayload");
                        final gpl n2 = this.n;
                        e = new gej();
                        final kyh a = kyh.a(f);
                        n2.c(a, (gel)e, kzl, n, 0, true);
                        final List b = n2.b(a, (FrameRequestVector)grx, (ljm)kuw, n);
                        this.h.h("submitRequests");
                        b.size();
                        c = (dxh)kwh.c(b);
                        try {
                            this.h.g();
                        }
                        catch (final kuw kuw) {
                            o = c;
                            break Label_0348;
                        }
                    }
                    kuw = (kuw)this.h;
                    break Label_0356;
                }
                catch (final kuw kuw3) {}
                finally {
                    this.h.g();
                }
            }
            kuw = (kuw)this.h;
            j = o;
        }
        ((kse)kuw).g();
        return (List)j;
    }
}

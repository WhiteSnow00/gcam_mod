import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnq implements gna
{
    private static final nsd b;
    public final het a;
    private final kjm c;
    private final gni d;
    private final boolean e;
    private int f;
    private final Object g;
    
    static {
        b = nsd.g("com/google/android/apps/camera/pixelcamerakit/aaa/illumination/SelfieFlashIlluminationController");
    }
    
    public gnq(final het a, final kjm c, final gni d, final cxl cxl) {
        this.g = new Object();
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = cxl.j(cxr.ac);
    }
    
    @Override
    public final gmz a(final kwh ex) {
        final gnp gnp = new gnp();
        try {
            synchronized (this.g) {
                final int f = this.f + 1;
                this.f = f;
                if (f == 1) {
                    final kvq a = ((kwh)ex).a();
                    ((lbf)a).c = 5;
                    int n;
                    if (!this.e) {
                        n = 0;
                    }
                    else {
                        n = 2;
                    }
                    ((lbf)a).e = n;
                    final oey b = ((kwh)ex).b(((lbf)a).e());
                    final ofn f2 = ofn.f();
                    this.c.execute(new gnm(this, f2));
                    ofi.k(b, f2).get();
                    final hes hes = f2.get();
                    final gni d = this.d;
                    final gin gin = new gin(hes.a);
                    final gnh gnh = new gnh(gin);
                    d.a.j(gnh);
                    try {
                        gin.a.d(new gng(d, gnh), odx.a);
                        ((Boolean)gin.a.get()).booleanValue();
                    }
                    catch (final ExecutionException ex2) {
                        throw new RuntimeException(ex2);
                    }
                }
            }
        }
        catch (final CancellationException ex) {}
        catch (final kuw ex) {}
        catch (final ExecutionException ex3) {}
        a.m(gnq.b.b(), "Couldn't turn on selfie flash", '\u0767', ex);
        return gnp;
    }
    
    @Override
    public final void b() {
        synchronized (this.g) {
            int f = this.f;
            if (f > 0) {
                --f;
                if ((this.f = f) == 0) {
                    this.c.execute(new gnl(this));
                }
            }
        }
    }
}

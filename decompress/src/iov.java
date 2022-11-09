import com.google.lens.sdk.LensApi;
import android.graphics.PointF;
import android.graphics.Bitmap;
import com.google.lens.sdk.LensApi$LensAvailabilityCallback;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iov
{
    public static final nsd a;
    public final Activity b;
    public final kjm c;
    public volatile ofn d;
    public volatile ofn e;
    public final hdo f;
    public oiv g;
    private final cxl h;
    private final njp i;
    private boolean j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/lens/LensUtil");
    }
    
    public iov(final Activity b, final kjm c, final Executor executor, final cxl h, final hdo f, final njp njp) {
        this.b = b;
        this.c = c;
        this.h = h;
        this.f = f;
        final njp f2 = nov.F(njp);
        this.i = f2;
        this.j = false;
        f2.getClass();
        executor.execute(new iok(f2));
    }
    
    public final oey a() {
        if (!this.h.k(cxr.ae)) {
            return ofi.n(false);
        }
        this.f();
        return this.d;
    }
    
    public final oey b() {
        final long currentTimeMillis = System.currentTimeMillis();
        final oiv g = this.g;
        Bitmap b;
        if (g == null) {
            b = null;
        }
        else {
            b = g.b;
        }
        if (b != null) {
            final PointF h = g.h;
            final lpw e = g.e;
            final Integer g2 = g.g;
            this.e();
            final oiu b2 = oiv.b();
            b2.e = 1;
            if (h != null) {
                b2.g = h;
            }
            if (e != null) {
                b2.d = e;
            }
            if (g2 != null) {
                b2.f = g2;
            }
            this.d().onResume();
            final ioh ioh = new ioh(this, b, b2, currentTimeMillis);
            final zn zn = new zn();
            final zq b3 = new zq(zn);
            zn.b = b3;
            zn.a = ioh.getClass();
            try {
                final iov a = ioh.a;
                a.d().checkPostCaptureAvailability(new ioo(a, ioh.b, ioh.c, ioh.d, zn));
                zn.a = "LensApi#checkPostCaptureAvailability for launchLensWithBitmap";
            }
            catch (final Exception ex) {
                b3.a(ex);
            }
            return b3;
        }
        return this.c(new ioq(this));
    }
    
    public final oey c(final Runnable runnable) {
        final ofn f = ofn.f();
        this.c.execute(new ioi(this, runnable, f));
        return f;
    }
    
    public final LensApi d() {
        return (LensApi)this.i.a();
    }
    
    public final void e() {
        this.g = null;
    }
    
    public final void f() {
        synchronized (this) {
            if (this.j) {
                return;
            }
            this.d = ofn.f();
            this.e = ofn.f();
            this.j = true;
            monitorexit(this);
            this.c.b(new ioq(this, 1));
        }
    }
}

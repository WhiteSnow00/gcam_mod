import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxr
{
    public static final nsd a;
    public final kjm b;
    public final bty c;
    public final Executor d;
    public final gha e;
    public final het f;
    public final DisplayMetrics g;
    public final CameraActivityTiming h;
    public final hwc i;
    public final fzj j;
    public final niz k;
    public final fex l;
    public final jbm m;
    public final crg n;
    public fxq o;
    public final lfw p;
    private final ktc q;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/capture/CaptureOneCameraCreator");
    }
    
    public fxr(final kjm b, final bty c, final het f, final Executor d, final gha e, final lfw p15, final DisplayMetrics g, final CameraActivityTiming h, final hwc i, final crg n, final ktc q, final fzj j, final niz k, final fex l, final jbm m) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.p = p15;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.q = q;
    }
    
    public final fmf a(final flq flq) {
        this.p.f(flq.a);
        return new fmf(flq, new fma(flq.a, flq.d.a));
    }
    
    public final oey b(final flq flq, final oey oey) {
        return this.c(this.a(flq), oey);
    }
    
    public final oey c(final fmf fmf, final oey oey) {
        this.q.d(fmf.a.a);
        return ofi.r(new fxk(this, fmf, oey), this.d);
    }
    
    public final void d() {
        this.d.execute(new fxn(this));
    }
    
    public final void e() {
        final fxq o = this.o;
        if (o == null) {
            return;
        }
        o.b.close();
        o.c.cancel(true);
        this.o = null;
    }
}

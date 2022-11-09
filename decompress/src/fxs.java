import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxs implements fxo
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    private final pii j;
    private final pii k;
    
    public fxs(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        k.getClass();
        this.k = k;
    }
    
    @Override
    public final fxr a(final fzj fzj, final niz niz, final fex fex, final jbm jbm) {
        final kjm kjm = (kjm)this.a.get();
        kjm.getClass();
        final bty bty = (bty)this.b.get();
        bty.getClass();
        final het het = (het)this.c.get();
        het.getClass();
        final Executor executor = (Executor)this.d.get();
        executor.getClass();
        final gha gha = (gha)this.e.get();
        gha.getClass();
        final lfw lfw = (lfw)this.f.get();
        lfw.getClass();
        final DisplayMetrics displayMetrics = (DisplayMetrics)this.g.get();
        displayMetrics.getClass();
        final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming)this.h.get();
        cameraActivityTiming.getClass();
        final hwc hwc = (hwc)this.i.get();
        hwc.getClass();
        final crg crg = (crg)this.j.get();
        crg.getClass();
        final ktc ktc = (ktc)this.k.get();
        ktc.getClass();
        jbm.getClass();
        return new fxr(kjm, bty, het, executor, gha, lfw, displayMetrics, cameraActivityTiming, hwc, crg, ktc, fzj, niz, fex, jbm);
    }
}

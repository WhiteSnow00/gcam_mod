import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvi implements krc
{
    public static final nsd a;
    public final kkz b;
    public final klv c;
    public final bwc d;
    public final bwg e;
    public final pii f;
    public final Executor g;
    public final kwd h;
    public final klj i;
    public final ohv j;
    public final bwh k;
    public final oui l;
    public final kwz m;
    public final kse n;
    public BaseCurator o;
    public kvw p;
    public krc q;
    public boolean r;
    
    static {
        a = nsd.g("com/google/android/apps/camera/autotimer/AutoTimerAnalysis");
    }
    
    public bvi(final kkz b, final klv c, final bwc d, final bwg e, final pii f, final Executor executor, final kwd h, final klj i, final ohv j, final bwh k, final oui l, final kse n, final kwz m) {
        this.o = null;
        this.p = null;
        this.r = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = ofi.e(executor);
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final void close() {
        this.g.execute(new bvg(this, 1));
    }
}

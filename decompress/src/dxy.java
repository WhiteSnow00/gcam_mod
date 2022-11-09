import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxy
{
    public static final nsd a;
    public final jdi b;
    public final eya c;
    public final gae d;
    public final Executor e;
    public final fxu f;
    public final hdz g;
    public final dyy h;
    public final cxl i;
    public final hdi j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/burst/BurstUtils");
    }
    
    public dxy(final jdi b, final eya c, final fxu f, final hdi j, final hdz g, final dyy h, final cxl i) {
        this.b = b;
        this.c = c;
        this.f = f;
        this.j = j;
        this.h = h;
        this.i = i;
        this.d = new gae(1);
        this.e = new kjs(mcn.h("BurstEnc"));
        this.g = g;
    }
}

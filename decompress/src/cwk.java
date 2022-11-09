// 
// Decompiled by Procyon v0.6.0
// 

public final class cwk
{
    public static final float a;
    public static final float b;
    private static final float g;
    private static final float h;
    public final float c;
    public final float d;
    public niz e;
    public niz f;
    private final long i;
    
    static {
        a = (float)Math.toRadians(15.0);
        b = (float)Math.toRadians(15.0);
        g = (float)Math.toRadians(15.0);
        h = (float)Math.toRadians(15.0);
        Math.toRadians(20.0);
        Math.toRadians(20.0);
    }
    
    public cwk(final cxl cxl) {
        this.e = nii.a;
        this.f = nii.a;
        if (cxl.k(cww.k)) {
            cxl.d();
        }
        njo.p(true, "camera.coach.fast_up_down and camera.coach.instant_up_down should not be enabled at the same time.");
        if (cxl.k(cww.k)) {
            this.i = 1000L;
            this.c = cwk.g;
            this.d = cwk.h;
            return;
        }
        cxl.d();
        this.i = 4000L;
        this.c = cwk.g;
        this.d = cwk.h;
    }
    
    final void a(final float n, final float n2, final long n3) {
        synchronized (this) {
            this.e = niz.i(new cwj(n, n2));
            if (!this.f.g()) {
                this.f = niz.i(new cws(new cwi(this), new cwi(this, 1), this.i));
            }
            ((cws)this.f.c()).b(n3);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.e = nii.a;
            this.f = nii.a;
        }
    }
}

import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvf implements hub
{
    public static final nsd a;
    public final pii b;
    public final cxl c;
    public final kse d;
    public final niz e;
    public final niz f;
    private final oey g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/HdrPlusPrewarmBehavior");
    }
    
    public dvf(final pii b, final cxl c, final kse d, final niz e, final niz f, final oey g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        knf.f(this.g, new dve(this), odx.a);
    }
}

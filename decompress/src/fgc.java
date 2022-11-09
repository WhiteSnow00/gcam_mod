import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgc implements lum
{
    public static final nsd a;
    public final String b;
    public final cxl c;
    private final lum d;
    private final AtomicInteger e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/LoggingMuxer");
    }
    
    public fgc(final String b, final cxl c, final lum d) {
        this.e = new AtomicInteger(0);
        this.b = b;
        this.d = d;
        this.c = c;
        final oey b2 = d.b();
        b2.d(new ffz(b2, b), odx.a);
    }
    
    @Override
    public final lup a() {
        return new fgb(this, this.d.a(), this.e.getAndIncrement());
    }
    
    @Override
    public final oey b() {
        return this.d.b();
    }
    
    @Override
    public final void c() {
        fgc.a.c().E(1646).r("%s: muxer cancelled.", this.b);
        this.d.c();
    }
    
    @Override
    public final void d() {
        fgc.a.c().E(1650).r("%s: starting.", this.b);
        this.d.d();
    }
}

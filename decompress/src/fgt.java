// 
// Decompiled by Procyon v0.6.0
// 

public final class fgt implements lum
{
    public static final nsd a;
    public final fgs b;
    private final lum c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/StatsCollectorMuxer");
    }
    
    public fgt(final fgs b, final lum c) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final lup a() {
        return new fgr(this, ofn.f(), this.c.a());
    }
    
    @Override
    public final oey b() {
        return this.c.b();
    }
    
    @Override
    public final void c() {
        this.c.c();
    }
    
    @Override
    public final void d() {
        this.c.d();
    }
}

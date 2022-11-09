// 
// Decompiled by Procyon v0.6.0
// 

public enum cke
{
    a("FPS_30", 0, 20000001L, 33333333L, 1.0f), 
    b("FPS_60", 1, 0L, 20000000L, 1.5f);
    
    public final float c;
    private final long e;
    private final long f;
    
    private cke(final String s, final int n, final long e, final long f, final float c) {
        this.e = e;
        this.f = f;
        this.c = c;
    }
    
    public final boolean a(final long n) {
        return n >= this.e && n <= this.f;
    }
}

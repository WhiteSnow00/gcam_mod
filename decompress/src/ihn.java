// 
// Decompiled by Procyon v0.6.0
// 

public enum ihn
{
    a("HIDDEN", 0, 0.0f, 255, 255, 255), 
    b("IDLE", 1, 0.16f, 255, 255, 255), 
    c("ACTIVE", 2, 0.72f, 255, 255, 255), 
    d("WARNING", 3, 0.86f, 217, 48, 37);
    
    public final int e;
    public final int f;
    public final int g;
    private final float i;
    
    private ihn(final String s, final int n, final float i, final int e, final int f, final int g) {
        this.i = i;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    final int a() {
        return (int)(this.i * 255.0f);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public enum kmu
{
    a("MPEG_4", 0, 2, 0, llk.e), 
    b("WEBM", 1, 9, 1, llk.g), 
    c("THREE_GPP", 2, 1, 2, llk.f);
    
    public final int d;
    public final int e;
    public final llk f;
    
    private kmu(final String s, final int n, final int d, final int e, final llk f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static boolean a(final kno kno) {
        final int e = kno.e;
        return e == 2 || e == 1;
    }
}

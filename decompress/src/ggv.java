// 
// Decompiled by Procyon v0.6.0
// 

public enum ggv
{
    a("AUTO", 0, "auto", 2), 
    b("OFF", 1, "off", 1), 
    c("ON", 2, "on", 3);
    
    public final String d;
    public final int e;
    
    private ggv(final String s, final int n, final String d, final int e) {
        this.d = d;
        this.e = e;
    }
    
    public static ggv a(final String s, final ggv ggv) {
        s.getClass();
        final ggv a = ggv.a;
        if (a.d.equals(s)) {
            return a;
        }
        final ggv b = ggv.b;
        if (b.d.equals(s)) {
            return b;
        }
        final ggv c = ggv.c;
        if (c.d.equals(s)) {
            return c;
        }
        return ggv;
    }
}

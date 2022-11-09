// 
// Decompiled by Procyon v0.6.0
// 

public enum ggz
{
    a("ON", 0, "on", 3), 
    b("AUTO", 1, "auto", 2), 
    c("OFF", 2, "off", 1);
    
    public final String d;
    public final int e;
    
    private ggz(final String s, final int n, final String d, final int e) {
        this.d = d;
        this.e = e;
    }
    
    public static ggz a(final String s, final ggz ggz) {
        s.getClass();
        final ggz b = ggz.b;
        if (b.d.equals(s)) {
            return b;
        }
        final ggz c = ggz.c;
        if (c.d.equals(s)) {
            return c;
        }
        final ggz a = ggz.a;
        if (a.d.equals(s)) {
            return a;
        }
        return ggz;
    }
}

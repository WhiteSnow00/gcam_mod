// 
// Decompiled by Procyon v0.6.0
// 

public enum cpt
{
    a("ENABLED_VISIBLE", 0, true, true), 
    b("DISABLED_VISIBLE", 1, false, true), 
    c("DISABLED_HIDDEN", 2, false, false);
    
    public final boolean d;
    public final boolean e;
    
    private cpt(final String s, final int n, final boolean d, final boolean e) {
        this.d = d;
        this.e = e;
    }
}

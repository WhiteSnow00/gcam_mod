// 
// Decompiled by Procyon v0.6.0
// 

public enum hzf
{
    a("COLD", 0, 6), 
    b("NORMAL", 1, 1), 
    c("HEAT_LIGHT", 2, 7), 
    d("HEAT_MODERATE", 3, 8), 
    e("HEAT_SEVERE", 4, 2), 
    f("HEAT_CRITICAL", 5, 3), 
    g("HEAT_EMERGENCY", 6, 4), 
    h("HEAT_SHUTDOWN", 7, 9), 
    i("UNKNOWN", 8, 5);
    
    public final int j;
    
    private hzf(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public final boolean a(final hzf hzf) {
        final hzf i = hzf.i;
        return this != i && hzf != i && this.ordinal() >= hzf.ordinal();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public enum lha
{
    a("ROTATION_0", 0, 1, false), 
    b("FLIP_ROTATION_0", 1, 2, false), 
    c("ROTATION_90", 2, 8, true), 
    d("FLIP_ROTATION_90", 3, 5, true), 
    e("ROTATION_180", 4, 3, false), 
    f("FLIP_ROTATION_180", 5, 4, false), 
    g("ROTATION_270", 6, 6, true), 
    h("FLIP_ROTATION_270", 7, 7, true);
    
    public final int i;
    public final boolean j;
    
    private lha(final String s, final int n, final int i, final boolean j) {
        this.i = i;
        this.j = j;
    }
}

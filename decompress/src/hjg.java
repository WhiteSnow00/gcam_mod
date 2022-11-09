// 
// Decompiled by Procyon v0.6.0
// 

public enum hjg
{
    a("OFF", 0, 0), 
    b("THREE", 1, 3), 
    c("TEN", 2, 10), 
    d("AUTO", 3, -1);
    
    public static final hjg e;
    public static final int[] f;
    public final int g;
    
    static {
        int i = 0;
        final hjg e2;
        e = e2;
        f = new int[values().length];
        final hjg[] values = values();
        for (int length = values.length, n = 0; i < length; ++i, ++n) {
            hjg.f[n] = values[i].g;
        }
    }
    
    private hjg(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static hjg a(final int n) {
        switch (n) {
            default: {
                return hjg.e;
            }
            case 10: {
                return hjg.c;
            }
            case 3: {
                return hjg.b;
            }
            case 0: {
                return hjg.a;
            }
            case -1: {
                return hjg.d;
            }
        }
    }
}

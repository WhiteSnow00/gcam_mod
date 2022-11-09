// 
// Decompiled by Procyon v0.6.0
// 

public enum hjc
{
    a("OFF", 0, 0), 
    b("ON_LIGHT", 1, 1), 
    c("ON_STRONG", 2, 2), 
    d("DEBUG_MAX", 3, 3);
    
    public final int e;
    
    private hjc(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static hjc a(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unknown beautification level");
            }
            case 3: {
                return hjc.d;
            }
            case 2: {
                return hjc.c;
            }
            case 1: {
                return hjc.b;
            }
            case 0: {
                return hjc.a;
            }
        }
    }
    
    public final boolean b() {
        return this != hjc.a;
    }
}

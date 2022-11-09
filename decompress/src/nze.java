// 
// Decompiled by Procyon v0.6.0
// 

public enum nze implements olb
{
    a("UNKNOWN_STATUS", 0, 0), 
    b("NOT_HEEDED", 1, 2), 
    c("HEEDED", 2, 1);
    
    public final int d;
    
    private nze(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static nze b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return nze.b;
            }
            case 1: {
                return nze.c;
            }
            case 0: {
                return nze.a;
            }
        }
    }
    
    public static old c() {
        return nzh.b;
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

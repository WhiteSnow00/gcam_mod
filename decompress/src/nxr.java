// 
// Decompiled by Procyon v0.6.0
// 

public enum nxr implements olb
{
    a("UNKNOWN_CAMERA_DIRECTION", 0, 0), 
    b("FRONT", 1, 1), 
    c("BACK", 2, 2);
    
    public final int d;
    
    private nxr(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static nxr b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return nxr.c;
            }
            case 1: {
                return nxr.b;
            }
            case 0: {
                return nxr.a;
            }
        }
    }
    
    public static old c() {
        return lpx.o;
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

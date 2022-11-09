// 
// Decompiled by Procyon v0.6.0
// 

public enum lri implements olb
{
    a("UNKNOWN_DYNAMIC_LOADING_MODE", 0, 0), 
    b("ENABLED", 1, 1), 
    c("DISABLED", 2, 2), 
    d("ARCORE_ONLY", 3, 3), 
    e("PLAYGROUND_ONLY", 4, 4);
    
    public final int f;
    
    private lri(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static lri b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 4: {
                return lri.e;
            }
            case 3: {
                return lri.d;
            }
            case 2: {
                return lri.c;
            }
            case 1: {
                return lri.b;
            }
            case 0: {
                return lri.a;
            }
        }
    }
    
    public static old c() {
        return lpx.e;
    }
    
    @Override
    public final int a() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

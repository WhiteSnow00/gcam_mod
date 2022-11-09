// 
// Decompiled by Procyon v0.6.0
// 

public enum obu implements olb
{
    a("NO_STABILIZATION", 0, 0), 
    b("STEADY_FACE", 1, 1), 
    c("STANDARD", 2, 2), 
    d("CINEMATIC", 3, 3), 
    e("LOCKED", 4, 4), 
    f("ACTIVE", 5, 5);
    
    public final int g;
    
    private obu(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static obu b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 5: {
                return obu.f;
            }
            case 4: {
                return obu.e;
            }
            case 3: {
                return obu.d;
            }
            case 2: {
                return obu.c;
            }
            case 1: {
                return obu.b;
            }
            case 0: {
                return obu.a;
            }
        }
    }
    
    public static old c() {
        return obh.j;
    }
    
    @Override
    public final int a() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

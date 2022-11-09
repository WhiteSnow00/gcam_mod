// 
// Decompiled by Procyon v0.6.0
// 

public enum obl implements olb
{
    a("UNKNOWN", 0, 0), 
    b("SLOWEST", 1, 1), 
    c("SLOW", 2, 2), 
    d("LITTLE_FAST", 3, 3), 
    e("FAST", 4, 4), 
    f("FASTEST", 5, 5);
    
    public final int g;
    
    private obl(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static obl b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 5: {
                return obl.f;
            }
            case 4: {
                return obl.e;
            }
            case 3: {
                return obl.d;
            }
            case 2: {
                return obl.c;
            }
            case 1: {
                return obl.b;
            }
            case 0: {
                return obl.a;
            }
        }
    }
    
    public static old c() {
        return obh.e;
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

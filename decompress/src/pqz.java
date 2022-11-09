// 
// Decompiled by Procyon v0.6.0
// 

public enum pqz implements olb
{
    a("UNKNOWN", 0, 0), 
    b("FOREGROUND_TO_BACKGROUND", 1, 1), 
    c("BACKGROUND_TO_FOREGROUND", 2, 2), 
    d("FOREGROUND_SERVICE_START", 3, 3), 
    e("FOREGROUND_SERVICE_STOP", 4, 4), 
    f("CUSTOM_MEASURE_START", 5, 5), 
    g("CUSTOM_MEASURE_STOP", 6, 6);
    
    public final int h;
    
    private pqz(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static pqz b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return pqz.g;
            }
            case 5: {
                return pqz.f;
            }
            case 4: {
                return pqz.e;
            }
            case 3: {
                return pqz.d;
            }
            case 2: {
                return pqz.c;
            }
            case 1: {
                return pqz.b;
            }
            case 0: {
                return pqz.a;
            }
        }
    }
    
    public static old c() {
        return opp.g;
    }
    
    @Override
    public final int a() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

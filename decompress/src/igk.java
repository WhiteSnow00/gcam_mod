// 
// Decompiled by Procyon v0.6.0
// 

public enum igk
{
    a("UNKNOWN", 0), 
    b("OPTICAL_FLOW", 1), 
    c("GYRO", 2), 
    d("GPU_TEMPLATE", 3), 
    e("ML", 4), 
    f("HYBRID", 5);
    
    private igk(final String s, final int n) {
    }
    
    public static igk a(final int n) {
        switch (n) {
            default: {
                return igk.a;
            }
            case 5: {
                return igk.f;
            }
            case 4: {
                return igk.e;
            }
            case 3: {
                return igk.d;
            }
            case 2: {
                return igk.c;
            }
            case 1: {
                return igk.b;
            }
        }
    }
}

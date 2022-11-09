// 
// Decompiled by Procyon v0.6.0
// 

public enum hjb
{
    a("ON", 0, 0), 
    b("ON_LOCKED", 1, 1), 
    c("OFF_NEAR", 2, 2), 
    d("OFF_FAR", 3, 3), 
    e("OFF_INFINITY", 4, 4);
    
    public final int f;
    
    private hjb(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static hjb a(final int n) {
        switch (n) {
            default: {
                return hjb.a;
            }
            case 4: {
                return hjb.e;
            }
            case 3: {
                return hjb.d;
            }
            case 2: {
                return hjb.c;
            }
            case 1: {
                return hjb.b;
            }
        }
    }
    
    public final int b() {
        final kmv a = kmv.a;
        switch (this.ordinal()) {
            default: {
                return 1;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 2;
            }
        }
    }
}

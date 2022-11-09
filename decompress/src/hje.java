// 
// Decompiled by Procyon v0.6.0
// 

public enum hje
{
    a("PHONE", 0, 0), 
    b("EXT_WIRED", 1, 1), 
    c("EXT_BLUETOOTH", 2, 2);
    
    public final int d;
    
    private hje(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static hje a(final int n) {
        switch (n) {
            default: {
                return hje.a;
            }
            case 2: {
                return hje.c;
            }
            case 1: {
                return hje.b;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public enum lft
{
    a("EXTENDED", 0, 128), 
    b("FULL", 1, 2), 
    c("SIMPLE", 2, 1), 
    d("NONE", 3, 0);
    
    public final int e;
    
    private lft(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static lft a(final int n) {
        switch (n) {
            default: {
                return lft.d;
            }
            case 128: {
                return lft.a;
            }
            case 2: {
                return lft.b;
            }
            case 1: {
                return lft.c;
            }
        }
    }
}

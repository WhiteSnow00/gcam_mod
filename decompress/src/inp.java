// 
// Decompiled by Procyon v0.6.0
// 

public enum inp
{
    a("OFF", 0, 0), 
    b("THREE_BY_THREE", 1, 1), 
    c("FOUR_BY_FOUR", 2, 2), 
    d("GOLDEN_RATIO", 3, 3);
    
    public final int e;
    
    private inp(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static inp a(final int n) {
        switch (n) {
            default: {
                return inp.a;
            }
            case 3: {
                return inp.d;
            }
            case 2: {
                return inp.c;
            }
            case 1: {
                return inp.b;
            }
            case 0: {
                return inp.a;
            }
        }
    }
}

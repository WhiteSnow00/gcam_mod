// 
// Decompiled by Procyon v0.6.0
// 

public final class gnb
{
    private final cxl a;
    
    public gnb(final cxl a) {
        this.a = a;
    }
    
    public static final boolean b() {
        return jlk.b != null && jlk.a != null && jlk.c != null;
    }
    
    public final int a(final lfg lfg) {
        final int intValue = (int)this.a.a(cxz.a).c();
        final boolean b = b();
        final int n = -1;
        int intValue2;
        if (!b) {
            intValue2 = n;
        }
        else {
            try {
                intValue2 = (int)lfg.n(jlk.c, -1);
            }
            catch (final IllegalArgumentException ex) {
                ex.getMessage();
                intValue2 = n;
            }
        }
        return Math.min(intValue, intValue2);
    }
}

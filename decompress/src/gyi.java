// 
// Decompiled by Procyon v0.6.0
// 

public final class gyi
{
    public static int a(final kre kre, final kre kre2) {
        int i = Math.min(kre.a / kre2.a, kre.b / kre2.b);
        if (i > 0) {
            while (i > 0) {
                if (b(kre.a, i) && b(kre.b, i)) {
                    return i;
                }
                --i;
            }
        }
        return 1;
    }
    
    public static boolean b(final int n, final int n2) {
        return n % (n2 + n2) == 0;
    }
}

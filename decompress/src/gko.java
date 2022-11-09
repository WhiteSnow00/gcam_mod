// 
// Decompiled by Procyon v0.6.0
// 

public final class gko
{
    public static int a(final kra kra, final boolean b) {
        if (b) {
            if (kra == kra.a) {
                return 1;
            }
            if (kra == kra.b) {
                return 3;
            }
            if (kra == kra.c) {
                return 2;
            }
            return 4;
        }
        else {
            if (kra == kra.a) {
                return 3;
            }
            if (kra == kra.b) {
                return 1;
            }
            if (kra == kra.c) {
                return 4;
            }
            return 2;
        }
    }
    
    public static boolean b(final int n) {
        return n == 3 || n == 4;
    }
}

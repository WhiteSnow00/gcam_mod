// 
// Decompiled by Procyon v0.6.0
// 

public final class cve
{
    static boolean a(final float n, final float n2) {
        final double abs = Math.abs(Math.toDegrees(n));
        final double abs2 = Math.abs(Math.toDegrees(n2 - n));
        if (abs <= 1.0) {
            if (abs2 >= 0.1) {
                return true;
            }
        }
        else if (abs2 >= 0.5) {
            return true;
        }
        return false;
    }
}

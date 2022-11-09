import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dal extends krl
{
    public final krm a(final String s) {
        return new krm(s, this);
    }
    
    @Override
    public final boolean b(final String s, final int n) {
        final int a = dam.a;
        boolean a2 = false;
        if (a != 0) {
            if (dam.a <= n) {
                return true;
            }
        }
        else if (n == 2) {
            a2 = dam.a(s, 2);
        }
        else {
            if (!"userdebug".equals(Build.TYPE)) {
                if (!"eng".equals(Build.TYPE)) {
                    if (!dam.a(s, n)) {
                        return false;
                    }
                }
            }
            a2 = true;
        }
        return a2;
    }
}

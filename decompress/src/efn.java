import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efn
{
    public static int a(final int n) {
        return n - 1;
    }
    
    public static Object b() {
        return new Object();
    }
    
    public static String c(int n, final Context context, final boolean b) {
        switch (n - 1) {
            default: {
                n = 2131952122;
                break;
            }
            case 4: {
                n = 2131952121;
                break;
            }
            case 3: {
                n = 2131952124;
                break;
            }
            case 2: {
                if (!b) {
                    n = 2131952125;
                    break;
                }
                n = 2131952123;
                break;
            }
        }
        return context.getString(n);
    }
    
    public static int d(final int n) {
        switch (n - 1) {
            default: {
                return 2;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 7;
            }
        }
    }
}

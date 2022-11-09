import android.view.WindowManager;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mif
{
    public static volatile int a;
    private static volatile int b;
    
    private mif() {
    }
    
    public static int a(final Context context) {
        if (Build$VERSION.SDK_INT >= 31) {
            return 0;
        }
        if (mif.b == 0) {
            synchronized (mif.class) {
                if (mif.b == 0) {
                    mif.b = Math.round(((WindowManager)context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return mif.b;
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
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
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
}

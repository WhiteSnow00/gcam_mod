import android.util.Log;
import android.os.Process;
import android.content.Context;
import android.os.UserManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loq
{
    private static UserManager b;
    private static volatile boolean c;
    
    static {
        loq.c = false;
    }
    
    private loq() {
    }
    
    public static Context a(final Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }
    
    public static boolean b(final Context context) {
        return !d(context);
    }
    
    public static boolean c(final Context context) {
        return d(context);
    }
    
    private static boolean d(final Context context) {
        if (loq.c) {
            return true;
        }
        monitorenter(loq.class);
        try {
            if (loq.c) {
                monitorexit(loq.class);
                return true;
            }
            int n = 1;
            boolean b2 = false;
            Label_0123: {
                int n2;
                while (true) {
                    n2 = 0;
                    if (n > 2) {
                        break;
                    }
                    if (loq.b == null) {
                        loq.b = (UserManager)context.getSystemService((Class)UserManager.class);
                    }
                    final UserManager b = loq.b;
                    if (b == null) {
                        b2 = true;
                        break Label_0123;
                    }
                    try {
                        if (b.isUserUnlocked() || !b.isUserRunning(Process.myUserHandle())) {
                            n2 = 1;
                        }
                    }
                    catch (final NullPointerException ex) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", (Throwable)ex);
                        loq.b = null;
                        ++n;
                        continue;
                    }
                    break;
                }
                b2 = (n2 != 0);
                if (n2 != 0) {
                    loq.b = null;
                    b2 = (n2 != 0);
                }
            }
            if (b2) {
                loq.c = true;
            }
            monitorexit(loq.class);
            return b2;
        }
        finally {
            monitorexit(loq.class);
            while (true) {}
        }
    }
}

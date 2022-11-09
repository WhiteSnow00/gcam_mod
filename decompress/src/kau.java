import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kau
{
    public static final int a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int a2 = 33554432;
        if (sdk_INT < 31) {
            if (Build$VERSION.CODENAME.length() != 1 || Build$VERSION.CODENAME.charAt(0) < 'S' || Build$VERSION.CODENAME.charAt(0) > 'Z') {
                a2 = 0;
            }
        }
        a = a2;
    }
    
    public static PendingIntent a(final Context context, final Intent intent, final int n) {
        return PendingIntent.getActivity(context, 0, intent, n);
    }
    
    public static PendingIntent b(final Context context, final Intent intent, final int n) {
        return PendingIntent.getBroadcast(context, 0, intent, n);
    }
}

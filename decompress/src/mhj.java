import android.provider.Settings$Secure;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class mhj
{
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }
    
    public mhj(final Context context) {
        mfs.b();
        Settings$Secure.getString(context.getContentResolver(), "android_id");
    }
}

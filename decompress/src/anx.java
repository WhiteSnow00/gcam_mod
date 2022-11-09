import android.text.TextUtils;
import android.app.Application;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anx
{
    static {
        aiy.b("ProcessUtils");
    }
    
    public static boolean a(final Context context) {
        final String processName = Application.getProcessName();
        if (!TextUtils.isEmpty((CharSequence)null)) {
            return TextUtils.equals((CharSequence)processName, (CharSequence)null);
        }
        return TextUtils.equals((CharSequence)processName, (CharSequence)context.getApplicationInfo().processName);
    }
}

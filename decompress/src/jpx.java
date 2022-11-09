import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class jpx
{
    public static final int c;
    
    static {
        final int c2 = jqg.c;
        c = 212606000;
    }
    
    public final int e(final Context context) {
        return this.f(context, jpx.c);
    }
    
    public final int f(final Context context, int b) {
        b = jqg.b(context, b);
        if (jqg.d(context, b)) {
            return 18;
        }
        return b;
    }
    
    public final Intent g(final Context context, final int n, final String s) {
        switch (n) {
            default: {
                return null;
            }
            case 3: {
                return jvg.b();
            }
            case 1:
            case 2: {
                if (context != null) {
                    jwn.d(context);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(jpx.c);
                sb.append("-");
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    sb.append(s);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(jwu.b(context).c(context.getPackageName(), 0).versionCode);
                    }
                    catch (final PackageManager$NameNotFoundException ex) {}
                }
                return jvg.a(sb.toString());
            }
        }
    }
    
    public final PendingIntent h(final Context context, final int n, final String s) {
        final Intent g = this.g(context, n, s);
        if (g == null) {
            return null;
        }
        return kau.a(context, g, kau.a | 0x8000000);
    }
}

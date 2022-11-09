import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anv
{
    static {
        aiy.b("PackageManagerHelper");
    }
    
    public static void a(final Context context, final Class clazz, final boolean b) {
        final String s = "disabled";
        try {
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (!b) {
                n = 2;
            }
            else {
                n = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            final aiy a = aiy.a();
            final String name = clazz.getName();
            String s2;
            if (!b) {
                s2 = "disabled";
            }
            else {
                s2 = "enabled";
            }
            String.format("%s %s", name, s2);
            a.d(new Throwable[0]);
        }
        catch (final Exception ex) {
            final aiy a2 = aiy.a();
            final String name2 = clazz.getName();
            String s3;
            if (!b) {
                s3 = s;
            }
            else {
                s3 = "enabled";
            }
            String.format("%s could not be %s", name2, s3);
            a2.d(ex);
        }
    }
}

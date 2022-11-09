import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.os.Build;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqg
{
    static boolean a;
    static final AtomicBoolean b;
    private static boolean d;
    private static final AtomicBoolean e;
    
    static {
        jqg.d = false;
        jqg.a = false;
        b = new AtomicBoolean();
        e = new AtomicBoolean();
    }
    
    @Deprecated
    public static int a(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
    
    @Deprecated
    public static int b(final Context context, int n) {
        try {
            context.getResources().getString(2131951859);
        }
        finally {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        final boolean equals = "com.google.android.gms".equals(context.getPackageName());
        int versionCode = 1;
        if (!equals) {
            if (!jqg.e.get()) {
                synchronized (jvp.a) {
                    Label_0144: {
                        if (jvp.b) {
                            monitorexit(jvp.a);
                        }
                        else {
                            jvp.b = true;
                            final String packageName = context.getPackageName();
                            final jwt b = jwu.b(context);
                            try {
                                final Bundle metaData = b.b(packageName, 128).metaData;
                                if (metaData == null) {
                                    monitorexit(jvp.a);
                                    break Label_0144;
                                }
                                metaData.getString("com.google.app.id");
                                jvp.c = metaData.getInt("com.google.android.gms.version");
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
                            }
                            monitorexit(jvp.a);
                        }
                    }
                    final int c = jvp.c;
                    if (c == 0) {
                        throw new GooglePlayServicesMissingManifestValueException();
                    }
                    if (c != 212606000) {
                        throw new GooglePlayServicesIncorrectManifestValueException(c);
                    }
                }
            }
        }
        jwn.d(context);
        if (jwn.c == null) {
            jwn.c = (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        final boolean b2 = jwn.c ^ true;
        jvu.b(true);
        final String packageName2 = context.getPackageName();
        final PackageManager packageManager = context.getPackageManager();
        Label_0310: {
            if (b2) {
                try {
                    final PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    break Label_0310;
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires the Google Play Store, but it is missing."));
                    n = 9;
                    return n;
                }
            }
            final PackageInfo packageInfo = null;
            try {
                final PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                jqh.a(context);
                if (!jqh.d(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but their signature is invalid."));
                    n = 9;
                }
                else {
                    if (b2) {
                        jvu.a(packageInfo);
                        if (!jqh.d(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play Store, but its signature is invalid."));
                            n = 9;
                            return n;
                        }
                    }
                    if (b2 && packageInfo != null && !packageInfo.signatures[0].equals((Object)packageInfo2.signatures[0])) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        n = 9;
                    }
                    else if (jxc.e(packageInfo2.versionCode) < jxc.e(n)) {
                        versionCode = packageInfo2.versionCode;
                        final StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 82);
                        sb.append("Google Play services out of date for ");
                        sb.append(packageName2);
                        sb.append(".  Requires ");
                        sb.append(n);
                        sb.append(" but found ");
                        sb.append(versionCode);
                        Log.w("GooglePlayServicesUtil", sb.toString());
                        n = 2;
                    }
                    else {
                        ApplicationInfo applicationInfo;
                        if ((applicationInfo = packageInfo2.applicationInfo) == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            }
                            catch (final PackageManager$NameNotFoundException ex3) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)ex3);
                                n = versionCode;
                                return n;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        n = 3;
                    }
                }
            }
            catch (final PackageManager$NameNotFoundException ex4) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but they are missing."));
                n = versionCode;
            }
        }
        return n;
    }
    
    public static boolean c(final Context context) {
        if (!jqg.a) {
            try {
                try {
                    final PackageInfo c = jwu.b(context).c("com.google.android.gms", 64);
                    jqh.a(context);
                    if (c != null && !jqh.d(c, false) && jqh.d(c, true)) {
                        jqg.d = true;
                    }
                    else {
                        jqg.d = false;
                    }
                    jqg.a = true;
                }
                finally {}
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)ex);
                jqg.a = true;
                return jqg.d || !"user".equals(Build.TYPE);
            }
            jqg.a = true;
        }
        return jqg.d || !"user".equals(Build.TYPE);
    }
    
    @Deprecated
    public static boolean d(final Context context, final int n) {
        return n == 1 && f(context);
    }
    
    @Deprecated
    public static boolean e(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 1:
            case 2:
            case 3:
            case 9: {
                return true;
            }
        }
    }
    
    public static boolean f(final Context context) {
        try {
            final Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (iterator.hasNext()) {
                if ("com.google.android.gms".equals(((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                    return true;
                }
            }
            final PackageManager packageManager = context.getPackageManager();
            try {
                return packageManager.getApplicationInfo("com.google.android.gms", 8192).enabled;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                return false;
            }
        }
        catch (final Exception ex2) {
            return false;
        }
    }
    
    @Deprecated
    public static String g() {
        return jps.a(13);
    }
}

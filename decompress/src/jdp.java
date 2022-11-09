import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdp
{
    public static final nsd a;
    public final Context b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/util/photos/PhotosPackageDetector");
    }
    
    public jdp(final Context b) {
        this.b = b;
    }
    
    public final PackageInfo a() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            a.m(jdp.a.c(), "Photos app package not found.", '\u0bcd', (Throwable)ex);
            packageInfo = null;
        }
        return packageInfo;
    }
    
    public final boolean b(final String s) {
        final PackageInfo a = this.a();
        if (a == null) {
            return false;
        }
        final String versionName = a.versionName;
        if (!versionName.equals("DEVELOPMENT")) {
            try {
                if (new jdo(versionName).a(new jdo(s)) >= 0) {
                    return true;
                }
            }
            catch (final IllegalArgumentException ex) {
                jdp.a.b().E(3023).x("Fail to check the version between %s and %s", versionName, s);
            }
            return false;
        }
        return true;
    }
}

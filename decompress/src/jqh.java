import android.content.pm.Signature;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqh
{
    private static jqh a;
    private final Context b;
    
    public jqh(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    public static jqh a(final Context context) {
        jvu.a(context);
        synchronized (jqh.class) {
            if (jqh.a == null) {
                jqf.a(context);
                jqh.a = new jqh(context);
            }
            return jqh.a;
        }
    }
    
    static final jvl c(final PackageInfo packageInfo, final jvl... array) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final Signature[] signatures = packageInfo.signatures;
        int i = 0;
        final jqc jqc = new jqc(signatures[0].toByteArray());
        while (i < array.length) {
            if (array[i].equals(jqc)) {
                return array[i];
            }
            ++i;
        }
        return null;
    }
    
    public static final boolean d(final PackageInfo packageInfo, final boolean b) {
        if (packageInfo != null && packageInfo.signatures != null) {
            jvl jvl;
            if (b) {
                jvl = c(packageInfo, jqe.a);
            }
            else {
                jvl = c(packageInfo, jqe.a[0]);
            }
            if (jvl != null) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b(final PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (jqg.c(this.b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}

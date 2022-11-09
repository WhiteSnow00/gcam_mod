import java.io.Serializable;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.text.TextUtils;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czd
{
    private static final nsd a;
    private final Set b;
    private final PackageManager c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/contentprovider/TrustedPartners");
    }
    
    public czd(final Context context, final Set b) {
        this.c = context.getPackageManager();
        this.b = b;
    }
    
    public final boolean a(String a) {
        if (TextUtils.isEmpty((CharSequence)a)) {
            a.l(czd.a.c(), "null or empty package name; do not trust", '\u0271');
            return false;
        }
        try {
            final PackageInfo packageInfo = this.c.getPackageInfo((String)a, 64);
            if (packageInfo.signatures != null) {
                if (packageInfo.signatures.length == 1) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("SHA1");
                        instance.update(packageInfo.signatures[0].toByteArray());
                        a = lnc.a(instance.digest());
                        return this.b.contains(a);
                    }
                    catch (final NoSuchAlgorithmException a) {
                        a.k(czd.a.b(), "unable to compute hash using %s; do not trust", "SHA1", '\u026f');
                        return false;
                    }
                }
            }
            czd.a.c().E(622).t("%d signatures found for package (%s); do not trust", packageInfo.signatures.length, a);
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            a.k(czd.a.c(), "package not found (%s); do not trust", a, '\u0270');
            return false;
        }
    }
}

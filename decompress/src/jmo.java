import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmo extends jmc
{
    private final jlq a;
    
    public jmo(final jmf jmf) {
        super(jmf);
        this.a = new jlq();
    }
    
    @Override
    protected final void a() {
        final jlw e = this.e();
        if (e.d == null) {
            synchronized (e) {
                if (e.d == null) {
                    final jlq d = new jlq();
                    final PackageManager packageManager = e.b.getPackageManager();
                    String s = e.b.getPackageName();
                    d.c = s;
                    d.d = packageManager.getInstallerPackageName(s);
                    final String s2 = null;
                    String versionName = null;
                    Label_0192: {
                        Label_0142: {
                            try {
                                final PackageInfo packageInfo = packageManager.getPackageInfo(e.b.getPackageName(), 0);
                                if (packageInfo != null) {
                                    final CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        s = applicationLabel.toString();
                                    }
                                    try {
                                        versionName = packageInfo.versionName;
                                    }
                                    catch (final PackageManager$NameNotFoundException ex) {
                                        break Label_0142;
                                    }
                                }
                                break Label_0192;
                            }
                            catch (final PackageManager$NameNotFoundException ex2) {}
                        }
                        final String value = String.valueOf(s);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Error retrieving package info: appName set to ".concat(value);
                        }
                        else {
                            concat = new String("Error retrieving package info: appName set to ");
                        }
                        Log.e("GAv4", concat);
                        versionName = s2;
                    }
                    d.a = s;
                    d.b = versionName;
                    e.d = d;
                }
            }
        }
        final jlq d2 = e.d;
        final jlq a = this.a;
        if (!TextUtils.isEmpty((CharSequence)d2.a)) {
            a.a = d2.a;
        }
        if (!TextUtils.isEmpty((CharSequence)d2.b)) {
            a.b = d2.b;
        }
        if (!TextUtils.isEmpty((CharSequence)d2.c)) {
            a.c = d2.c;
        }
        if (!TextUtils.isEmpty((CharSequence)d2.d)) {
            a.d = d2.d;
        }
        final jnw k = this.k();
        k.z();
        final String c = k.c;
        if (c != null) {
            this.a.a = c;
        }
        k.z();
        final String a2 = k.a;
        if (a2 != null) {
            this.a.b = a2;
        }
    }
}

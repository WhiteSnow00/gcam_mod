import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnv
{
    static volatile niz a;
    private static final Object b;
    
    static {
        mnv.a = nii.a;
        b = new Object();
    }
    
    public static boolean a(final Context context, final Uri uri) {
        final String authority = uri.getAuthority();
        final boolean equals = "com.google.android.gms.phenotype".equals(authority);
        boolean b = false;
        if (!equals) {
            final StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (mnv.a.g()) {
            return (boolean)mnv.a.c();
        }
        synchronized (mnv.b) {
            if (mnv.a.g()) {
                return (boolean)mnv.a.c();
            }
            Label_0200: {
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456);
                    if (resolveContentProvider == null) {
                        break Label_0200;
                    }
                    if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        break Label_0200;
                    }
                }
                final PackageManager packageManager = context.getPackageManager();
                try {
                    if ((packageManager.getApplicationInfo("com.google.android.gms", 0).flags & 0x81) != 0x0) {
                        b = true;
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {}
            }
            mnv.a = niz.i(b);
            monitorexit(mnv.b);
            return (boolean)mnv.a.c();
        }
    }
}

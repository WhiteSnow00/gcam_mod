import java.util.List;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfe implements awi
{
    private final Context a;
    
    public bfe(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public final aza c(final Uri uri) {
        final String authority = uri.getAuthority();
        Context context = null;
        Label_0060: {
            if (!authority.equals(this.a.getPackageName())) {
                Label_0346: {
                    try {
                        context = this.a.createPackageContext(authority, 0);
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        if (!authority.contains(this.a.getPackageName())) {
                            break Label_0346;
                        }
                        context = this.a;
                    }
                    break Label_0060;
                }
                final String value = String.valueOf(uri);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57);
                sb.append("Failed to obtain context or unrecognized Uri format for: ");
                sb.append(value);
                final PackageManager$NameNotFoundException ex;
                throw new IllegalArgumentException(sb.toString(), (Throwable)ex);
            }
            context = this.a;
        }
        final List pathSegments = uri.getPathSegments();
        Label_0233: {
            if (pathSegments.size() == 2) {
                final List pathSegments2 = uri.getPathSegments();
                final String authority2 = uri.getAuthority();
                final String s = pathSegments2.get(0);
                final String s2 = pathSegments2.get(1);
                int n = context.getResources().getIdentifier(s2, s, authority2);
                if (n == 0) {
                    n = Resources.getSystem().getIdentifier(s2, s, "android");
                }
                if (n != 0) {
                    break Label_0233;
                }
                final String value2 = String.valueOf(uri);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 32);
                sb2.append("Failed to find resource id for: ");
                sb2.append(value2);
                throw new IllegalArgumentException(sb2.toString());
            }
            else if (pathSegments.size() != 1) {
                break Label_0233;
            }
            final List pathSegments3 = uri.getPathSegments();
            try {
                final int n = Integer.parseInt((String)pathSegments3.get(0));
                return bfd.g(bfb.a(this.a, context, n, null));
            }
            catch (final NumberFormatException ex2) {
                final String value3 = String.valueOf(uri);
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 25);
                sb3.append("Unrecognized Uri format: ");
                sb3.append(value3);
                throw new IllegalArgumentException(sb3.toString(), ex2);
            }
        }
        final String value4 = String.valueOf(uri);
        final StringBuilder sb4 = new StringBuilder(String.valueOf(value4).length() + 25);
        sb4.append("Unrecognized Uri format: ");
        sb4.append(value4);
        throw new IllegalArgumentException(sb4.toString());
    }
}

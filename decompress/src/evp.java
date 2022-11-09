import android.content.pm.PackageManager$NameNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class evp
{
    private final Context a;
    
    public evp(final Context a) {
        this.a = a;
    }
    
    static final boolean c(String s, final int n, final int n2) {
        final Matcher matcher = Pattern.compile("^([0-9]+)\\.([0-9]+).*").matcher(s);
        if (matcher.find()) {
            s = matcher.group(1);
            s.getClass();
            final int int1 = Integer.parseInt(s);
            s = matcher.group(2);
            s.getClass();
            final int int2 = Integer.parseInt(s);
            if (int1 > n || (int1 == n && int2 >= n2)) {
                return true;
            }
        }
        return false;
    }
    
    final String a(String versionName) {
        try {
            versionName = this.a.getPackageManager().getPackageInfo(versionName, 0).versionName;
            return versionName;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return "";
        }
    }
    
    final String b() {
        return this.a("com.google.vr.apps.ornament");
    }
}

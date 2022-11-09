import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jde implements oun
{
    private final pii a;
    private final pii b;
    
    public jde(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final PackageInfo a() {
        final PackageManager a = ((jdf)this.a).a();
        final Context a2 = ((egg)this.b).a();
        try {
            final PackageInfo packageInfo = a.getPackageInfo(a2.getPackageName(), 0);
            pqf.k(packageInfo);
            return packageInfo;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new IllegalStateException("getPackageInfo for getPackageName should always succeed.", (Throwable)ex);
        }
    }
}

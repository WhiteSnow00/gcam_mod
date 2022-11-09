import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwt
{
    public final Context a;
    
    public jwt(final Context a) {
        this.a = a;
    }
    
    public final int a(final String s) {
        return this.a.checkCallingOrSelfPermission(s);
    }
    
    public final ApplicationInfo b(final String s, final int n) {
        return this.a.getPackageManager().getApplicationInfo(s, n);
    }
    
    public final PackageInfo c(final String s, final int n) {
        return this.a.getPackageManager().getPackageInfo(s, n);
    }
}

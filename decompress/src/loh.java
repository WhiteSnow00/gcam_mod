import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loh
{
    private Integer a;
    
    public final int a(final Context context) {
        if (this.a == null) {
            try {
                this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                this.a = -1;
            }
        }
        return this.a;
    }
}

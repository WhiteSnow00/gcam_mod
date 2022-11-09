import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdf implements oun
{
    private final pii a;
    
    public jdf(final pii a) {
        this.a = a;
    }
    
    public final PackageManager a() {
        final PackageManager packageManager = ((egg)this.a).a().getPackageManager();
        pqf.k(packageManager);
        return packageManager;
    }
}

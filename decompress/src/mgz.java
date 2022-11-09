import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgz
{
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final lor e;
    public final njp f;
    public final njp g;
    public final int h;
    
    public mgz(final Context a, final niz niz, final String d) {
        this.a = a;
        this.b = a.getPackageName();
        final int b = mfs.b;
        final String packageName = a.getPackageName();
        String c = mfs.b();
        final njp njp = null;
        if (c != null) {
            if (packageName != null) {
                if (c.startsWith(packageName)) {
                    final int length = packageName.length();
                    if (c.length() == length) {
                        c = null;
                    }
                    else {
                        c = c.substring(length + 1);
                    }
                }
            }
        }
        this.c = c;
        njp a2;
        if (niz.g()) {
            a2 = ((mgp)niz.c()).a();
        }
        else {
            a2 = njp;
        }
        this.g = a2;
        this.d = d;
        final PackageManager packageManager = a.getPackageManager();
        int h;
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            h = 3;
        }
        else if (packageManager.hasSystemFeature("android.software.leanback")) {
            h = 4;
        }
        else {
            h = 2;
        }
        if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            h = 5;
        }
        this.h = h;
        this.e = new lor(a);
        this.f = nov.F(new mgy(this));
    }
}

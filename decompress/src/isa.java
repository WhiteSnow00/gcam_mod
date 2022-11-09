import android.content.Context;
import android.content.Intent;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isa
{
    public final cxl a;
    
    public isa(final cxl a) {
        this.a = a;
    }
    
    public static final boolean b(final orl orl) {
        final String a = orl.a("com.google.vr.apps.ornament", "ar_service_desc");
        if (a == null) {
            return false;
        }
        final String[] split = a.split("/");
        if (split.length != 2) {
            Log.e(orl.a, "Ornament's AR service descriptor not valid");
        }
        else {
            final Intent intent = new Intent();
            intent.setClassName(split[0], split[1]);
            if (orl.b.resolveService(intent, 0) != null) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean c(final Context context) {
        return new orl(context.getPackageManager()).c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.funshot.activity.FunshotActivity");
    }
    
    public final boolean a(final Context context) {
        if (!this.a.k(cxu.o)) {
            return false;
        }
        final orl orl = new orl(context.getPackageManager());
        if (!orl.c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity")) {
            return false;
        }
        final liz a = liz.a();
        return (a.b() || a.c() || a.d() || a.e() || a.f()) && b(orl);
    }
}

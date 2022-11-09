import android.content.Intent;
import android.content.Context;
import com.google.android.apps.camera.ui.preference.StorageStatusPreference;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxy
{
    public final hyc a;
    public final ScheduledExecutorService b;
    public final kjm c;
    public final eyt d;
    public final boolean e;
    public StorageStatusPreference f;
    public hyj g;
    public final hyl h;
    private final hxu i;
    
    public hxy(final hyc a, final hyl h, final hxu i, final ScheduledExecutorService b, final kjm c, final eyt d, final cxl cxl) {
        this.a = a;
        this.h = h;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = cxl.k(cxr.at);
    }
    
    public static Intent a(final Context context) {
        final Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
        intent.putExtra("pref_open_setting_page", "pref_category_storage");
        intent.putExtra("pref_make_setting_page_root", true);
        return intent;
    }
    
    public final void b() {
        final hyj g = this.g;
        if (g != null) {
            final hxt a = this.i.a(g);
            final boolean c = a.c;
            boolean g2 = false;
            final boolean f = c || a.d;
            if (!a.e) {
                if (a.f) {
                    g2 = true;
                }
            }
            else {
                g2 = true;
            }
            final StorageStatusPreference f2 = this.f;
            final long b = g.b;
            final long c2 = g.c;
            final int a2 = a.a;
            final int b2 = a.b;
            f2.a = b;
            f2.b = c2;
            f2.c = a2;
            f2.d = b2;
            f2.f = f;
            f2.g = g2;
            f2.a();
        }
    }
}

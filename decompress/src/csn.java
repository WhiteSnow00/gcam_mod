import android.content.SharedPreferences;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csn
{
    public final CameraFatalErrorTrackerDatabase a;
    public final crw b;
    private final SharedPreferences c;
    
    public csn(final SharedPreferences c, final CameraFatalErrorTrackerDatabase a, final crw b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (this.c.getBoolean("pref_key_reboot_completed", false)) {
            final CameraFatalErrorTrackerDatabase a = this.a;
            final csl csl = new csl(this);
            a.h();
            try {
                csl.run();
                a.j();
                a.i();
                this.c.edit().putBoolean("pref_key_reboot_completed", false).apply();
            }
            finally {
                a.i();
            }
        }
    }
}

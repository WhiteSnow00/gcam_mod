import java.io.Serializable;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isb
{
    private final Activity a;
    private final hlb b;
    private final hkc c;
    private final ckn d;
    private final klj e;
    private final hlj f;
    private final crg g;
    private final bmq h;
    private final lfw i;
    
    public isb(final Activity a, final bmq h, final lfw i, final hlb b, final hkc c, final ckn d, final klj e, final hlj f, final crg g) {
        this.a = a;
        this.h = h;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a() {
        final Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity");
        this.b(intent);
    }
    
    public final void b(final Intent intent) {
        intent.setFlags(65536);
        if (this.a.isVoiceInteractionRoot()) {
            intent.addFlags(268435456);
        }
        final lfu e = this.g.e();
        final lfu b = lfu.b;
        final lfj e2 = this.i.e(b);
        final lfu a = lfu.a;
        final lfj e3 = this.i.e(a);
        final orm orm = new orm();
        orm.b = (boolean)this.e.aQ();
        orm.a = (boolean)this.c.c(hjq.a);
        orm.d = ((hli)this.f.aQ()).name();
        orm.c = e.equals(lfu.a);
        orm.g = this.b.a(e3, a).c().toString();
        orm.h = this.d.a(a).c().c().toString();
        orm.e = this.b.a(e2, b).c().toString();
        orm.f = this.d.a(b).c().c().toString();
        final Boolean a2 = orm.a;
        if (a2 != null) {
            intent.putExtra("settings_save_location", (Serializable)a2);
        }
        final Boolean b2 = orm.b;
        if (b2 != null) {
            intent.putExtra("settings_camera_sounds", (Serializable)b2);
        }
        final Boolean c = orm.c;
        if (c != null) {
            intent.putExtra("settings_preferred_camera_type_is_front", (Serializable)c);
        }
        final String d = orm.d;
        if (d != null) {
            intent.putExtra("settings_volume_key_action", d);
        }
        final String e4 = orm.e;
        if (e4 != null) {
            intent.putExtra("settings_back_camera_photo_resolution", e4);
        }
        final String f = orm.f;
        if (f != null) {
            intent.putExtra("settings_back_camera_video_resolution", f);
        }
        final String g = orm.g;
        if (g != null) {
            intent.putExtra("settings_front_camera_photo_resolution", g);
        }
        final String h = orm.h;
        if (h != null) {
            intent.putExtra("settings_front_camera_video_resolution", h);
        }
        final int a3 = orn.a;
        this.h.b(intent);
    }
    
    public final void c() {
        final Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.photobooth.activity.PhotoboothActivity");
        this.b(intent);
    }
}

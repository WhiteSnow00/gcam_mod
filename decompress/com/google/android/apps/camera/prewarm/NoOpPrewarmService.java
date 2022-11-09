// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.prewarm;

import android.content.Intent;
import android.service.media.CameraPrewarmService;

public class NoOpPrewarmService extends CameraPrewarmService
{
    public static final nsd a;
    public eyt b;
    public kkf c;
    public hvn d;
    public ehp e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/prewarm/NoOpPrewarmService");
    }
    
    public final void onCooldown(final boolean b) {
        this.c.a();
        this.b.J();
    }
    
    public final void onCreate() {
        ((gwe)((egp)this.getApplication()).c(gwe.class)).m(this);
        super.onCreate();
        this.d.a();
    }
    
    public final void onPrewarm() {
        this.c.b(new gwd(this));
        this.b.B();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        if (!this.e.a()) {
            a.l(NoOpPrewarmService.a.b(), "KeepAlive is off. Skipping.", '\u085b');
            return 2;
        }
        ((brp)this.getApplicationContext()).b().a(2);
        return 1;
    }
}

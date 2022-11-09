// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.wear.wearv2;

import android.os.PowerManager$WakeLock;
import android.content.Intent;
import android.app.KeyguardManager;
import android.os.PowerManager;

public class DataLayerListenerService extends kfu
{
    private static final nsd f;
    
    static {
        f = nsd.g("com/google/android/apps/camera/wear/wearv2/DataLayerListenerService");
    }
    
    @Override
    public final void a(final kht kht) {
        if (!"/start-activity".equals(kht.b)) {
            DataLayerListenerService.f.c().E(3030).r("Unsupported message path :%s", kht.b);
            return;
        }
        if (jhx.a) {
            return;
        }
        final PowerManager$WakeLock wakeLock = ((PowerManager)this.getSystemService("power")).newWakeLock(268435466, "Camera:ScreenOnForWearable");
        wakeLock.acquire(1000L);
        wakeLock.release();
        final KeyguardManager keyguardManager = (KeyguardManager)this.getSystemService("keyguard");
        String s;
        if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
            s = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
        }
        else {
            s = "android.media.action.STILL_IMAGE_CAMERA";
        }
        this.startActivity(new Intent(s).addFlags(335544320).putExtra("extra_turn_screen_on", true).putExtra("extra_launch_fom_wear", true).setPackage(this.getPackageName()));
    }
}

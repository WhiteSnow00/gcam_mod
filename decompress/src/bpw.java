import android.content.pm.PackageManager;
import android.service.voice.VoiceInteractionService;
import android.content.Intent;
import android.content.Context;
import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpw implements bpz
{
    private static final ComponentName a;
    private final Context b;
    private final klv c;
    
    static {
        a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");
    }
    
    public bpw(final Context b, final klv c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        System.currentTimeMillis();
        final Intent intent = new Intent();
        intent.addFlags(268468224);
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink"));
        final PackageManager packageManager = this.b.getPackageManager();
        boolean b = false;
        if (packageManager.resolveActivity(intent, 0) != null && VoiceInteractionService.isActiveService(this.b, bpw.a)) {
            b = true;
        }
        System.currentTimeMillis();
        this.c.aR(b);
    }
}

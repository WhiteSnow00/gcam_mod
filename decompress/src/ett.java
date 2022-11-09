import android.preference.PreferenceManager;
import java.io.File;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ett extends Thread
{
    final /* synthetic */ LocalSessionStorage a;
    final /* synthetic */ foa b;
    
    public ett(final LocalSessionStorage a, final foa b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (!new File(this.a.e).exists()) {
            a.l(etu.a.b(), "The storage directory does not exist.", '\u058a');
        }
        final foa b = this.b;
        final fol b2 = b.b;
        if (b2.G) {
            final float a = esh.a(b.a.e);
            if (a > 0.0f) {
                PreferenceManager.getDefaultSharedPreferences(b.b.t.s()).edit().putFloat("photoSphereCalibratedFieldOfView", a).apply();
            }
            return;
        }
        final eth eth = new eth(b.a, b2.v, b2.D, b2.S);
        eth.c(new fnz(b, b.b.m.e, eth));
        b.b.c.b(eth);
    }
}

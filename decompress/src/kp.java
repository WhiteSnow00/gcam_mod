import android.content.IntentFilter;
import android.content.Context;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class kp extends kr
{
    public final PowerManager a;
    final /* synthetic */ kw b;
    
    public kp(final kw b, final Context context) {
        this.b = b;
        super(b);
        this.a = (PowerManager)context.getApplicationContext().getSystemService("power");
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
    
    @Override
    public final void b() {
        this.b.J();
    }
}

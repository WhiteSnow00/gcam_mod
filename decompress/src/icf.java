import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class icf extends BroadcastReceiver
{
    final /* synthetic */ icg a;
    
    public icf(final icg a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.a.m == null) {
            return;
        }
        final int intExtra = intent.getIntExtra("level", 0);
        if (intExtra <= 5L) {
            icg.a.c().E(2672).p("Low battery level: %d", intExtra);
            this.a.m.a.c();
        }
    }
}

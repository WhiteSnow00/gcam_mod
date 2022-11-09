import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class itg extends BroadcastReceiver
{
    final /* synthetic */ ith a;
    
    public itg(final ith a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        int n = 0;
        Label_0051: {
            switch (action.hashCode()) {
                case -1538406691: {
                    if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                        n = 0;
                        break Label_0051;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return;
            }
            case 0: {
                this.a.a(intent);
            }
        }
    }
}

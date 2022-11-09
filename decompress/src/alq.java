import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alq extends als
{
    private static final String f;
    
    static {
        f = aiy.b("BatteryNotLowTracker");
    }
    
    public alq(final Context context, final apa apa) {
        super(context, apa);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public final void c(final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        final aiy a = aiy.a();
        String.format("Received %s", intent.getAction());
        a.d(new Throwable[0]);
        final String action = intent.getAction();
        int n = 0;
        Label_0105: {
            switch (action.hashCode()) {
                case 490310653: {
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        n = 1;
                        break Label_0105;
                    }
                    break;
                }
                case -1980154005: {
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        n = 0;
                        break Label_0105;
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
            case 1: {
                this.g(false);
                return;
            }
            case 0: {
                this.g(true);
            }
        }
    }
}

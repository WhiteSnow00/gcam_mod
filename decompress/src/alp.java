import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alp extends als
{
    private static final String f;
    
    static {
        f = aiy.b("BatteryChrgTracker");
    }
    
    public alp(final Context context, final apa apa) {
        super(context, apa);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
    
    @Override
    public final void c(final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        final aiy a = aiy.a();
        String.format("Received %s", action);
        a.d(new Throwable[0]);
        int n = 0;
        Label_0145: {
            switch (action.hashCode()) {
                case 1019184907: {
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        n = 2;
                        break Label_0145;
                    }
                    break;
                }
                case 948344062: {
                    if (action.equals("android.os.action.CHARGING")) {
                        n = 0;
                        break Label_0145;
                    }
                    break;
                }
                case -54942926: {
                    if (action.equals("android.os.action.DISCHARGING")) {
                        n = 1;
                        break Label_0145;
                    }
                    break;
                }
                case -1886648615: {
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        n = 3;
                        break Label_0145;
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
            case 3: {
                this.g(false);
                return;
            }
            case 2: {
                this.g(true);
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

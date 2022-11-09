import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alx extends als
{
    static {
        aiy.b("StorageNotLowTracker");
    }
    
    public alx(final Context context, final apa apa) {
        super(context, apa);
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
                case -730838620: {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        n = 0;
                        break Label_0105;
                    }
                    break;
                }
                case -1181163412: {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        n = 1;
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

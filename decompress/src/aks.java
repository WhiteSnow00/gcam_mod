import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import android.content.BroadcastReceiver$PendingResult;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aks implements Runnable
{
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ BroadcastReceiver$PendingResult c;
    
    public aks(final Intent a, final Context b, final BroadcastReceiver$PendingResult c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            final boolean booleanExtra = this.a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            final boolean booleanExtra2 = this.a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            final boolean booleanExtra3 = this.a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            final boolean booleanExtra4 = this.a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            final aiy a = aiy.a();
            final int a2 = ConstraintProxyUpdateReceiver.a;
            String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", booleanExtra, booleanExtra2, booleanExtra3, booleanExtra4);
            a.d(new Throwable[0]);
            anv.a(this.b, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            anv.a(this.b, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            anv.a(this.b, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            anv.a(this.b, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        }
        finally {
            this.c.finish();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver$PendingResult;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class RescheduleReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = aiy.b("RescheduleReceiver");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final aiy a = aiy.a();
        String.format("Received intent %s", intent);
        a.d(new Throwable[0]);
        try {
            final akh e = akh.e(context);
            final BroadcastReceiver$PendingResult goAsync = this.goAsync();
            synchronized (akh.a) {
                e.i = goAsync;
                if (e.h) {
                    e.i.finish();
                    e.i = null;
                }
            }
        }
        catch (final IllegalStateException ex) {
            aiy.a();
            aiy.e(RescheduleReceiver.a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", ex);
        }
    }
}

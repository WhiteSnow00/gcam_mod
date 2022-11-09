import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class alr extends BroadcastReceiver
{
    final /* synthetic */ als a;
    
    public alr(final als a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            this.a.c(intent);
        }
    }
}

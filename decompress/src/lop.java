import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lop extends BroadcastReceiver
{
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Runnable b;
    
    public lop(final AtomicBoolean a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            context.unregisterReceiver((BroadcastReceiver)this);
            this.b.run();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.diagnostics;

import java.util.List;
import java.util.Collections;
import androidx.work.impl.workers.DiagnosticsWorker;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DiagnosticsReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = aiy.b("DiagnosticsRcvr");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        aiy.a().d(new Throwable[0]);
        try {
            final akh e = akh.e(context);
            final List<ajh> singletonList = Collections.singletonList(new ajg(DiagnosticsWorker.class).a());
            if (!singletonList.isEmpty()) {
                new ajs(e, null, 2, singletonList).a();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        catch (final IllegalStateException ex) {
            aiy.a();
            aiy.e(DiagnosticsReceiver.a, "WorkManager is not initialized", ex);
        }
    }
}

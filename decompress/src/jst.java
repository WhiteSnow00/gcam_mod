import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jst extends BroadcastReceiver
{
    public Context a;
    private final jss b;
    
    public jst(final jss b) {
        this.b = b;
    }
    
    public final void a() {
        synchronized (this) {
            final Context a = this.a;
            if (a != null) {
                a.unregisterReceiver((BroadcastReceiver)this);
            }
            this.a = null;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.b.a();
            this.a();
        }
    }
}

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdl extends BroadcastReceiver
{
    final /* synthetic */ hdm a;
    
    public hdl(final hdm a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final hdm a = this.a;
        final String value = String.valueOf(intent);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
        sb.append("Received UserPresent broadcast: ");
        sb.append(value);
        a.c(sb.toString());
    }
}

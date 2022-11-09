import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdk extends BroadcastReceiver
{
    final /* synthetic */ hdm a;
    
    public hdk(final hdm a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final hdm a = this.a;
        a.c = true;
        if (!a.b) {
            final String value = String.valueOf(intent);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 43);
            sb.append("Received ScreenOff broadcast after onStop: ");
            sb.append(value);
            a.c(sb.toString());
            return;
        }
        a.a.f("Ignoring ScreenOff shutdown behavior, the activity is still started.");
    }
}

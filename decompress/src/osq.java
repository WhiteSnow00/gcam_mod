import android.util.Log;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osq implements Runnable
{
    final /* synthetic */ PendingIntent a;
    
    public osq(final PendingIntent a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.send(0);
        }
        catch (final Exception ex) {
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31);
            sb.append("Couldn't launch PendingIntent: ");
            sb.append(value);
            Log.e("DaydreamApi", sb.toString());
        }
    }
}

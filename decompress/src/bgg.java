import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.util.Log;
import android.net.ConnectivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgg implements bge
{
    boolean a;
    final auy b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e;
    
    public bgg(final Context context, final auy b) {
        this.e = new bgf(this);
        this.c = context.getApplicationContext();
        this.b = b;
    }
    
    static final boolean a(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        bit.a(connectivityManager);
        try {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        catch (final RuntimeException ex) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", (Throwable)ex);
            }
            return true;
        }
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
        if (!this.d) {
            this.a = a(this.c);
            try {
                this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.d = true;
            }
            catch (final SecurityException ex) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", (Throwable)ex);
                }
            }
        }
    }
    
    @Override
    public final void i() {
        if (!this.d) {
            return;
        }
        this.c.unregisterReceiver(this.e);
        this.d = false;
    }
}

import android.net.ConnectivityManager$NetworkCallback;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alw extends alu
{
    static final String f;
    private final ConnectivityManager h;
    private final alv i;
    
    static {
        f = aiy.b("NetworkStateTracker");
    }
    
    public alw(final Context context, final apa apa) {
        super(context, apa);
        this.h = (ConnectivityManager)this.a.getSystemService("connectivity");
        this.i = new alv(this);
    }
    
    final ald a() {
        final NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean b = true;
        boolean b2;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3;
        try {
            final NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            b3 = (networkCapabilities != null && networkCapabilities.hasCapability(16));
        }
        catch (final SecurityException ex) {
            aiy.a();
            aiy.e(alw.f, "Unable to validate active network", ex);
            b3 = false;
        }
        final boolean activeNetworkMetered = this.h.isActiveNetworkMetered();
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            b = false;
        }
        return new ald(b2, b3, activeNetworkMetered, b);
    }
    
    @Override
    public final void d() {
        try {
            aiy.a().d(new Throwable[0]);
            this.h.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)this.i);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        aiy.a();
        final SecurityException ex;
        aiy.e(alw.f, "Received exception while registering network callback", ex);
    }
    
    @Override
    public final void e() {
        try {
            aiy.a().d(new Throwable[0]);
            this.h.unregisterNetworkCallback((ConnectivityManager$NetworkCallback)this.i);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        aiy.a();
        final SecurityException ex;
        aiy.e(alw.f, "Received exception while unregistering network callback", ex);
    }
}

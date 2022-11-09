import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class alv extends ConnectivityManager$NetworkCallback
{
    final /* synthetic */ alw a;
    
    public alv(final alw a) {
        this.a = a;
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        final aiy a = aiy.a();
        final int g = alw.g;
        String.format("Network capabilities changed: %s", networkCapabilities);
        a.d(new Throwable[0]);
        final alw a2 = this.a;
        a2.g(a2.a());
    }
    
    public final void onLost(final Network network) {
        final aiy a = aiy.a();
        final int g = alw.g;
        a.d(new Throwable[0]);
        final alw a2 = this.a;
        a2.g(a2.a());
    }
}

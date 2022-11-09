import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class iml extends ConnectivityManager$NetworkCallback
{
    final /* synthetic */ imp a;
    
    public iml(final imp a) {
        this.a = a;
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        final int b = nrr.B(this.a.a);
        final imp a = this.a;
        if (b != a.c) {
            a.b(false);
        }
    }
}

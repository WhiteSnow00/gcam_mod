import android.os.Bundle;
import android.location.Location;
import android.location.LocationListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class exx implements LocationListener
{
    final Location a;
    boolean b;
    final String c;
    
    public exx(final String c) {
        this.b = false;
        this.c = c;
        this.a = new Location(c);
    }
    
    public final void onLocationChanged(final Location location) {
        if (location.getLatitude() == 0.0 && location.getLongitude() == 0.0) {
            return;
        }
        this.a.set(location);
        this.b = true;
    }
    
    public final void onProviderDisabled(final String s) {
        this.b = false;
    }
    
    public final void onProviderEnabled(final String s) {
    }
    
    public final void onStatusChanged(final String s, final int n, final Bundle bundle) {
        switch (n) {
            default: {
                return;
            }
            case 0:
            case 1: {
                this.b = false;
            }
        }
    }
}

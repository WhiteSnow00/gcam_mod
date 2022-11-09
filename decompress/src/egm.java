import android.location.LocationManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egm implements oun
{
    private final pii a;
    
    public egm(final pii a) {
        this.a = a;
    }
    
    public final LocationManager a() {
        final LocationManager locationManager = (LocationManager)((egi)this.a.get()).a(egi.h);
        pqf.k(locationManager);
        return locationManager;
    }
}

import android.location.Location;
import android.location.LocationManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class li
{
    public static li a;
    public final Context b;
    public final lh c;
    private final LocationManager d;
    
    public li(final Context b, final LocationManager d) {
        this.c = new lh();
        this.b = b;
        this.d = d;
    }
    
    public final Location a(final String s) {
        try {
            if (this.d.isProviderEnabled(s)) {
                return this.d.getLastKnownLocation(s);
            }
        }
        catch (final Exception ex) {}
        return null;
    }
}

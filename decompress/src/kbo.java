import android.os.Parcel;
import android.location.Location;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbo extends bjf implements kbp
{
    private final jtd a;
    
    public kbo() {
        super("com.google.android.gms.location.ILocationListener");
    }
    
    public kbo(final jtd a) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = a;
    }
    
    public final void b(final Location location) {
        synchronized (this) {
            this.a.b(new kcd(location));
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.a.a();
        }
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        if (n == 1) {
            this.b((Location)bjg.a(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}

import android.location.LocationListener;
import android.location.LocationManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class exy implements exz
{
    public final pii a;
    public LocationManager b;
    final exx[] c;
    private boolean d;
    
    public exy(final pii a) {
        this.c = new exx[] { new exx("gps"), new exx("network") };
        this.a = a;
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        int n = 0;
        while (true) {
            final exx[] c = this.c;
            Object a = null;
            if (n >= 2) {
                f.o(null);
                return f;
            }
            final exx exx = c[n];
            if (exx.b) {
                a = exx.a;
            }
            if (a != null) {
                f.o(a);
                return f;
            }
            ++n;
        }
    }
    
    @Override
    public final void c(final boolean d) {
        if (this.d != d) {
            if (!(this.d = d)) {
                if (this.b != null) {
                    int n = 0;
                    while (true) {
                        final exx[] c = this.c;
                        if (n >= 2) {
                            break;
                        }
                        try {
                            this.b.removeUpdates((LocationListener)c[n]);
                        }
                        catch (final Exception ex) {}
                        ++n;
                    }
                }
            }
            else {
                mcn.n().execute(new exw(this));
            }
        }
    }
}

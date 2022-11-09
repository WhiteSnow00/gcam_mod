import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.os.SystemClock;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyd extends gxu
{
    public static final nsd e;
    public final eyx f;
    private final niz g;
    private gyb h;
    private double i;
    
    static {
        e = nsd.g("com/google/android/apps/camera/processing/imagebackend/LuckyShotImageFilter");
    }
    
    public gyd(final gxr gxr, final gyg gyg, final niz g, final eyx f) {
        super(gxr, gyg);
        this.h = null;
        this.i = 0.0;
        this.g = g;
        this.f = f;
    }
    
    public final void c(final Set set, final hhy hhy) {
        synchronized (this) {
            if (set.size() == 0) {
                gyd.e.c().E(2175).p("Filtered Image future failed to return a single image. There are %d images.  No Image produced.", set.size());
                return;
            }
            if (set.size() <= 1) {
                this.f.e = SystemClock.elapsedRealtimeNanos();
                final huz k = hhy.k();
                if (k != null) {
                    final hvb a = k.a();
                    if (a != null) {
                        final eyx f = this.f;
                        a.d = f.d;
                        a.e = f.e;
                        synchronized (f.a) {
                            final List f2 = f.f;
                            List f3;
                            if (f2 != null) {
                                f3 = new ArrayList(f2);
                                monitorexit(f.a);
                            }
                            else {
                                monitorexit(f.a);
                                f3 = null;
                            }
                            a.f = f3;
                        }
                    }
                }
                final gam gam = (gam)((njd)this.g).a;
                final gyb gyb = set.iterator().next();
                hhy.k().x(this.f);
                gam.b.a.a.g("finish lucky shot selection, pass to the piped image saver");
                try {
                    final gdf a2 = gam.a;
                    final lju a3 = gyb.a;
                    final oey c = gyb.c;
                    c.getClass();
                    a2.a(a3, c);
                    return;
                }
                finally {
                    gam.a.close();
                }
            }
            gyd.e.b().E(2174).p("Filtered Image return multiple images. There are %d images.  No Image produced.", set.size());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            SystemClock.elapsedRealtimeNanos();
            super.close();
        }
    }
    
    public final gyb d(final gyb h, final double i) {
        synchronized (this) {
            final gyb h2 = this.h;
            if (h2 != null && i <= this.i) {
                return h;
            }
            this.h = h;
            this.i = i;
            return h2;
        }
    }
}

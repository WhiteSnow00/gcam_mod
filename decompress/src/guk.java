import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guk
{
    private static final nsd d;
    public final gui a;
    public final cxl b;
    public final kjk c;
    private final dvj e;
    
    static {
        d = nsd.g("com/google/android/apps/camera/pixelcamerakit/temporalbinning/TemporalBinningUtils");
    }
    
    public guk(final gui a, final dvj e, final cxl b, final kjk c) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    private final Set c(final List list) {
        final HashSet set = new HashSet();
        for (final kvs kvs : list) {
            final kvx b = kvs.b();
            if (b != null && !this.b(kvs)) {
                set.add(b);
            }
        }
        return set;
    }
    
    public final Set a(final List list) {
        if (!this.b.k(cxs.S)) {
            return nqr.a;
        }
        Set set = this.c(list);
        if (!list.isEmpty() && set.size() == list.size()) {
            final HashSet set2 = new HashSet();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final ljm c = ((kvs)iterator.next()).c();
                if (c != null) {
                    set2.add(this.e.a(c));
                }
            }
            final Iterator iterator2 = set2.iterator();
            while (iterator2.hasNext()) {
                this.e.u((int)iterator2.next());
            }
            final Set set3 = set = this.c(list);
            if (set3.size() == list.size()) {
                a.l(guk.d.b(), "[zsl-ns] Binning has claimed all frames. Giving up and sending all frames to Gcam.", '\u083a');
                set3.clear();
                return set3;
            }
        }
        return set;
    }
    
    public final boolean b(final kvs kvs) {
        final ljm c = kvs.c();
        return c != null && this.e.z(c);
    }
}

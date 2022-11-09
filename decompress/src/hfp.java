import java.io.File;
import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfp implements hfn
{
    public static final nsd a;
    private final Map b;
    private final kjm c;
    private final eyt d;
    private final hhw e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/session/CaptureSessionManagerImpl");
    }
    
    public hfp(final hhw e, final kjm c, final eyt d) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = new LinkedHashMap();
    }
    
    @Override
    public final hhy a(final him him) {
        synchronized (this.b) {
            return this.b.get(him);
        }
    }
    
    @Override
    public final oey b(final hhz hhz) {
        final Map b = this.b;
        monitorenter(b);
        try {
            final Collection values = this.b.values();
            final int size = values.size();
            bst bst;
            if (size > 0) {
                bst = new bst(size);
            }
            else {
                bst = null;
            }
            for (final hhy hhy : values) {
                ofi.w(hhy.q(), new hfo(hhy, hhz, bst), this.c);
            }
            oey oey;
            if (bst == null) {
                oey = oev.a;
            }
            else {
                oey = bst.a;
            }
            monitorexit(b);
            return oey;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final File c(final String s) {
        return this.e.a(s);
    }
    
    @Override
    public final void d(final him him) {
        synchronized (this.b) {
            synchronized (this.b) {
                final hhy hhy = this.b.remove(him);
                monitorexit(this.b);
                monitorexit(this.b);
                if (hhy != null) {
                    hhy.A();
                    return;
                }
                a.l(hfp.a.c(), "Session was already removed, cannot be finalized", '\u08e8');
            }
        }
    }
    
    @Override
    public final void e(final hhy hhy) {
        final hvb hvb = new hvb(this.d, hhy.h());
        final huz k = hhy.k();
        k.getClass();
        k.y(hvb);
        hhy.u(hvb);
        synchronized (this.b) {
            this.b.put(hhy.h(), hhy);
        }
    }
}

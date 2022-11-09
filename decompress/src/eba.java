import java.util.concurrent.atomic.AtomicBoolean;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eba
{
    private static final nsd p;
    public final kse a;
    public final krr b;
    public final edc c;
    public final edf d;
    public final kjm e;
    public final kkz f;
    public final bpt g;
    public kwd h;
    public Surface i;
    public kwz j;
    public kvw k;
    public eaz l;
    public kvv m;
    public final AtomicBoolean n;
    public final lae o;
    private final cxl q;
    
    static {
        p = nsd.g("com/google/android/apps/camera/imax/ImaxFrameServer");
    }
    
    public eba(final lae o, final krr krr, final kse a, final cxl q, final edc c, final edf d, final kjm e, final bpt g) {
        this.n = new AtomicBoolean(false);
        this.o = o;
        this.a = a;
        this.q = q;
        this.c = c;
        this.d = d;
        this.e = e;
        this.b = krr.a("ImaxFrameServer");
        this.f = new kkz(false);
        this.g = g;
    }
    
    public final void a(final boolean b) {
        if (b) {
            try {
                final kwd h = this.h;
                h.getClass();
                final cxl q = this.q;
                final cxm a = cxt.a;
                q.d();
                h.o(true);
                return;
            }
            catch (final Exception ex) {
                a.m(eba.p.b(), "Panorama failed to lock 3A.", '\u0432', ex);
                return;
            }
        }
        try {
            final kwd h2 = this.h;
            h2.getClass();
            h2.k(true, true, true);
        }
        catch (final Exception ex2) {
            a.m(eba.p.b(), "Panorama failed to unlock 3A.", '\u0430', ex2);
        }
    }
    
    public final boolean b() {
        return (boolean)this.f.d;
    }
}

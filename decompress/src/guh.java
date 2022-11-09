import java.util.Iterator;
import j$.util.function.Supplier;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guh implements kvv, krc
{
    public static final nsd a;
    public final dvj b;
    public final gry c;
    public final kvw d;
    public final HashSet e;
    public final kkn f;
    private final Supplier g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/temporalbinning/PckTemporalBinningShunt");
    }
    
    public guh(final dvj b, final gry c, final kkn f, final Supplier g, final kvw d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new HashSet();
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a(final lbe lbe) {
        if (this.g.get()) {
            kwp.l(lbe, new guf(this));
        }
    }
    
    @Override
    public final void close() {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            this.b.u((int)iterator.next());
        }
        this.e.clear();
    }
}

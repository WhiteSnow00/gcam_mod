import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bye implements jyw
{
    public static final nsd a;
    public final Deque b;
    public final AtomicReference c;
    public final AtomicInteger d;
    private final bys e;
    private final ExecutorService f;
    private final bza g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/examplestore/lib/CamExampleIterator");
    }
    
    public bye(final bys e, final bza g, final byx byx, final ExecutorService f) {
        this.f = f;
        this.e = e;
        this.g = g;
        this.c = new AtomicReference((V)byx);
        this.b = new ArrayDeque();
        this.d = new AtomicInteger();
    }
    
    @Override
    public final void a(final jzt jzt) {
        Object o = this.b;
        synchronized (o) {
            oey oey;
            if (!this.b.isEmpty()) {
                oey = oev.a;
                monitorexit(o);
            }
            else {
                monitorexit(o);
                final bys e = this.e;
                o = this.g;
                final byx byx = this.c.get();
                final int g = this.g.g;
                int min = 100;
                if (g > 0) {
                    min = Math.min(100, g - this.d.get());
                }
                oey = odg.h(ofi.r(new byk(e, (bza)o, byx, min), e.e), new byc(this), this.f);
            }
            ofi.w(oey, new byd(this, jzt), this.f);
        }
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void close() {
    }
}

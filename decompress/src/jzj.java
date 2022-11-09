import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzj implements jyw
{
    public final Deque a;
    public final AtomicReference b;
    public final AtomicInteger c;
    private final String d;
    private final jzq e;
    private final ExecutorService f;
    private final oif g;
    
    public jzj(final jzq e, final String d, final oif g, final oie oie, final ExecutorService f) {
        this.f = f;
        this.e = e;
        this.d = d;
        this.g = g;
        this.b = new AtomicReference((V)oie);
        this.a = new ArrayDeque();
        this.c = new AtomicInteger();
    }
    
    @Override
    public final void a(final jzt jzt) {
        Object o = this.a;
        synchronized (o) {
            oey oey;
            if (!this.a.isEmpty()) {
                oey = ofi.n(null);
                monitorexit(o);
            }
            else {
                monitorexit(o);
                o = this.e;
                final String d = this.d;
                final oif g = this.g;
                final oie oie = this.b.get();
                final int g2 = this.g.g;
                int min;
                if (g2 > 0) {
                    min = Math.min(100, g2 - this.c.get());
                }
                else {
                    min = 100;
                }
                oey = odg.h(ofi.r(new jzo((jzq)o, d, g, oie, min), ((jzq)o).d), new jzh(this), this.f);
            }
            ofi.w(oey, new jzi(this, jzt), this.f);
        }
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void close() {
    }
}

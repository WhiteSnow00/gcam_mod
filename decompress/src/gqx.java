import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gqx implements kvv
{
    public final List a;
    public boolean b;
    final /* synthetic */ gqy c;
    private final AtomicInteger d;
    private final AtomicInteger e;
    private final long f;
    
    public gqx(final gqy c, final long f) {
        this.c = c;
        this.a = new ArrayList();
        this.d = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
        this.b = true;
        this.f = f;
    }
    
    @Override
    public final void a(final lbe lbe) {
        synchronized (this) {
            if (!this.b) {
                return;
            }
            monitorexit(this);
            final kvx b = lbe.b();
            if (b == null || b.b <= this.f) {
                return;
            }
            final int value = this.d.get();
            final gqy c = this.c;
            if (value >= c.b) {
                synchronized (c.c) {
                    final gqy c2 = this.c;
                    c2.e.l(c2.d);
                    monitorexit(c.c);
                    synchronized (this) {
                        this.b = false;
                        this.notifyAll();
                        return;
                    }
                }
            }
            final kvs a = lbe.a();
            this.d.incrementAndGet();
            if (a == null) {
                gqy.a.c().E(2023).z("Image not available %d (done: %s, metadata done: %s, images done: %s", this.d.get(), lbe.e(), lbe.a.m(), lbe.a.l());
                this.c.f.aR(null);
                return;
            }
            this.a.add(a);
            this.c.f.aR(null);
            this.e.incrementAndGet();
            this.e.get();
        }
    }
}

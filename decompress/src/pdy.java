import java.util.concurrent.atomic.AtomicLongArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdy implements pss
{
    final int a;
    final int b;
    final /* synthetic */ pdz c;
    
    public pdy(final pdz c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        if (this.c.b.compareAndSet(this.a + this.b, 0L, 1L)) {
            final pdz c = this.c;
            final int b = this.b;
            if (c.b.decrementAndGet(b + b) == 0L) {
                c.k = true;
                c.f.a();
                if (c.getAndIncrement() == 0) {
                    c.g.bZ();
                }
            }
        }
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            final AtomicLongArray b = this.c.b;
            long value;
            do {
                value = b.get(this.a);
                if (value == Long.MAX_VALUE) {
                    return;
                }
            } while (!b.compareAndSet(this.a, value, phn.c(value, n)));
            if (this.c.l.get() == this.b) {
                this.c.d();
            }
        }
    }
}

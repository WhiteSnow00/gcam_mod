import java.util.Collection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class lws
{
    public final lxh a;
    public final Object[] b;
    public final lwi[] c;
    public volatile boolean d;
    private final AtomicInteger e;
    
    public lws(final Iterable iterable) {
        this.a = lxh.i();
        int n = 0;
        this.d = false;
        final int size = ((Collection)iterable).size();
        this.b = new Object[size];
        this.c = new lwi[size];
        this.e = new AtomicInteger(size);
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((lwh)iterator.next()).c(odx.a, new lwq(this, n), new lwr(this, n)).h(lvm.a);
            ++n;
        }
    }
    
    public final void a() {
        if (this.e.decrementAndGet() == 0) {
            if (this.d) {
                final lwi[] c = this.c;
                final int length = c.length;
                lwi lwi = null;
                lwi lwi3;
                for (int i = 0; i < length; ++i, lwi = lwi3) {
                    final lwi lwi2 = c[i];
                    lwi3 = lwi;
                    if (lwi2 != null) {
                        if (lwi == null) {
                            lwi3 = lwi2;
                        }
                        else {
                            lwi.addSuppressed(lwi2);
                            lwi3 = lwi;
                        }
                    }
                }
                if (lwi != null) {
                    this.a.l(lwi);
                    return;
                }
                this.a.l(lwi.a(new AssertionError((Object)"Result list was marked as having an exception,but no exception was found")));
            }
            else {
                this.a.k(Arrays.asList(this.b));
            }
        }
    }
}

import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public class gxu implements gxs
{
    public final AtomicInteger a;
    public final ofn b;
    public final Object c;
    public int d;
    private final Set e;
    private final gxr f;
    private final gyg g;
    
    public gxu(final gxr f, final gyg g) {
        this.e = new HashSet();
        this.a = new AtomicInteger(0);
        this.b = ofn.f();
        this.c = new Object();
        this.d = 1;
        this.f = f;
        this.g = g;
    }
    
    public final void a() {
        njo.o(this.d == 3);
        if (this.e.size() > 0) {
            final gxr f = this.f;
            Object e = ((gxp)f).e;
            synchronized (e) {
                ((gxp)f).g.retainAll(((gxp)f).e.keySet());
                final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(((gxp)f).g));
                monitorexit(e);
                e = new HashSet<gyb>();
                for (gyb gyb : this.e) {
                    final lju a = gyb.a;
                    if (a != null && unmodifiableSet.contains(a)) {
                        final gxr f2 = this.f;
                        final lju a2 = gyb.a;
                        synchronized (((gxp)f2).e) {
                            if (((gxp)f2).g.contains(a2)) {
                                ((gxp)f2).g.remove(a2);
                                if (((gxp)f2).e.remove(a2) != null) {
                                    --((gxp)f2).h;
                                    monitorexit(((gxp)f2).e);
                                }
                                else {
                                    monitorexit(((gxp)f2).e);
                                }
                            }
                            else {
                                monitorexit(((gxp)f2).e);
                            }
                            ((Set<gyb>)e).add(gyb);
                            continue;
                        }
                        break;
                    }
                }
                this.b.o(e);
                return;
            }
        }
        this.b.o(new HashSet());
    }
    
    public final void b(final gyb gyb, final hhy hhy) {
        synchronized (this) {
            synchronized (this.c) {
                final int d = this.d;
                final boolean b = false;
                njo.o(d == 2);
                njo.o(this.a.get() > 0 || b);
                this.a.incrementAndGet();
                this.e.add(gyb);
                final gxt gxt = new gxt(this);
                try {
                    final gxr f = this.f;
                    final gyg g = this.g;
                    final gyq gyq = new gyq(gyb, g.b, g.a, g.c, hhy, g.f, g.d, g.e);
                    final niz i = niz.i(gxt);
                    final HashSet set = new HashSet(1);
                    set.add(gyq);
                    ((gxp)f).d(gyq.g, set, false, true, i);
                }
                catch (final InterruptedException ex) {
                    ex.printStackTrace();
                    throw new IllegalStateException("Interrupt should NOT happen, because call is non-blocking");
                }
            }
        }
    }
    
    @Override
    public void close() {
        synchronized (this) {
            synchronized (this.c) {
                final int d = this.d;
                boolean b = true;
                if (d != 2) {
                    if (d != 3) {
                        b = false;
                    }
                }
                njo.o(b);
                if (this.d != 3) {
                    this.d = 3;
                    if (this.a.decrementAndGet() == 0) {
                        this.a();
                    }
                }
            }
        }
    }
}

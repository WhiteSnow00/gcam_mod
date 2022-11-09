import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkn
{
    public final Object a;
    public final Deque b;
    public int c;
    private final Executor d;
    private final kqu e;
    
    public kkn(final Executor d, final kqu e) {
        this.a = new Object();
        this.b = new ArrayDeque();
        this.c = 0;
        njo.d(true);
        this.d = d;
        this.e = e;
    }
    
    public final oey a(Runnable runnable) {
        Object o = this.a;
        synchronized (o) {
            Object a;
            if (this.c >= 2) {
                a = this.e.a(this.b);
                if (a == null) {
                    return ofi.n(false);
                }
                --this.c;
            }
            else {
                a = null;
            }
            final kko kko = new kko(runnable);
            this.b.add(kko);
            ++this.c;
            monitorexit(o);
            try {
                o = this.d;
                runnable = new kkm(this);
                ((Executor)o).execute(runnable);
            }
            catch (final RejectedExecutionException ex) {
                synchronized (this.a) {
                    o = this.b.pollFirst();
                    if (o != null) {
                        ((kko)o).b.o(false);
                    }
                    --this.c;
                    monitorexit(this.a);
                    if (a != null) {
                        ((kko)a).b.o(false);
                    }
                    return kko.b;
                }
            }
        }
    }
}

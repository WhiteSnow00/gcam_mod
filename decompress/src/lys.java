import java.util.concurrent.RejectedExecutionException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public class lys extends lvh implements lyp
{
    private static final Callable b;
    public volatile boolean a;
    private final Executor c;
    private final lwh d;
    private final lxh e;
    private final HashMap f;
    
    static {
        b = new mzt(1);
    }
    
    public lys(final Executor c) {
        this.e = lxh.i();
        this.f = new HashMap();
        this.a = true;
        this.c = c;
        this.d = lwt.a(c, lys.b);
    }
    
    private final Collection k() {
        synchronized (this.f) {
            final ArrayList list = new ArrayList(this.f.values());
            this.f.clear();
            return list;
        }
    }
    
    @Override
    protected final lwk b() {
        final Collection k = this.k();
        final Executor c = this.c;
        final lyr a = lyr.a;
        final ArrayList list = new ArrayList();
        final Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            list.add(lwt.b(iterator.next()));
        }
        final ArrayList list2 = new ArrayList();
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(((lwh)iterator2.next()).b(c, a));
        }
        return lwk.i(lwt.c(list2).b(this.c, new lwm(this.e)).b(this.c, new lyr(1)).b(this.c, new lyq(this)));
    }
    
    @Override
    protected final void bG() {
        final Iterator iterator = this.k().iterator();
        while (iterator.hasNext()) {
            ((mdk)iterator.next()).close();
        }
        ((lyo)lwt.f(this.e)).close();
        this.a = false;
        lwt.f(this.i());
    }
    
    @Override
    public final lyo d() {
        return (lyo)lwt.d(this.e);
    }
    
    @Override
    public final map e() {
        return ((lzy)((lyo)lwt.d(this.e)).j()).h();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.a) {
            this.c.execute(runnable);
            return;
        }
        throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
    }
    
    @Override
    public final void f(final lzq lzq, final Runnable runnable) {
        this.execute(new oyq(1));
    }
    
    @Override
    public final boolean g() {
        return lwt.e(this.d) == Thread.currentThread();
    }
    
    @Override
    public final mdk h(Object o, final njp njp) {
        synchronized (this.f) {
            final mdk mdk = this.f.get(o);
            final mdk mdk2;
            Label_0067: {
                if (mdk == null) {
                    try {
                        final Object o2 = new mdk((mde)njp.a());
                        this.f.put(o, o2);
                        o = o2;
                        break Label_0067;
                    }
                    finally {
                        throw njt.a((Throwable)mdk2);
                    }
                }
                mdk2 = mdk;
            }
            if (mdk2.b.get()) {
                mdk2.a.a.incrementAndGet();
                return new mdk(mdk2.a);
            }
            o = new mdh();
            throw o;
        }
    }
    
    protected lwk i() {
        return lwj.a;
    }
    
    public final void j(final lyo lyo) {
        this.e.k(lyo);
    }
}

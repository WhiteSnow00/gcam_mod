import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class owx implements psq
{
    public static final int a;
    
    static {
        a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    public static owx b() {
        final owx b = pap.b;
        pip.l();
        return b;
    }
    
    public static owx c(final Throwable t) {
        phn.g(t, "throwable is null");
        final paq paq = new paq(oyw.a(t));
        pip.l();
        return paq;
    }
    
    public static owx d(final Object o) {
        phn.g(o, "item is null");
        final pax pax = new pax(o);
        pip.l();
        return pax;
    }
    
    public static owx f(final long n, final TimeUnit timeUnit, final oxj oxj) {
        phn.g(timeUnit, "unit is null");
        phn.g(oxj, "scheduler is null");
        final pbu pbu = new pbu(Math.max(0L, n), timeUnit, oxj);
        pip.l();
        return pbu;
    }
    
    public static owx l(final int n) {
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(42);
            sb.append("count >= 0 required but it was ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return b();
        }
        if (n == 1) {
            return d(0);
        }
        final pbf pbf = new pbf(n);
        pip.l();
        return pbf;
    }
    
    public final owx a(final oyf oyf) {
        phn.h(2, "prefetch");
        owx owx;
        if (this instanceof ozb) {
            final Object call = ((ozb)this).call();
            if (call == null) {
                owx = b();
            }
            else {
                owx = phn.e(call, oyf);
            }
        }
        else {
            owx = new pao(this, oyf);
            pip.l();
        }
        return owx;
    }
    
    public final owx e(final Object o, final oyd oyd) {
        final pbq pbq = new pbq(this, oyw.a(o), oyd);
        pip.l();
        return pbq;
    }
    
    public final oxk g(final Callable callable, final oyc oyc) {
        final pai pai = new pai(this, callable, oyc);
        pip.o();
        return pai;
    }
    
    public final oxk h(final Object o) {
        phn.g(o, "defaultItem");
        final paz paz = new paz(this, o);
        pip.o();
        return paz;
    }
    
    public final void i(final owy owy) {
        phn.g(owy, "s is null");
        try {
            final oyd p = pip.p;
            phn.g(owy, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.k(owy);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            psn.e(t);
            pip.g(t);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    @Override
    public final void j(final psr psr) {
        if (psr instanceof owy) {
            this.i((owy)psr);
            return;
        }
        phn.g(psr, "s is null");
        this.i(new pgx(psr));
    }
    
    protected abstract void k(final psr p0);
}

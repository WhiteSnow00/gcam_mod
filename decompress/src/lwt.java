import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwt
{
    public static lwh a(final Executor executor, final Callable callable) {
        final lxh i = lxh.i();
        try {
            executor.execute(new lwn(i, callable));
        }
        catch (final Exception ex) {
            i.l(lwi.a(ex));
        }
        return i;
    }
    
    public static lwh b(final Object o) {
        return new lwg(o);
    }
    
    public static lwh c(final Iterable iterable) {
        if (((Collection)iterable).isEmpty()) {
            return b(Collections.emptyList());
        }
        return new lws(iterable).a;
    }
    
    public static Object d(final lwh lwh) {
        final Object e = e(lwh);
        if (e != null) {
            return e;
        }
        final String value = String.valueOf(lwh);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55);
        sb.append("Attempting to get value of ");
        sb.append(value);
        sb.append(" which is not yet available!");
        throw new IllegalStateException(sb.toString());
    }
    
    public static Object e(final lwh lwh) {
        if (lwh.f()) {
            return f(lwh);
        }
        return null;
    }
    
    public static Object f(final lwh lwh) {
        try {
            return g(lwh);
        }
        catch (final lwi lwi) {
            throw new ofw(lwi);
        }
    }
    
    public static Object g(final lwh lwh) {
        int n = 0;
        while (true) {
            try {
                final Object e = lwh.e();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return e;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    public static lwa h() {
        njo.e(true, "maxPendingEventCount must be > 0");
        return new lwa();
    }
    
    public static lvj i(final int n) {
        return new lvj(new ArrayList(n));
    }
    
    public static lva j(final Throwable t) {
        return new lvf(t);
    }
    
    public static lva k(final Object o) {
        return new lvc(o);
    }
    
    public static lva l(final Throwable t) {
        return new lve(t);
    }
    
    public static lvn m() {
        return new lvd();
    }
    
    public static Object n(final keg keg, final long n, final TimeUnit timeUnit) {
        if (jxc.d()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        jvu.j(timeUnit, "TimeUnit must not be null");
        if (keg.d()) {
            return p(keg);
        }
        final ken ken = new ken();
        keg.i(kel.b, ken);
        keg.h(kel.b, ken);
        final Executor b = kel.b;
        final kem kem = (kem)keg;
        kem.b.a(new kdv(b, ken));
        kem.j();
        if (ken.a.await(n, timeUnit)) {
            return p(keg);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    public static boolean o(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    private static Object p(final keg keg) {
        if (keg.e()) {
            return keg.c();
        }
        if (((kem)keg).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(keg.b());
    }
}

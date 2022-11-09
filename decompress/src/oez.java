import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oez extends FutureTask implements oey
{
    private final oea a;
    
    public oez(final Callable callable) {
        super(callable);
        this.a = new oea();
    }
    
    public static oez a(final Callable callable) {
        return new oez(callable);
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        final oea a = this.a;
        runnable.getClass();
        executor.getClass();
        synchronized (a) {
            if (!a.b) {
                a.a = new odz(runnable, executor, a.a);
                return;
            }
            monitorexit(a);
            oea.a(runnable, executor);
        }
    }
    
    @Override
    protected final void done() {
        Object o = this.a;
        monitorenter(o);
        try {
            if (((oea)o).b) {
                monitorexit(o);
                return;
            }
            ((oea)o).b = true;
            Object a = ((oea)o).a;
            odz c = null;
            ((oea)o).a = null;
            monitorexit(o);
            while (true) {
                o = c;
                if (a == null) {
                    break;
                }
                o = ((odz)a).c;
                ((odz)a).c = c;
                c = (odz)a;
                a = o;
            }
            while (o != null) {
                oea.a(((odz)o).a, ((odz)o).b);
                o = ((odz)o).c;
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        final long nanos = timeUnit.toNanos(n);
        if (nanos <= 2147483647999999999L) {
            return super.get(n, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}

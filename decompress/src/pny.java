import java.util.Iterator;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pny
{
    private static final List a;
    
    static {
        final Iterator<CoroutineExceptionHandler> iterator = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        iterator.getClass();
        a = plv.c(new pmf(new pmp(iterator)));
    }
    
    public static final void a(pjq iterator, final Throwable t) {
        iterator.getClass();
        iterator = (pjq)pny.a.iterator();
        while (((Iterator)iterator).hasNext()) {
            final CoroutineExceptionHandler coroutineExceptionHandler = ((Iterator<CoroutineExceptionHandler>)iterator).next();
            try {
                coroutineExceptionHandler.f();
            }
            finally {
                final Thread currentThread = Thread.currentThread();
                final Throwable t2;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, poe.c(t, t2));
            }
        }
        final Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, t);
    }
}

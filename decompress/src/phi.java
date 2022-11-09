import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phi
{
    public static final Throwable a;
    
    static {
        a = new phh();
    }
    
    public static RuntimeException a(final Throwable t) {
        if (t instanceof Error) {
            throw (Error)t;
        }
        if (t instanceof RuntimeException) {
            return (RuntimeException)t;
        }
        return new RuntimeException(t);
    }
    
    public static Throwable b(final AtomicReference atomicReference) {
        final Throwable t = atomicReference.get();
        final Throwable a = phi.a;
        if (t != a) {
            return atomicReference.getAndSet(a);
        }
        return t;
    }
    
    public static boolean c(final AtomicReference atomicReference, final Throwable t) {
        Throwable t2;
        Throwable t3;
        do {
            t2 = atomicReference.get();
            if (t2 == phi.a) {
                return false;
            }
            if (t2 == null) {
                t3 = t;
            }
            else {
                t3 = new oxw(new Throwable[] { t2, t });
            }
        } while (!atomicReference.compareAndSet(t2, t3));
        return true;
    }
}

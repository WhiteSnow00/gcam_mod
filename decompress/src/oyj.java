import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum oyj implements oxp
{
    a;
    
    public static void b() {
        pip.g(new oxz("Disposable already set!"));
    }
    
    public static boolean c(final oxp oxp) {
        return oxp == oyj.a;
    }
    
    public static boolean e(final AtomicReference atomicReference, final oxp oxp) {
        phn.g(oxp, "d is null");
        if (!atomicReference.compareAndSet(null, oxp)) {
            oxp.bX();
            if (atomicReference.get() != oyj.a) {
                b();
            }
            return false;
        }
        return true;
    }
    
    public static boolean f(final oxp oxp, final oxp oxp2) {
        if (oxp2 == null) {
            pip.g(new NullPointerException("next is null"));
            return false;
        }
        if (oxp != null) {
            oxp2.bX();
            b();
            return false;
        }
        return true;
    }
    
    public static void g(final AtomicReference atomicReference) {
        final oxp oxp = atomicReference.get();
        final oyj a = oyj.a;
        if (oxp != a) {
            final oxp oxp2 = atomicReference.getAndSet(a);
            if (oxp2 != a && oxp2 != null) {
                oxp2.bX();
            }
        }
    }
    
    public static void h(final AtomicReference atomicReference, final oxp oxp) {
        oxp oxp2;
        do {
            oxp2 = atomicReference.get();
            if (oxp2 == oyj.a) {
                if (oxp != null) {
                    oxp.bX();
                }
            }
        } while (!atomicReference.compareAndSet(oxp2, oxp));
    }
    
    public static void i(final AtomicReference atomicReference, final oxp oxp) {
        oxp oxp2;
        do {
            oxp2 = atomicReference.get();
            if (oxp2 == oyj.a) {
                if (oxp != null) {
                    oxp.bX();
                }
                return;
            }
        } while (!atomicReference.compareAndSet(oxp2, oxp));
        if (oxp2 != null) {
            oxp2.bX();
        }
    }
    
    public static void j(final AtomicReference atomicReference, final oxp oxp) {
        if (!atomicReference.compareAndSet(null, oxp) && atomicReference.get() == oyj.a) {
            oxp.bX();
        }
    }
    
    @Override
    public final void bX() {
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}

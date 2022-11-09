import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum phe implements pss
{
    a;
    
    public static void b(final AtomicReference atomicReference, final AtomicLong atomicLong, long andSet) {
        final pss pss = atomicReference.get();
        if (pss != null) {
            pss.cb(andSet);
            return;
        }
        if (g(andSet)) {
            phn.b(atomicLong, andSet);
            final pss pss2 = atomicReference.get();
            if (pss2 != null) {
                andSet = atomicLong.getAndSet(0L);
                if (andSet != 0L) {
                    pss2.cb(andSet);
                }
            }
        }
    }
    
    public static void c(final long n) {
        final StringBuilder sb = new StringBuilder(50);
        sb.append("More produced than requested: ");
        sb.append(n);
        pip.g(new oxz(sb.toString()));
    }
    
    public static void e() {
        pip.g(new oxz("Subscription already set!"));
    }
    
    public static boolean f(final AtomicReference atomicReference, final pss pss) {
        phn.g(pss, "s is null");
        if (!atomicReference.compareAndSet(null, pss)) {
            pss.a();
            if (atomicReference.get() != phe.a) {
                e();
            }
            return false;
        }
        return true;
    }
    
    public static boolean g(final long n) {
        if (n <= 0L) {
            final StringBuilder sb = new StringBuilder(46);
            sb.append("n > 0 required but it was ");
            sb.append(n);
            pip.g(new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }
    
    public static boolean h(final pss pss, final pss pss2) {
        if (pss2 == null) {
            pip.g(new NullPointerException("next is null"));
            return false;
        }
        if (pss != null) {
            pss2.a();
            e();
            return false;
        }
        return true;
    }
    
    public static void i(final AtomicReference atomicReference) {
        final pss pss = atomicReference.get();
        final phe a = phe.a;
        if (pss != a) {
            final pss pss2 = atomicReference.getAndSet(a);
            if (pss2 != a && pss2 != null) {
                pss2.a();
            }
        }
    }
    
    public static void j(final AtomicReference atomicReference, final AtomicLong atomicLong, final pss pss) {
        if (f(atomicReference, pss)) {
            final long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0L) {
                pss.cb(andSet);
            }
        }
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void cb(final long n) {
    }
}

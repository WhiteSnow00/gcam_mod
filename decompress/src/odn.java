import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class odn extends ocy
{
    private static final Logger a;
    public static final odk b;
    public volatile int remaining;
    public volatile Set seenExceptions;
    
    static {
        a = Logger.getLogger(odn.class.getName());
        odm b2;
        try {
            final odl odl = new odl(AtomicReferenceFieldUpdater.newUpdater(odn.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(odn.class, "remaining"));
        }
        finally {
            b2 = new odm();
        }
        b = b2;
        final Throwable t;
        if (t != null) {
            odn.a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", t);
        }
    }
    
    public odn(final int remaining) {
        this.seenExceptions = null;
        this.remaining = remaining;
    }
    
    public abstract void f(final Set p0);
}

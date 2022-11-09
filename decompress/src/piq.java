import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class piq implements Serializable, pik
{
    private static final AtomicReferenceFieldUpdater a;
    private volatile pkn b;
    private volatile Object c;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(piq.class, Object.class, "c");
    }
    
    public piq(final pkn b) {
        this.b = b;
        this.c = pis.a;
    }
    
    private final Object writeReplace() {
        return new pij(this.a());
    }
    
    @Override
    public final Object a() {
        final Object c = this.c;
        if (c != pis.a) {
            return c;
        }
        final pkn b = this.b;
        if (b != null) {
            final Object a = b.a();
            if (piq.a.compareAndSet(this, pis.a, a)) {
                this.b = null;
                return a;
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        String value;
        if (this.c != pis.a) {
            value = String.valueOf(this.a());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
}

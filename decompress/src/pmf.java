import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmf implements pml
{
    private final AtomicReference a;
    
    public pmf(final pml pml) {
        this.a = new AtomicReference((V)pml);
    }
    
    @Override
    public final Iterator a() {
        final pml pml = this.a.getAndSet(null);
        if (pml != null) {
            return pml.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

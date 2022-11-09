import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

final class odl extends odk
{
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;
    
    public odl(final AtomicReferenceFieldUpdater a, final AtomicIntegerFieldUpdater b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final odn odn) {
        return this.b.decrementAndGet(odn);
    }
    
    @Override
    public final void b(final odn odn, final Set set) {
        this.a.compareAndSet(odn, null, set);
    }
}

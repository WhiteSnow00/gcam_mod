import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdi extends pho
{
    final oxf a;
    final AtomicReference b;
    
    public pdi(final oxf a) {
        this.a = a;
        this.b = new AtomicReference();
    }
    
    public final void b(final oxp oxp) {
        this.b.compareAndSet(oxp, null);
    }
    
    @Override
    protected final void g(final oxg oxg) {
        pdh pdh;
        do {
            pdh = this.b.get();
            if (pdh != null) {
                break;
            }
            pdh = new pdh(this.b);
        } while (!this.b.compareAndSet(null, pdh));
        final pdg pdg = new pdg(oxg, pdh);
        oxg.bV(pdg);
        while (true) {
            final pdg[] array = pdh.get();
            if (array == pdh.b) {
                final Throwable f = pdh.f;
                if (f != null) {
                    oxg.b(f);
                    return;
                }
                oxg.bU();
            }
            else {
                final int length = array.length;
                final pdg[] array2 = new pdg[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = pdg;
                if (pdh.compareAndSet(array, array2)) {
                    if (pdg.get() == null) {
                        pdh.f(pdg);
                    }
                    return;
                }
                continue;
            }
        }
    }
}

import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pde implements oxf
{
    private final AtomicReference a;
    
    public pde(final AtomicReference a) {
        this.a = a;
    }
    
    @Override
    public final void f(final oxg oxg) {
        final pdc pdc = new pdc(oxg);
        oxg.bV(pdc);
        pdd pdd2 = null;
    Label_0016:
        while (true) {
            final pdd pdd = this.a.get();
            while (true) {
                Label_0046: {
                    if (pdd == null) {
                        break Label_0046;
                    }
                    pdd2 = pdd;
                    if (pdd.d.get() == pdd.b) {
                        break Label_0046;
                    }
                    pdc[] array;
                    pdc[] array2;
                    do {
                        array = pdd2.d.get();
                        if (array == pdd.b) {
                            continue Label_0016;
                        }
                        final int length = array.length;
                        array2 = new pdc[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = pdc;
                    } while (!pdd2.d.compareAndSet(array, array2));
                    break;
                }
                pdd2 = new pdd(this.a);
                if (this.a.compareAndSet(pdd, pdd2)) {
                    continue;
                }
                break;
            }
        }
        if (!pdc.compareAndSet(null, pdd2)) {
            pdd2.f(pdc);
        }
    }
}

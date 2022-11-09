import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdh extends AtomicReference implements oxg, oxp
{
    static final pdg[] a;
    static final pdg[] b;
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicBoolean c;
    final AtomicReference d;
    final AtomicReference e;
    Throwable f;
    
    static {
        a = new pdg[0];
        b = new pdg[0];
    }
    
    public pdh(final AtomicReference d) {
        this.c = new AtomicBoolean();
        this.d = d;
        this.e = new AtomicReference();
        this.lazySet(pdh.a);
    }
    
    @Override
    public final void b(final Throwable f) {
        this.f = f;
        this.e.lazySet(oyj.a);
        final pdg[] array = this.getAndSet(pdh.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.b(f);
        }
    }
    
    @Override
    public final void bU() {
        this.e.lazySet(oyj.a);
        final pdg[] array = this.getAndSet(pdh.b);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.bU();
        }
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.e(this.e, oxp);
    }
    
    @Override
    public final void bX() {
        this.getAndSet(pdh.b);
        this.d.compareAndSet(this, null);
        oyj.g(this.e);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        final pdg[] array = this.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.e(o);
        }
    }
    
    public final void f(final pdg pdg) {
        pdg[] array;
        pdg[] a;
    Label_0100:
        do {
            array = this.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != pdg) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            a = pdh.a;
                            if (length != 1) {
                                a = new pdg[length - 1];
                                System.arraycopy(array, 0, a, 0, n);
                                System.arraycopy(array, n + 1, a, n, length - n - 1);
                                continue Label_0100;
                            }
                            continue Label_0100;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
            break;
        } while (!this.compareAndSet(array, a));
    }
}

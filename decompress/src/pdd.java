import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdd implements oxg, oxp
{
    static final pdc[] a;
    static final pdc[] b;
    final AtomicReference c;
    final AtomicReference d;
    final AtomicReference e;
    
    static {
        a = new pdc[0];
        b = new pdc[0];
    }
    
    public pdd(final AtomicReference c) {
        this.e = new AtomicReference();
        this.d = new AtomicReference((V)(Object)pdd.a);
        this.c = c;
        new AtomicBoolean();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.compareAndSet(this, null);
        final pdc[] array = this.d.getAndSet(pdd.b);
        final int length = array.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                array[i].a.b(t);
            }
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        this.c.compareAndSet(this, null);
        final pdc[] array = this.d.getAndSet(pdd.b);
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
        final AtomicReference d = this.d;
        final pdc[] b = pdd.b;
        if (d.getAndSet(b) != b) {
            this.c.compareAndSet(this, null);
            oyj.g(this.e);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        final pdc[] array = this.d.get();
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].a.e(o);
        }
    }
    
    final void f(final pdc pdc) {
        pdc[] array;
        pdc[] a = null;
    Label_0106:
        do {
            array = this.d.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (!array[i].equals(pdc)) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = pdd.a;
                                continue Label_0106;
                            }
                            a = new pdc[length - 1];
                            System.arraycopy(array, 0, a, 0, n);
                            System.arraycopy(array, n + 1, a, n, length - n - 1);
                            continue Label_0106;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
        } while (!this.d.compareAndSet(array, a));
    }
}

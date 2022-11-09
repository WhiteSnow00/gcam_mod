import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pif extends oxk implements oxl
{
    static final pie[] a;
    static final pie[] b;
    final AtomicReference c;
    final AtomicBoolean d;
    Object e;
    Throwable f;
    
    static {
        a = new pie[0];
        b = new pie[0];
    }
    
    public pif() {
        this.d = new AtomicBoolean();
        this.c = new AtomicReference((V)(Object)pif.a);
    }
    
    @Override
    public final void b(final Throwable f) {
        phn.g(f, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean d = this.d;
        int i = 0;
        if (d.compareAndSet(false, true)) {
            this.f = f;
            for (pie[] array = this.c.getAndSet(pif.b); i < array.length; ++i) {
                array[i].a.b(f);
            }
            return;
        }
        pip.g(f);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        if (this.c.get() == pif.b) {
            oxp.bX();
        }
    }
    
    @Override
    public final void d(final Object e) {
        phn.g(e, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        final AtomicBoolean d = this.d;
        int i = 0;
        if (d.compareAndSet(false, true)) {
            this.e = e;
            for (pie[] array = this.c.getAndSet(pif.b); i < array.length; ++i) {
                array[i].a.d(e);
            }
        }
    }
    
    @Override
    protected final void n(final oxl oxl) {
        final pie pie = new pie(oxl, this);
        oxl.bV(pie);
        while (true) {
            final pie[] array = this.c.get();
            if (array == pif.b) {
                final Throwable f = this.f;
                if (f != null) {
                    oxl.b(f);
                    return;
                }
                oxl.d(this.e);
            }
            else {
                final int length = array.length;
                final pie[] array2 = new pie[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = pie;
                if (this.c.compareAndSet(array, array2)) {
                    if (pie.get() == null) {
                        this.o(pie);
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    final void o(final pie pie) {
        pie[] array;
        pie[] a = null;
    Label_0103:
        do {
            array = this.c.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != pie) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = pif.a;
                                continue Label_0103;
                            }
                            a = new pie[length - 1];
                            System.arraycopy(array, 0, a, 0, n);
                            System.arraycopy(array, n + 1, a, n, length - n - 1);
                            continue Label_0103;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
        } while (!this.c.compareAndSet(array, a));
    }
}

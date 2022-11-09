import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pid extends pig
{
    static final pic[] a;
    static final pic[] b;
    final AtomicReference c;
    Throwable d;
    
    static {
        a = new pic[0];
        b = new pic[0];
    }
    
    public pid() {
        this.c = new AtomicReference((V)(Object)pid.b);
    }
    
    @Override
    public final void b(final Throwable d) {
        phn.g(d, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        final pic[] value = this.c.get();
        final pic[] a = pid.a;
        if (value == a) {
            pip.g(d);
            return;
        }
        this.d = d;
        for (final pic pic : this.c.getAndSet(a)) {
            if (pic.get()) {
                pip.g(d);
            }
            else {
                pic.a.b(d);
            }
        }
    }
    
    @Override
    public final void bU() {
        final pic[] value = this.c.get();
        final pic[] a = pid.a;
        if (value == a) {
            return;
        }
        for (final pic pic : this.c.getAndSet(a)) {
            if (!pic.get()) {
                pic.a.bU();
            }
        }
    }
    
    @Override
    public final void bV(final oxp oxp) {
        if (this.c.get() == pid.a) {
            oxp.bX();
        }
    }
    
    @Override
    public final void e(final Object o) {
        phn.g(o, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (final pic pic : this.c.get()) {
            if (!pic.get()) {
                pic.a.e(o);
            }
        }
    }
    
    @Override
    protected final void g(final oxg oxg) {
        final pic pic = new pic(oxg, this);
        oxg.bV(pic);
        while (true) {
            final pic[] array = this.c.get();
            if (array == pid.a) {
                final Throwable d = this.d;
                if (d != null) {
                    oxg.b(d);
                    return;
                }
                oxg.bU();
            }
            else {
                final int length = array.length;
                final pic[] array2 = new pic[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = pic;
                if (this.c.compareAndSet(array, array2)) {
                    if (pic.get()) {
                        this.k(pic);
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    final void k(final pic pic) {
        pic[] array;
        pic[] b = null;
    Label_0116:
        do {
            array = this.c.get();
            if (array != pid.a && array != pid.b) {
                final int length = array.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != pic) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                b = pid.b;
                                continue Label_0116;
                            }
                            b = new pic[length - 1];
                            System.arraycopy(array, 0, b, 0, n);
                            System.arraycopy(array, n + 1, b, n, length - n - 1);
                            continue Label_0116;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
        } while (!this.c.compareAndSet(array, b));
    }
}

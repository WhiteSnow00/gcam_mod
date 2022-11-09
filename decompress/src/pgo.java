import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgo extends AtomicReferenceArray implements Runnable, Callable, oxp
{
    static final Object a;
    static final Object b;
    static final Object c;
    static final Object d;
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable e;
    
    static {
        a = new Object();
        b = new Object();
        c = new Object();
        d = new Object();
    }
    
    public pgo(final Runnable e, final oyi oyi) {
        super(3);
        this.e = e;
        this.lazySet(0, oyi);
    }
    
    public final void b(final Future future) {
        Object value;
        do {
            value = this.get(1);
            if (value == pgo.d) {
                return;
            }
            if (value == pgo.b) {
                future.cancel(false);
                return;
            }
            if (value == pgo.c) {
                future.cancel(true);
            }
        } while (!this.compareAndSet(1, value, future));
    }
    
    @Override
    public final void bX() {
        while (true) {
            Future value;
            Object b;
            boolean b2;
            do {
                value = this.get(1);
                if (value != pgo.d) {
                    b = pgo.b;
                    if (value != b) {
                        final Object c = pgo.c;
                        if (value != c) {
                            b2 = (this.get(2) != Thread.currentThread());
                            if (b2) {
                                b = c;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                oyi value2;
                Object a;
                do {
                    value2 = this.get(0);
                    if (value2 != pgo.d) {
                        a = pgo.a;
                        if (value2 != a) {
                            if (value2 != null) {
                                continue;
                            }
                        }
                    }
                    return;
                } while (!this.compareAndSet(0, value2, (oyi)a));
                value2.c(this);
                return;
            } while (!this.compareAndSet(1, value, (Future)b));
            if (value != null) {
                value.cancel(b2);
            }
            continue;
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final Object call() {
        this.run();
        return null;
    }
    
    @Override
    public final void run() {
        this.lazySet(2, Thread.currentThread());
        Label_0025: {
            try {
                this.e.run();
                break Label_0025;
            }
            finally {
                try {
                    final Throwable t;
                    pip.g(t);
                    this.lazySet(2, null);
                    final oyi value = this.get(0);
                    if (value != pgo.a) {
                        if (this.compareAndSet(0, value, pgo.d) && value != null) {
                            value.c(this);
                        }
                    }
                    Object value2;
                    do {
                        value2 = this.get(1);
                    } while (value2 != pgo.b && value2 != pgo.c && !this.compareAndSet(1, value2, pgo.d));
                }
                finally {
                    this.lazySet(2, null);
                    final oyi value3 = this.get(0);
                    if (value3 != pgo.a) {
                        if (this.compareAndSet(0, value3, pgo.d) && value3 != null) {
                            value3.c(this);
                        }
                    }
                Label_0192:
                    while (true) {
                        final Object value4 = this.get(1);
                        if (value4 != pgo.b && value4 != pgo.c && !this.compareAndSet(1, value4, pgo.d)) {
                            continue;
                        }
                        break Label_0192;
                    }
                    while (true) {}
                }
            }
        }
    }
}

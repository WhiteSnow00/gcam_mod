import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class pez extends pgy implements oxl
{
    private static final long serialVersionUID = -8938804753851907758L;
    final psr a;
    final oyf b;
    final AtomicLong c;
    oxp d;
    volatile Iterator e;
    volatile boolean f;
    boolean g;
    
    public pez(final psr a, final oyf b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicLong();
    }
    
    @Override
    public final void a() {
        this.f = true;
        this.d.bX();
        this.d = oyj.a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.d = oyj.a;
        this.a.cd(t);
    }
    
    @Override
    public final void bV(final oxp d) {
        if (oyj.f(this.d, d)) {
            this.d = d;
            this.a.bY(this);
        }
    }
    
    @Override
    public final Object bW() {
        final Iterator e = this.e;
        if (e != null) {
            final Object next = e.next();
            phn.g(next, "The iterator returned a null value");
            if (!e.hasNext()) {
                this.e = null;
            }
            return next;
        }
        return null;
    }
    
    @Override
    public final void bZ() {
        this.e = null;
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.c, n);
            this.e();
        }
    }
    
    @Override
    public final void d(final Object o) {
        try {
            final Iterator<Object> iterator = ((Iterable<Object>)this.b.a(o)).iterator();
            if (!iterator.hasNext()) {
                this.a.cc();
                return;
            }
            this.e = iterator;
            this.e();
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.cd(t);
        }
    }
    
    final void e() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final psr a = this.a;
        Iterator iterator = this.e;
        final boolean g = this.g;
        int n = 1;
        if (g) {
            if (iterator != null) {
                a.ce(null);
                a.cc();
                return;
            }
        }
        while (true) {
            if (iterator != null) {
                final long value = this.c.get();
                if (value == Long.MAX_VALUE) {
                    while (true) {
                        Label_0137: {
                            if (this.f) {
                                break Label_0137;
                            }
                            try {
                                a.ce(iterator.next());
                                if (!this.f) {
                                    try {
                                        if (!iterator.hasNext()) {
                                            a.cc();
                                            return;
                                        }
                                        continue;
                                    }
                                    finally {}
                                }
                            }
                            finally {
                                psn.e((Throwable)iterator);
                                a.cd((Throwable)iterator);
                                return;
                            }
                        }
                        break;
                    }
                }
                long n2 = 0L;
                while (n2 != value) {
                    if (this.f) {
                        return;
                    }
                    try {
                        final Object next = iterator.next();
                        phn.g(next, "The iterator returned a null value");
                        a.ce(next);
                        if (this.f) {
                            return;
                        }
                        ++n2;
                        try {
                            if (iterator.hasNext()) {
                                continue;
                            }
                            a.cc();
                            return;
                        }
                        finally {
                            final Throwable t;
                            psn.e(t);
                            a.cd(t);
                            return;
                        }
                    }
                    finally {
                        psn.e((Throwable)iterator);
                        a.cd((Throwable)iterator);
                        return;
                    }
                    break;
                }
                if (n2 != 0L) {
                    phn.d(this.c, n2);
                }
            }
            final int addAndGet = this.addAndGet(-n);
            if (addAndGet == 0) {
                return;
            }
            n = addAndGet;
            if (iterator != null) {
                continue;
            }
            iterator = this.e;
            n = addAndGet;
        }
    }
    
    @Override
    public final boolean i() {
        return this.e == null;
    }
    
    @Override
    public final int k() {
        this.g = true;
        return 2;
    }
}

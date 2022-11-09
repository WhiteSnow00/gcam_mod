import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public class phd extends AtomicInteger implements pss
{
    private static final long serialVersionUID = -2189523197179400958L;
    pss e;
    long f;
    final AtomicReference g;
    final AtomicLong h;
    final AtomicLong i;
    public volatile boolean j;
    public boolean k;
    
    public phd() {
        this.g = new AtomicReference();
        this.h = new AtomicLong();
        this.i = new AtomicLong();
    }
    
    @Override
    public void a() {
        if (!this.j) {
            this.j = true;
            this.f();
        }
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            if (this.k) {
                return;
            }
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                final long f = this.f;
                if (f != Long.MAX_VALUE) {
                    final long c = phn.c(f, n);
                    this.f = c;
                    if (c == Long.MAX_VALUE) {
                        this.k = true;
                    }
                }
                final pss e = this.e;
                if (this.decrementAndGet() != 0) {
                    this.g();
                }
                if (e != null) {
                    e.cb(n);
                }
                return;
            }
            phn.b(this.h, n);
            this.f();
        }
    }
    
    final void f() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.g();
    }
    
    final void g() {
        int addAndGet = 1;
        pss pss = null;
        long n = 0L;
        long n4;
        pss pss2;
        while (true) {
            pss e;
            if ((e = this.g.get()) != null) {
                e = this.g.getAndSet(null);
            }
            long n2;
            if ((n2 = this.h.get()) != 0L) {
                n2 = this.h.getAndSet(0L);
            }
            long n3;
            if ((n3 = this.i.get()) != 0L) {
                n3 = this.i.getAndSet(0L);
            }
            final pss e2 = this.e;
            if (this.j) {
                if (e2 != null) {
                    e2.a();
                    this.e = null;
                }
                if (e != null) {
                    e.a();
                    n4 = n;
                    pss2 = pss;
                }
                else {
                    n4 = n;
                    pss2 = pss;
                }
            }
            else {
                final long f = this.f;
                long n7;
                if (f != Long.MAX_VALUE) {
                    long c;
                    final long n5 = c = phn.c(f, n2);
                    if (n5 != Long.MAX_VALUE) {
                        final long n6 = c = n5 - n3;
                        if (n6 < 0L) {
                            phe.c(n6);
                            c = 0L;
                        }
                    }
                    this.f = c;
                    n7 = c;
                }
                else {
                    n7 = f;
                }
                if (e != null) {
                    this.e = e;
                    n4 = n;
                    pss2 = pss;
                    if (n7 != 0L) {
                        n4 = phn.c(n, n7);
                        pss2 = e;
                    }
                }
                else {
                    n4 = n;
                    pss2 = pss;
                    if (e2 != null) {
                        n4 = n;
                        pss2 = pss;
                        if (n2 != 0L) {
                            n4 = phn.c(n, n2);
                            pss2 = e2;
                        }
                    }
                }
            }
            addAndGet = this.addAndGet(-addAndGet);
            if (addAndGet == 0) {
                break;
            }
            n = n4;
            pss = pss2;
        }
        if (n4 != 0L) {
            pss2.cb(n4);
        }
    }
    
    public final void h(long f) {
        if (this.k) {
            return;
        }
        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
            phn.b(this.i, f);
            this.f();
            return;
        }
        final long f2 = this.f;
        if (f2 != Long.MAX_VALUE) {
            final long n = f = f2 - f;
            if (n < 0L) {
                phe.c(n);
                f = 0L;
            }
            this.f = f;
        }
        if (this.decrementAndGet() == 0) {
            return;
        }
        this.g();
    }
    
    public final void i(pss e) {
        if (this.j) {
            e.a();
            return;
        }
        phn.g(e, "s is null");
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            this.e = e;
            final long f = this.f;
            if (this.decrementAndGet() != 0) {
                this.g();
            }
            if (f != 0L) {
                e.cb(f);
            }
            return;
        }
        e = this.g.getAndSet(e);
        this.f();
    }
}

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ped extends AtomicInteger implements pss
{
    private static final long serialVersionUID = 3100232009247827843L;
    final psr a;
    final peb[] b;
    final phg c;
    final AtomicLong d;
    volatile boolean e;
    final AtomicInteger f;
    
    public ped(final psr a, final int n, final int n2) {
        this.c = new phg();
        this.d = new AtomicLong();
        this.f = new AtomicInteger();
        this.a = a;
        final peb[] b = new peb[n];
        for (int i = 0; i < n; ++i) {
            b[i] = new peb(this, n2);
        }
        this.b = b;
        this.f.lazySet(n);
    }
    
    @Override
    public final void a() {
        if (!this.e) {
            this.e = true;
            this.h();
            if (this.getAndIncrement() == 0) {
                this.i();
            }
        }
    }
    
    public abstract void b();
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.d, n);
            this.b();
        }
    }
    
    public abstract void e();
    
    public abstract void f(final Throwable p0);
    
    public abstract void g(final peb p0, final Object p1);
    
    final void h() {
        final peb[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            phe.i(b[i]);
        }
    }
    
    final void i() {
        final peb[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].e = null;
        }
    }
}

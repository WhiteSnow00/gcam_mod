import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pht extends phq
{
    final pft b;
    final AtomicReference c;
    volatile boolean d;
    Throwable e;
    final AtomicReference f;
    volatile boolean g;
    final AtomicBoolean h;
    final pgy i;
    final AtomicLong j;
    boolean k;
    
    public pht() {
        phn.h(8, "capacityHint");
        this.b = new pft(8);
        this.c = new AtomicReference(null);
        this.f = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new phs(this);
        this.j = new AtomicLong();
    }
    
    @Override
    public final void bY(final pss pss) {
        if (!this.d && !this.g) {
            pss.cb(Long.MAX_VALUE);
            return;
        }
        pss.a();
    }
    
    @Override
    public final void cc() {
        if (!this.d && !this.g) {
            this.d = true;
            this.m();
            this.n();
        }
    }
    
    @Override
    public final void cd(final Throwable e) {
        phn.g(e, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.d && !this.g) {
            this.e = e;
            this.d = true;
            this.m();
            this.n();
            return;
        }
        pip.g(e);
    }
    
    @Override
    public final void ce(final Object o) {
        phn.g(o, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.d && !this.g) {
            this.b.j(o);
            this.n();
        }
    }
    
    @Override
    protected final void k(final psr psr) {
        if (this.h.get() || !this.h.compareAndSet(false, true)) {
            phb.f(new IllegalStateException("This processor allows only a single Subscriber"), psr);
            return;
        }
        psr.bY(this.i);
        this.f.set(psr);
        if (this.g) {
            this.f.lazySet(null);
            return;
        }
        this.n();
    }
    
    final void m() {
        final Runnable runnable = this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
    
    final void n() {
        if (this.i.getAndIncrement() != 0) {
            return;
        }
        psr psr = this.f.get();
        final int n = 1;
        int addAndGet = 1;
        while (psr == null) {
            addAndGet = this.i.addAndGet(-addAndGet);
            if (addAndGet == 0) {
                return;
            }
            psr = this.f.get();
        }
        if (this.k) {
            final pft b = this.b;
            int addAndGet2 = n;
            while (!this.g) {
                final boolean d = this.d;
                psr.ce(null);
                if (d) {
                    this.f.lazySet(null);
                    final Throwable e = this.e;
                    if (e != null) {
                        psr.cd(e);
                        return;
                    }
                    psr.cc();
                    return;
                }
                else {
                    if ((addAndGet2 = this.i.addAndGet(-addAndGet2)) == 0) {
                        return;
                    }
                    continue;
                }
            }
            b.bZ();
            this.f.lazySet(null);
            return;
        }
        final pft b2 = this.b;
        int addAndGet3 = 1;
    Label_0302:
        do {
            long value;
            long n2;
            for (value = this.j.get(), n2 = 0L; value != n2; ++n2) {
                final boolean d2 = this.d;
                final Object bw = b2.bW();
                final boolean b3 = bw == null;
                if (this.o(d2, b3, psr, b2)) {
                    break Label_0302;
                }
                if (b3) {
                    break;
                }
                psr.ce(bw);
            }
            if (value == n2 && this.o(this.d, b2.i(), psr, b2)) {
                break;
            }
            if (n2 == 0L || value == Long.MAX_VALUE) {
                continue;
            }
            this.j.addAndGet(-n2);
        } while ((addAndGet3 = this.i.addAndGet(-addAndGet3)) != 0);
    }
    
    final boolean o(final boolean b, final boolean b2, final psr psr, final pft pft) {
        if (this.g) {
            pft.bZ();
            this.f.lazySet(null);
            return true;
        }
        if (b && b2) {
            final Throwable e = this.e;
            this.f.lazySet(null);
            if (e != null) {
                psr.cd(e);
            }
            else {
                psr.cc();
            }
            return true;
        }
        return false;
    }
}

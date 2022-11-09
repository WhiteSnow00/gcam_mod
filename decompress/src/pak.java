import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pak extends paj
{
    private static final long serialVersionUID = 7898995095634264146L;
    final psr m;
    final AtomicInteger n;
    
    public pak(final psr m, final oyf oyf) {
        super(oyf);
        this.m = m;
        this.n = new AtomicInteger();
    }
    
    @Override
    public final void a() {
        if (!this.i) {
            this.i = true;
            this.a.a();
            this.e.a();
        }
    }
    
    @Override
    public final void cb(final long n) {
        this.a.cb(n);
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (phi.c(this.j, t)) {
            this.a.a();
            if (this.getAndIncrement() == 0) {
                this.m.cd(phi.b(this.j));
            }
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void f() {
        if (this.n.getAndIncrement() == 0) {
            while (!this.i) {
                Label_0385: {
                    if (!this.k) {
                        final boolean h = this.h;
                        try {
                            final Object bw = this.g.bW();
                            if (h) {
                                if (bw == null) {
                                    this.m.cc();
                                    return;
                                }
                            }
                            else if (bw == null) {
                                break Label_0385;
                            }
                            try {
                                final psq psq = (psq)this.b.a(bw);
                                phn.g(psq, "The mapper returned a null Publisher");
                                if (this.l != 1) {
                                    final int f = this.f + 1;
                                    if (f == this.d) {
                                        this.f = 0;
                                        this.e.cb(f);
                                    }
                                    else {
                                        this.f = f;
                                    }
                                }
                                if (psq instanceof Callable) {
                                    final Callable callable = (Callable)psq;
                                    try {
                                        final Object call = callable.call();
                                        if (call == null) {
                                            continue;
                                        }
                                        if (!this.a.k) {
                                            this.k = true;
                                            final pal a = this.a;
                                            a.i(new pan(call, a));
                                            break Label_0385;
                                        }
                                        if (this.get() != 0 || !this.compareAndSet(0, 1)) {
                                            continue;
                                        }
                                        this.m.ce(call);
                                        if (!this.compareAndSet(1, 0)) {
                                            this.m.cd(phi.b(this.j));
                                            return;
                                        }
                                        continue;
                                    }
                                    finally {
                                        final Throwable t;
                                        psn.e(t);
                                        this.e.a();
                                        phi.c(this.j, t);
                                        this.m.cd(phi.b(this.j));
                                        return;
                                    }
                                }
                                this.k = true;
                                psq.j(this.a);
                            }
                            finally {
                                final Throwable t2;
                                psn.e(t2);
                                this.e.a();
                                phi.c(this.j, t2);
                                this.m.cd(phi.b(this.j));
                                return;
                            }
                        }
                        finally {
                            final Throwable t3;
                            psn.e(t3);
                            this.e.a();
                            phi.c(this.j, t3);
                            this.m.cd(phi.b(this.j));
                            return;
                        }
                    }
                }
                if (this.n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
    
    @Override
    public final void h() {
        this.m.bY(this);
    }
    
    @Override
    public final void i(final Throwable t) {
        if (phi.c(this.j, t)) {
            this.e.a();
            if (this.getAndIncrement() == 0) {
                this.m.cd(phi.b(this.j));
            }
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void j(final Object o) {
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            this.m.ce(o);
            if (this.compareAndSet(1, 0)) {
                return;
            }
            this.m.cd(phi.b(this.j));
        }
    }
}

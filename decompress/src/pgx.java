import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgx extends AtomicInteger implements owy, pss
{
    private static final long serialVersionUID = -4945028590049415624L;
    final psr a;
    final phg b;
    final AtomicLong c;
    final AtomicReference d;
    final AtomicBoolean e;
    volatile boolean f;
    
    public pgx(final psr a) {
        this.a = a;
        this.b = new phg();
        this.c = new AtomicLong();
        this.d = new AtomicReference();
        this.e = new AtomicBoolean();
    }
    
    @Override
    public final void a() {
        if (!this.f) {
            phe.i(this.d);
        }
    }
    
    @Override
    public final void bY(final pss pss) {
        if (this.e.compareAndSet(false, true)) {
            this.a.bY(this);
            phe.j(this.d, this.c, pss);
            return;
        }
        pss.a();
        this.a();
        this.cd(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }
    
    @Override
    public final void cb(final long n) {
        if (n <= 0L) {
            this.a();
            final StringBuilder sb = new StringBuilder(79);
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(n);
            this.cd(new IllegalArgumentException(sb.toString()));
            return;
        }
        phe.b(this.d, this.c, n);
    }
    
    @Override
    public final void cc() {
        this.f = true;
        final psr a = this.a;
        final phg b = this.b;
        if (this.getAndIncrement() == 0) {
            final Throwable b2 = phi.b(b);
            if (b2 != null) {
                a.cd(b2);
                return;
            }
            a.cc();
        }
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.f = true;
        final psr a = this.a;
        final phg b = this.b;
        if (phi.c(b, t)) {
            if (this.getAndIncrement() == 0) {
                a.cd(phi.b(b));
            }
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void ce(final Object o) {
        final psr a = this.a;
        final phg b = this.b;
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            a.ce(o);
            if (this.decrementAndGet() != 0) {
                final Throwable b2 = phi.b(b);
                if (b2 != null) {
                    a.cd(b2);
                    return;
                }
                a.cc();
            }
        }
    }
}

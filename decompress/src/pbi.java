import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pbi extends AtomicInteger implements owy, pss
{
    private static final long serialVersionUID = 2827772011130406689L;
    final psq a;
    final AtomicReference b;
    final AtomicLong c;
    pbj d;
    
    public pbi(final psq a) {
        this.a = a;
        this.b = new AtomicReference();
        this.c = new AtomicLong();
    }
    
    @Override
    public final void a() {
        phe.i(this.b);
    }
    
    @Override
    public final void bY(final pss pss) {
        phe.j(this.b, this.c, pss);
    }
    
    @Override
    public final void cb(final long n) {
        phe.b(this.b, this.c, n);
    }
    
    @Override
    public final void cc() {
        this.d.a();
        this.d.a.cc();
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.d.a();
        this.d.a.cd(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.getAndIncrement() == 0) {
            while (this.b.get() != phe.a) {
                this.a.j(this.d);
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}

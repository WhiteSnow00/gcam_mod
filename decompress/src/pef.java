import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class pef extends AtomicInteger implements Runnable, owy, pss
{
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final pfs c;
    final oxi d;
    pss e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h;
    volatile boolean i;
    int j;
    
    public pef(final int a, final pfs c, final oxi d) {
        this.h = new AtomicLong();
        this.a = a;
        this.c = c;
        this.b = a - (a >> 2);
        this.d = d;
    }
    
    @Override
    public final void a() {
        if (!this.i) {
            this.i = true;
            this.e.a();
            this.d.bX();
            if (this.getAndIncrement() == 0) {
                this.c.bZ();
            }
        }
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.h, n);
            this.f();
        }
    }
    
    @Override
    public final void cc() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f();
    }
    
    @Override
    public final void cd(final Throwable g) {
        if (this.f) {
            pip.g(g);
            return;
        }
        this.g = g;
        this.f = true;
        this.f();
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.f) {
            return;
        }
        if (!this.c.j(o)) {
            this.e.a();
            this.cd(new oxx("Queue is full?!"));
            return;
        }
        this.f();
    }
    
    final void f() {
        if (this.getAndIncrement() == 0) {
            this.d.b(this);
        }
    }
}

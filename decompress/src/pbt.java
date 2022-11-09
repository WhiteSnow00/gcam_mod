import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pbt extends AtomicReference implements Runnable, pss
{
    private static final long serialVersionUID = -2809475196591179431L;
    final psr a;
    volatile boolean b;
    
    public pbt(final psr a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        oyj.g(this);
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            this.b = true;
        }
    }
    
    @Override
    public final void run() {
        if (this.get() != oyj.a) {
            if (this.b) {
                this.a.ce(0L);
                this.lazySet(oyk.a);
                this.a.cc();
                return;
            }
            this.lazySet(oyk.a);
            this.a.cd(new oxx("Can't deliver value due to lack of requests"));
        }
    }
}

import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class pbc extends pgz
{
    private static final long serialVersionUID = -2252972430506210021L;
    final int a;
    int b;
    volatile boolean c;
    
    public pbc(final int a) {
        this.b = 0;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.c = true;
    }
    
    @Override
    public final void bZ() {
        this.b = this.a;
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n) && phn.b(this, n) == 0L) {
            if (n == Long.MAX_VALUE) {
                this.e();
                return;
            }
            this.f(n);
        }
    }
    
    public abstract void e();
    
    public abstract void f(final long p0);
    
    @Override
    public final boolean i() {
        return this.b == this.a;
    }
    
    @Override
    public final int k() {
        return 1;
    }
}

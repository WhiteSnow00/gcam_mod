import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goj implements gue
{
    private final goq a;
    private final gue b;
    
    public goj(final gor gor, final gow gow, final kjk kjk, final long n, final int n2, final njp njp) {
        final goq a = gor.a(n2);
        kjk.c(a);
        this.a = a;
        this.b = gow.a(n, a, njp, 2);
    }
    
    @Override
    public final gud a() {
        return new goi(this.a.r());
    }
    
    @Override
    public final kvs b(final long n) {
        return this.b.b(n);
    }
    
    @Override
    public final kvs c() {
        return this.b.c();
    }
    
    @Override
    public final kvs d() {
        return this.b.d();
    }
    
    @Override
    public final kvs e() {
        return this.b.e();
    }
    
    @Override
    public final kvw f() {
        return ((gov)this.b).c;
    }
    
    @Override
    public final nns g(final List list) {
        return this.b.g(list);
    }
    
    @Override
    public final nns h(final List list) {
        return this.b.h(list);
    }
    
    @Override
    public final List i() {
        return ((gov)this.b).m();
    }
    
    @Override
    public final List j() {
        return this.b.j();
    }
    
    @Override
    public final void k(final int n) {
        this.b.k(n);
    }
    
    @Override
    public final kzl l() {
        return this.b.l();
    }
}

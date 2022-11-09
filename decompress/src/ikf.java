// 
// Decompiled by Procyon v0.6.0
// 

public final class ikf extends iin implements huk
{
    private final huj a;
    private final hul b;
    
    public ikf(final ijj ijj, final iit iit, final cmw cmw) {
        final hul b = new hul(new ilm(1), new huh[] { ijj, iit, cmw });
        this.b = b;
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
    }
    
    @Override
    public final void f() {
        this.a.c();
    }
    
    @Override
    public final void g() {
        this.a.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

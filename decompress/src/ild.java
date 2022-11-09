// 
// Decompiled by Procyon v0.6.0
// 

public final class ild extends iln implements huk
{
    private final huj a;
    private final hul b;
    
    public ild(final ilr ilr, final iit iit) {
        final hul b = new hul(new ilm(), new huh[] { ilr, iit });
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

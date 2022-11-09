// 
// Decompiled by Procyon v0.6.0
// 

public final class ill extends ilz implements huk
{
    private final huj b;
    private final hul c;
    
    public ill(final klv klv, final cmw cmw, final cna cna) {
        super(klv);
        final hul c = new hul(new ily(this), new huh[] { cmw, cna });
        this.c = c;
        (this.b = new huj(c, false)).f();
    }
    
    @Override
    public final void e() {
        this.b.b();
        this.c.e();
    }
    
    @Override
    public final void f() {
        this.b.c();
    }
    
    @Override
    public final void g() {
        this.b.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmw extends cmt implements huk
{
    public final dgn a;
    public final fvt b;
    public fxu c;
    public final huj d;
    public final hul e;
    public final hul f;
    
    public cmw(final dgn a, final fvt b) {
        this.a = a;
        this.b = b;
        final hul e = new hul(new cmf(this), new huh[0]);
        this.e = e;
        this.f = new hul(new cmg(this), new huh[0]);
        (this.d = new huj(e, false)).f();
    }
    
    @Override
    public final void a(final fxu fxu) {
        if (this.d.a() == null) {
            return;
        }
        ((cmt)this.d.a().a).a(fxu);
    }
    
    @Override
    public final void b() {
        if (this.d.a() == null) {
            return;
        }
        ((cmt)this.d.a().a).b();
    }
    
    @Override
    public final void e() {
        this.d.b();
        this.e.e();
        this.f.e();
    }
    
    @Override
    public final void f() {
        this.d.c();
    }
    
    @Override
    public final void g() {
        this.d.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

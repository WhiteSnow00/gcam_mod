// 
// Decompiled by Procyon v0.6.0
// 

public final class iit extends iio implements huk
{
    public final kjm a;
    public final fvt b;
    public final fwd c;
    public final dgn d;
    public fxu e;
    public final huj f;
    public final hul g;
    public final hul h;
    
    public iit(final kjm a, final fvt b, final fwd c, final dgn d) {
        this.e = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final hul g = new hul(new ikg(this), new huh[0]);
        this.g = g;
        this.h = new hul(new ikh(this), new huh[0]);
        (this.f = new huj(g, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.f.a() == null) {
            return;
        }
        ((iio)this.f.a().a).a();
    }
    
    @Override
    public final void b(final fxu fxu, final kjk kjk) {
        if (this.f.a() == null) {
            return;
        }
        ((iio)this.f.a().a).b(fxu, kjk);
    }
    
    @Override
    public final void e() {
        this.f.b();
        this.g.e();
        this.h.e();
    }
    
    @Override
    public final void f() {
        this.f.c();
    }
    
    @Override
    public final void g() {
        this.f.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeo extends jew implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    
    public jeo() {
        final hul b = new hul(new jem(this), new huh[0]);
        this.b = b;
        this.c = new hul(new jen(this), new huh[0]);
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jet)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jet)this.a.a().a).b();
    }
    
    @Override
    public final void c(final jfg jfg, final jey e) {
        if (this.a.a() == null) {
            super.d = ((jfl)jfg).f;
            super.e = e;
            return;
        }
        ((jet)this.a.a().a).c(jfg, e);
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
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

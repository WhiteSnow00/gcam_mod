// 
// Decompiled by Procyon v0.6.0
// 

public final class jej extends jeg implements huk
{
    public final pii a;
    public final huj b;
    public final hul c;
    public final hul d;
    
    public jej(final pii a) {
        this.a = a;
        final hul c = new hul(new jek(this), new huh[0]);
        this.c = c;
        this.d = new hul(new jel(this), new huh[0]);
        (this.b = new huj(c, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.b.a() == null) {
            return;
        }
        ((jeg)this.b.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.b.a() == null) {
            return;
        }
        ((jeg)this.b.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.b.a() == null) {
            return;
        }
        ((jeg)this.b.a().a).c();
    }
    
    @Override
    public final void e() {
        this.b.b();
        this.c.e();
        this.d.e();
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

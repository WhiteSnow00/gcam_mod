import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jes extends jff implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    private final hul l;
    
    public jes() {
        this.b = new hul(new jep(this), new huh[0]);
        this.c = new hul(new jeq(this), new huh[0]);
        final hul l = new hul(new jer(this), new huh[0]);
        this.l = l;
        (this.a = new huj(l, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).b();
    }
    
    @Override
    public final void bC() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).bC();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).d();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.l.e();
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
    
    @Override
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).i();
    }
    
    @Override
    public final void j(final jfg d, final Uri h, final jej f, final jew g, final int i, final boolean j, final boolean k) {
        if (this.a.a() == null) {
            d.getClass();
            super.d = d;
            super.e = ((jfl)d).f;
            super.f = f;
            super.g = g;
            super.h = h;
            super.i = i;
            super.j = j;
            super.k = k;
            return;
        }
        ((jez)this.a.a().a).j(d, h, f, g, i, j, k);
    }
    
    @Override
    public final void k() {
        if (this.a.a() == null) {
            return;
        }
        ((jez)this.a.a().a).k();
    }
}

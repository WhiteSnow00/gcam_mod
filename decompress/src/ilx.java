import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilx extends ils implements huk
{
    public final BottomBarController a;
    public final ivj b;
    public final gjj c;
    public final kkz d;
    public final fvt e;
    public final itx f;
    public final huj g;
    public final hul h;
    public final hul i;
    public final hul j;
    public final hul k;
    
    public ilx(final BottomBarController a, final ivj b, final gjj c, final itx f, final fvt e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = new kkz(false);
        this.e = e;
        this.h = new hul(new ilh(this), new huh[0]);
        this.i = new hul(new ili(this), new huh[0]);
        final hul j = new hul(new ilj(this), new huh[0]);
        this.j = j;
        this.k = new hul(new ilk(this), new huh[0]);
        (this.g = new huj(j, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.g.a() == null) {
            return;
        }
        ((ils)this.g.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.g.a() == null) {
            return;
        }
        ((ils)this.g.a().a).b();
    }
    
    @Override
    public final void by() {
        if (this.g.a() == null) {
            return;
        }
        ((ils)this.g.a().a).by();
    }
    
    @Override
    public final void c() {
        if (this.g.a() == null) {
            return;
        }
        ((ils)this.g.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.g.a() == null) {
            return;
        }
        ((ils)this.g.a().a).d();
    }
    
    @Override
    public final void e() {
        this.g.b();
        this.h.e();
        this.i.e();
        this.j.e();
        this.k.e();
    }
    
    @Override
    public final void f() {
        this.g.c();
    }
    
    @Override
    public final void g() {
        this.g.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

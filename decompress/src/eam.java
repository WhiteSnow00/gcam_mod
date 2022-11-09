import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eam extends edc implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    
    public eam(final ivj ivj, final BottomBarController bottomBarController, final gjj gjj, final ebo ebo, final itx itx) {
        super(ivj, bottomBarController, gjj, ebo, itx);
        final hul b = new hul(new eak(this), new huh[0]);
        this.b = b;
        this.c = new hul(new eal(this), new huh[0]);
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((ecz)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((ecz)this.a.a().a).b();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
    }
    
    @Override
    public final void f() {
        super.f();
        this.a.c();
    }
    
    @Override
    public final void g() {
        super.g();
        this.a.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

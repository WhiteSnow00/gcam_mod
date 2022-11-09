import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cme extends cms implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    
    public cme(final BottomBarController bottomBarController, final cxl cxl, final ivj ivj, final iqg iqg, final itx itx, final cnf cnf, final niz niz, final gjj gjj) {
        super(bottomBarController, cxl, ivj, iqg, itx, cnf, niz, gjj);
        this.b = new hul(new cmb(this), new huh[0]);
        final hul c = new hul(new cmc(this), new huh[0]);
        this.c = c;
        this.d = new hul(new cmd(this), new huh[0]);
        (this.a = new huj(c, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((cne)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((cne)this.a.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((cne)this.a.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((cne)this.a.a().a).d();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
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
        ((cne)this.a.a().a).i();
    }
}

import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fat extends fbb implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    public final hul e;
    public final hul f;
    private final hul o;
    
    public fat(final ivj ivj, final itn itn, final gjj gjj, final irc irc, final BottomBarController bottomBarController, final gkw gkw, final duq duq, final jjb jjb) {
        super(ivj, itn, gjj, irc, bottomBarController, gkw, duq, jjb);
        this.b = new hul(new fan(this), new huh[0]);
        this.c = new hul(new fao(this), new huh[0]);
        this.d = new hul(new fap(this), new huh[0]);
        this.e = new hul(new faq(this), new huh[0]);
        this.f = new hul(new far(this), new huh[0]);
        final hul o = new hul(new fas(this), new huh[0]);
        this.o = o;
        (this.a = new huj(o, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).b();
    }
    
    @Override
    public final void bo() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).bo();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).d();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
        this.f.e();
        this.o.e();
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
        ((fau)this.a.a().a).i();
    }
    
    @Override
    public final void j() {
        if (this.a.a() == null) {
            return;
        }
        ((fau)this.a.a().a).j();
    }
}

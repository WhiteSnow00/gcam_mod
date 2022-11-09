import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikm extends ijj implements huk
{
    public final huj o;
    public final hul p;
    public final hul q;
    public final hul r;
    
    public ikm(final bti bti, final eiq eiq, final BottomBarController bottomBarController, final gjj gjj, final jjb jjb, final imk imk, final pii pii, final ivj ivj, final dul dul, final irc irc, final crg crg, final hkd hkd, final klv klv, final efm efm, final iim iim, final ijx ijx, final ikb ikb) {
        super(bti, eiq, bottomBarController, gjj, jjb, imk, pii, ivj, dul, irc, crg, hkd, klv, efm);
        final hul p17 = new hul(new ikj(this), new huh[] { iim, ijx, ikb });
        this.p = p17;
        this.q = new hul(new ikk(this), new huh[0]);
        this.r = new hul(new ikl(this), new huh[0]);
        (this.o = new huj(p17, false)).f();
    }
    
    @Override
    public final void b() {
        if (this.o.a() == null) {
            return;
        }
        ((hug)this.o.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.o.a() == null) {
            return;
        }
        ((hug)this.o.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.o.a() == null) {
            return;
        }
        ((hug)this.o.a().a).d();
    }
    
    @Override
    public final void e() {
        this.o.b();
        this.p.e();
        this.q.e();
        this.r.e();
    }
    
    @Override
    public final void f() {
        super.f();
        this.o.c();
    }
    
    @Override
    public final void g() {
        super.g();
        this.o.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
    
    @Override
    public final void i() {
        if (this.o.a() == null) {
            return;
        }
        ((hug)this.o.a().a).i();
    }
}

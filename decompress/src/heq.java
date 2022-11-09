import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class heq extends hej implements huk
{
    public final eyt a;
    public final oui b;
    public final huj c;
    public final hul d;
    public final hul e;
    public final hul f;
    public final hul g;
    private final BottomBarController h;
    private final hyt i;
    private final klj j;
    private final hkd k;
    private final jcd l;
    
    public heq(final eyt a, final BottomBarController h, final oui b, final jcd l, final hyt i, final klv j, final hkd k) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.l = l;
        this.i = i;
        this.j = j;
        this.k = k;
        this.d = new hul(new heb(this), new huh[0]);
        this.e = new hul(new hec(this), new huh[0]);
        final hul f = new hul(new hed(this), new huh[0]);
        this.f = f;
        this.g = new hul(new hee(this), new huh[0]);
        (this.c = new huj(f, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.c.a() == null) {
            return;
        }
        ((hej)this.c.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.c.a() == null) {
            return;
        }
        ((hej)this.c.a().a).b();
    }
    
    @Override
    public final void c() {
        if (this.c.a() == null) {
            return;
        }
        ((hej)this.c.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.c.a() == null) {
            return;
        }
        ((hej)this.c.a().a).d();
    }
    
    @Override
    public final void e() {
        this.c.b();
        this.d.e();
        this.e.e();
        this.f.e();
        this.g.e();
    }
    
    @Override
    public final void f() {
        this.c.c();
    }
    
    @Override
    public final void g() {
        this.c.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
    
    public final void i() {
        this.h.setSelfieFlashState(true);
        this.k.d(hjq.k, true);
        if (this.k()) {
            this.l.b(((heu)this.b.get()).a());
        }
        else {
            this.l.c();
        }
        this.i.a(1812);
        ((heu)this.b.get()).e(this.k());
    }
    
    public final void j() {
        this.h.setSelfieFlashState(false);
        this.l.a();
        ((heu)this.b.get()).d();
        this.k.d(hjq.k, false);
        this.i.a(1797);
    }
    
    public final boolean k() {
        return this.j.aQ() == jbm.m;
    }
}

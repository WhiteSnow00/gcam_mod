import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilc extends ikb implements huk
{
    public final huj l;
    public final hul m;
    public final hul n;
    
    public ilc(final klv klv, final dgn dgn, final BottomBarController bottomBarController, final ivj ivj, final imk imk, final iqg iqg, final gjj gjj, final fwd fwd, final klv klv2, final jjb jjb) {
        super(klv, dgn, bottomBarController, ivj, imk, iqg, gjj, fwd, klv2, jjb);
        this.m = new hul(new ila(this), new huh[0]);
        final hul n = new hul(new ilb(this), new huh[0]);
        this.n = n;
        (this.l = new huj(n, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.l.a() == null) {
            return;
        }
        ((ijy)this.l.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.l.a() == null) {
            return;
        }
        ((ijy)this.l.a().a).b();
    }
    
    @Override
    public final void e() {
        this.l.b();
        this.m.e();
        this.n.e();
    }
    
    @Override
    public final void f() {
        this.l.c();
    }
    
    @Override
    public final void g() {
        this.l.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

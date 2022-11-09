import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ike extends iim implements huk
{
    public final huj k;
    public final hul l;
    public final hul m;
    
    public ike(final bvq bvq, final dgn dgn, final BottomBarController bottomBarController, final ivj ivj, final imk imk, final iqg iqg, final gjj gjj, final fwd fwd, final jjb jjb) {
        super(bvq, dgn, bottomBarController, ivj, imk, iqg, gjj, fwd, jjb);
        this.l = new hul(new ikc(this), new huh[0]);
        final hul m = new hul(new ikd(this), new huh[0]);
        this.m = m;
        (this.k = new huj(m, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.k.a() == null) {
            return;
        }
        ((iij)this.k.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.k.a() == null) {
            return;
        }
        ((iij)this.k.a().a).b();
    }
    
    @Override
    public final void e() {
        this.k.b();
        this.l.e();
        this.m.e();
    }
    
    @Override
    public final void f() {
        this.k.c();
    }
    
    @Override
    public final void g() {
        this.k.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

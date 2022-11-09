import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmk extends cna implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    
    public cmk(final BottomBarController bottomBarController, final ivj ivj, final jjb jjb, final Window window, final imk imk, final bti bti, final iqg iqg, final cnf cnf) {
        super(bottomBarController, ivj, jjb, window, imk, bti, iqg, cnf);
        final hul b = new hul(new cmh(this), new huh[0]);
        this.b = b;
        this.c = new hul(new cmi(this), new huh[0]);
        this.d = new hul(new cmj(this), new huh[0]);
        (this.a = new huj(b, false)).f();
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
    
    @Override
    public final void i() {
        if (this.a.a() == null) {
            return;
        }
        ((cne)this.a.a().a).i();
    }
}

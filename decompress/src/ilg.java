import android.view.Window;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilg extends ilr implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    
    public ilg(final klv klv, final BottomBarController bottomBarController, final ivj ivj, final jjb jjb, final Window window, final imk imk, final bti bti, final gjj gjj, final iqg iqg, final ikb ikb) {
        super(klv, bottomBarController, ivj, jjb, window, imk, bti, gjj, iqg);
        final hul b = new hul(new ile(this), new huh[] { ikb });
        this.b = b;
        this.c = new hul(new ilf(this), new huh[0]);
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((ilo)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((ilo)this.a.a().a).b();
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

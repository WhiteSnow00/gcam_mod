import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iaf extends icm implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    public final hul d;
    public final hul e;
    
    public iaf(final BottomBarController bottomBarController, final imk imk, final cxl cxl, final iqg iqg, final itx itx, final gjj gjj, final ivj ivj, final icy icy, final eiq eiq) {
        super(bottomBarController, imk, cxl, iqg, itx, gjj, ivj, icy, eiq);
        this.b = new hul(new iab(this), new huh[0]);
        this.c = new hul(new iac(this), new huh[0]);
        final hul d = new hul(new iad(this), new huh[0]);
        this.d = d;
        this.e = new hul(new iae(this), new huh[0]);
        (this.a = new huj(d, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((ibw)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((ibw)this.a.a().a).b();
    }
    
    @Override
    public final void bx() {
        if (this.a.a() == null) {
            return;
        }
        ((ibw)this.a.a().a).bx();
    }
    
    @Override
    public final void c() {
        if (this.a.a() == null) {
            return;
        }
        ((ibw)this.a.a().a).c();
    }
    
    @Override
    public final void d() {
        if (this.a.a() == null) {
            return;
        }
        ((ibw)this.a.a().a).d();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
        this.d.e();
        this.e.e();
    }
    
    @Override
    public final void f() {
        final icy l = super.l;
        l.b.set(0L);
        l.a.set(false);
        if (!l.k.k(cwv.H)) {
            l.i.a();
            final ieo v = l.v;
            v.a.set(true);
            if (v.o != null) {
                v.o.e(v.p.a.c((double)v.j.aQ()));
            }
        }
        final icy i = super.l;
        if (i.k.k(cwv.H)) {
            if (i.p.g()) {
                ((cor)i.p.c()).f(false);
            }
        }
        else {
            final FrameLayout n = i.v.n;
            if (n != null) {
                n.setVisibility(0);
            }
        }
        super.l.b();
        super.f.setClickable(true);
        super.i.l(true);
        super.m.g(1);
        jgu.d();
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
}

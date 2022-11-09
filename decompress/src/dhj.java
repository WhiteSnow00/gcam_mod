import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhj extends dgy implements huk
{
    public final huj f;
    public final hul g;
    public final hul h;
    public final hul i;
    
    public dhj(final EvCompView evCompView, final CheckBox checkBox, final ObjectAnimator objectAnimator, final dhf dhf, final dgm dgm, final dhf dhf2) {
        super(evCompView, checkBox, objectAnimator, dhf, dgm);
        final hul g = new hul(new dhg(this), new huh[0]);
        this.g = g;
        this.h = new hul(new dhh(this), new huh[0]);
        this.i = new hul(new dhi(this), new huh[] { dhf2 });
        (this.f = new huj(g, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.f.a() == null) {
            return;
        }
        ((dgt)this.f.a().a).a();
    }
    
    @Override
    public final void b(final int n, final int n2, final float n3) {
        if (this.f.a() == null) {
            return;
        }
        ((dgt)this.f.a().a).b(n, n2, n3);
    }
    
    @Override
    public final void c(final boolean b) {
        if (this.f.a() == null) {
            return;
        }
        ((dgt)this.f.a().a).c(b);
    }
    
    @Override
    public final void d(final boolean b, final boolean b2) {
        if (this.f.a() == null) {
            return;
        }
        ((dgt)this.f.a().a).d(b, b2);
    }
    
    @Override
    public final void e() {
        this.f.b();
        this.g.e();
        this.h.e();
        this.i.e();
    }
    
    @Override
    public final void f() {
        this.f.c();
    }
    
    @Override
    public final void g() {
        this.f.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

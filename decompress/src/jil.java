import com.google.android.apps.camera.zoomui.ZoomUi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jil extends jkj implements huk
{
    public final huj a;
    public final hul b;
    public final hul c;
    
    public jil(final ZoomUi zoomUi, final jkf jkf) {
        super(zoomUi);
        final hul b = new hul(new jij(this), new huh[0]);
        this.b = b;
        this.c = new hul(new jik(this), new huh[] { jkf });
        (this.a = new huj(b, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.a.a() == null) {
            return;
        }
        ((jkg)this.a.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.a.a() == null) {
            return;
        }
        ((jkg)this.a.a().a).b();
    }
    
    @Override
    public final void e() {
        this.a.b();
        this.b.e();
        this.c.e();
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
}

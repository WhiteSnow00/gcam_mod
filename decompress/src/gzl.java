import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzl extends gzi implements huk
{
    public final ProgressOverlay a;
    public boolean b;
    public final huj c;
    public final hul d;
    public final hul e;
    
    public gzl(final ProgressOverlay a, final gzd gzd) {
        kjm.a();
        this.a = a;
        final hul d = new hul(new gyz(this), new huh[0]);
        this.d = d;
        this.e = new hul(new gza(this), new huh[] { gzd });
        (this.c = new huj(d, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.c.a() == null) {
            return;
        }
        ((gzi)this.c.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.c.a() == null) {
            return;
        }
        ((gzi)this.c.a().a).b();
    }
    
    @Override
    public final void e() {
        this.c.b();
        this.d.e();
        this.e.e();
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
}

import android.graphics.drawable.Animatable2$AnimationCallback;
import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzh extends gzd implements huk
{
    public final ProgressOverlay a;
    public boolean b;
    public final AnimatedVectorDrawable c;
    public final huj d;
    public final hul e;
    public final hul f;
    
    public gzh(final ProgressOverlay a) {
        kjm.a();
        this.a = a;
        (this.c = a.a).registerAnimationCallback((Animatable2$AnimationCallback)new gze(this));
        this.b = false;
        final hul e = new hul(new gyx(this), new huh[0]);
        this.e = e;
        this.f = new hul(new gyy(this), new huh[0]);
        (this.d = new huj(e, false)).f();
    }
    
    @Override
    public final void a() {
        if (this.d.a() == null) {
            return;
        }
        ((gzd)this.d.a().a).a();
    }
    
    @Override
    public final void b() {
        if (this.d.a() == null) {
            return;
        }
        ((gzd)this.d.a().a).b();
    }
    
    @Override
    public final void e() {
        this.d.b();
        this.e.e();
        this.f.e();
    }
    
    @Override
    public final void f() {
        this.d.c();
    }
    
    @Override
    public final void g() {
        this.d.d();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}

import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.ui.views.ViewfinderCover;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izd implements iqb
{
    final /* synthetic */ ViewfinderCover a;
    
    public izd(final ViewfinderCover a) {
        this.a = a;
    }
    
    @Override
    public final niz b() {
        return this.a.b();
    }
    
    @Override
    public final niz c() {
        return this.a.c();
    }
    
    @Override
    public final void d(final boolean b) {
        final ViewfinderCover a = this.a;
        a.e.setImageDrawable((Drawable)a.f);
        this.a.i.m();
        this.a.f.start();
    }
    
    @Override
    public final void e() {
        this.a.e();
    }
    
    @Override
    public final void f() {
        this.a.f();
    }
    
    @Override
    public final void g(final jbm jbm) {
    }
    
    @Override
    public final boolean h() {
        throw null;
    }
    
    @Override
    public final boolean i() {
        return false;
    }
}

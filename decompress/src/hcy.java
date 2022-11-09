import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.view.ViewPropertyAnimator;
import j$.util.function.Consumer;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

class hcy extends hcu
{
    final /* synthetic */ hcz b;
    
    public hcy(final hcz b) {
        this.b = b;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        final nsx a = ntf.a;
        nov.C(this.b.g.getChildCount() > 0, "Cannot enter Rewind without inflated Preview content.", new Object[0]);
        nov.C(this.b.h.getChildCount() > 0, "Cannot enter Rewind without inflated ControllerView content.", new Object[0]);
        final ViewPropertyAnimator alpha = this.b.f.animate().alpha(0.0f);
        final ViewfinderCover f = this.b.f;
        f.getClass();
        alpha.withEndAction((Runnable)new hcx(f)).start();
        final hcp e = this.b.e;
        if (e.h != null && e.i != null) {
            e.u(jvh.f((Consumer)new hcj(e))).start();
            return;
        }
        a.l(hcp.b.b().g(ntf.a, "McFlyControllerImpl"), "Rewind has not been initialized.", '\u08ca');
    }
    
    @Override
    public final void g() {
        final hcp e = this.b.e;
        if (e.h != null && e.i != null) {
            final jwn o = e.o;
            if (o != null) {
                final MainActivityLayout c = e.l.c;
                kjm.a();
                c.e.remove(o);
                e.o = null;
            }
            e.u((Animator$AnimatorListener)new hcl(e)).reverse();
            return;
        }
        a.l(hcp.b.b().g(ntf.a, "McFlyControllerImpl"), "Rewind has not been initialized.", '\u08c9');
    }
}

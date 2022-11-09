import android.animation.TimeInterpolator;
import j$.util.function.Consumer;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ivg
{
    final /* synthetic */ ivh a;
    private final Animator b;
    
    public ivg(final ivh a, final Animator b) {
        this.a = a;
        this.b = b;
    }
    
    final void a() {
        this.b.setStartDelay(150L);
    }
    
    final void b() {
        this.b.addListener((Animator$AnimatorListener)new ivf(this));
    }
    
    final void c(final niz niz) {
        if (niz.g()) {
            this.b.addListener(jvh.e((Consumer)new ivd(this, niz, 1)));
        }
    }
    
    final void d(final int n) {
        this.b.setDuration((long)n);
    }
    
    final void e() {
        this.b.setInterpolator((TimeInterpolator)ivh.a);
    }
    
    final void f() {
        this.b.setInterpolator((TimeInterpolator)this.a.t);
    }
    
    final void g() {
        this.b.setInterpolator((TimeInterpolator)this.a.u);
    }
    
    final void h(final niz niz) {
        if (niz.g()) {
            this.b.addListener(jvh.f((Consumer)new ivd(this, niz)));
        }
    }
    
    final void i() {
        this.b.addListener((Animator$AnimatorListener)new ive(this));
    }
}

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

class hel extends hej
{
    private Animator a;
    final /* synthetic */ heq b;
    
    public hel(final heq b) {
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        (this.a = ((heu)this.b.b.get()).b(this.b.k())).addListener((Animator$AnimatorListener)new hek(this));
        this.a.start();
    }
    
    @Override
    public final void g() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
    }
}

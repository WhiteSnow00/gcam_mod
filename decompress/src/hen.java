import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

class hen extends hej
{
    private Animator a;
    final /* synthetic */ heq b;
    
    public hen(final heq b) {
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public final void f() {
        this.b.i();
        (this.a = ((heu)this.b.b.get()).c(this.b.k())).addListener((Animator$AnimatorListener)new hem(this));
        this.a.start();
    }
    
    @Override
    public final void g() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
        this.b.j();
    }
}

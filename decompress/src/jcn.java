import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcn implements jcl
{
    private final Animator b;
    
    public jcn(final Animator b) {
        this.b = b;
    }
    
    @Override
    public final jck a() {
        final ofn f = ofn.f();
        this.b.addListener((Animator$AnimatorListener)new jcm(f));
        this.b.start();
        return new jcq(this.b, f);
    }
    
    @Override
    public final void b(final Animator$AnimatorListener animator$AnimatorListener) {
        this.b.addListener(animator$AnimatorListener);
    }
}

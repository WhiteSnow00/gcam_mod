import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class vn implements Animator$AnimatorListener
{
    private boolean a;
    
    public void a() {
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (!this.a) {
            this.a();
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a = false;
    }
}

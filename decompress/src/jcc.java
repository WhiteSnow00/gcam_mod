import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcc extends AnimatorListenerAdapter
{
    private final View a;
    private final int b;
    private int c;
    
    public jcc(final View a, final int b) {
        this.c = 0;
        this.a = a;
        this.b = b;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.setVisibility(this.c);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final int b = this.b;
        if (b != 0) {
            this.a.setVisibility(b);
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.c = this.a.getVisibility();
        if (this.b == 0) {
            this.a.setVisibility(0);
        }
    }
}

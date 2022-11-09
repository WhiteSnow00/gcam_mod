import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet$Builder;
import android.animation.AnimatorSet;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbp
{
    public int a;
    private final Interpolator b;
    private final AnimatorSet c;
    private AnimatorSet$Builder d;
    
    private jbp(final int a, final Interpolator b) {
        this.a = a;
        this.b = b;
        this.c = new AnimatorSet();
    }
    
    public static jbp b(final int n, final Interpolator interpolator) {
        return new jbp(n, interpolator);
    }
    
    public final AnimatorSet a() {
        return this.c.clone();
    }
    
    public final void c(final Object o, final String s, final float n, final float n2) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o, s, new float[] { n, n2 });
        ofFloat.setDuration((long)this.a);
        ofFloat.setInterpolator((TimeInterpolator)this.b);
        final AnimatorSet$Builder d = this.d;
        if (d == null) {
            this.d = this.c.play((Animator)ofFloat);
            return;
        }
        d.with((Animator)ofFloat);
    }
    
    public final void d(final Object o, final String s, final int n, final int n2) {
        final ObjectAnimator ofArgb = ObjectAnimator.ofArgb(o, s, new int[] { n, n2 });
        ofArgb.setDuration((long)this.a);
        ofArgb.setInterpolator((TimeInterpolator)this.b);
        final AnimatorSet$Builder d = this.d;
        if (d == null) {
            this.d = this.c.play((Animator)ofArgb);
            return;
        }
        d.with((Animator)ofArgb);
    }
}

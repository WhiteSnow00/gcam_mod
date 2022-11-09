import android.view.ViewGroup$LayoutParams;
import java.util.List;
import j$.util.function.Consumer;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrh
{
    public final kf a;
    public final ofn b;
    public final hsw c;
    public final hpw d;
    public boolean e;
    public View f;
    public View g;
    public jcb h;
    public hqi i;
    private final int j;
    private AnimatorSet k;
    
    public hrh(final kf a, final hsw c, final hpw d) {
        this.b = ofn.f();
        this.h = jcb.a;
        this.a = a;
        this.c = c;
        this.d = d;
        this.j = a.getResources().getInteger(2131492979);
    }
    
    public final Animator a() {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.g, View.ALPHA, new float[] { 0.0f, 1.0f });
        ofFloat.setDuration((long)this.j);
        ofFloat.addListener(jvh.f((Consumer)new hrf(this, 1)));
        return (Animator)ofFloat;
    }
    
    public final Animator b() {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.g, View.ALPHA, new float[] { 1.0f, 0.0f });
        ofFloat.setDuration((long)this.j);
        ofFloat.addListener(jvh.e((Consumer)new hrf(this)));
        return (Animator)ofFloat;
    }
    
    final void c() {
        if (this.f.getWidth() != 0 && this.f.getHeight() != 0) {
            this.d(nns.n(this.b(), this.a()));
            final View f = this.f;
            final jcb h = this.h;
            final int min = Math.min(f.getWidth(), f.getHeight());
            final int max = Math.max(f.getWidth(), f.getHeight());
            jcb.d(h);
            final ViewGroup$LayoutParams layoutParams = f.getLayoutParams();
            if (jcb.d(h)) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            else {
                layoutParams.height = max;
                layoutParams.width = min;
            }
            f.setLayoutParams(layoutParams);
            final View f2 = this.f;
            final jcb h2 = this.h;
            int max2 = Math.max(f2.getWidth(), f2.getHeight());
            int min2 = Math.min(f2.getWidth(), f2.getHeight());
            switch (h2.ordinal()) {
                default: {
                    max2 = 0;
                    min2 = 0;
                    break;
                }
                case 2: {
                    min2 = 0;
                    break;
                }
                case 1: {
                    max2 = 0;
                    break;
                }
            }
            final int e = h2.e;
            f2.setTranslationX((float)max2);
            f2.setTranslationY((float)min2);
            f2.setPivotX(0.0f);
            f2.setPivotY(0.0f);
            f2.setRotation((float)h2.e);
            this.d.e(this.h);
        }
    }
    
    public final void d(final List list) {
        if (this.e) {
            final AnimatorSet k = this.k;
            if (k != null && k.isStarted()) {
                this.k.cancel();
            }
            (this.k = new AnimatorSet()).playSequentially(list);
            this.k.start();
        }
    }
}

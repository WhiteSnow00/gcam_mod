import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngb implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ TabLayout a;
    
    public ngb(final TabLayout a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.scrollTo((int)valueAnimator.getAnimatedValue(), 0);
    }
}

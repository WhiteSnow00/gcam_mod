import android.animation.Animator;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import android.content.res.Resources;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpk extends AnimatorListenerAdapter
{
    final /* synthetic */ Resources a;
    final /* synthetic */ dos b;
    final /* synthetic */ FocusIndicatorView c;
    
    public dpk(final Resources a, final dos b, final FocusIndicatorView c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.b.f(this.a.getDimension(2131165294));
        this.b.c(this.a.getDimension(2131165467) / 2.0f);
        this.c.invalidate();
    }
}

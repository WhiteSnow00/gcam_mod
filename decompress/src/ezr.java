import android.graphics.drawable.Animatable2$AnimationCallback;
import android.view.View;
import android.widget.FrameLayout;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ezr implements View$OnAttachStateChangeListener
{
    final /* synthetic */ AnimatedVectorDrawable a;
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ ezs c;
    
    public ezr(final ezs c, final AnimatedVectorDrawable a, final FrameLayout b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.a.registerAnimationCallback((Animatable2$AnimationCallback)new ezq(this));
        this.a.start();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a.clearAnimationCallbacks();
        this.b.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
}

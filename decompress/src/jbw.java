import android.graphics.Paint;
import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbw extends AnimatorListenerAdapter
{
    private final View a;
    private final int b;
    
    public jbw(final View a) {
        this.a = a;
        this.b = a.getLayerType();
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a.setLayerType(this.b, (Paint)null);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.a.setLayerType(this.b, (Paint)null);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.a.setLayerType(2, (Paint)null);
    }
}

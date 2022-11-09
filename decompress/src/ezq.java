import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ezq extends Animatable2$AnimationCallback
{
    final /* synthetic */ ezr a;
    
    public ezq(final ezr a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Drawable drawable) {
        final ezr a = this.a;
        final kjm a2 = a.c.a;
        final AnimatedVectorDrawable a3 = a.a;
        a3.getClass();
        a2.execute(new ezp(a3));
    }
}

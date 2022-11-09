import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import android.graphics.drawable.Animatable2$AnimationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hol extends Animatable2$AnimationCallback
{
    final /* synthetic */ SmartsUiGleamingView a;
    
    public hol(final SmartsUiGleamingView a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(final Drawable drawable) {
        super.onAnimationEnd(drawable);
        this.a.a();
    }
}

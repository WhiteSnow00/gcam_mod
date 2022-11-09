import android.animation.Animator$AnimatorListener;
import android.support.wearable.view.drawer.PageIndicatorView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vt extends vn
{
    final /* synthetic */ PageIndicatorView a;
    
    public vt(final PageIndicatorView a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final PageIndicatorView a = this.a;
        a.c = false;
        a.animate().alpha(0.0f).setListener((Animator$AnimatorListener)null).setStartDelay((long)this.a.a).setDuration((long)this.a.b).start();
    }
}

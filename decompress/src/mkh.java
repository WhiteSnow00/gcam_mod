import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mkh implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ mki a;
    private final AtomicReference b;
    
    public mkh(final mki a, final View view) {
        this.a = a;
        this.b = new AtomicReference((V)view);
    }
    
    public final boolean onPreDraw() {
        final View view = this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            mrm.a().postAtFrontOfQueue((Runnable)new mkg(this.a));
            mrm.e(new mkg(this.a, 2));
        }
        catch (final RuntimeException ex) {}
        return true;
    }
}

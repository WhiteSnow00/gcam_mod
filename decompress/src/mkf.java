import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.SystemClock;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewTreeObserver$OnDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mkf implements ViewTreeObserver$OnDrawListener
{
    final /* synthetic */ mki a;
    private final AtomicReference b = new AtomicReference((V)view);
    
    public void onDraw() {
        final View view = this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new mke(this, view));
            mrm.e(new mkg(this.a, 1));
        }
        catch (final RuntimeException ex) {}
    }
}

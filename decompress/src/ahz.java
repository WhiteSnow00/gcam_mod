import android.os.IBinder;
import android.view.View;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahz implements View$OnAttachStateChangeListener
{
    private final aib a;
    private final WeakReference b;
    
    public ahz(final aib a, final Activity activity) {
        this.a = a;
        this.b = new WeakReference((T)activity);
    }
    
    public final void onViewAttachedToWindow(final View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final Activity activity = (Activity)this.b.get();
        final IBinder c = aal.c(activity);
        if (activity == null) {
            return;
        }
        if (c == null) {
            return;
        }
        this.a.e(c, activity);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        view.getClass();
    }
}

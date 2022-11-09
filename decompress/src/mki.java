import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver$OnDrawListener;
import android.os.SystemClock;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mki implements Application$ActivityLifecycleCallbacks
{
    public final Application a;
    final /* synthetic */ mkk b;
    
    public mki(final mkk b, final Application a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        mkd mkd;
        if (this.b.m.b == null) {
            mkd = this.b.m;
        }
        else {
            mkd = this.b.n;
        }
        mkd.a = activity.getClass().getSimpleName();
        mkd.b = elapsedRealtime;
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        mkd mkd;
        if (this.b.n.b == null) {
            mkd = this.b.m;
        }
        else {
            mkd = this.b.n;
        }
        if (mkd.d == null) {
            mkd.d = SystemClock.elapsedRealtime();
        }
        try {
            final View viewById = activity.findViewById(16908290);
            final ViewTreeObserver viewTreeObserver = viewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener((ViewTreeObserver$OnDrawListener)new mkf(this, viewById, null));
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new mkh(this, viewById));
        }
        catch (final RuntimeException ex) {}
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        mkd mkd;
        if (this.b.n.b == null) {
            mkd = this.b.m;
        }
        else {
            mkd = this.b.n;
        }
        if (mkd.c == null) {
            mkd.c = SystemClock.elapsedRealtime();
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}

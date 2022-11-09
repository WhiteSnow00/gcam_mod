import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

final class adk implements Application$ActivityLifecycleCallbacks
{
    public adk() {
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityPostCreated(final Activity activity, final Bundle bundle) {
        adl.a(activity, g.a);
    }
    
    public final void onActivityPostResumed(final Activity activity) {
        adl.a(activity, g.c);
    }
    
    public final void onActivityPostStarted(final Activity activity) {
        adl.a(activity, g.b);
    }
    
    public final void onActivityPreDestroyed(final Activity activity) {
        adl.a(activity, g.f);
    }
    
    public final void onActivityPrePaused(final Activity activity) {
        adl.a(activity, g.d);
    }
    
    public final void onActivityPreStopped(final Activity activity) {
        adl.a(activity, g.e);
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}

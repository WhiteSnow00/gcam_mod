import android.os.Bundle;
import android.app.FragmentManager;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import android.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adl extends Fragment
{
    static void a(final Activity activity, final g g) {
        if (activity instanceof m) {
            ((m)activity).b().c(g);
            return;
        }
        if (activity instanceof k) {
            final i ad = ((k)activity).aD();
            if (ad instanceof i) {
                ad.c(g);
            }
        }
    }
    
    public static void b(final Activity activity) {
        activity.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new adk());
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new adl(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final g a = g.a;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final g a = g.a;
    }
    
    public final void onPause() {
        super.onPause();
        final g a = g.a;
    }
    
    public final void onResume() {
        super.onResume();
        final g a = g.a;
    }
    
    public final void onStart() {
        super.onStart();
        final g a = g.a;
    }
    
    public final void onStop() {
        super.onStop();
        final g a = g.a;
    }
}

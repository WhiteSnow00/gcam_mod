import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnv
{
    private static final nsd a;
    private final WeakReference b;
    private final kjm c;
    private final AtomicBoolean d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/activity/util/ActivityFinishWithReason");
    }
    
    public bnv(final WeakReference b, final kjm c) {
        this.b = b;
        this.c = c;
        this.d = new AtomicBoolean(false);
    }
    
    public final void a(final String s) {
        kjm.a();
        njo.d(njb.d(s) ^ true);
        final Activity activity = (Activity)this.b.get();
        if (activity != null && !this.d.getAndSet(true)) {
            a.k(bnv.a.c(), "WARNING: Activity was artificially finished: %s", s, '1');
            this.c.execute(new dqi(activity, 1));
        }
    }
}

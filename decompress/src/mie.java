import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mie implements mfh, mfg
{
    private static final nsd a;
    private final oui b;
    private boolean c;
    private Activity d;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor");
    }
    
    public mie(final oui b, final pii pii, final niz niz, final Executor executor) {
        this.c = false;
        this.b = b;
        executor.execute(new mid(this, pii, niz));
    }
    
    @Override
    public void a(final Activity d) {
        synchronized (this) {
            this.d = d;
            if (this.c) {
                ((min)this.b.get()).d(d);
            }
        }
    }
    
    @Override
    public void b(final Activity activity) {
        synchronized (this) {
            if (!activity.equals(this.d)) {
                mie.a.c().E(3109).x("Activity mismatch (currentActivity=%s, activity=%s)", this.d, activity);
            }
            if (this.c) {
                ((min)this.b.get()).a(activity);
            }
            this.d = null;
        }
    }
}

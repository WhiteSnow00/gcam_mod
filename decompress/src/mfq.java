import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfq implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public final List a;
    public final AtomicInteger b;
    private final mdp d;
    private final AtomicInteger e;
    private final AtomicInteger f;
    private final AtomicInteger g;
    private final AtomicInteger h;
    private final AtomicInteger i;
    private Boolean j;
    private volatile String k;
    private volatile Activity l;
    private boolean m;
    
    public mfq(final mdp d) {
        this.a = new CopyOnWriteArrayList();
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.b = new AtomicInteger();
        this.g = new AtomicInteger();
        this.h = new AtomicInteger();
        this.i = new AtomicInteger();
        this.m = false;
        this.d = d;
    }
    
    private final void a(final Activity activity) {
        this.c(mfs.c(activity.getApplicationContext()), activity);
    }
    
    private final void b() {
        if (this.m) {
            return;
        }
        if (this.e.get() != 0) {
            return;
        }
        final mdp d = this.d;
        if (d.a()) {
            this.m = true;
            return;
        }
        final String value = String.valueOf(d.a);
        String concat;
        if (value.length() != 0) {
            concat = "Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: ".concat(value);
        }
        else {
            concat = new String("Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: ");
        }
        throw new IllegalStateException(concat);
    }
    
    private final void c(final Boolean j, final Activity activity) {
        if (j.equals(this.j)) {
            return;
        }
        this.j = j;
        if (j) {
            for (final mfo mfo : this.a) {
                if (mfo instanceof mfm) {
                    ((mfm)mfo).b(activity);
                }
            }
        }
        else {
            for (final mfo mfo2 : this.a) {
                if (mfo2 instanceof mfl) {
                    ((mfl)mfo2).c(activity);
                }
            }
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.e.incrementAndGet();
        this.l = null;
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfe) {
                ((mfe)mfo).a(activity, bundle);
            }
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        if (this.i.getAndIncrement() == 0) {
            this.b();
        }
        this.l = null;
        for (final mfo mfo : this.a) {
            if (mfo instanceof mff) {
                ((mff)mfo).a();
            }
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            this.b();
        }
        this.k = null;
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfg) {
                ((mfg)mfo).b(activity);
            }
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            this.b();
        }
        this.l = null;
        this.k = activity.getClass().getSimpleName();
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfh) {
                ((mfh)mfo).a(activity);
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfi) {
                ((mfi)mfo).a();
            }
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            this.b();
        }
        this.l = null;
        this.a(activity);
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfj) {
                ((mfj)mfo).b(activity);
            }
        }
    }
    
    public final void onActivityStopped(final Activity l) {
        if (this.h.getAndIncrement() == 0) {
            this.b();
        }
        this.l = l;
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfk) {
                ((mfk)mfo).a();
            }
        }
        this.a(l);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        for (final mfo mfo : this.a) {
            if (mfo instanceof mfn) {
                ((mfn)mfo).a();
            }
        }
        if (n >= 20 && this.l != null) {
            this.c(false, this.l);
        }
        this.l = null;
    }
}

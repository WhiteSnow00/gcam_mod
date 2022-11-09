import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrr implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public static final jrr a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public final ArrayList d;
    public boolean e;
    
    static {
        a = new jrr();
    }
    
    private jrr() {
        this.b = new AtomicBoolean();
        this.c = new AtomicBoolean();
        this.d = new ArrayList();
        this.e = false;
    }
    
    private final void a(final boolean b) {
        final jrr a = jrr.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                final Handler o = ((jsh)iterator.next()).a.o;
                o.sendMessage(o.obtainMessage(1, (Object)b));
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            this.a(false);
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        final boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            this.a(false);
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            this.a(true);
        }
    }
}

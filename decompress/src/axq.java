import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axq
{
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile axo d;
    
    public axq() {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(new axm());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        singleThreadExecutor.execute(new axn(this));
    }
    
    public final ayt a(final awc awc) {
        synchronized (this) {
            final axp axp = this.a.get(awc);
            if (axp == null) {
                return null;
            }
            final ayt ayt = axp.get();
            if (ayt == null) {
                this.c(axp);
            }
            return ayt;
        }
    }
    
    public final void b(final awc awc, final ayt ayt) {
        synchronized (this) {
            final axp axp = this.a.put(awc, new axp(awc, ayt, this.b));
            if (axp != null) {
                axp.a();
            }
        }
    }
    
    final void c(final axp axp) {
        synchronized (this) {
            this.a.remove(axp.a);
            if (axp.b) {
                final aza c = axp.c;
            }
        }
    }
    
    final void d(final awc awc) {
        synchronized (this) {
            final axp axp = this.a.remove(awc);
            if (axp != null) {
                axp.a();
            }
        }
    }
}

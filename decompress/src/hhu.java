import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Set;
import j$.util.function.Consumer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhu
{
    public static final nsd a;
    public final List b;
    public final hfn c;
    public final Executor d;
    public final Map e;
    private final oui f;
    private final kjm g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/session/SessionNotifier");
    }
    
    public hhu(final Executor executor, final kjm g, final hfn c, final oui f) {
        this.b = new ArrayList();
        this.e = (Map)new ConcurrentHashMap();
        this.g = g;
        this.c = c;
        this.f = f;
        this.d = ofi.e(executor);
    }
    
    public final void a(final hhz hhz) {
        synchronized (this.b) {
            this.b.add(hhz);
        }
    }
    
    public final void b(final Consumer consumer, final him him) {
        this.g.execute(new hhr(this, consumer, him));
    }
    
    public final void c(final Consumer consumer) {
        final Iterator iterator = ((Set)this.f.get()).iterator();
        while (iterator.hasNext()) {
            consumer.accept((Object)iterator.next());
        }
        final Iterator iterator2 = this.b.iterator();
        while (iterator2.hasNext()) {
            consumer.accept((Object)iterator2.next());
        }
    }
    
    public final void d(final Consumer consumer) {
        this.g.execute(new hhq(this, consumer));
    }
    
    public final void e(final him him, final Runnable runnable, final String s) {
        final oey oey = this.e.get(him);
        if (oey == null) {
            hhu.a.b().E(2318).x("%s: No queued future found, maybe shot already finalized?: %s", him, s);
            return;
        }
        ofi.w(oey, new hht(s, runnable, him), this.d);
    }
    
    public final void f(final Bitmap bitmap) {
        this.d((Consumer)new hhi(bitmap));
    }
    
    public final void g(final him him) {
        final oey oey = this.e.get(him);
        if (oey == null) {
            a.k(hhu.a.b(), "%s: No queued future found, maybe shot already finalized?: notifyTaskDone", him, '\u0914');
            return;
        }
        oey.d(new hhn(this, him, 2), this.d);
    }
    
    public final void h(final him him, final oey oey, final hip hip) {
        this.e.put(him, odg.h(oey, new hhh(this, him, hip), this.d));
    }
    
    public final void i(final hhz hhz) {
        synchronized (this.b) {
            this.b.remove(hhz);
        }
    }
}

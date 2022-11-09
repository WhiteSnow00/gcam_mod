import java.util.logging.Level;
import android.util.Log;
import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class nuw extends num
{
    public static final AtomicReference a;
    private static final AtomicLong b;
    private static final ConcurrentLinkedQueue c;
    private volatile ntl d;
    
    static {
        a = new AtomicReference();
        b = new AtomicLong();
        c = new ConcurrentLinkedQueue();
    }
    
    public nuw(String fingerprint) {
        super(fingerprint);
        fingerprint = Build.FINGERPRINT;
        boolean b = true;
        final boolean b2 = fingerprint == null || "robolectric".equals(Build.FINGERPRINT);
        final boolean b3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if (!"eng".equals(Build.TYPE)) {
            if (!"userdebug".equals(Build.TYPE)) {
                b = false;
            }
        }
        if (!b2 && !b3) {
            ntl a;
            if (b) {
                final nuy nuy = new nuy();
                a = new nuy(nuy.a, nuy.b, false, nuy.d).a(this.a());
            }
            else {
                a = null;
            }
            this.d = a;
            return;
        }
        this.d = new nun().a(this.a());
    }
    
    public static void e() {
        while (true) {
            final nuw nuw = nuu.a.poll();
            if (nuw == null) {
                break;
            }
            nuw.d = nuw.a.get().a(nuw.a());
        }
        f();
    }
    
    private static void f() {
        while (true) {
            final nuv nuv = nuw.c.poll();
            if (nuv == null) {
                break;
            }
            nuw.b.getAndDecrement();
            final ntl a = nuv.a;
            final ntk b = nuv.b;
            if (!b.B() && !a.d(b.m())) {
                continue;
            }
            a.c(b);
        }
    }
    
    @Override
    public final void b(final RuntimeException ex, final ntk ntk) {
        if (this.d != null) {
            this.d.b(ex, ntk);
            return;
        }
        Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", (Throwable)ex);
    }
    
    @Override
    public final void c(final ntk ntk) {
        if (this.d != null) {
            this.d.c(ntk);
            return;
        }
        if (nuw.b.incrementAndGet() > 20L) {
            nuw.c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        nuw.c.offer(new nuv(this, ntk));
        if (this.d != null) {
            f();
        }
    }
    
    @Override
    public final boolean d(final Level level) {
        return this.d == null || this.d.d(level);
    }
}

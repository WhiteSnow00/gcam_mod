import java.util.Iterator;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.util.Log;
import java.util.concurrent.Executors;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.os.WorkSource;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.concurrent.Future;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdp
{
    public static final long a;
    public static volatile lwt p;
    private static volatile ScheduledExecutorService q;
    private static final Object r;
    public final Object b;
    public final PowerManager$WakeLock c;
    public int d;
    public Future e;
    public long f;
    public boolean g;
    public int h;
    public kat i;
    public final String j;
    public final String k;
    public final Map l;
    public AtomicInteger m;
    public final ScheduledExecutorService n;
    public jwm o;
    private final Set s;
    private WorkSource t;
    
    static {
        a = TimeUnit.DAYS.toMillis(366L);
        kdp.q = null;
        r = new Object();
        kdp.p = new lwt();
    }
    
    public kdp(final Context context) {
        final String packageName = context.getPackageName();
        this.b = new Object();
        this.d = 0;
        this.s = new HashSet();
        this.g = true;
        this.o = jwm.a;
        this.l = new HashMap();
        this.m = new AtomicInteger(0);
        jvu.j(context, "WakeLock: context must not be null");
        jvu.i("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.k = "Analytics WakeLock";
        this.i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.j = "*gcore*:Analytics WakeLock";
        }
        else {
            this.j = "Analytics WakeLock";
        }
        final PowerManager powerManager = (PowerManager)context.getSystemService("power");
        nov.z(powerManager);
        final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, "Analytics WakeLock");
        this.c = wakeLock;
        if (jws.b(context)) {
            String packageName2 = packageName;
            if (jwr.a(packageName)) {
                packageName2 = context.getPackageName();
            }
            final WorkSource a = jws.a(context, packageName2);
            if ((this.t = a) != null) {
                e(wakeLock, a);
            }
        }
        final ScheduledExecutorService q;
        if ((q = kdp.q) == null) {
            synchronized (kdp.r) {
                if (kdp.q == null) {
                    final ltl a2 = kaw.a;
                    kdp.q = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                }
            }
        }
        this.n = q;
    }
    
    private static void e(final PowerManager$WakeLock ex, final WorkSource workSource) {
        try {
            ((PowerManager$WakeLock)ex).setWorkSource(workSource);
            return;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {}
        catch (final IllegalArgumentException ex2) {}
        Log.wtf("WakeLock", ex.toString());
    }
    
    public final void a() {
        if (this.s.isEmpty()) {
            return;
        }
        final ArrayList list = new ArrayList(this.s);
        this.s.clear();
        if (list.size() <= 0) {
            return;
        }
        final lwt lwt = (lwt)list.get(0);
        throw null;
    }
    
    public final boolean b() {
        synchronized (this.b) {
            return this.d > 0;
        }
    }
    
    public final void c() {
        if (this.g) {
            TextUtils.isEmpty((CharSequence)null);
        }
    }
    
    public final void d() {
        final Object b = this.b;
        monitorenter(b);
        try {
            if (!this.b()) {
                monitorexit(b);
                return;
            }
            if (this.g) {
                if (--this.d > 0) {
                    monitorexit(b);
                    return;
                }
            }
            else {
                this.d = 0;
            }
            this.a();
            final Iterator iterator = this.l.values().iterator();
            while (iterator.hasNext()) {
                ((kdo)iterator.next()).a = 0;
            }
            this.l.clear();
            final Future e = this.e;
            if (e != null) {
                e.cancel(false);
                this.e = null;
                this.f = 0L;
            }
            this.h = 0;
            Label_0253: {
                if (this.c.isHeld()) {
                    try {
                        try {
                            this.c.release();
                            if (this.i != null) {
                                this.i = null;
                            }
                            break Label_0253;
                        }
                        finally {
                            if (this.i != null) {
                                this.i = null;
                            }
                            throw;
                            Log.e("WakeLock", this.j.concat(" failed to release!"), (Throwable)ex);
                            iftrue(Label_0253:)(this.i == null);
                            this.i = null;
                        }
                    }
                    catch (final RuntimeException ex2) {}
                }
                Log.e("WakeLock", this.j.concat(" should be held!"));
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}

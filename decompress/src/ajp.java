import android.content.Intent;
import java.util.Iterator;
import androidx.work.ListenableWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import java.util.Set;
import java.util.Map;
import android.content.Context;
import android.os.PowerManager$WakeLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajp implements ajm, alz
{
    public static final String a;
    public PowerManager$WakeLock b;
    public final Context c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final Object g;
    private final ail h;
    private final WorkDatabase i;
    private final List j;
    private final List k;
    private final apa l;
    
    static {
        a = aiy.b("Processor");
    }
    
    public ajp(final Context c, final ail h, final apa l, final WorkDatabase i, final List j) {
        this.c = c;
        this.h = h;
        this.l = l;
        this.i = i;
        this.e = new HashMap();
        this.d = new HashMap();
        this.j = j;
        this.f = new HashSet();
        this.k = new ArrayList();
        this.b = null;
        this.g = new Object();
    }
    
    public static boolean e(final String s, final akl akl) {
        if (akl != null) {
            akl.f = true;
            akl.c();
            final oey e = akl.e;
            boolean done;
            if (e != null) {
                done = e.isDone();
                akl.e.cancel(true);
            }
            else {
                done = false;
            }
            final ListenableWorker d = akl.d;
            if (d != null && !done) {
                d.aH();
            }
            else {
                String.format("WorkSpec %s is already done. Not interrupting.", akl.c);
                aiy.a().d(new Throwable[0]);
            }
            final aiy a = aiy.a();
            String.format("WorkerWrapper interrupted for %s", s);
            a.d(new Throwable[0]);
            return true;
        }
        final aiy a2 = aiy.a();
        String.format("WorkerWrapper could not be found for %s", s);
        a2.d(new Throwable[0]);
        return false;
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        final Object g = this.g;
        monitorenter(g);
        try {
            this.e.remove(s);
            final aiy a = aiy.a();
            String.format("%s %s executed; reschedule = %s", this.getClass().getSimpleName(), s, b);
            a.d(new Throwable[0]);
            final Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                ((ajm)iterator.next()).a(s, b);
            }
            monitorexit(g);
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
    
    public final void b(final ajm ajm) {
        synchronized (this.g) {
            this.k.add(ajm);
        }
    }
    
    public final void c(final ajm ajm) {
        synchronized (this.g) {
            this.k.remove(ajm);
        }
    }
    
    public final void d() {
        synchronized (this.g) {
            if (this.d.isEmpty()) {
                final Intent d = amc.d(this.c);
                try {
                    this.c.startService(d);
                }
                finally {
                    aiy.a();
                    final Throwable t;
                    aiy.e(ajp.a, "Unable to stop foreground service", t);
                }
                final PowerManager$WakeLock b = this.b;
                if (b != null) {
                    b.release();
                    this.b = null;
                }
            }
        }
    }
    
    public final boolean f(final String s) {
        synchronized (this.g) {
            final boolean containsKey = this.e.containsKey(s);
            boolean b = true;
            if (!containsKey) {
                if (!this.d.containsKey(s)) {
                    b = false;
                }
            }
            return b;
        }
    }
    
    public final boolean g(final String s) {
        Object o = this.g;
        synchronized (o) {
            if (this.f(s)) {
                final aiy a = aiy.a();
                String.format("Work %s is already enqueued for processing", s);
                a.d(new Throwable[0]);
                return false;
            }
            final akk akk = new akk(this.c, this.h, this.l, this, this.i, s);
            akk.f = this.j;
            final akl akl = new akl(akk);
            final aox h = akl.h;
            h.d(new ajo(this, s, h), this.l.c);
            this.e.put(s, akl);
            monitorexit(o);
            this.l.a.execute(akl);
            o = aiy.a();
            String.format("%s: processing %s", this.getClass().getSimpleName(), s);
            ((aiy)o).d(new Throwable[0]);
            return true;
        }
    }
}

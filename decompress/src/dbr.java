import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbr implements dbk
{
    public static final nsd a;
    public final List b;
    public final List c;
    public jbm d;
    protected final low e;
    private boolean f;
    private final ScheduledExecutorService g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/debug/jankmonitor/limited/JankMonitorFacadeLimited");
    }
    
    public dbr() {
        this.f = false;
        this.g = mcn.l("JankReports");
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = jbm.a;
        this.e = new low(new dbn(this));
    }
    
    @Override
    public final List a() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList(this.c);
            this.c.clear();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                list.add(((dbq)iterator.next()).a());
            }
            this.b.clear();
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final long n, final long n2) {
        this.e.a(n, n2);
        monitorenter(this);
        try {
            for (final dbq dbq : this.b) {
                ++dbq.c;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d(final jbm d) {
        monitorenter(this);
        try {
            this.d = d;
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.c.add(((dbq)iterator.next()).a());
            }
            this.b.clear();
            this.b.add(new dbq(d, 2));
            if (!this.f) {
                this.f = true;
                final dbq dbq = new dbq(this.d, 3);
                this.b.add(dbq);
                this.g.schedule(new dbm(this, dbq, 1), 5L, TimeUnit.SECONDS);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            final dbq dbq = new dbq(this.d, 4);
            this.b.add(dbq);
            this.g.schedule(new dbm(this, dbq), 5L, TimeUnit.SECONDS);
        }
    }
    
    @Override
    public final void f() {
        monitorenter(this);
        monitorexit(this);
    }
}

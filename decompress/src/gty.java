import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import com.google.googlex.gcam.BurstSpec;
import java.util.Iterator;
import java.util.HashMap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gty implements duz, dvr, dwc
{
    public static final nsd a;
    public final niz b;
    public final gum c;
    private final gry d;
    private final dty e;
    private final Executor f;
    private final HashMap g;
    private final dxk h;
    private final oui i;
    private final dyn j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/SecondaryStereoProcessor");
    }
    
    public gty(final gry d, final dty e, final niz b, final oui i, final Executor f, final dxk h, final gum c, final dyn j) {
        this.g = new HashMap();
        this.d = d;
        this.e = e;
        this.b = b;
        this.i = i;
        this.f = f;
        this.h = h;
        this.c = c;
        this.j = j;
        njo.o(b.g());
    }
    
    private static void k(final dwa dwa, final Throwable t) {
        Throwable t2 = t;
        if (t == null) {
            t2 = new Throwable();
        }
        dwa.b(new dvv(t2));
    }
    
    @Override
    public final void a(final dxh dxh, int a, final long n, final ljm ljm) {
        synchronized (this) {
            dxh.a();
            final gtn gtn = this.g.get(dxh);
            if (gtn != null) {
                gtn.c.o(a);
                return;
            }
            a = dxh.a();
            final StringBuilder sb = new StringBuilder(41);
            sb.append("Shot ");
            sb.append(a);
            sb.append(" hasn't been started yet!");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        synchronized (this) {
            this.d(dxh.c.b.h());
        }
    }
    
    @Override
    public final void d(final him him) {
        monitorenter(this);
        try {
            while (true) {
                for (dxh dxh : this.g.keySet()) {
                    if (dxh.c.b.h().equals(him)) {
                        final dxh dxh2 = dxh;
                        if (dxh2 == null) {
                            monitorexit(this);
                            return;
                        }
                        gty.a.c().E(2086).p("Aborting shot %s", dxh2.a());
                        final gtn gtn = this.g.remove(dxh2);
                        if (gtn != null) {
                            gtn.b();
                        }
                        monitorexit(this);
                        return;
                    }
                }
                final dxh dxh2 = null;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final dxh dxh, final kvs kvs) {
        synchronized (this) {
            final gtx gtx = this.g.get(dxh);
            if (gtx != null) {
                gtx.c(kvs);
            }
        }
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        synchronized (this) {
            dxh.a();
            njo.o(this.g.containsKey(dxh) ^ true);
            this.g.put(dxh, new gtx(this, dxh.c, this.e.a(), burstSpec, ljm));
        }
    }
    
    @Override
    public final void g(final him him) {
        synchronized (this) {
            final dxi a = this.h.a(him);
            a.a(new gtu(this));
            a.e(this);
        }
    }
    
    @Override
    public final void h(final dxh dxh) {
        synchronized (this) {
            dxh.a();
            final gtn gtn = this.g.get(dxh);
            if (gtn == null) {
                gty.a.c().E(2093).p("Shot %s hasn't started yet or was aborted!", dxh.a());
                return;
            }
            this.f.execute(new gtv(this, gtn, dxh));
        }
    }
    
    @Override
    public final void n(final dxh dxh) {
        synchronized (this) {
            this.d(dxh.c.b.h());
        }
    }
}

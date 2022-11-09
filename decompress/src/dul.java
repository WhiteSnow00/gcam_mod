import com.google.googlex.gcam.GcamModuleJNI;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import com.google.googlex.gcam.Gcam;
import java.util.concurrent.Future;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dul
{
    public final Object a;
    public final List b;
    public Future c;
    private final Gcam d;
    private final ScheduledExecutorService e;
    private float f;
    
    public dul(final Gcam d, final ScheduledExecutorService e) {
        this.a = new Object();
        this.b = new ArrayList();
        this.f = 1.0f;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        synchronized (this.a) {
            final Future c = this.c;
            if (c != null) {
                c.cancel(false);
            }
            monitorexit(this.a);
            this.e.execute(new duj(this, 1));
        }
    }
    
    public final void b() {
        this.e.execute(new duj(this));
        synchronized (this.a) {
            this.c = this.e.schedule(new duj(this, 2), 2000L, TimeUnit.MILLISECONDS);
        }
    }
    
    public final void c(final float f) {
        Object o = this.a;
        monitorenter(o);
        try {
            if (f == this.f) {
                monitorexit(o);
                return;
            }
            this.f = f;
            final nns j = nns.j(this.b);
            monitorexit(o);
            for (int size = j.size(), i = 0; i < size; ++i) {
                final int a = j.get(i).a;
                o = this.d;
                GcamModuleJNI.Gcam_LimitShotCpuUsage(((Gcam)o).a, (Gcam)o, a, f);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}

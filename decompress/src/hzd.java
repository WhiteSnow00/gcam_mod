import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.PowerManager$OnThermalStatusChangedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzd implements PowerManager$OnThermalStatusChangedListener, hzg, exn, ews, ewr
{
    private static final nsd c;
    public final List a;
    private final eyt d;
    private final hzb e;
    private boolean f;
    private hzf g;
    
    static {
        c = nsd.g("com/google/android/apps/camera/temperature/SelfUpdatingTemperatureBroadcaster");
    }
    
    public hzd(final eyt d, final hzb e, final ewn ewn, final kjm kjm, final cxl cxl) {
        this.a = new ArrayList();
        this.g = hzf.i;
        this.d = d;
        this.e = e;
        final cxo a = cxr.a;
        cxl.d();
        synchronized (this) {
            if (!this.f) {
                e.a((PowerManager$OnThermalStatusChangedListener)this);
                this.f = true;
            }
            monitorexit(this);
            egz.c(kjm, ewn, this);
        }
    }
    
    public final void a() {
        synchronized (this) {
            if (!this.f) {
                this.e.a((PowerManager$OnThermalStatusChangedListener)this);
            }
            else {
                a.l(hzd.c.c(), "Was already registered as ThermalStatusListener on AppStart", '\u0a0d');
            }
            this.f = true;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.f) {
                final hzb e = this.e;
                e.e.execute(new hza(e, (PowerManager$OnThermalStatusChangedListener)this));
            }
            else {
                a.l(hzd.c.c(), "Was not registered as ThermalStatusListener on AppStop", '\u0a0f');
            }
            this.f = false;
        }
    }
    
    public final hzf c() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final krc d(final hze hze) {
        synchronized (this) {
            this.a.add(hze);
            final hzf g = this.g;
            monitorexit(this);
            if (g != hzf.i) {
                hze.c(g);
            }
            return new hzc(this, hze);
        }
    }
    
    public final void onThermalStatusChanged(int i) {
        final Map b = hzd.b;
        final Integer value = i;
        b.get(value);
        final hzf g = hzd.b.get(value);
        if (g == null) {
            hzd.c.c().E(2579).p("Ignoring call to onThermalStatusChanged with unknown status value: %d", i);
            return;
        }
        monitorenter(this);
        try {
            if (g == this.g) {
                monitorexit(this);
                return;
            }
            final okt m = obk.d.m();
            final int j = this.g.j;
            final boolean c = m.c;
            i = 0;
            if (c) {
                m.m();
                m.c = false;
            }
            final obk obk = (obk)m.b;
            if (j != 0) {
                obk.c = j - 1;
                final int a = obk.a | 0x8;
                obk.a = a;
                final int k = g.j;
                if (k != 0) {
                    obk.b = k - 1;
                    obk.a = (a | 0x4);
                    this.g = g;
                    monitorexit(this);
                    this.d.w((obk)m.h());
                    synchronized (this) {
                        final nns l = nns.j(this.a);
                        final hzf g2 = this.g;
                        monitorexit(this);
                        while (i < l.size()) {
                            l.get(i).c(g2);
                            ++i;
                        }
                        return;
                    }
                }
                throw null;
            }
            throw null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}

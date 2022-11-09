import android.os.Looper;
import android.content.Context;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irr
{
    public final irf a;
    public final irf b;
    public final Handler c;
    public final kkz d;
    public Runnable e;
    public Runnable f;
    public kri g;
    public Executor h;
    private final kjm i;
    private final cxl j;
    private final irf k;
    private final Runnable l;
    private final Object m;
    private krc n;
    
    public irr(final kjm i, final cxl j, final Context context) {
        this.m = new Object();
        this.g = null;
        this.h = null;
        this.i = i;
        this.j = j;
        final boolean k = j.k(cxr.at);
        final String string = context.getResources().getString(2131952009);
        final irg irg = new irg();
        irg.d = string;
        irg.a = true;
        irg.e = context;
        irg.h = 2;
        irg.g = k;
        this.a = irg.a();
        final irg irg2 = new irg();
        irg2.e = context;
        irg2.h = 2;
        irg2.g = k;
        irg2.d = context.getResources().getString(2131952807);
        irg2.a = true;
        this.k = irg2.a();
        irg2.a = false;
        irg2.c = new irl(this);
        this.b = irg2.a();
        this.c = kpo.d(Looper.getMainLooper());
        this.d = new kkz(false);
        this.l = new irn(this);
    }
    
    public final void a() {
        synchronized (this.m) {
            this.c.removeCallbacks(this.l);
            final krc n = this.n;
            if (n != null) {
                n.close();
                this.n = null;
            }
            this.c.removeCallbacks(this.e);
            final Runnable f = this.f;
            if (f != null) {
                this.i.execute(f);
            }
        }
    }
    
    public final void b(final klj klj, final boolean b, final jbm jbm, final efm efm) {
        synchronized (this.m) {
            final cxl j = this.j;
            final cxo a = cxr.a;
            j.f();
            irf irf;
            if (jbm == jbm.b && this.j.k(cxv.d)) {
                irf = this.b;
            }
            else {
                irf = this.k;
            }
            this.d.aR(false);
            final irq irq = new irq(klj, this.d);
            try (final krc n = this.n) {}
            this.e = new iro(this, efm, b, irf, 1);
            this.f = new iro(this, efm, b, irf);
            this.n = irq.a(new irm(this), this.i);
            this.c.postDelayed(this.l, 1000L);
        }
    }
    
    public final void c(final kri g, final Executor h) {
        this.g = g;
        this.h = h;
    }
}

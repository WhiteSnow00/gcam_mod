import android.os.SystemClock;
import android.hardware.camera2.CaptureResult;
import java.util.concurrent.TimeUnit;
import android.content.res.Resources;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpt implements bot
{
    public final bpu a;
    private long b;
    private ScheduledFuture c;
    private ScheduledExecutorService d;
    private lfu e;
    private final Resources f;
    private final eyt g;
    private final boh h;
    private box i;
    private bpa j;
    
    public bpt(final bpu a, final Resources f, final eyt g) {
        this.b = 0L;
        this.a = a;
        this.f = f;
        this.g = g;
        final boh boh = new boh();
        this.h = boh;
        this.i = boh;
    }
    
    private final ScheduledFuture h(final long n) {
        synchronized (this) {
            if (this.d == null) {
                this.d = mcn.l("scn-dist");
            }
            return this.d.schedule(new bps(this), n, TimeUnit.MILLISECONDS);
        }
    }
    
    private final boolean i() {
        final box i = this.i;
        boolean b = false;
        if (i != null) {
            if (i.c() != 1) {
                if (this.i.c() == 2) {
                    return true;
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final void a(final ljm ljm) {
        final lfu e = this.e;
        if (e != null && e == lfu.a) {
            return;
        }
        if (!this.a.c()) {
            return;
        }
        final Integer n = (Integer)ljm.d(CaptureResult.CONTROL_AF_MODE);
        if (n == null) {
            return;
        }
        if (n == 0) {
            this.c();
            return;
        }
        final Boolean b = (Boolean)ljm.d(jli.a);
        if (b == null) {
            return;
        }
        if (b) {
            if (!this.i()) {
                final bpa j = this.j;
                if (j != null) {
                    final bod a = boe.a();
                    a.a = this.f.getString(2131951721);
                    a.b = this.f.getString(2131951721);
                    a.c = true;
                    a.e = 3;
                    final box a2 = j.a(a.a());
                    if ((this.i = a2) != null && a2.c() != 4) {
                        this.b = SystemClock.uptimeMillis();
                        this.g.t();
                    }
                }
            }
            else {
                final ScheduledFuture c = this.c;
                if (c != null) {
                    c.cancel(false);
                }
            }
            return;
        }
        final long n2 = SystemClock.uptimeMillis() - this.b;
        if (n2 < 2000L) {
            this.c = this.h(2000L - n2);
            return;
        }
        this.g();
    }
    
    @Override
    public final bor b() {
        return this.a;
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            this.g();
            final ScheduledExecutorService d = this.d;
            if (d != null) {
                d.shutdown();
                this.d = null;
            }
            this.c = null;
        }
    }
    
    @Override
    public final void d(final lfj lfj) {
    }
    
    @Override
    public final void e(final lfg lfg) {
        this.e = lfg.l();
        this.g();
    }
    
    @Override
    public final void f(final bpa j) {
        this.j = j;
        if (j == null) {
            this.i = this.h;
        }
    }
    
    public final void g() {
        if (this.i == null) {
            return;
        }
        if (this.i()) {
            this.i.a();
        }
    }
}

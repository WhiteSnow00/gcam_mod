import java.util.concurrent.Executor;
import android.view.View;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcl implements ivy
{
    public final ixx a;
    public final efm b;
    public final flc c;
    public final Handler d;
    public krc e;
    public volatile krc f;
    private final Resources g;
    private final SharedPreferences h;
    private final hkg i;
    private final ScheduledExecutorService j;
    private final cxl k;
    private final boolean l;
    private iuk m;
    private ScheduledFuture n;
    
    public fcl(final bmz bmz, final ixx a, final Resources g, final SharedPreferences h, final efm b, final hkg i, final flc c, final cxl k, final ScheduledExecutorService j, final Handler d) {
        this.n = null;
        this.f = null;
        this.a = a;
        this.g = g;
        this.h = h;
        this.b = b;
        this.i = i;
        this.c = c;
        this.j = j;
        this.d = d;
        this.k = k;
        this.l = k.k(cxw.r);
        bmz.i().c(new fcj(this));
    }
    
    private final void d() {
        synchronized (this) {
            this.n = this.j.schedule(new fck(this), 3000L, TimeUnit.MILLISECONDS);
        }
    }
    
    private final void e() {
        synchronized (this) {
            final ScheduledFuture n = this.n;
            if (n != null) {
                n.cancel(false);
                this.n = null;
            }
            if (this.f != null) {
                this.f.close();
                this.f = null;
            }
        }
    }
    
    private final boolean f() {
        synchronized (this) {
            return this.m == iuk.a && this.i.a("long_press") == 0 && this.h.getBoolean("finish_video_capture", false) && !this.h.getBoolean("finish_long_shot_capture", false);
        }
    }
    
    public final void a() {
        synchronized (this) {
            this.i.b("long_press", this.i.a("long_press") + 1);
        }
    }
    
    @Override
    public final void b(final iuk m) {
        synchronized (this) {
            if (this.l && (this.m == iuk.a || this.m == null) && m == iuk.G) {
                this.d();
            }
            if (this.m == iuk.f && m == iuk.e && !this.h.contains("finish_video_capture")) {
                this.h.edit().putBoolean("finish_video_capture", true).apply();
            }
            if ((this.m == iuk.G || this.m == iuk.H) && m == iuk.a) {
                if (this.l) {
                    this.e();
                }
                if (!this.h.contains("finish_long_shot_capture")) {
                    this.h.edit().putBoolean("finish_long_shot_capture", true).apply();
                }
            }
            if (m != iuk.a) {
                try (final krc e = this.e) {}
            }
            this.m = m;
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            if (!this.f()) {
                return;
            }
            final int n = -this.a.l.getHeight() / 2;
            final int dimensionPixelSize = this.g.getDimensionPixelSize(2131166139);
            int n2;
            if (this.k.k(cxr.at)) {
                n2 = this.g.getDimensionPixelSize(2131165753);
            }
            else {
                n2 = this.g.getDimensionPixelSize(2131165754);
            }
            final iwg iwg = new iwg(this.g.getString(2131952170));
            iwg.c((View)this.a.l, n + dimensionPixelSize + n2);
            iwg.p();
            iwg.h = this.k.k(cxr.at);
            iwg.u();
            iwg.l();
            iwg.m();
            iwg.c = 1500;
            iwg.k();
            iwg.f = true;
            iwg.g(new fck(this, 2), this.j);
            iwg.i = this.b;
            iwg.m = 4;
            iwg.e = true;
            this.e = iwg.a();
        }
    }
}

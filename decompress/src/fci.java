import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import j$.util.function.Supplier;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fci implements hhz
{
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final niz c;
    public final cxl d;
    public final hrk e;
    private final ixx f;
    private final Resources g;
    private final efm h;
    private final hfn i;
    private final hkg j;
    private final ScheduledExecutorService k;
    private final AtomicBoolean l;
    
    public fci(final ixx f, final Resources g, final hkg j, final efm h, final ScheduledExecutorService k, final hfn i, final niz c, final cxl d) {
        this.a = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.e = new fch(this);
        this.f = f;
        this.g = g;
        this.j = j;
        this.i = i;
        this.h = h;
        this.k = k;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        synchronized (this) {
            this.j.b("long_press_photos_edu", this.j.a("long_press_photos_edu") + 1);
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.l.compareAndSet(true, false) && this.j.a("long_press_photos_edu") == 0) {
                final float thumbnailFinalDiameter = this.f.f.getThumbnailButton().getThumbnailFinalDiameter();
                final Resources g = this.g;
                int n;
                if (!this.d.k(cxr.at)) {
                    n = 2131165756;
                }
                else {
                    n = 2131165755;
                }
                final int dimensionPixelSize = g.getDimensionPixelSize(n);
                final iwg iwg = new iwg(new fce(this));
                iwg.c((View)this.f.f.getThumbnailButton(), (int)(-(thumbnailFinalDiameter / 2.0f) + dimensionPixelSize));
                iwg.p();
                iwg.h = this.d.k(cxr.at);
                iwg.u();
                iwg.l();
                iwg.m();
                iwg.c = 200;
                iwg.d = 30000;
                iwg.d((Supplier)new fcg(this));
                iwg.k();
                iwg.f = true;
                iwg.g = false;
                iwg.a.add(new iwa(new fcf(this), this.k, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.SECONDS)));
                iwg.i = this.h;
                iwg.m = 4;
                iwg.e = false;
                iwg.a();
            }
        }
    }
    
    @Override
    public final void k(final him him) {
        this.l.set((boolean)niz.h(this.i.a(him)).b(btt.s).e(false));
        if (!this.a.get()) {
            this.b();
        }
    }
}

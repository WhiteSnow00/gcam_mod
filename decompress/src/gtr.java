import com.google.googlex.gcam.BurstSpec;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtr implements duz, dwc
{
    public static final nsd a;
    public final oui b;
    public final kre c;
    public final gry d;
    public final fxu e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public dtx j;
    private final dty k;
    private final Executor l;
    private final dxk m;
    private boolean n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/OnDemandPreviewProcessor");
    }
    
    public gtr(final oui b, final kre c, final dty k, final gry d, final fxu e, final Executor l, final dxk m) {
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = e;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.d(dxh.c.b.h());
    }
    
    @Override
    public final void d(final him him) {
        synchronized (this) {
            this.i = false;
            this.n = false;
        }
    }
    
    @Override
    public final void e(final dxh dxh, final kvs kvs) {
        synchronized (this) {
            ++this.h;
            if (this.i && this.n) {
                this.l.execute(new gtq(this, dxh, kvs));
                return;
            }
            kvs.close();
        }
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        this.j = this.k.a();
        if (burstSpec != null) {
            this.g = (int)burstSpec.b().a();
            this.h = 0;
        }
    }
    
    @Override
    public final void g(final him him) {
        this.m.a(him).e(this);
    }
    
    @Override
    public final void h(final dxh dxh) {
        synchronized (this) {
            this.i = false;
            this.n = false;
        }
    }
    
    public final void j(final long f) {
        synchronized (this) {
            this.i = true;
            this.f = f;
            if (f >= 30000L) {
                this.n = true;
            }
        }
    }
    
    public final void k(final dxh dxh) {
        synchronized (this) {
            if (this.i) {
                this.l.execute(new gtp(this, dxh));
            }
        }
    }
    
    @Override
    public final void n(final dxh dxh) {
        this.d(dxh.c.b.h());
    }
}

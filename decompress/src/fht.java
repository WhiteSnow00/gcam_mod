import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.List;
import android.media.MediaCodec$BufferInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fht implements fha, dpz
{
    public static final nsd a;
    public final hah b;
    public final gzx c;
    public final dtb d;
    public final niz e;
    public final niz f;
    public final fhl g;
    public final fhu h;
    public final MediaFormat i;
    public final fjn j;
    public final AtomicLong k;
    public final AtomicLong l;
    public final AtomicLong m;
    public final AtomicLong n;
    public final flh o;
    public volatile lup p;
    public fjm q;
    private final Executor r;
    private final dpy s;
    private final kre t;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/gyro/MotionDataProcessorImpl");
    }
    
    public fht(final dtb d, final fjn j, final dpy s, final niz e, final niz f, final Executor r, final kre t, final hah b, final gzx c, final fhl g, final fhu h, final MediaFormat i, final cxl cxl) {
        this.k = new AtomicLong(-1L);
        this.l = new AtomicLong(-1L);
        this.m = new AtomicLong(-1L);
        this.n = new AtomicLong(-1L);
        this.o = new flh();
        this.q = null;
        this.d = d;
        this.j = j;
        this.e = e;
        this.f = f;
        this.r = r;
        this.b = b;
        this.c = c;
        this.s = s;
        this.t = t;
        this.g = g;
        this.h = h;
        this.i = i;
        final cxo a = cxw.a;
        cxl.b();
    }
    
    @Override
    public final void b(final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.n.set(mediaCodec$BufferInfo.presentationTimeUs);
        this.o.c(mediaCodec$BufferInfo.presentationTimeUs, new fhp(mediaCodec$BufferInfo));
        this.r.execute(new fhs(this));
    }
    
    @Override
    public final void c() {
        final lup p = this.p;
        if (p != null) {
            this.p = null;
            p.close();
        }
        final fjm q = this.q;
        if (q != null) {
            q.a();
            this.q = null;
        }
    }
    
    @Override
    public final void d(final long n) {
        this.k.set(n);
        new fhr(n);
        flj.b();
        if (!this.d.e()) {
            return;
        }
        final fhn d = fhn.d(this.t, n, 1);
        this.o.b(d);
        final gzn a = this.s.a(n);
        if (a != null) {
            d.a.c.o(a);
        }
        this.r.execute(new fhs(this));
    }
    
    @Override
    public final void e(final long n, final List list) {
        this.l.set(n);
        new fhr(n, 2);
        flj.b();
        final fhn d = fhn.d(this.t, n, 2);
        d.a.f.o(list);
        this.o.b(d);
        final gzn a = this.s.a(n);
        if (a != null) {
            d.a.c.o(a);
        }
        this.r.execute(new fhs(this));
    }
    
    @Override
    public final void k(final gzn gzn) {
        this.m.set(gzn.b);
        final long convert = TimeUnit.MICROSECONDS.convert(gzn.b, TimeUnit.NANOSECONDS);
        if (this.o.a() > 0) {
            this.o.c(convert, new fhq(gzn));
        }
        final long b = gzn.b;
        final Iterator iterator = this.o.a.d().iterator();
        while (iterator.hasNext()) {
            final fho a = ((fhn)iterator.next()).a;
            if (b <= a.b) {
                break;
            }
            if (a.g) {
                continue;
            }
            a.g = true;
        }
        this.r.execute(new fhs(this));
    }
}

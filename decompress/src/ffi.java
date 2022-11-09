import java.util.concurrent.TimeUnit;
import android.media.MediaFormat;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffi implements AutoCloseable
{
    private static final nsd g;
    public final niz a;
    public final Handler b;
    public final niz c;
    public final Executor d;
    public final AtomicLong e;
    ffh f;
    private final cxl h;
    private final MediaFormat i;
    private final AtomicLong j;
    private final AtomicLong k;
    private final AtomicLong l;
    private final AtomicLong m;
    
    static {
        g = nsd.g("com/google/android/apps/camera/microvideo/encoder/AudioTrackSampler");
    }
    
    public ffi(final cxl h, final MediaFormat i, final niz c, final niz a, final Executor d) {
        this.j = new AtomicLong();
        this.k = new AtomicLong();
        this.l = new AtomicLong();
        this.e = new AtomicLong();
        this.m = new AtomicLong();
        this.h = h;
        this.i = i;
        this.a = a;
        this.b = kpo.e(new kjk(), "mv-aud-encoder");
        this.c = c;
        this.d = d;
    }
    
    public final void a(final boolean b) {
        if (!b && System.currentTimeMillis() < this.m.get() + 1000L) {
            return;
        }
        this.j.get();
        this.l.get();
        this.e.get();
        this.k.get();
        this.m.set(System.currentTimeMillis());
    }
    
    public final void b(final lup lup, final ffy ffy) {
        synchronized (this) {
            if (!this.c.g()) {
                return;
            }
            ((dpm)this.c.c()).d(new fff(this, 2), this.d);
            njo.p(this.f == null, "Trying to initialize more than one time");
            final mbl c = mcn.c(new fgo(lup));
            final mbr c2 = ((mbp)c).c(this.i);
            c2.c = this.b;
            c2.b(new ffg(this));
            final mbk a = c2.a();
            c.b();
            this.f = new ffh(c, a, ffy);
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            if (!this.c.g()) {
                monitorexit(this);
                return;
            }
            final ffh f = this.f;
            f.getClass();
            final mbk b = f.b;
            if (b == null) {
                monitorexit(this);
                return;
            }
            try {
                final mbc d = b.d();
                if (d != null) {
                    try {
                        final ffy c = f.c;
                        niz niz;
                        while (true) {
                            final Object b2 = ((dpm)this.c.c()).b();
                            if (b2 == null) {
                                niz = nii.a;
                                break;
                            }
                            this.j.incrementAndGet();
                            final ffx a = c.a(TimeUnit.MICROSECONDS.convert(((maw)b2).c, TimeUnit.NANOSECONDS));
                            if (!a.b()) {
                                final cxl h = this.h;
                                final cxo a2 = cxw.a;
                                h.e();
                                if (a.c() && this.a.g() && this.j.get() >= 5L) {
                                    ((dqc)this.a.c()).b();
                                    this.a(true);
                                    this.j.set(0L);
                                }
                                niz = niz.i(b2);
                                break;
                            }
                            this.k.incrementAndGet();
                        }
                        if (niz.g()) {
                            d.b.put(((maw)niz.c()).a.asReadOnlyBuffer());
                            d.b.position(((maw)niz.c()).a.limit());
                            d.a = TimeUnit.MICROSECONDS.convert(((maw)niz.c()).c, TimeUnit.NANOSECONDS);
                            this.l.incrementAndGet();
                            this.a(false);
                        }
                        d.close();
                        monitorexit(this);
                        return;
                    }
                    finally {
                        try {
                            d.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
                monitorexit(this);
            }
            catch (final IllegalStateException ex) {
                a.m(ffi.g.c(), "Error trying to encode audio packet. Possible codec shutdown", '\u064a', ex);
                monitorexit(this);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a(true);
            final ffh f = this.f;
            if (this.a.g()) {
                ((dqc)this.a.c()).b();
                this.j.set(0L);
            }
            oey oey;
            if (f != null) {
                oey = f.a.a();
            }
            else {
                oey = ofi.n(null);
            }
            flj.a("AudioTrackSampler", oey);
            oey.d(new fff(this, 1), odx.a);
        }
    }
}

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chv extends kxc
{
    private static final nsd a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private final dbu j;
    private final niz k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final long n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/frameserver/listener/FrameDropListener");
    }
    
    public chv(final kmt kmt, final dbu j) {
        long n = -1L;
        this.f = -1L;
        this.l = new AtomicBoolean(true);
        final AtomicBoolean m = new AtomicBoolean(true);
        this.m = m;
        if (kmt != kmt.a) {
            n = 1000000L / kmt.i;
        }
        this.n = n;
        this.j = j;
        final cxo a = cwv.a;
        this.k = nii.a;
        this.b = 1000000 / kmt.i;
        kmt.f();
        if (kmt.f()) {
            m.set(false);
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            ++this.g;
            monitorexit(this);
            if (this.m.get()) {
                final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
                n.getClass();
                final long n2 = n / 1000L;
                long n3 = this.n;
                if (n3 == -1L) {
                    final Long n4 = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
                    n4.getClass();
                    n3 = n4 / 1000L;
                }
                this.g(n2, n3);
                return;
            }
            final long b = ljm.b();
            synchronized (this) {
                if (this.f == b) {
                    this.m.set(true);
                }
                else {
                    this.f = b;
                }
            }
        }
    }
    
    public final int d() {
        synchronized (this) {
            return this.h;
        }
    }
    
    public final int e() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final long f() {
        synchronized (this) {
            return this.g;
        }
    }
    
    final void g(final long d, final long b) {
        synchronized (this) {
            if (!this.l.compareAndSet(true, false) && d > this.e) {
                final long n = d - this.d;
                final long c = this.c;
                final long b2 = this.b;
                final int h = (int)((n - c) / b2);
                if (h < 0 || h > 1000) {
                    chv.a.b().E(475).z("Likely error in frame drop calculation: %d = (%d - %d) / %d", h, n, c, b2);
                }
                this.i += h;
                if (h > this.h) {
                    this.h = h;
                }
                chv.a.c().E(477).z("Frame presentation time: %d us. Expected FPS: %d. Delay: %d us. Possible frame loss counts: %d", d, 1000000L / b, n, h);
            }
            final long c2 = (long)(b * 0.4f);
            this.c = c2;
            this.b = b;
            this.d = d;
            this.e = d + b + c2;
        }
    }
}

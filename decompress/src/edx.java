import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edx implements AutoCloseable, edr
{
    public static final nsd a;
    public final edz b;
    public final edu c;
    public final edh d;
    public edy e;
    public boolean f;
    public boolean g;
    public edq h;
    public Texture i;
    public double j;
    public int k;
    public eap l;
    private final float[] m;
    private final float[] n;
    private final TrackerStats o;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/capture/CaptureModule");
    }
    
    public edx() {
        final edu c = new edu();
        final edz b = new edz();
        this.m = new float[] { 0.0f, 0.0f, 0.0f };
        this.n = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
        this.o = new TrackerStats();
        this.d = ((edi)eea.a(edi.class)).a();
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.i = null;
        this.l = null;
        this.j = 3.4028234663852886E38;
        this.k = 0;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final float[] array, final long n) {
        synchronized (this) {
            if (!this.f || this.g) {
                return;
            }
            this.e.d(this.n);
            final double a = this.e.a();
            if (Math.abs(a - this.j) < 0.5) {
                ++this.k;
                return;
            }
            this.j = a;
            this.d.trackTexture(this.m, this.n);
            this.d.getTrackerStats(this.o);
            this.b.a(this.o);
            this.c.a(array, n);
        }
    }
    
    @Override
    public final void b(final int n, final int n2) {
    }
    
    @Override
    public final void c(final Texture i, final edq h) {
        this.i = i;
        this.h = h;
        this.c.c(i, h);
        final int a = h.a;
        final float d = h.d;
    }
    
    @Override
    public final void close() {
        this.d.release();
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            if (this.f && !this.g) {
                this.c.d();
            }
        }
    }
    
    @Override
    public final void e(final eap eap) {
        this.l = eap;
        this.c.g = eap;
    }
    
    public final void f() {
        this.c.f = 24000000;
    }
    
    public final void g(final String s) {
        synchronized (this) {
            if (!this.f) {
                return;
            }
            this.f = false;
            this.g = false;
            monitorexit(this);
            final edu c = this.c;
            final ees b = c.b;
            if (b != null) {
                b.f = false;
                final eer e = b.e;
                e.sendMessage(e.obtainMessage(2));
                final eer e2 = b.e;
                e2.sendMessage(e2.obtainMessage(3));
                try {
                    b.d.getThread().join();
                }
                catch (final InterruptedException ex) {
                    a.n(ees.a.b(), "%s", ex.getMessage(), '\u0493', ex);
                }
            }
            final edo d = c.d;
            if (d != null) {
                d.a();
            }
            c.g.a(new eds(c));
            final edt edt = new edt();
            final ees b2 = c.b;
            if (b2 != null) {
                edt.a = b2.a();
                edt.b = c.b.c.k;
            }
            else {
                edt.a = 0;
                edt.b = 0;
            }
            c.b = null;
            c.d = null;
            final int stopCapture = this.d.stopCapture(s);
            this.l.a(new edw(this, 1));
            if (edt.a == stopCapture && edt.b <= 0) {
                if (this.k > 0) {
                    final nsx a = ntf.a;
                }
                return;
            }
            edx.a.b().g(ntf.a, "ImaxCaptureModule").E(1129).y("Recorded video stream is out-of-sync with tracking\n%d frames recorded with %d packets dropped, but %d frames tracked", edt.a, edt.b, stopCapture);
        }
    }
}

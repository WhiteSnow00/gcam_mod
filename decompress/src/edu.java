import java.io.IOException;
import android.opengl.EGL14;
import android.media.MediaCodec;
import com.google.android.libraries.vision.opengl.Texture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edu implements edr
{
    public static final nsd a;
    public ees b;
    public eeo c;
    public edo d;
    public boolean e;
    public int f;
    public eap g;
    private edq h;
    private Texture i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/capture/CameraRecorder");
    }
    
    public edu() {
        this.h = null;
        this.i = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.e = false;
        this.f = -1;
    }
    
    @Override
    public final void a(final float[] array, final long n) {
        if (!this.e) {
            final edo d = this.d;
            if (d != null) {
                d.b.c = n / 1000L - System.nanoTime() / 1000L;
                this.e = true;
            }
        }
        final ees b = this.b;
        if (b == null) {
            return;
        }
        if (!b.f) {
            return;
        }
        b.g.incrementAndGet();
        b.b.e();
        final eer e = b.e;
        e.sendMessage(e.obtainMessage(1, (int)(n >> 32), (int)n, (Object)array));
    }
    
    @Override
    public final void b(final int n, final int n2) {
    }
    
    @Override
    public final void c(final Texture i, final edq h) {
        this.i = i;
        this.h = h;
        this.f();
    }
    
    @Override
    public final void d() {
        final ees b = this.b;
        if (b == null) {
            return;
        }
        final eeo b2 = b.b;
        b2.e();
        b2.f();
    }
    
    @Override
    public final void e(final eap g) {
        this.g = g;
    }
    
    public final void f() {
        try {
            int f = this.f;
            if (f <= 0) {
                final float n = this.h.b / 1080.0f;
                f = (int)((n + n * n) * 0.5f * 1.2E7f);
            }
            final edq h = this.h;
            this.c = new eeo(MediaCodec.createEncoderByType("video/avc"), new een(h.a, h.b, h.c, EGL14.eglGetCurrentContext(), this.i, f));
        }
        catch (final IOException ex) {
            a.l(edu.a.b(), "Could not instantiate a video recorder!", '\u0466');
            this.c = null;
        }
    }
}

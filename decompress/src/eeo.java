import java.io.IOException;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import java.util.concurrent.Semaphore;
import android.media.MediaCodec;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeo implements eeh
{
    public static final nsd a;
    public final Bundle b;
    public MediaCodec c;
    public eep d;
    public muf e;
    public final een f;
    public int g;
    public boolean h;
    private final Semaphore i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/video/SurfaceVideoEncoder");
    }
    
    public eeo(final MediaCodec c, final een f) {
        this.i = new Semaphore(1);
        final Bundle b = new Bundle();
        this.b = b;
        this.g = 0;
        this.h = false;
        this.c = c;
        this.f = f;
        b.putInt("request-sync", 0);
    }
    
    @Override
    public final MediaCodec a() {
        return this.c;
    }
    
    @Override
    public final void b() {
        if (!this.h) {
            return;
        }
        this.c.signalEndOfInputStream();
    }
    
    @Override
    public final void c() {
        if (!this.h) {
            return;
        }
        this.h = false;
        try {
            this.c.stop();
        }
        catch (final IllegalStateException ex) {
            a.m(eeo.a.b(), "Illegal state when stopping MediaCodec", '\u0487', ex);
        }
        this.c.release();
        this.e.a();
    }
    
    @Override
    public final boolean d() {
        final een f = this.f;
        final MediaFormat videoFormat = MediaFormat.createVideoFormat("video/avc", f.b, f.c);
        videoFormat.setInteger("color-format", 2130708361);
        videoFormat.setInteger("bitrate", this.f.a);
        videoFormat.setInteger("frame-rate", 30);
        videoFormat.setInteger("i-frame-interval", Math.max(1, 10));
        try {
            this.c.configure(videoFormat, (Surface)null, (MediaCrypto)null, 1);
            (this.e = new muf(this.f.e, this.c.createInputSurface())).b();
            final een f2 = this.f;
            final eep d = new eep(f2.f, f2.d);
            this.d = d;
            final float[] array = new float[16];
            Matrix.setIdentityM(array, 0);
            d.a(array);
            EGL14.eglMakeCurrent(this.e.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            try {
                this.c.start();
                return this.h = true;
            }
            catch (final IllegalStateException ex) {
                a.m(eeo.a.b(), "Cannot start encoder", '\u0489', ex);
                return false;
            }
        }
        catch (final Exception ex2) {
            a.m(eeo.a.b(), "Exception when configuring MediaCodec", '\u0488', ex2);
            this.c.release();
            try {
                this.c = MediaCodec.createEncoderByType("video/avc");
            }
            catch (final IOException ex3) {
                ex3.printStackTrace();
            }
            return false;
        }
    }
    
    public final void e() {
        try {
            this.i.acquire();
        }
        catch (final InterruptedException ex) {
            throw new RuntimeException("Unable to lock frame data", ex);
        }
    }
    
    public final void f() {
        this.i.release();
    }
}

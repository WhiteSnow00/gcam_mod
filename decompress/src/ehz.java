import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.hardware.HardwareBuffer;
import android.opengl.Matrix;
import android.location.Location;
import android.media.MediaFormat;
import android.media.MediaCodec;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import android.view.Surface;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehz implements krc
{
    public static final nsd a;
    private static final float[] g;
    public final ExecutorService b;
    public final lyp c;
    public final mao d;
    public final Surface e;
    public final lyo f;
    private final mbl h;
    private final kra i;
    private final Executor j;
    private final AtomicBoolean k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/kepler/AstrolapseEncoder");
        g = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f };
    }
    
    public ehz(final dsd dsd, final eya eya, final Executor j, final FileOutputStream fileOutputStream, kre i, final kra k) {
        this.b = mcn.h("resource-closing");
        final Surface persistentInputSurface = MediaCodec.createPersistentInputSurface();
        this.e = persistentInputSurface;
        this.k = new AtomicBoolean(false);
        this.i = k;
        i = i.i(k);
        final nsx a = ntf.a;
        final int e = k.e;
        final MediaFormat videoFormat = MediaFormat.createVideoFormat("video/avc", i.a, i.b);
        videoFormat.setInteger("profile", 8);
        videoFormat.setInteger("level", 32768);
        videoFormat.setInteger("bitrate", 38000000);
        videoFormat.setInteger("color-format", 2130708361);
        videoFormat.setInteger("frame-rate", 10);
        videoFormat.setFloat("i-frame-interval", 1.0f);
        final mcm a2 = mcn.a(j);
        a2.c(fileOutputStream.getFD());
        ((mcl)a2).b(0);
        final niz d = eya.d();
        if (d.g()) {
            final Location location = (Location)d.c();
            final oey n = ofi.n((float)location.getLatitude());
            final mck mck = (mck)a2;
            mck.b = n;
            mck.c = ofi.n((float)location.getLongitude());
        }
        final mbz a3 = ((mcl)a2).a();
        ((mcd)a3).g.d(new ehx(fileOutputStream), j);
        final mbl c = mcn.c(a3);
        this.h = c;
        final mbr c2 = ((mbp)c).c(videoFormat);
        c2.d = false;
        c2.e = persistentInputSurface;
        c2.a();
        final lyp a4 = dsd.a("glContext");
        this.c = a4;
        this.d = mao.a(a4);
        this.f = lyo.c(a4, new mav(persistentInputSurface), lvl.d(i.a, i.b));
        c.b();
        this.j = j;
    }
    
    private static float[] d(final kra kra) {
        final float[] array = ehz.g.clone();
        Matrix.translateM(array, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(array, 0, (float)kra.e, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(array, 0, -0.5f, -0.5f, 0.0f);
        return array;
    }
    
    public final oey a() {
        synchronized (this) {
            this.c();
            return ((mbp)this.h).b.b();
        }
    }
    
    public final void b(final HardwareBuffer hardwareBuffer, final long n) {
        synchronized (this) {
            if (this.k.get()) {
                a.l(ehz.a.c().g(ntf.a, "KeplerEncoder"), "Shutdown already called. Skipping additional requests.", '\u04c1');
                hardwareBuffer.close();
                return;
            }
            final EGLImage eglImage = new EGLImage(hardwareBuffer);
            try {
                final lzn b = lzn.b(this.c, eglImage);
                try {
                    this.f.i(ftm.b, new ftl(n, 1));
                    this.d.d(b, this.f, d(this.i));
                    this.b.execute(new ehw(this, eglImage, hardwareBuffer));
                    b.close();
                    eglImage.close();
                }
                finally {
                    try {
                        b.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)hardwareBuffer).addSuppressed(t);
                    }
                }
            }
            finally {
                try {
                    eglImage.close();
                }
                finally {
                    final Throwable t2;
                    ((Throwable)hardwareBuffer).addSuppressed(t2);
                }
            }
        }
    }
    
    public final void c() {
        if (this.k.getAndSet(true)) {
            a.l(ehz.a.c().g(ntf.a, "KeplerEncoder"), "Shutdown already called. Skipping additional requests.", '\u04c3');
            return;
        }
        final nsx a = ntf.a;
        this.h.a().d(new ehv(this), this.j);
    }
    
    @Override
    public final void close() {
        this.c();
    }
}

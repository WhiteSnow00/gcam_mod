import java.util.concurrent.Executor;
import java.util.Iterator;
import android.opengl.EGL14;
import javax.microedition.khronos.egl.EGL10;
import android.opengl.GLES30;
import java.util.concurrent.TimeUnit;
import android.util.SizeF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idh implements idf
{
    private static final nsd c;
    public final idp a;
    public hzx b;
    private final Object d;
    private boolean e;
    private egv f;
    private final hny g;
    
    static {
        c = nsd.g("com/google/android/apps/camera/timelapse/stabilization/EisControllerImp");
    }
    
    public idh(final idp a, final hny g, final byte[] array, final byte[] array2) {
        this.d = new Object();
        this.a = a;
        this.g = g;
        this.e = false;
    }
    
    private final void f(final idm idm) {
        monitorenter(this);
        try {
            if (idm.d) {
                final lji a = idm.a;
                final int e = idm.e;
                if (e == 2) {
                    final OisSample[] array = (OisSample[])a.d(CaptureResult.STATISTICS_OIS_SAMPLES);
                    if (array != null) {
                        for (final OisSample oisSample : array) {
                            this.f.i(oisSample.getXshift(), oisSample.getYshift(), oisSample.getTimestamp());
                        }
                    }
                    monitorexit(this);
                    return;
                }
                idh.c.c().E(2693).p("Api version not support Ois. Api version: %d", e);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void a(final long n, final kvs kvs, final lju lju, final idm idm, final boolean b, final niz niz) {
        synchronized (this) {
            Object o = this.d;
            synchronized (o) {
                if (this.e) {
                    return;
                }
                monitorexit(o);
                final int height = idm.b.height();
                final int width = idm.b.width();
                final int b2 = lju.b();
                final int c = lju.c();
                this.f(idm);
                o = idm.a.d(CaptureResult.SENSOR_TIMESTAMP);
                o.getClass();
                final long longValue = (long)o;
                o = idm.a.d(CaptureResult.SENSOR_EXPOSURE_TIME);
                o.getClass();
                final long longValue2 = (long)o;
                o = idm.a.d(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW);
                o.getClass();
                final long longValue3 = (long)o;
                final long n2 = (long)(longValue3 * (idm.f.height() * (b2 / (float)c / (height / (float)width)) / idm.b.height()));
                final int width2 = idm.f.width();
                final int width3 = idm.b.width();
                o = idm.c;
                final Float n3 = (Float)idm.a.d(CaptureResult.LENS_FOCAL_LENGTH);
                n3.getClass();
                final float floatValue = n3;
                final float width4 = ((SizeF)o).getWidth();
                o = new idj();
                final Long value = longValue + (longValue3 - n2) / 2L + longValue2 / 2L;
                ((idj)o).a = value;
                ((idj)o).b = longValue2;
                ((idj)o).c = value;
                ((idj)o).d = n2;
                ((idj)o).e = 1.0f;
                ((idj)o).f = width2 / (float)width3 * (width4 / floatValue);
                final Rect b3 = idm.b;
                if (b3 == null) {
                    throw new NullPointerException("Null fullImageSize");
                }
                ((idj)o).g = b3;
                final Rect f = idm.f;
                if (f == null) {
                    throw new NullPointerException("Null cropRegion");
                }
                ((idj)o).h = f;
                final SizeF c2 = idm.c;
                if (c2 == null) {
                    throw new NullPointerException("Null sensorSize");
                }
                ((idj)o).i = c2;
                final Long a = ((idj)o).a;
                if (a == null || ((idj)o).b == null || ((idj)o).c == null || ((idj)o).d == null || ((idj)o).e == null || ((idj)o).f == null || ((idj)o).g == null || ((idj)o).h == null || ((idj)o).i == null) {
                    final StringBuilder sb = new StringBuilder();
                    if (((idj)o).a == null) {
                        sb.append(" frameTimestampNs");
                    }
                    if (((idj)o).b == null) {
                        sb.append(" sensorExposureTimeNs");
                    }
                    if (((idj)o).c == null) {
                        sb.append(" oisTimestampNs");
                    }
                    if (((idj)o).d == null) {
                        sb.append(" rollingShutterTimeNs");
                    }
                    if (((idj)o).e == null) {
                        sb.append(" digitalZoomRatio");
                    }
                    if (((idj)o).f == null) {
                        sb.append(" fieldOfView");
                    }
                    if (((idj)o).g == null) {
                        sb.append(" fullImageSize");
                    }
                    if (((idj)o).h == null) {
                        sb.append(" cropRegion");
                    }
                    if (((idj)o).i == null) {
                        sb.append(" sensorSize");
                    }
                    final String value2 = String.valueOf(sb);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(value2);
                    throw new IllegalStateException(sb2.toString());
                }
                final idk idk = new idk(a, ((idj)o).b, ((idj)o).c, ((idj)o).d, ((idj)o).e, ((idj)o).f, ((idj)o).g, ((idj)o).h, ((idj)o).i);
                final idp a2 = this.a;
                if (!a2.c.isShutdown()) {
                    o = a2.c;
                    ((Executor)o).execute(new ido(a2, lju, idk, kvs, b, n, niz));
                    return;
                }
                a.l(idp.a.c(), "Executor service is shut down", '\u0a89');
            }
        }
    }
    
    @Override
    public final void b(final float n, final float n2, final float n3, final long n4) {
        synchronized (this) {
            synchronized (this.d) {
                if (this.e) {
                    return;
                }
                monitorexit(this.d);
                this.f.h(n, n2, n3, n4);
            }
        }
    }
    
    @Override
    public final void c() {
        monitorenter(this);
        try {
            Object o = this.d;
            synchronized (o) {
                this.e = true;
                monitorexit(o);
                o = this.a;
                ((idp)o).c.shutdown();
                try {
                    ((idp)o).c.awaitTermination(2000L, TimeUnit.MILLISECONDS);
                }
                catch (final InterruptedException ex) {
                    a.l(idp.a.c(), "Eis executorService is interrupted while waiting", '\u0a88');
                }
                final Iterator iterator = ((idp)o).d.iterator();
                while (iterator.hasNext()) {
                    ((lju)iterator.next()).close();
                }
                final Iterator iterator2 = ((idp)o).e.iterator();
                while (iterator2.hasNext()) {
                    ((kvs)iterator2.next()).close();
                }
                final idr g = ((idp)o).g;
                if (g != null) {
                    final idv a = g.e.a;
                    final ids c = a.l.c;
                    final int[] f = c.f;
                    if (f != null) {
                        GLES30.glDeleteTextures(1, f, 0);
                    }
                    final int[] g2 = c.g;
                    if (g2 != null) {
                        GLES30.glDeleteFramebuffers(2, g2, 0);
                    }
                    if (a.e != EGL10.EGL_NO_DISPLAY && a.i != null) {
                        a.j.eglMakeCurrent(a.e, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                        a.j.eglDestroySurface(a.e, a.i);
                        a.j.eglDestroyContext(a.e, a.h);
                        EGL14.eglReleaseThread();
                    }
                }
                ((idp)o).d.clear();
                ((idp)o).e.clear();
                this.f.c();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean d() {
        synchronized (this) {
            return this.f.f();
        }
    }
    
    @Override
    public final void e(final boolean b, final int n, final int n2, final hzx b2) {
        synchronized (this) {
            Object o = this.d;
            synchronized (o) {
                if (this.e) {
                    return;
                }
                monitorexit(o);
                this.b = b2;
                final egv d = hjf.d(egw.e, n, n2, 1.0f, b);
                this.f = d;
                o = this.a;
                final hny g = this.g;
                ((idp)o).f = new idg(this);
                ((idp)o).b.set(d.a());
                ((idp)o).c.execute(new idn((idp)o, n, n2, g, d, null, null));
                this.f.j();
            }
        }
    }
}

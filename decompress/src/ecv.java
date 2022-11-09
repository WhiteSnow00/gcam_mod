import javax.microedition.khronos.egl.EGLConfig;
import android.app.Activity;
import android.opengl.Matrix;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.EGL14;
import android.os.SystemClock;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.util.ArrayList;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.SurfaceTexture;
import com.google.android.libraries.vision.opengl.Texture;
import android.opengl.GLSurfaceView$Renderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecv implements GLSurfaceView$Renderer, krc
{
    public static final nsd a;
    public final int b;
    public final int c;
    public Texture d;
    public SurfaceTexture e;
    public edd f;
    public final ofn g;
    public final AtomicBoolean h;
    public final ecb i;
    public final ecj j;
    public final ecf k;
    private final Context l;
    private final float[] m;
    private final float[] n;
    private float o;
    private float p;
    private long q;
    private final ArrayList r;
    private final kjk s;
    private final eaj t;
    private final edf u;
    private final edq v;
    private final ebo w;
    private final SurfaceTexture$OnFrameAvailableListener x;
    private final eap y;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/ImaxSceneRenderer");
    }
    
    public ecv(final eaj t, final eap y, final edf u, final ebo w, final ecb i, final ecj j, final ecf k, final ecs ecs, final ecl ecl, final ech ech, final ecd ecd, final Context l) {
        this.c = edg.a;
        this.m = new float[16];
        this.n = new float[16];
        this.q = 0L;
        this.x = (SurfaceTexture$OnFrameAvailableListener)new ecu(this);
        this.t = t;
        this.g = ofn.f();
        this.y = y;
        this.v = u.b;
        this.u = u;
        this.w = w;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        final ArrayList r = new ArrayList();
        this.r = r;
        this.s = new kjk();
        this.h = new AtomicBoolean(false);
        this.q = SystemClock.elapsedRealtime();
        final double n = edg.a;
        final double a = u.a();
        Double.isNaN(n);
        this.b = (int)(n * a / 360.0);
        i.h = w.k();
        r.add(j);
        r.add(k);
        r.add(ecs);
        r.add(ecl);
        r.add(ech);
        r.add(ecd);
    }
    
    private final float a(final float n) {
        return this.i.d / this.o * n;
    }
    
    private final float b(final float n) {
        return this.i.e / this.p * n;
    }
    
    public final void close() {
        this.s.close();
        final ArrayList r = this.r;
        for (int size = r.size(), i = 0; i < size; ++i) {
            ((eca)r.get(i)).a();
        }
        EGL14.eglReleaseThread();
    }
    
    public final void onDrawFrame(final GL10 gl10) {
        if (this.s.a()) {
            return;
        }
        GLES20.glDisable(3042);
        final AtomicBoolean h = this.h;
        int i = 0;
        if (h.getAndSet(false)) {
            final SurfaceTexture e = this.e;
            nov.z(e);
            this.t.d();
            e.updateTexImage();
            e.getTransformMatrix(this.m);
            final long timestamp = e.getTimestamp();
            this.f.a.f(this.n);
            this.f.a.e(this.m);
            this.t.a(this.m, timestamp);
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long q = this.q;
        this.q = elapsedRealtime;
        final float abs = Math.abs(this.w.g());
        final float min = Math.min((elapsedRealtime - q) * (Math.min(abs, 0.15f) / 0.15f * 2.4300002E-4f + 7.0E-6f), abs - this.i.g);
        final ecb j = this.i;
        final float g = j.g + min;
        j.g = g;
        if (g > 1.0f) {
            j.g = 1.0f;
        }
        final ebo w = this.w;
        final boolean value = w.e.get();
        final boolean b = true;
        j.m = (!value || w.a.d.getCaptureProgress() >= 0.0f);
        Matrix.setRotateEulerM(this.i.f, 0, 0.0f, 0.0f, (float)(-this.w.o));
        final ecb k = this.i;
        float n2;
        if (k.h) {
            final float g2 = k.g;
            final float q2 = k.q;
            final float max = Math.max(g2 + q2, q2 + q2);
            final float n = (float)this.b;
            n2 = (n + n) / (this.c * max);
        }
        else {
            final float g3 = k.g;
            final float p = k.p;
            final float max2 = Math.max(g3 + p, p + p);
            final float a = this.i.a;
            n2 = (a + a) * this.b / (this.c * max2);
        }
        final ecb l = this.i;
        l.getClass();
        final boolean h2 = l.h;
        float n3;
        float d2;
        if (h2) {
            final float d = 0.9f * n2;
            l.d = d;
            n3 = n2 / this.o * this.p;
            l.e = n3;
            d2 = d;
        }
        else {
            n3 = 0.9f * n2;
            l.e = n3;
            d2 = n2 / this.p * this.o;
            l.d = d2;
        }
        final float n4 = (float)this.w.f;
        if (h2) {
            l.b = n4 / this.o * d2;
            final boolean m = l.m;
            float c = Math.min(1.0f - n3 * 0.5f, this.b(l.g * (this.p + 360.0f)) * 0.5f) - this.b((float)this.w.g);
            if (!m) {
                c = -c;
            }
            l.c = c;
        }
        else {
            final boolean m2 = l.m;
            float b2 = Math.min(l.a - d2 * 0.5f, this.a(l.g * (this.o + 360.0f)) * 0.5f) - this.a((float)this.w.g);
            if (!m2) {
                b2 = -b2;
            }
            l.b = b2;
            final ecb i2 = this.i;
            i2.c = -n4 / this.p * i2.e;
        }
        final ecb i3 = this.i;
        i3.n = (i3.o != null && this.w.j() && b);
        this.f.b();
        final ecb i4 = this.i;
        GLES20.glViewport(0, 0, i4.j, i4.k);
        for (ArrayList r = this.r; i < r.size(); ++i) {
            ((eca)r.get(i)).b();
        }
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int j, final int k) {
        final ecb i = this.i;
        i.j = j;
        i.k = k;
        i.a = j / (float)k;
        final int n = ((Activity)this.l).getWindowManager().getDefaultDisplay().getRotation() * 90;
        final float[] n2 = this.n;
        final float n3 = (float)(-n);
        int l = 0;
        Matrix.setRotateEulerM(n2, 0, 0.0f, 0.0f, n3);
        final ebo w = this.w;
        w.n = n;
        this.i.h = w.k();
        if (this.i.h) {
            final double a = this.u.a();
            final edq v = this.v;
            this.p = (float)a * v.b / v.a;
            this.o = (float)this.u.a();
        }
        else {
            final double a2 = this.u.a();
            final edq v2 = this.v;
            this.o = (float)a2 * v2.b / v2.a;
            this.p = (float)this.u.a();
        }
        final ecb m = this.i;
        float l2;
        if (m.h) {
            l2 = m.k / (float)m.j;
        }
        else {
            l2 = 1.0f;
        }
        m.l = l2;
        m.p = this.o / 360.0f;
        m.q = this.p / 360.0f;
        this.t.b(j, k);
        this.f.c(j, k);
        for (ArrayList r = this.r; l < r.size(); ++l) {
            ((eca)r.get(l)).c(j, k);
        }
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        final edq v = this.v;
        this.d = new Texture(v.a, v.b, 36197);
        this.f = new edd(this.d, this.i);
        final SurfaceTexture e = this.e;
        if (e != null) {
            e.release();
            this.e = null;
        }
        final Texture d = this.d;
        nov.z(d);
        final SurfaceTexture e2 = new SurfaceTexture(d.getName());
        final edq v2 = this.v;
        e2.setDefaultBufferSize(v2.a, v2.b);
        e2.setOnFrameAvailableListener(this.x);
        this.e = e2;
        this.g.o(e2);
        this.s.c(new ect(this, e2));
        this.t.e(this.y);
        final eaj t = this.t;
        final Texture d2 = this.d;
        nov.z(d2);
        t.c(d2, this.v);
    }
}

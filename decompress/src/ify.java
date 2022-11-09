import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.graphics.PointF;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ify implements igj
{
    private static final nsd a;
    private boolean b;
    private final long c;
    private volatile long d;
    private volatile int e;
    private final niz f;
    private final niz g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/tracking/RoiTrackerImpl");
    }
    
    public ify() {
        new huf();
        throw null;
    }
    
    public ify(final niz f, final niz g, final Context context) {
        this.f = f;
        this.g = g;
        igk b;
        if (g.g()) {
            b = (igk)g.c();
        }
        else {
            b = igk.b;
        }
        String absolutePath;
        if (context != null) {
            absolutePath = context.getCacheDir().getAbsolutePath();
        }
        else {
            absolutePath = "";
        }
        this.c = RoiTrackerNative.createHandle(context, absolutePath, b.ordinal());
        this.d = 0L;
        this.e = 0;
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            RoiTrackerNative.stopTracking(this.c);
            if (this.f.g()) {
                ((igp)this.f.c()).a();
            }
        }
    }
    
    @Override
    public final igr b(lju lju, final PointF pointF) {
        synchronized (this) {
            if (this.b) {
                a.l(ify.a.c(), "Cannot start tracking: tracker is closed", '\u0aa2');
                return igr.b();
            }
            this.d = lju.d();
            this.e = 0;
            igk b;
            if (this.g.g()) {
                b = (igk)this.g.c();
            }
            else {
                b = igk.b;
            }
            igk c = b;
            if (this.f.g()) {
                if (!((igp)this.f.c()).b(new kre(lju.c(), lju.b()), lju.d())) {
                    a.l(ify.a.c(), "Cannot start motion estimator for tracking", '\u0aa1');
                }
                final gzn b2 = ((igp)this.f.c()).a.b();
                c = b;
                if (b2 != null) {
                    c = b;
                    if (b2.c > 50000000L) {
                        c = b;
                        if (b2.e > 350L) {
                            c = igk.c;
                        }
                    }
                }
            }
            final ljt ljt = lju.h().get(0);
            final ljt ljt2 = lju.h().get(1);
            final ljt ljt3 = lju.h().get(2);
            final int c2 = lju.c();
            final int b3 = lju.b();
            final float[] array = new float[4];
            final float n = (float)c2;
            array[0] = pointF.x * n - 5.0f;
            final float n2 = (float)b3;
            array[1] = pointF.y * n2 - 5.0f;
            array[3] = (array[2] = 11.0f);
            lju = (lju)lju.f();
            try {
                final int startTracking = RoiTrackerNative.startTracking(this.c, true, c.ordinal(), 0, 1.0f, c2, b3, ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), ljt2.getBuffer(), ljt2.getPixelStride(), ljt2.getRowStride(), ljt3.getBuffer(), ljt3.getPixelStride(), ljt3.getRowStride(), (HardwareBuffer)lju, array);
                if (lju != null) {
                    ((HardwareBuffer)lju).close();
                }
                final float n3 = array[0];
                final float n4 = array[1];
                final float n5 = array[2];
                final float n6 = array[3];
                this.e += (RoiTrackerNative.getIsRefresherCalled(this.c) ? 1 : 0);
                lju = (lju)igr.a();
                ((igq)lju).d(new RectF(n3 / n, n4 / n2, (n3 + n5 - 1.0f) / n, (n4 + n6 - 1.0f) / n2));
                ((igq)lju).b(1.0f);
                ((igq)lju).a = igt.a(startTracking);
                ((igq)lju).f(igk.a(RoiTrackerNative.getCurrentTrackerIndex(this.c)));
                ((igq)lju).c(this.e);
                ((igq)lju).e(0L);
                lju = (lju)((igq)lju).a();
                return (igr)lju;
            }
            finally {
                if (lju != null) {
                    try {
                        ((HardwareBuffer)lju).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)pointF).addSuppressed(t);
                    }
                }
            }
        }
    }
    
    @Override
    public final igr c(final lju lju) {
        synchronized (this) {
            if (this.b) {
                return igr.b();
            }
            final ljt ljt = lju.h().get(0);
            final ljt ljt2 = lju.h().get(1);
            final ljt ljt3 = lju.h().get(2);
            final int c = lju.c();
            final int b = lju.b();
            final float[] array = new float[5];
            float[] c2;
            if (this.f.g()) {
                c2 = ((igp)this.f.c()).c(lju.d());
            }
            else {
                c2 = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
            }
            final HardwareBuffer f = lju.f();
            try {
                final int updateRoi = RoiTrackerNative.updateRoi(this.c, 0, 1.0f, c, b, ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), ljt2.getBuffer(), ljt2.getPixelStride(), ljt2.getRowStride(), ljt3.getBuffer(), ljt3.getPixelStride(), ljt3.getRowStride(), c2, f, array);
                if (f != null) {
                    f.close();
                }
                final float n = array[0];
                final float n2 = (float)c;
                final float n3 = array[1];
                final float n4 = (float)b;
                final float n5 = array[2];
                final float n6 = array[3];
                final float n7 = array[4];
                this.e += (RoiTrackerNative.getIsRefresherCalled(this.c) ? 1 : 0);
                final igq a = igr.a();
                a.d(new RectF(n / n2, n3 / n4, (n + n5 - 1.0f) / n2, (n3 + n6 - 1.0f) / n4));
                a.b(n7);
                a.a = igt.a(updateRoi);
                a.f(igk.a(RoiTrackerNative.getCurrentTrackerIndex(this.c)));
                a.c(this.e);
                a.e((lju.d() - this.d) / 1000000L);
                return a.a();
            }
            finally {
                if (f != null) {
                    try {
                        f.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)lju).addSuppressed(t);
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.a();
            if (this.f.g()) {
                ((igp)this.f.c()).close();
            }
            RoiTrackerNative.releaseHandle(this.c);
            this.b = true;
        }
    }
}

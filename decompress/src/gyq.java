import java.util.ArrayList;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import android.os.SystemClock;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyq extends gyp
{
    private final gyd a;
    private final eyx b;
    private final kse i;
    private final gye j;
    
    public gyq(final gyb gyb, final Executor executor, final gxz gxz, final gyd a, final hhy hhy, final gye j, final eyx b, final kse i) {
        super(gyb, executor, gxz, 1, hhy);
        this.a = a;
        this.j = j;
        this.b = b;
        this.i = i;
    }
    
    @Override
    public final void run() {
        this.i.f("LuckyShot");
        final okt m = oad.d.m();
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oad oad = (oad)m.b;
        oad.a |= 0x1;
        oad.b = elapsedRealtimeNanos;
        final gye j = this.j;
        final gyb f = this.f;
        final long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        j.b.f("LuckyShotScore");
        final lju a = f.a;
        final ljt ljt = a.h().get(0);
        final double n = ImgUtilNative.measureSharpnessOnEdgeGivenCropNative(a.c(), a.b(), ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), f.e.left, f.e.top, f.e.right, f.e.bottom);
        j.b.g();
        if (n <= 0.0) {
            a.l(gye.a.c(), "invalid metric value from LS metric calculation.", '\u0882');
        }
        final niz i = niz.i(new eyv(eyw.c, (float)n, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2));
        final long elapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oad oad2 = (oad)m.b;
        oad2.a |= 0x2;
        oad2.c = elapsedRealtimeNanos3;
        final eyx b = this.b;
        final oad oad3 = (oad)m.h();
        Object o = b.a;
        synchronized (o) {
            if (b.f == null) {
                b.f = new ArrayList();
            }
            b.f.add(oad3);
            monitorexit(o);
            o = this.a.d(this.f, n);
            final eyx b2 = this.b;
            final eyv eyv = (eyv)((njd)i).a;
            final okt k = oab.g.m();
            if (k.c) {
                k.m();
                k.c = false;
            }
            final oab oab = (oab)k.b;
            final int a2 = oab.a | 0x1;
            oab.a = a2;
            oab.b = -1;
            final float b3 = eyv.b;
            final int a3 = a2 | 0x2;
            oab.a = a3;
            oab.c = b3;
            final int a4 = a3 | 0x4;
            oab.a = a4;
            oab.d = 0.0f;
            final int a5 = a4 | 0x8;
            oab.a = a5;
            oab.e = 0.0f;
            final long c = eyv.c;
            oab.a = (a5 | 0x10);
            oab.f = c;
            final oab oab2 = (oab)k.h();
            final eyw a6 = eyv.a;
            synchronized (b2.a) {
                b2.b.add(oab2);
                b2.c.add(a6);
                monitorexit(b2.a);
                if (o != null) {
                    this.c.b(((gyb)o).a, this.d);
                }
                this.i.g();
            }
        }
    }
}

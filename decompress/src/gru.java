import android.hardware.camera2.CaptureResult;
import java.util.concurrent.TimeUnit;
import com.google.googlex.gcam.BurstSpec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gru
{
    public static long a(final lfg lfg, final BurstSpec burstSpec, final niz niz, final int n, final int n2, final boolean b, final boolean b2, final ljm ljm) {
        long n4;
        long n3 = n4 = 0L;
        if (ljm != null) {
            final float n5 = (float)TimeUnit.NANOSECONDS.toMillis(ohv.d(lfg));
            if (niz.g() && n2 > 0) {
                n3 = Math.round(((BurstSpec)niz.c()).a(n5, b2));
            }
            if (n > 0) {
                n3 += Math.round(burstSpec.a(n5, b2));
            }
            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
            final Long n6 = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
            n6.getClass();
            final long millis = nanoseconds.toMillis(n6);
            n4 = n3;
            if (b) {
                n4 = n3 + (n + n2) * millis * 6L;
            }
        }
        return n4;
    }
    
    public static final void b(final lju lju) {
        lju.close();
    }
}

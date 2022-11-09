import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lao implements kri
{
    public final ofn a;
    private final CaptureResult$Key b;
    private final noi c;
    private final long d;
    private final long e;
    private long f;
    private long g;
    
    public lao(final CaptureResult$Key b, final noi c, long d, long e) {
        this.f = -1L;
        this.g = -1L;
        this.b = b;
        this.c = c;
        if (d <= 0L) {
            d = 3000000000L;
        }
        this.d = d;
        if (e <= 0L) {
            e = 60L;
        }
        this.e = e;
        this.a = ofn.f();
    }
    
    public final void b(final lji lji) {
        if (this.a.isDone()) {
            return;
        }
        final Long n = (Long)lji.d(CaptureResult.SENSOR_TIMESTAMP);
        long longValue;
        if (n == null) {
            longValue = -1L;
        }
        else {
            longValue = n;
        }
        final kvx kvx = new kvx(longValue, lji.b(), lji.a());
        if (this.c.isEmpty()) {
            this.a.o(kvx);
            return;
        }
        if (n != null) {
            if (this.f == -1L) {
                this.f = n;
            }
            if (n - this.f > this.d) {
                this.a.o(kvx);
                return;
            }
        }
        if (this.g == -1L) {
            this.g = lji.b();
        }
        if (lji.b() - this.g > this.e) {
            this.a.o(kvx);
            return;
        }
        if (this.c.contains(lji.d(this.b))) {
            this.a.o(kvx);
        }
    }
}

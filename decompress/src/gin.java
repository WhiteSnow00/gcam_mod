import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gin implements kri
{
    private static final nsd b;
    public final ofn a;
    private final long c;
    private Long d;
    private boolean e;
    
    static {
        b = nsd.g("com/google/android/apps/camera/one/util/TimestampWaiter");
    }
    
    public gin(final long c) {
        this.e = false;
        this.c = c;
        this.a = ofn.f();
    }
    
    public final void b(final lji lji) {
        if (this.e) {
            return;
        }
        if (this.d == null) {
            this.d = lji.b();
        }
        final long b = lji.b();
        final Long d = this.d;
        nov.z(d);
        final long n = b - d;
        final Long n2 = (Long)lji.d(CaptureResult.SENSOR_TIMESTAMP);
        if (n2 != null && n2 > this.c) {
            this.e = true;
            this.a.o(true);
            return;
        }
        if (n >= 10L) {
            gin.b.c().E(1827).y("timeout waiting for %d at %d, after %dframes", this.c, n2, n);
            this.e = true;
            this.a.o(false);
        }
    }
}

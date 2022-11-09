import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghy implements ghw
{
    private final krr a;
    private final dbk b;
    private double c;
    
    public ghy(final krq krq, final dbk b) {
        this.c = 33.0;
        this.a = krq.a("FrameJank");
        this.b = b;
    }
    
    @Override
    public final void a(final ljm ljm, final double c, double n) {
        final Long n2 = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        final Long n3 = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (n2 != null && n3 != null) {
            this.b.b(n2, n3);
        }
        n = this.c;
        if (n > 33.0 && c > 33.0) {
            final double n4 = (c - n) / n;
            if (n4 >= 1.5) {
                final krr a = this.a;
                final StringBuilder sb = new StringBuilder(146);
                sb.append("JANK! Time between frames (");
                sb.append(c);
                sb.append("ms) increased by ");
                sb.append(n4 * 100.0);
                sb.append("% over the expected delta (");
                sb.append(n);
                sb.append("ms)");
                a.f(sb.toString());
            }
        }
        if (c > 33.0) {
            n = this.c;
            if (c > n) {
                this.c = (c + n * 10.0) / 11.0;
                return;
            }
            this.c = c;
        }
    }
}

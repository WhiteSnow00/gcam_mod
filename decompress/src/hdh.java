import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdh implements hdg
{
    private final dlc a;
    private final float[] b;
    
    public hdh(final dlc a) {
        this.b = new float[3];
        this.a = a;
    }
    
    @Override
    public final float a(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        float n2 = Float.NaN;
        float n3;
        if (n == null) {
            n3 = Float.NaN;
        }
        else {
            n3 = n;
        }
        final Long n4 = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        Label_0141: {
            if (n4 == null) {
                break Label_0141;
            }
            synchronized (this.b) {
                final dlc a = this.a;
                if (a != null) {
                    final dkz c = a.c(n4);
                    if (!c.e()) {
                        final float[] a2 = c.a;
                        final float n5 = a2[0];
                        final float n6 = a2[1];
                        final float n7 = a2[2];
                        n2 = (float)Math.sqrt(n5 * n5 + n6 * n6 + n7 * n7);
                    }
                    monitorexit(this.b);
                }
                else {
                    monitorexit(this.b);
                }
                return (float)Math.exp(n3 * -5.0E-7f * n2);
            }
        }
    }
}

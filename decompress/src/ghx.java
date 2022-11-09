import java.util.Iterator;
import android.hardware.camera2.CaptureResult;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghx extends kxc
{
    private final Set a;
    private long b;
    private double c;
    
    public ghx(final Set a) {
        this.b = -1L;
        this.c = -1.0;
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        long longValue;
        if (n == null) {
            longValue = -1L;
        }
        else {
            longValue = n;
        }
        final long b = this.b;
        double n2 = -1.0;
        double c;
        double n4;
        if (b >= 0L) {
            final double n3 = (double)(longValue - b);
            Double.isNaN(n3);
            c = n3 / 1000000.0;
            final double c2 = this.c;
            if (c2 > 0.0) {
                n2 = c2;
            }
            this.c = c;
            n4 = n2;
        }
        else {
            n4 = -1.0;
            c = n2;
        }
        this.b = longValue;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ghw)iterator.next()).a(ljm, c, n4);
        }
    }
}

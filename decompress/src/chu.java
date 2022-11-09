import android.os.SystemClock;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chu extends kxc
{
    private final kof a;
    private boolean b;
    private long c;
    
    public chu(final kof a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
            n.getClass();
            final long n2 = n / 1000L;
            if (!this.b) {
                final long n3 = SystemClock.elapsedRealtimeNanos() / 1000L;
                final long uptimeMillis = SystemClock.uptimeMillis();
                Long.signum(uptimeMillis);
                this.c = n3 - uptimeMillis * 1000L;
                this.b = true;
            }
            final long c = this.c;
            final niz o = this.a.o();
            if (o.g()) {
                ((knz)o.c()).e(new cht(ljm), n2 - c);
            }
        }
    }
}

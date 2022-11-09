import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class eaw extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ kri b;
    final /* synthetic */ eba c;
    
    public eaw(final eba c, final kvs a, final kri b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b() {
        final ljm c = this.a.c();
        if (c != null) {
            this.c.g.a(c);
            final eaz l = this.c.l;
            if (l != null) {
                final Long n = (Long)c.d(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (n != null) {
                    final float q = n / 1000000.0f;
                    final ebo f = ((eby)l).f;
                    synchronized (f.p) {
                        f.q = q;
                    }
                }
            }
        }
        this.a.close();
        if (this.c.n.compareAndSet(false, true)) {
            this.c.e.execute(new eav(this, this.b));
        }
    }
}

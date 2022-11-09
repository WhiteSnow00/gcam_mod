import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chs extends kxc
{
    private final ckf a;
    
    public chs(final kof kof) {
        this.a = new ckf(kof);
    }
    
    @Override
    public final void b(final ljm ljm) {
        final ckf a = this.a;
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (n != null) {
            if (cke.a.a(n) && a.b != cke.a) {
                a.b = cke.a;
                a.a.p(a.b.c);
                return;
            }
            if (cke.b.a(n) && a.b != cke.b) {
                a.b = cke.b;
                a.a.p(a.b.c);
            }
        }
    }
}

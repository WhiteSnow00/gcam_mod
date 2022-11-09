import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bow extends kxc
{
    private final pii a;
    private final oey b;
    private final fxz c;
    private long d;
    
    public bow(final oey b, final fxz c, final pii a) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = 0L;
    }
    
    @Override
    public final void b(final ljm ljm) {
        final boi boi = (boi)knf.d(this.b);
        if (boi != null && boi.i()) {
            final long b = ljm.b();
            final long d = this.d;
            final int a = boi.a();
            if (a != 0 && b > d + a) {
                final Integer n = (Integer)ljm.d(CaptureResult.CONTROL_AF_MODE);
                if (n != null) {
                    final int intValue = n;
                    final Integer n2 = (Integer)ljm.d(CaptureResult.CONTROL_AF_STATE);
                    n2.getClass();
                    final int intValue2 = n2;
                    if (intValue == 0 || intValue2 == 2 || intValue2 == 4) {
                        this.d = ljm.b();
                        this.c.b((fxx)this.a.get());
                    }
                }
            }
        }
    }
}

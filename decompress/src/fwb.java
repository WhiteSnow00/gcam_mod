import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwb extends kxc
{
    private final fvz a;
    
    public fwb(final fvz a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ljm ljm) {
        final Integer n = (Integer)ljm.d(CaptureResult.CONTROL_AE_MODE);
        n.getClass();
        final int intValue = n;
        final gzo gzo = gzo.g.get(intValue);
        if (gzo == null) {
            final StringBuilder sb = new StringBuilder(35);
            sb.append("unknown metadata value: ");
            sb.append(intValue);
            throw new IllegalArgumentException(sb.toString());
        }
        final Integer n2 = (Integer)ljm.d(CaptureResult.CONTROL_AE_STATE);
        n2.getClass();
        final int intValue2 = n2;
        final gzp gzp = gzp.g.get(intValue2);
        if (gzp != null) {
            final fvx a = fvy.a();
            a.b(gzo);
            a.c(gzp);
            this.a.b(a.a());
            return;
        }
        final StringBuilder sb2 = new StringBuilder(35);
        sb2.append("unknown metadata value: ");
        sb2.append(intValue2);
        throw new IllegalArgumentException(sb2.toString());
    }
}

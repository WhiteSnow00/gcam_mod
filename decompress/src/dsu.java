// 
// Decompiled by Procyon v0.6.0
// 

public final class dsu
{
    public static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gyro/GyroVec");
    }
    
    public static float a(final float n, final float n2, final double n3) {
        final double n4 = n;
        Double.isNaN(n4);
        final double n5 = n2;
        Double.isNaN(n5);
        return (float)((1.0 - n3) * n4 + n3 * n5);
    }
}

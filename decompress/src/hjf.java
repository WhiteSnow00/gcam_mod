import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjf
{
    public static int a(final int n) {
        return n - 1;
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static final ByteBuffer c(final int n, final int n2, final ljt ljt) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(n * n2);
        mcy.a.copyBytes2D(ljt.getBuffer(), allocateDirect, n, n2, 0, 0, ljt.getPixelStride(), 1, ljt.getRowStride(), n);
        return allocateDirect;
    }
    
    public static final egv d(final egw egw, final int n, final int n2, final float n3, final boolean b) {
        return new egv(egw, n, n2, n3, b);
    }
}

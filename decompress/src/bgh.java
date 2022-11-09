import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgh
{
    public static final int a(final int n, final ByteBuffer byteBuffer) {
        if (c(n, 4, byteBuffer)) {
            return byteBuffer.getInt(n);
        }
        return -1;
    }
    
    public static final short b(final int n, final ByteBuffer byteBuffer) {
        if (c(n, 2, byteBuffer)) {
            return byteBuffer.getShort(n);
        }
        return -1;
    }
    
    private static final boolean c(final int n, final int n2, final ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - n >= n2;
    }
}

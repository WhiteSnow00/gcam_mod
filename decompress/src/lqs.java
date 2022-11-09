import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqs
{
    public static final okm a;
    
    static {
        a = okm.c();
    }
    
    public static lqo a(final ByteBuffer byteBuffer, final okm okm) {
        if (byteBuffer != null) {
            try {
                return (lqo)oky.s(lqo.e, byteBuffer, okm);
            }
            catch (final Exception ex) {}
        }
        return lqo.e;
    }
}

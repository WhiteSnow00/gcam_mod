import java.security.MessageDigest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bes implements awe
{
    private final ByteBuffer a;
    private final /* synthetic */ int b;
    
    public bes() {
        this.a = ByteBuffer.allocate(4);
    }
    
    public bes(final int b) {
        this.b = b;
        this.a = ByteBuffer.allocate(8);
    }
}

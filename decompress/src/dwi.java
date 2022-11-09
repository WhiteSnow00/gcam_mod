import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwi
{
    public final ByteBuffer a;
    public final int b;
    public final int c;
    
    public dwi(final ByteBuffer byteBuffer, final int b, final int c) {
        this.a = byteBuffer.duplicate();
        this.b = b;
        this.c = c;
    }
}

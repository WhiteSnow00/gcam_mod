import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.io.FilterOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvl extends FilterOutputStream
{
    public final ByteBuffer a;
    
    public kvl(final OutputStream outputStream) {
        super(outputStream);
        this.a = ByteBuffer.allocate(4);
    }
    
    public final void a(final int n) {
        this.a.rewind();
        this.a.putInt(n);
        this.out.write(this.a.array());
    }
    
    public final void b(final short n) {
        this.a.rewind();
        this.a.putShort(n);
        this.out.write(this.a.array(), 0, 2);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.out.write(array, n, n2);
    }
}

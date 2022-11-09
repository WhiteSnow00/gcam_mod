import java.io.OutputStream;
import java.io.FilterOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxc extends FilterOutputStream
{
    public long a;
    
    public nxc(final OutputStream outputStream) {
        super(outputStream);
    }
    
    @Override
    public final void close() {
        this.out.close();
    }
    
    @Override
    public final void write(final int n) {
        this.out.write(n);
        ++this.a;
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.out.write(array, n, n2);
        this.a += n2;
    }
}

import java.io.OutputStream;
import java.io.FilterOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class msj extends FilterOutputStream
{
    public msj(final OutputStream outputStream) {
        super(outputStream);
    }
    
    @Override
    public void write(final byte[] array) {
        this.out.write(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.out.write(array, n, n2);
    }
}

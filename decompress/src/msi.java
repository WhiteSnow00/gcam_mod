import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class msi extends FilterInputStream
{
    public msi(final InputStream inputStream) {
        super(inputStream);
    }
    
    @Override
    public int read(final byte[] array) {
        return this.in.read(array);
    }
}

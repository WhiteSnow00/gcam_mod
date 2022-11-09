import com.google.common.io.ByteStreams;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class lmu implements lmw
{
    private final InputStream a;
    
    public lmu(final InputStream a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.read();
    }
    
    @Override
    public final lmv b(final int n, final int n2) {
        final byte[] array = new byte[n];
        return new lmv(array, n2, 0, ByteStreams.read(this.a, array, 0, n));
    }
    
    @Override
    public final void c(final int n) {
        ByteStreams.skipFully(this.a, n);
    }
    
    @Override
    public final lmv d() {
        final byte[] byteArray = ByteStreams.toByteArray(this.a);
        return new lmv(byteArray, 218, 0, byteArray.length);
    }
}

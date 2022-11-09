import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apk extends OutputStream
{
    public int a;
    private final OutputStream b;
    
    public apk(final OutputStream b) {
        this.a = 0;
        this.b = b;
    }
    
    @Override
    public final void write(final int n) {
        this.b.write(n);
        ++this.a;
    }
    
    @Override
    public final void write(final byte[] array) {
        this.b.write(array);
        this.a += array.length;
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.b.write(array, n, n2);
        this.a += n2;
    }
}

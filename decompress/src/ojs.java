import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojs extends ojv
{
    private static final long serialVersionUID = 1L;
    private final int d;
    private final int e;
    
    public ojs(final byte[] array, final int d, final int e) {
        super(array);
        ojw.q(d, d + e, array.length);
        this.d = d;
        this.e = e;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
    
    @Override
    public final byte a(final int n) {
        ojw.A(n, this.e);
        return this.a[this.d + n];
    }
    
    @Override
    public final byte b(final int n) {
        return this.a[this.d + n];
    }
    
    @Override
    protected final int c() {
        return this.d;
    }
    
    @Override
    public final int d() {
        return this.e;
    }
    
    @Override
    protected final void e(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.a, this.d + n, array, n2, n3);
    }
    
    Object writeReplace() {
        return ojw.x(this.B());
    }
}

import com.google.common.io.ByteStreams;
import java.nio.ByteOrder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuy extends FilterInputStream
{
    public int a;
    public final ByteBuffer b;
    private final byte[] c;
    
    protected kuy(final InputStream inputStream) {
        super(inputStream);
        this.a = 0;
        final byte[] c = new byte[8];
        this.c = c;
        this.b = ByteBuffer.wrap(c);
    }
    
    public final int a() {
        this.f(this.c, 4);
        this.b.rewind();
        return this.b.getInt();
    }
    
    public final int b() {
        return (char)this.d();
    }
    
    public final long c() {
        return (long)this.a() & 0xFFFFFFFFL;
    }
    
    public final short d() {
        this.f(this.c, 2);
        this.b.rewind();
        return this.b.getShort();
    }
    
    public final void e(final ByteOrder byteOrder) {
        this.b.order(byteOrder);
    }
    
    public final void f(final byte[] array, final int n) {
        ByteStreams.readFully(this, array, 0, n);
    }
    
    @Override
    public final int read() {
        final int read = this.in.read();
        final int a = this.a;
        int n;
        if (read >= 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.a = a + n;
        return read;
    }
    
    @Override
    public final int read(final byte[] array) {
        final int read = this.in.read(array);
        this.a += Math.max(read, 0);
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        read = this.in.read(array, read, n);
        this.a += Math.max(read, 0);
        return read;
    }
    
    @Override
    public final long skip(long skip) {
        skip = this.in.skip(skip);
        this.a += (int)skip;
        return skip;
    }
}

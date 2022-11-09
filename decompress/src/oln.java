import java.nio.ByteBuffer;
import java.util.Iterator;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class oln extends InputStream
{
    private Iterator a;
    private ByteBuffer b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;
    
    public oln(final Iterable iterable) {
        this.a = iterable.iterator();
        this.c = 0;
        for (final ByteBuffer byteBuffer : iterable) {
            ++this.c;
        }
        this.d = -1;
        if (!this.b()) {
            this.b = olk.c;
            this.d = 0;
            this.e = 0;
            this.i = 0L;
        }
    }
    
    private final void a(int e) {
        e += this.e;
        this.e = e;
        if (e == this.b.limit()) {
            this.b();
        }
    }
    
    private final boolean b() {
        ++this.d;
        if (!this.a.hasNext()) {
            return false;
        }
        final ByteBuffer b = this.a.next();
        this.b = b;
        this.e = b.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        }
        else {
            this.f = false;
            this.i = ons.e(this.b);
            this.g = null;
        }
        return true;
    }
    
    @Override
    public final int read() {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            final byte b = this.g[this.e + this.h];
            this.a(1);
            return b & 0xFF;
        }
        final byte a = ons.a(this.e + this.i);
        this.a(1);
        return a & 0xFF;
    }
    
    @Override
    public final int read(final byte[] array, final int n, int position) {
        if (this.d == this.c) {
            return -1;
        }
        final int limit = this.b.limit();
        final int e = this.e;
        final int n2 = limit - e;
        int n3;
        if ((n3 = position) > n2) {
            n3 = n2;
        }
        if (this.f) {
            System.arraycopy(this.g, e + this.h, array, n, n3);
            this.a(n3);
        }
        else {
            position = this.b.position();
            this.b.position(this.e);
            this.b.get(array, n, n3);
            this.b.position(position);
            this.a(n3);
        }
        return n3;
    }
}

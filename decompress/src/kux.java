import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kux
{
    public byte[] a;
    public int b;
    public int c;
    
    public kux() {
        this.a = new byte[1];
        this.b = 0;
        this.c = 0;
    }
    
    public final int a() {
        return this.c - this.b;
    }
    
    public final void b(int n) {
        final byte[] a = this.a;
        final int length = a.length;
        final int c = this.c;
        if (length - c < n) {
            final int b = this.b;
            final int c2 = c - b;
            n += c2;
            if (n <= length && n > length >> 1) {
                if (c2 > 0) {
                    System.arraycopy(a, b, a, 0, c2);
                }
            }
            else {
                final byte[] a2 = new byte[n];
                if (c2 > 0) {
                    System.arraycopy(a, b, a2, 0, c2);
                }
                this.a = a2;
            }
            this.b = 0;
            this.c = c2;
        }
    }
    
    public final void c(final OutputStream outputStream, final int n) {
        final int b = this.b;
        if (b + n <= this.c) {
            outputStream.write(this.a, b, n);
            this.b += n;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }
    
    public final void d(int b) {
        b += this.b;
        if (b <= this.c) {
            this.b = b;
            return;
        }
        throw new IllegalStateException("Byte queue is too short");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.a.length; ++i) {
            if (i == this.b) {
                sb.append("{ ");
            }
            if (i == this.c) {
                sb.append("} ");
            }
            final byte[] a = this.a;
            if (i < a.length) {
                sb.append(String.format("%02X ", a[i]));
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcw implements mcx
{
    private final mcx a;
    private final /* synthetic */ int b;
    
    public mcw(final mcx a) {
        this.a = a;
    }
    
    public mcw(final mcx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private static int b(final int n, final int n2, final int n3) {
        return Math.max(Math.max(n, n2), n3);
    }
    
    private static int c(final int n, final int n2, final int n3) {
        return Math.min(Math.min(n, n2), n3);
    }
    
    private final void d(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        if (this.a(byteBuffer, byteBuffer2)) {
            return;
        }
        final String value = String.valueOf(byteBuffer);
        final String value2 = String.valueOf(byteBuffer2);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 56 + String.valueOf(value2).length());
        sb.append("MemCopier does not support copying from buffer '");
        sb.append(value);
        sb.append("' to '");
        sb.append(value2);
        sb.append("'!");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static void e(final int n, final int n2) {
        int n3;
        int n4;
        if (n2 < 0) {
            n3 = -n2;
            n4 = n2;
        }
        else {
            n4 = 0;
            n3 = n2;
        }
        if (n4 < 0) {
            final StringBuilder sb = new StringBuilder(58);
            sb.append("Attempting to copy from negative buffer index ");
            sb.append(n4);
            sb.append("!");
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (n >= n3) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder(86);
        sb2.append("Attempting to copy ");
        sb2.append(n3);
        sb2.append(" bytes at offset 0 on ");
        sb2.append(n);
        sb2.append("-byte buffer!");
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    @Override
    public final boolean a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        switch (this.b) {
            default: {
                return this.a.a(byteBuffer, byteBuffer2);
            }
            case 0: {
                return this.a.a(byteBuffer, byteBuffer2);
            }
        }
    }
    
    @Override
    public final void copyBytes(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, int capacity, int capacity2, final int n) {
        switch (this.b) {
            default: {
                this.d(byteBuffer, byteBuffer2);
                capacity2 = byteBuffer.capacity();
                capacity = byteBuffer2.capacity();
                e(capacity2, n);
                e(capacity, n);
                this.a.copyBytes(byteBuffer, byteBuffer2, 0, 0, n);
                return;
            }
            case 0: {
                this.a.copyBytes(byteBuffer, byteBuffer2, 0, 0, n);
            }
        }
    }
    
    @Override
    public final void copyBytes2D(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final int n, final int n2, int capacity, int capacity2, final int n3, final int n4) {
        switch (this.b) {
            default: {
                this.d(byteBuffer, byteBuffer2);
                capacity = byteBuffer.capacity();
                capacity2 = byteBuffer2.capacity();
                e(capacity, n2 * n3);
                e(capacity2, n2 * n4);
                this.a.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n3, n4);
                return;
            }
            case 0: {
                if (n3 == n4 && n3 == n) {
                    this.copyBytes(byteBuffer, byteBuffer2, 0, 0, n3 * n2);
                    return;
                }
                this.a.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n3, n4);
            }
        }
    }
    
    @Override
    public final void copyBytes2D(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final int n, final int n2, int capacity, int b, final int n3, int c, final int n4, final int n5) {
        switch (this.b) {
            default: {
                this.d(byteBuffer, byteBuffer2);
                final int capacity2 = byteBuffer.capacity();
                capacity = byteBuffer2.capacity();
                b = n - 1;
                final int n6 = n3 * b;
                c = n2 - 1;
                final int n7 = n4 * c;
                final int n8 = n7 + n6;
                final int c2 = c(n6, n7, n8);
                final int b2 = b(n6, n7, n8);
                e(capacity2, c2);
                e(capacity2, b2);
                final int n9 = n5 * c;
                final int n10 = n9 + b;
                c = c(b, n9, n10);
                b = b(b, n9, n10);
                e(capacity, c);
                e(capacity, b);
                this.a.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n3, 1, n4, n5);
                return;
            }
            case 0: {
                if (n3 == 1) {
                    this.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n4, n5);
                    return;
                }
                this.a.copyBytes2D(byteBuffer, byteBuffer2, n, n2, 0, 0, n3, 1, n4, n5);
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.b) {
            default: {
                final String value = String.valueOf(this.a);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 9);
                sb.append("checked[");
                sb.append(value);
                sb.append("]");
                return sb.toString();
            }
            case 0: {
                final String value2 = String.valueOf(this.a);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 8);
                sb2.append("greedy[");
                sb2.append(value2);
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
